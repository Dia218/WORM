package operation.manager;

import element.Worm;
import element.block.TelpoBlock;
import element.worm.WormHead;
import operation.ManageElement;

public interface MoveElement {

	
	default void moveWorm() {
	
		ManageElement.elementManager.gamefield.removeElement(wormHead.returnX(), wormHead.returnY());
		WormHead wormHead = ManageElement.elementManager.wormHead;
		
		//임시 머리에 실제머리 좌표 대입.
		wormHead.setFakeWormHead(wormHead.returnFakeWormHead()[0],wormHead.returnFakeWormHead()[1]);
		//몸통들 전부 이동
		for(int index = ManageElement.elementManager.wormHead.returnWormSize()-1 ; index >0 ; index--) {
			//index번째 지렁이 객체 받아오기
			Worm worm = ManageElement.elementManager.wormHead.getWorm(index);
			//지렁이 몸통 이동 메소드 호출 (바로 전 지렁이 객체 좌표 대입)
			moveWormBody(worm, index);			
		}
		//지렁이 머리 이동 메소드 호출
		moveWormHead(wormHead);
	}
	
	private void moveWormHead(WormHead wormHead, int headX, int headY) {
		
		//오른쪽 : x+1, y
		if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.RIGHT)) {
			//이동할 공간 확인
			checkArea(headX+1, headY);
			//게임 필드에서 삭제
			ManageElement.elementManager.gamefield.removeElement(wormHead.returnX(), wormHead.returnY());}
		}
			
	
	default void telpoWorm(WormHead wormHead, TelpoBlock telpoBlock) {
		//이거 혹은
		wormHead.setFakeWormHead(telpoBlock.telpoOtherReturn()[0],telpoBlock.telpoOtherReturn()[1]);

	}
	
	
	private void moveWormHead(WormHead wormHead) {
		int headX = wormHead.returnX();
		int headY = wormHead.returnY();
		
		//오른쪽 : x+1, y
		if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.RIGHT)) {
			//이동할 공간 확인
			checkArea(headX, headY-1);
			//실제 머리에 임시머리 좌표 대입
			wormHead.returnWorm().setXY(wormHead.returnFakeWormHead()[0], wormHead.returnFakeWormHead()[1]);
			//지렁이 머리의 좌표 설정
			wormHead.setXY(--headX, headY);
			//게임 필드에 지렁이 머리 저장
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//왼쪽 : x-1, y
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.LEFT)) {
			//이동할 공간 확인
			checkArea(headX-1, headY);
			//실제 머리에 임시머리 좌표 대입
			wormHead.returnWorm().setXY(wormHead.returnFakeWormHead()[0], wormHead.returnFakeWormHead()[1]);
			//지렁이 머리의 좌표 설정
			wormHead.setXY(--headX, headY);
			//게임 필드에 지렁이 머리 저장
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//위쪽 : x, y+1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.UP)) {
			//이동할 공간 확인
			checkArea(headX, headY+1);
			//실제 머리에 임시머리 좌표 대입
			wormHead.returnWorm().setXY(wormHead.returnFakeWormHead()[0], wormHead.returnFakeWormHead()[1]);
			//지렁이 머리의 좌표 설정
			wormHead.setXY(--headX, headY);
			//게임 필드에 지렁이 머리 저장
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//아래쪽 : x, y-1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.DOWN)) {
			//이동할 공간 확인
			checkArea(headX, headY-1);
			//실제 머리에 임시머리 좌표 대입
			wormHead.returnWorm().setXY(wormHead.returnFakeWormHead()[0], wormHead.returnFakeWormHead()[1]);
			//지렁이 머리의 좌표 설정
			wormHead.setXY(--headX, headY);
			//게임 필드에 지렁이 머리 저장
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//이동없음
		else
			;
	}
	

	
	
	private void calcMove(int moveXY[]) {
		//오른쪽 : x+1, y
		if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.RIGHT)) {
			moveXY[0] = +1;
			moveXY[1] = 0;
		}
		//왼쪽 : x-1, y
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.LEFT)) {
			moveXY[0] = -1;
			moveXY[1] = 0;
		}
		//위쪽 : x, y+1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.UP)) {
			moveXY[0] = 0;
			moveXY[1] = +1;
		}
		//아래쪽 : x, y-1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.DOWN)) {
			moveXY[0] = 0;
			moveXY[1] = -1;
		}
		//이동없음
		else {
			moveXY[0] = 0;
			moveXY[1] = 0;
		}
	}
	
	
	private void moveWormBody(Worm worm, int index) {
		//게임 필드에서 삭제
		ManageElement.elementManager.gamefield.removeElement(worm.returnX(), worm.returnY());
		
		//지렁이 좌표설정
		worm.setXY(worm.getWorm(index-1).returnX(),worm.getWorm(index-1).returnY() );

		
		//게임 필드에 지렁이 몸통 저장
		ManageElement.elementManager.gamefield.setElement(worm);
	}

	private void checkArea(int areaX, int areaY) {
		if(null == ManageElement.elementManager.gamefield.checkElement(areaX, areaY)) {
			;
		}
		else {
			//ManageElement.elementManager.gamefield.checkElement(areaX, areaY).executeElement();
		}
	}

	default void moveTelpo() {
		//기존 텔레포트 삭제		
		ManageElement.elementManager.deleteElement(ManageElement.elementManager.telpoBlockA.returnX(), ManageElement.elementManager.telpoBlockA.returnY());
		ManageElement.elementManager.deleteElement(ManageElement.elementManager.telpoBlockB.returnX(), ManageElement.elementManager.telpoBlockB.returnY());
		
		//새 텔레포트 생성
		ManageElement.elementManager.createTelpoBlock();
	}
}

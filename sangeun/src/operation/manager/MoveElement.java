package operation.manager;

import element.Worm;
import element.block.TelpoBlock;
import element.worm.WormHead;
import operation.ManageElement;

public interface MoveElement {

	
	default void moveWorm() {
		int[] headXY = ManageElement.elementManager.wormHead.returnWormHead();
		//지렁이 몸통 갯수만큼 반복
		WormHead wormhead = ManageElement.elementManager.wormHead;
		int x = 0, y = 0;
		for(int index = 0; index < ManageElement.elementManager.wormHead.returnWormSize(); index++) {
			//index번째 지렁이 객체 받아오기
			Worm worm = ManageElement.elementManager.wormHead.getWorm(index);
			
			//지렁이 머리일 경우
			if(index == 0) {
				//지렁이 머리 이동 메소드 호출
				moveWormHead((WormHead)worm);

			}
			//몸통일 경우
			else {
				//지렁이 몸통 이동 메소드 호출 (바로 전 지렁이 객체 좌표 대입)
				moveWormBody(worm, x, y);
			}
			
			//index번째 지렁이 객체의 좌표 저장
			x = worm.returnX();
			y = worm.returnY();
		}
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
		int headX = wormHead.returnX();
		int headY = wormHead.returnY();
		int [] otherTelpoBlock = telpoBlock.telpoOtherReturn();
		headX = otherTelpoBlock[0];
		headX = otherTelpoBlock[1];
		ManageElement.elementManager.wormHead.returnWorm().setXY(headX, headY);
		
		//이거
		int [] otherTelpoBlock = telpoBlock.telpoOtherReturn();
		ManageElement.elementManager.wormHead.returnWorm().setXY(otherTelpoBlock[0], otherTelpoBlock[1]);
		
	}
	
	
	private void moveWormHead(WormHead wormHead) {
		int headX = wormHead.returnX();
		int headY = wormHead.returnY();
		
		//오른쪽 : x+1, y
		if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.RIGHT)) {
			//게임 필드에서 삭제
			ManageElement.elementManager.gamefield.removeElement(headX, headY);
			//지렁이 머리의 좌표 설정
			wormHead.setXY(++headX, headY);
			//게임 필드에 지렁이 머리 저장
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//왼쪽 : x-1, y
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.LEFT)) {
			//이동할 공간 확인
			checkArea(headX-1, headY);
			//게임 필드에서 삭제
			ManageElement.elementManager.gamefield.removeElement(wormHead.returnX(), wormHead.returnY());
			//게임 필드에서 삭제
			ManageElement.elementManager.gamefield.removeElement(headX, headY);
			//지렁이 머리의 좌표 설정
			wormHead.setXY(--headX, headY);
			//게임 필드에 지렁이 머리 저장
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//위쪽 : x, y+1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.UP)) {
			//이동할 공간 확인
			checkArea(headX, headY+1);
			//게임 필드에서 삭제
			ManageElement.elementManager.gamefield.removeElement(wormHead.returnX(), wormHead.returnY());
			//게임 필드에서 삭제
			ManageElement.elementManager.gamefield.removeElement(headX, headY);
			//지렁이 머리의 좌표 설정
			wormHead.setXY(headX, ++headY);
			//게임 필드에 지렁이 머리 저장
			ManageElement.elementManager.gamefield.setElement(wormHead);

		//아래쪽 : x, y-1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.DOWN)) {

			//이동할 공간 확인
			checkArea(headX, headY-1);
			//게임 필드에서 삭제
			ManageElement.elementManager.gamefield.removeElement(wormHead.returnX(), wormHead.returnY());

			//게임 필드에서 삭제
			ManageElement.elementManager.gamefield.removeElement(headX, headY);

			//지렁이 머리의 좌표 설정
			wormHead.setXY(headX, --headY);
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
	
	
	private void moveWormBody(Worm worm, int x, int y) {
		//게임 필드에서 삭제
		ManageElement.elementManager.gamefield.removeElement(worm.returnX(), worm.returnY());
		//지렁이 몸통의 좌표 설정
		worm.setXY(x, y);
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

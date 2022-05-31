package operation.manager;

import element.Worm;
import element.block.TelpoBlock;
import element.worm.WormHead;
import operation.ManageElement;

public interface MoveElement {

	MoveInfo moveInfo = new MoveInfo();

	default void moveWorm() {
		
		//이동 여부 확인
		//if (ManageElement.elementManager.wormDirection.isMove == true)
		//{머리이동 및 몸통 이동 호출}
		//else
		//{아무것도 실행 안함}
		
		//지렁이 머리 이동 호출
		moveWormHead();
		//지렁이 몸통 이동 호출
		moveWormBody();
	}

	private void moveWormHead() {
		//현재 머리 좌표 저장
		moveInfo.indexXY[0] = ManageElement.elementManager.wormHead.returnX();
		moveInfo.indexXY[1] = ManageElement.elementManager.wormHead.returnY();
		
		//게임 필드에서 삭제
		ManageElement.elementManager.gamefield.removeElement(ManageElement.elementManager.wormHead.returnX(), ManageElement.elementManager.wormHead.returnY());
		
		//지렁이 머리의 좌표 설정
		ManageElement.elementManager.wormHead.setXY(moveInfo.directXY[0] + moveInfo.moveXY[0], moveInfo.directXY[1] + moveInfo.moveXY[1]);
		
		//게임 필드에 지렁이 머리 저장
		ManageElement.elementManager.gamefield.setElement(ManageElement.elementManager.wormHead);
	}
	
	private void moveWormBody() {
		for(int index = 1; index < ManageElement.elementManager.wormHead.returnWormSize(); index++) {
			//지렁이 객체 받아오기
			Worm worm = ManageElement.elementManager.wormHead.getWorm(index);
			
			//지렁이 좌표
			int x = worm.returnX();
			int y = worm.returnY();
			
			//게임 필드에서 삭제
			ManageElement.elementManager.gamefield.removeElement(x, y);
			
			//지렁이 몸통의 좌표 설정
			worm.setXY(moveInfo.indexXY[0], moveInfo.indexXY[1]);
			
			//게임 필드에 지렁이 몸통 저장
			ManageElement.elementManager.gamefield.setElement(worm);
			
			//원래 지렁이 몸통이 있었던 자리 저장
			moveInfo.indexXY[0] = x;
			moveInfo.indexXY[1] = y;
		}
	}
	
	default void checkMove() {
		//현재 위치 저장
		moveInfo.directXY[0] = ManageElement.elementManager.wormHead.returnX();
		moveInfo.directXY[1] = ManageElement.elementManager.wormHead.returnY();
		
		//이동 여부 확인
		//if (ManageElement.elementManager.wormDirection.isMove == true)
		//{좌표 변화 값 계산 및 공간 메소드 실행}
		//else
		//{아무것도 실행 안함}
		
		//좌표 변화 값 계산
		calcMove(moveInfo.moveXY);
		
		//공간 확인 및 요소 메소드 실행
		checkArea(moveInfo.directXY[0] + moveInfo.moveXY[0], moveInfo.directXY[1] + moveInfo.moveXY[1]);
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
			;
		}
	}
	
	private void checkArea(int areaX, int areaY) {
		//이동할 공간에 아무것도 없으면 작동 안함
		if(null == ManageElement.elementManager.gamefield.checkElement(areaX, areaY)) {
			;
		}
		//이동할 공간에 들어있는 요소의 메소드 호출
		else {
			//ManageElement.elementManager.gamefield.checkElement(areaX, areaY).executeElement();
		}
	}
	
	default void telpoWorm(int telpoX, int telpoY) {
		moveInfo.directXY[0] = telpoX;
		moveInfo.directXY[1] = telpoY;
	}

	default void moveTelpo() {
		//기존 텔레포트 삭제		
		ManageElement.elementManager.deleteElement(ManageElement.elementManager.telpoBlockA.returnX(), ManageElement.elementManager.telpoBlockA.returnY());
		ManageElement.elementManager.deleteElement(ManageElement.elementManager.telpoBlockB.returnX(), ManageElement.elementManager.telpoBlockB.returnY());
		
		//새 텔레포트 생성
		ManageElement.elementManager.createTelpoBlock();
	}
}

class MoveInfo {
	//0 : x좌표 변화 값, 1 : y좌표 변화 값
	int moveXY[] = new int[2];
	
	//0 : 이동 기준점 x좌표 값, 1 : y좌표 값
	int directXY[] = new int[2];
	
	//0 : 현재 위치 x좌표, 1 : 현재 위치 y좌표
	int indexXY[] = new int[2];
	
}

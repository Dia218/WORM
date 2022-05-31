package operation.manager;

import element.Worm;
import element.block.TelpoBlock;
import element.worm.WormHead;
import operation.ManageElement;

public interface MoveElement {

	MoveInfo moveInfo = new MoveInfo();

	default void moveWorm() {
		
		//�̵� ���� Ȯ��
		//if (ManageElement.elementManager.wormDirection.isMove == true)
		//{�Ӹ��̵� �� ���� �̵� ȣ��}
		//else
		//{�ƹ��͵� ���� ����}
		
		//������ �Ӹ� �̵� ȣ��
		moveWormHead();
		//������ ���� �̵� ȣ��
		moveWormBody();
	}

	private void moveWormHead() {
		//���� �Ӹ� ��ǥ ����
		moveInfo.indexXY[0] = ManageElement.elementManager.wormHead.returnX();
		moveInfo.indexXY[1] = ManageElement.elementManager.wormHead.returnY();
		
		//���� �ʵ忡�� ����
		ManageElement.elementManager.gamefield.removeElement(ManageElement.elementManager.wormHead.returnX(), ManageElement.elementManager.wormHead.returnY());
		
		//������ �Ӹ��� ��ǥ ����
		ManageElement.elementManager.wormHead.setXY(moveInfo.directXY[0] + moveInfo.moveXY[0], moveInfo.directXY[1] + moveInfo.moveXY[1]);
		
		//���� �ʵ忡 ������ �Ӹ� ����
		ManageElement.elementManager.gamefield.setElement(ManageElement.elementManager.wormHead);
	}
	
	private void moveWormBody() {
		for(int index = 1; index < ManageElement.elementManager.wormHead.returnWormSize(); index++) {
			//������ ��ü �޾ƿ���
			Worm worm = ManageElement.elementManager.wormHead.getWorm(index);
			
			//������ ��ǥ
			int x = worm.returnX();
			int y = worm.returnY();
			
			//���� �ʵ忡�� ����
			ManageElement.elementManager.gamefield.removeElement(x, y);
			
			//������ ������ ��ǥ ����
			worm.setXY(moveInfo.indexXY[0], moveInfo.indexXY[1]);
			
			//���� �ʵ忡 ������ ���� ����
			ManageElement.elementManager.gamefield.setElement(worm);
			
			//���� ������ ������ �־��� �ڸ� ����
			moveInfo.indexXY[0] = x;
			moveInfo.indexXY[1] = y;
		}
	}
	
	default void checkMove() {
		//���� ��ġ ����
		moveInfo.directXY[0] = ManageElement.elementManager.wormHead.returnX();
		moveInfo.directXY[1] = ManageElement.elementManager.wormHead.returnY();
		
		//�̵� ���� Ȯ��
		//if (ManageElement.elementManager.wormDirection.isMove == true)
		//{��ǥ ��ȭ �� ��� �� ���� �޼ҵ� ����}
		//else
		//{�ƹ��͵� ���� ����}
		
		//��ǥ ��ȭ �� ���
		calcMove(moveInfo.moveXY);
		
		//���� Ȯ�� �� ��� �޼ҵ� ����
		checkArea(moveInfo.directXY[0] + moveInfo.moveXY[0], moveInfo.directXY[1] + moveInfo.moveXY[1]);
	}
	
	
	private void calcMove(int moveXY[]) {
		//������ : x+1, y
		if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.RIGHT)) {
			moveXY[0] = +1;
			moveXY[1] = 0;
		}
		//���� : x-1, y
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.LEFT)) {
			moveXY[0] = -1;
			moveXY[1] = 0;
		}
		//���� : x, y+1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.UP)) {
			moveXY[0] = 0;
			moveXY[1] = +1;
		}
		//�Ʒ��� : x, y-1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.DOWN)) {
			moveXY[0] = 0;
			moveXY[1] = -1;
		}
		//�̵�����
		else {
			;
		}
	}
	
	private void checkArea(int areaX, int areaY) {
		//�̵��� ������ �ƹ��͵� ������ �۵� ����
		if(null == ManageElement.elementManager.gamefield.checkElement(areaX, areaY)) {
			;
		}
		//�̵��� ������ ����ִ� ����� �޼ҵ� ȣ��
		else {
			//ManageElement.elementManager.gamefield.checkElement(areaX, areaY).executeElement();
		}
	}
	
	default void telpoWorm(int telpoX, int telpoY) {
		moveInfo.directXY[0] = telpoX;
		moveInfo.directXY[1] = telpoY;
	}

	default void moveTelpo() {
		//���� �ڷ���Ʈ ����		
		ManageElement.elementManager.deleteElement(ManageElement.elementManager.telpoBlockA.returnX(), ManageElement.elementManager.telpoBlockA.returnY());
		ManageElement.elementManager.deleteElement(ManageElement.elementManager.telpoBlockB.returnX(), ManageElement.elementManager.telpoBlockB.returnY());
		
		//�� �ڷ���Ʈ ����
		ManageElement.elementManager.createTelpoBlock();
	}
}

class MoveInfo {
	//0 : x��ǥ ��ȭ ��, 1 : y��ǥ ��ȭ ��
	int moveXY[] = new int[2];
	
	//0 : �̵� ������ x��ǥ ��, 1 : y��ǥ ��
	int directXY[] = new int[2];
	
	//0 : ���� ��ġ x��ǥ, 1 : ���� ��ġ y��ǥ
	int indexXY[] = new int[2];
	
}

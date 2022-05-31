package operation.manager;

import element.Worm;
import element.block.TelpoBlock;
import element.worm.WormHead;
import operation.ManageElement;

public interface MoveElement {

	
	default void moveWorm() {
	
		ManageElement.elementManager.gamefield.removeElement(wormHead.returnX(), wormHead.returnY());
		WormHead wormHead = ManageElement.elementManager.wormHead;
		
		//�ӽ� �Ӹ��� �����Ӹ� ��ǥ ����.
		wormHead.setFakeWormHead(wormHead.returnFakeWormHead()[0],wormHead.returnFakeWormHead()[1]);
		//����� ���� �̵�
		for(int index = ManageElement.elementManager.wormHead.returnWormSize()-1 ; index >0 ; index--) {
			//index��° ������ ��ü �޾ƿ���
			Worm worm = ManageElement.elementManager.wormHead.getWorm(index);
			//������ ���� �̵� �޼ҵ� ȣ�� (�ٷ� �� ������ ��ü ��ǥ ����)
			moveWormBody(worm, index);			
		}
		//������ �Ӹ� �̵� �޼ҵ� ȣ��
		moveWormHead(wormHead);
	}
	
	private void moveWormHead(WormHead wormHead, int headX, int headY) {
		
		//������ : x+1, y
		if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.RIGHT)) {
			//�̵��� ���� Ȯ��
			checkArea(headX+1, headY);
			//���� �ʵ忡�� ����
			ManageElement.elementManager.gamefield.removeElement(wormHead.returnX(), wormHead.returnY());}
		}
			
	
	default void telpoWorm(WormHead wormHead, TelpoBlock telpoBlock) {
		//�̰� Ȥ��
		wormHead.setFakeWormHead(telpoBlock.telpoOtherReturn()[0],telpoBlock.telpoOtherReturn()[1]);

	}
	
	
	private void moveWormHead(WormHead wormHead) {
		int headX = wormHead.returnX();
		int headY = wormHead.returnY();
		
		//������ : x+1, y
		if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.RIGHT)) {
			//�̵��� ���� Ȯ��
			checkArea(headX, headY-1);
			//���� �Ӹ��� �ӽøӸ� ��ǥ ����
			wormHead.returnWorm().setXY(wormHead.returnFakeWormHead()[0], wormHead.returnFakeWormHead()[1]);
			//������ �Ӹ��� ��ǥ ����
			wormHead.setXY(--headX, headY);
			//���� �ʵ忡 ������ �Ӹ� ����
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//���� : x-1, y
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.LEFT)) {
			//�̵��� ���� Ȯ��
			checkArea(headX-1, headY);
			//���� �Ӹ��� �ӽøӸ� ��ǥ ����
			wormHead.returnWorm().setXY(wormHead.returnFakeWormHead()[0], wormHead.returnFakeWormHead()[1]);
			//������ �Ӹ��� ��ǥ ����
			wormHead.setXY(--headX, headY);
			//���� �ʵ忡 ������ �Ӹ� ����
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//���� : x, y+1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.UP)) {
			//�̵��� ���� Ȯ��
			checkArea(headX, headY+1);
			//���� �Ӹ��� �ӽøӸ� ��ǥ ����
			wormHead.returnWorm().setXY(wormHead.returnFakeWormHead()[0], wormHead.returnFakeWormHead()[1]);
			//������ �Ӹ��� ��ǥ ����
			wormHead.setXY(--headX, headY);
			//���� �ʵ忡 ������ �Ӹ� ����
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//�Ʒ��� : x, y-1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.DOWN)) {
			//�̵��� ���� Ȯ��
			checkArea(headX, headY-1);
			//���� �Ӹ��� �ӽøӸ� ��ǥ ����
			wormHead.returnWorm().setXY(wormHead.returnFakeWormHead()[0], wormHead.returnFakeWormHead()[1]);
			//������ �Ӹ��� ��ǥ ����
			wormHead.setXY(--headX, headY);
			//���� �ʵ忡 ������ �Ӹ� ����
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//�̵�����
		else
			;
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
			moveXY[0] = 0;
			moveXY[1] = 0;
		}
	}
	
	
	private void moveWormBody(Worm worm, int index) {
		//���� �ʵ忡�� ����
		ManageElement.elementManager.gamefield.removeElement(worm.returnX(), worm.returnY());
		
		//������ ��ǥ����
		worm.setXY(worm.getWorm(index-1).returnX(),worm.getWorm(index-1).returnY() );

		
		//���� �ʵ忡 ������ ���� ����
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
		//���� �ڷ���Ʈ ����		
		ManageElement.elementManager.deleteElement(ManageElement.elementManager.telpoBlockA.returnX(), ManageElement.elementManager.telpoBlockA.returnY());
		ManageElement.elementManager.deleteElement(ManageElement.elementManager.telpoBlockB.returnX(), ManageElement.elementManager.telpoBlockB.returnY());
		
		//�� �ڷ���Ʈ ����
		ManageElement.elementManager.createTelpoBlock();
	}
}

package operation.manager;

import element.Worm;
import element.block.TelpoBlock;
import element.worm.WormHead;
import operation.ManageElement;

public interface MoveElement {

	default void moveWorm() {

		//������ ���� ������ŭ �ݺ�
		int x = 0, y = 0;
		for(int index = 0; index < ManageElement.elementManager.wormHead.returnWormSize(); index++) {
			//index��° ������ ��ü �޾ƿ���
			Worm worm = ManageElement.elementManager.wormHead.getWorm(index);
			
			//������ �Ӹ��� ���
			if(index == 0) {
				//������ �Ӹ� �̵� �޼ҵ� ȣ��
				moveWormHead((WormHead)worm);
			}
			//������ ���
			else {
				//������ ���� �̵� �޼ҵ� ȣ�� (�ٷ� �� ������ ��ü ��ǥ ����)
				moveWormBody(worm, x, y);
			}
			
			//index��° ������ ��ü�� ��ǥ ����
			x = worm.returnX();
			y = worm.returnY();
		}
	}
	
	default void telpoWorm(WormHead wormHead, TelpoBlock telpoBlock) {
		int headX = wormHead.returnX();
		int headY = wormHead.returnY();
		int [] otherTelpoBlock = telpoBlock.telpoOtherReturn();
		headX = otherTelpoBlock[0];
		headX = otherTelpoBlock[1];
		ManageElement.elementManager.wormHead.returnWorm().setXY(headX, headY);
	}
	
	private void moveWormHead(WormHead wormHead) {
		int headX = wormHead.returnX();
		int headY = wormHead.returnY();
		
		//������ : x+1, y
		if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.RIGHT)) {
			//���� �ʵ忡�� ����
			ManageElement.elementManager.gamefield.removeElement(headX, headY);
			//������ �Ӹ��� ��ǥ ����
			wormHead.setXY(++headX, headY);
			//���� �ʵ忡 ������ �Ӹ� ����
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//���� : x-1, y
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.LEFT)) {
			//���� �ʵ忡�� ����
			ManageElement.elementManager.gamefield.removeElement(headX, headY);
			//������ �Ӹ��� ��ǥ ����
			wormHead.setXY(--headX, headY);
			//���� �ʵ忡 ������ �Ӹ� ����
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//���� : x, y+1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.UP)) {
			//���� �ʵ忡�� ����
			ManageElement.elementManager.gamefield.removeElement(headX, headY);
			//������ �Ӹ��� ��ǥ ����
			wormHead.setXY(headX, ++headY);
			//���� �ʵ忡 ������ �Ӹ� ����
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//�Ʒ��� : x, y-1
		else if (ManageElement.elementManager.wormDirection.getDirection().equals(ManageElement.elementManager.wormDirection.direction.DOWN)) {
			//���� �ʵ忡�� ����
			ManageElement.elementManager.gamefield.removeElement(headX, headY);
			//������ �Ӹ��� ��ǥ ����
			wormHead.setXY(headX, --headY);
			//���� �ʵ忡 ������ �Ӹ� ����
			ManageElement.elementManager.gamefield.setElement(wormHead);
		}
		//�̵�����
		else
			;
	}
	
	private void moveWormBody(Worm worm, int x, int y) {
		//���� �ʵ忡�� ����
		ManageElement.elementManager.gamefield.removeElement(worm.returnX(), worm.returnY());
		//������ ������ ��ǥ ����
		worm.setXY(x, y);
		//���� �ʵ忡 ������ ���� ����
		ManageElement.elementManager.gamefield.setElement(worm);
	}

	
	default void moveTelpo() {
		//���� �ڷ���Ʈ ����		
		ManageElement.elementManager.deleteElement(ManageElement.elementManager.telpoBlockA.returnX(), ManageElement.elementManager.telpoBlockA.returnY());
		ManageElement.elementManager.deleteElement(ManageElement.elementManager.telpoBlockB.returnX(), ManageElement.elementManager.telpoBlockB.returnY());
		
		//�� �ڷ���Ʈ ����
		ManageElement.elementManager.createTelpoBlock();
	}
}

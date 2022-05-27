package operation;

import java.util.*;
import element.*;
import element.block.*;
import element.item.*;
import screen.GameField;

//element ��ü�� �����ϴ� Ŭ����
public class CreateElement {
	
	/*���� Ŭ������ �ʵ�*/
	Random rand = new Random();

	/*���� Ŭ������ ������*/
	public CreateElement() {
		//���� Ȯ��
		System.out.println("createElement ��ü ����");
	}
	
	
	/*���� Ŭ������ �޼ҵ�*/
	public void initElement() {
		//���� Ȯ��
		System.out.println("��� init ����");
		
		//������ �Ӹ� ����
		//WormHead wormHead = new WormHead(0, 0);
		//System.put.println("������ �Ӹ� ����");
		
		//��� �̴� ȣ��
		initBlock();
		
		//������ �̴� ȣ��
		initItem();
	}
	
	
	/*��� ���� �޼ҵ�*/
	
	//��� �ʱ�ȭ �޼ҵ�
	private void initBlock() {
		//���� Ȯ��
		System.out.println("��� init ����");
		
		//���� ��� ���� ȣ��
		createTelpoBlock();
		
		//ų ��� ���� ȣ�� : 2����
		for (int num = 1; num <= 2; num++) {
			createKillBlock();
		}
		
		//�⺻ ��� ���� ȣ�� : 4����
		for (int num = 1; num <= 4; num++) {
			createBasicBlock();
		}
	}
	
	//�ڷ���Ʈ ��� ���� �޼ҵ�
	public void createTelpoBlock() {
		//���� Ȯ��
		System.out.println("�ڷ���Ʈ ��� ���� ȣ��");
		
		int telpoArandXY[] = new int[2]; //0 = X ��ǥ, 1 = Y ��ǥ
		int telpoBrandXY[] = new int[2]; //0 = X ��ǥ, 1 = Y ��ǥ

		//��ǥ ���ϱ�
		randomLocate(telpoArandXY);
		randomLocate(telpoBrandXY);
		
		//�ڷ���Ʈ ��� ��ü ���� - A, B
		TelpoBlock telpoBlockA = new TelpoBlock(telpoArandXY[0], telpoArandXY[1]);
		TelpoBlock telpoBlockB = new TelpoBlock(telpoBrandXY[0], telpoBrandXY[1]);
		GameField.gamefield.setElement(telpoBlockA);
		GameField.gamefield.setElement(telpoBlockB);

		//�ڷ���Ʈ ��� ��ü ���� ����?
		
	}
	
	//ų ��� ���� �޼ҵ�
	public void createKillBlock() {
		//���� Ȯ��
		System.out.println("ų ��� ���� ȣ��");
		
		int randXY[] = new int[2]; //0 = X ��ǥ, 1 = Y ��ǥ
		int sizeWL[] = new int[2]; //0 = Width ����, 1 = Length ����
		
		//2 * 2 ������� ����
		sizeWL[0] = 2;
		sizeWL[1] = 2;
		
		//2 * 2 ũ�Ⱑ �� �� �ִ� ��ǥ ����
		do {
			//��ǥ ���ϱ�
			randomLocate(randXY);
			
			//�� ���� ��ǥ�� ���� �ʵ带 ��� ��� �ٷ� do �ٽ� ����
			if(randXY[0] + sizeWL[0] - 1 >= GameField.gamefield.elementNum) {
				continue;
			}
			if(randXY[1] + sizeWL[1] - 1 >= GameField.gamefield.elementNum) {
				continue;
			}
			
			//������ �׽�Ʈ�� ����ϸ� do-while �ݺ��� ����
			if(testSize(randXY, sizeWL) == true) {
				break;
			}
		} while(true);
		
		//ų ��� ��ü ����
		for(int x = randXY[0]; x <= randXY[0] + sizeWL[0] - 1; x++) {
			for(int y = randXY[1]; y <= randXY[1] + sizeWL[1] - 1; y++) {
				KillBlock killBlock = new KillBlock(x, y);
				GameField.gamefield.setElement(killBlock);
			}
		}
	}
	
	//�⺻ ��� ���� �޼ҵ�
	public void createBasicBlock() {
		//���� Ȯ��
		System.out.println("�⺻ ��� ���� ȣ��");
		
		int randXY[] = new int[2]; //0 = X ��ǥ, 1 = Y ��ǥ
		int sizeWL[] = new int[2]; //0 = Width ����, 1 = Length ����
		
		//��ǥ ���ϱ�
		randomLocate(randXY);
		
		//������ ���ϱ�
		randomSize(randXY, sizeWL);
		
		//�⺻ ��� ��ü ����
		for(int x = randXY[0]; x <= randXY[0] + sizeWL[0] - 1; x++) {
			for(int y = randXY[1]; y <= randXY[1] + sizeWL[1] - 1; y++) {
				BasicBlock basicBlock = new BasicBlock(x, y);
				GameField.gamefield.setElement(basicBlock);		
			}
		}
	}
	
	
	/*������ ���� �޼ҵ�*/
	
	//������ �ʱ�ȭ �޼ҵ�
	private void initItem() {
		//���� Ȯ��
		System.out.println("������ ���� ȣ��");
		
		//���� ������ ���� ȣ��
		createGoodItem();
		
		//���� ������ ���� ȣ��
		createBadItem();
		
		//ȥ�� ������ ���� ȣ��
		createConfuseItem();
	}
	
	//���� ������ ���� �޼ҵ�
	public void createGoodItem() {
		//���� Ȯ��
		System.out.println("���� ������ ���� ȣ��");
		
		int randXY[] = new int[2]; //0 = X ��ǥ, 1 = Y ��ǥ

		//��ǥ ���ϱ�
		randomLocate(randXY);
		
		//���� ������ ��ü ����
		GoodItem goodItem = new GoodItem(randXY[0], randXY[1]);
		GameField.gamefield.setElement(goodItem);
	}
	
	//���� ������ ���� �޼ҵ�
	public void createBadItem() {
		//���� Ȯ��
		System.out.println("���� ������ ���� ȣ��");
		
		int randXY[] = new int[2]; //0 = X ��ǥ, 1 = Y ��ǥ

		//��ǥ ���ϱ�
		randomLocate(randXY);
		
		//���� ������ ��ü ����
		BadItem badItem = new BadItem(randXY[0], randXY[1]);
		GameField.gamefield.setElement(badItem);
	}
	
	//ȥ�� ������ ���� �޼ҵ�
	public void createConfuseItem() {
		//���� Ȯ��
		System.out.println("ȥ�� ������ ���� ȣ��");
		
		int randXY[] = new int[2]; //0 = X ��ǥ, 1 = Y ��ǥ

		//��ǥ ���ϱ�
		randomLocate(randXY);
		
		//ȥ�� ������ ��ü ����
		ConfuseItem ConfuseItem = new ConfuseItem(randXY[0], randXY[1]);
		GameField.gamefield.setElement(ConfuseItem);
	}
	
	
	/*���� ���� �޼ҵ�*/
	
	//��ǥ ���� ���� �޼ҵ�
	private void randomLocate(int randXY[]) {
		//���� Ȯ��
		System.out.println("��ǥ ���� ���� ȣ��");
		
		//0���� (��� �ִ� ����-1)���� ���� �� ���� ����
		randXY[0] = rand.nextInt(GameField.gamefield.elementNum) + 0;
		randXY[1] = rand.nextInt(GameField.gamefield.elementNum) + 0;
		
		//�ش� ��ǥ�� ��ü�� ���� ������ ���ȣ��
		while (null != GameField.gamefield.checkElement(randXY[0], randXY[1])) {
			randomLocate(randXY);
		}
	}
	
	//������ ���� ���� �޼ҵ�
	private void randomSize(int randXY[], int sizeWL[]) {
		//���� Ȯ��
		System.out.println("��� ������ ���� ���� ȣ��");

		do {
			//������ : 1���� 4������ ���� �� ���� ����
			sizeWL[0] = rand.nextInt((4-1) + 1) + 1;
			sizeWL[1] = rand.nextInt((4-1) + 1) + 1;

			//�� ���� ��ǥ�� ���� �ʵ带 ��� ��� �ٷ� do �ٽ� ����
			if(randXY[0] + sizeWL[0] - 1 >= GameField.gamefield.elementNum) {
				continue;
			}
			if(randXY[1] + sizeWL[1] - 1 >= GameField.gamefield.elementNum) {
				continue;
			}
			
			//������ �׽�Ʈ�� ����ϸ� do-while �ݺ��� ����
			if(testSize(randXY, sizeWL) == true) {
				break;
			}
			
		} while(true);
	}
	
	//������ ����� �ùٸ��� �׽�Ʈ �ϴ� �޼ҵ�
	private Boolean testSize(int randXY[], int sizeWL[]) {
		//���� Ȯ��
		System.out.println("��� ������ �׽�Ʈ ȣ��");
		
		//��ǥ�� ���ư��鼭 �˻�
		int x = randXY[0]+1; int y = randXY[1]+1;
		while(x <= randXY[0]+sizeWL[0]-1) {
			while(y <= randXY[1]+sizeWL[1]-1) {
				//�ش� ��ǥ�� element�� ���� ���
				if(null != GameField.gamefield.checkElement(x, y)) {
					x = 100; y = 100; //�ݺ��� ����������
				}
				y++;
			}
			x++;
		}
		
		//������ �˻��ߴٸ� true
		if(x == randXY[0]+sizeWL[0] && y == randXY[1]+sizeWL[1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void createWormBody(/*�� �κ��� ��ü ���۷����� �޾ƿ;��� �� ����*/) {
		
	}
	


}

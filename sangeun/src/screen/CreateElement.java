package screen;

import java.util.*;
import element.*;
import element.block.*;
import element.item.*;

//element ��ü�� �����ϴ� Ŭ����
public class CreateElement {
	
	/*��� ���� Ŭ���� �ʵ�*/
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
			
			//�˻� �ٽ� ����
		
			//(x+1) ��ǥ �˻�
			if (null != GameField.gamefield.checkElement(randXY[0]+1, randXY[1])) {
				//������� ������ �ٷ� do �ݺ�
				continue;
			}
		
			//(y+1) ��ǥ �˻�
			if (null != GameField.gamefield.checkElement(randXY[0], randXY[1]+1)) {
				//������� ������ �ٷ� do �ݺ�
				continue;
			}
			
			//�˻縦 ���ϸ� do �ݺ��� ����
			break;
			
		} while(true);
		
		//ų ��� ��ü - ���� ����
		for(int addWidth = 0; addWidth < sizeWL[0]; addWidth++) {
			KillBlock killBlock = new KillBlock(randXY[0]+addWidth, randXY[1]);
			GameField.gamefield.setElement(killBlock);	
		}
		//ų ��� ��ü - ���� ����
		for(int addLength = 0; addLength < sizeWL[1]; addLength++) {
			KillBlock killBlock = new KillBlock(randXY[0], randXY[1]+addLength);
			GameField.gamefield.setElement(killBlock);
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
		
		//�⺻ ��� ��ü - ���� ����
		for(int addWidth = 0; addWidth < sizeWL[0]; addWidth++) {
			BasicBlock basicBlock = new BasicBlock(randXY[0]+addWidth, randXY[1]);
			GameField.gamefield.setElement(basicBlock);	
		}
		//�⺻ ��� ��ü - ���� ����
		for(int addLength = 0; addLength < sizeWL[1]; addLength++) {
			BasicBlock basicBlock = new BasicBlock(randXY[0], randXY[1]+addLength);
			GameField.gamefield.setElement(basicBlock);
		}
		
		
		/*
		 **������ ���� ���� ����
		 *
		 * ��� ����� �ʵ带 �Ѿ �� �ִµ� �װ� üũ�ϴ� �� ���� 
		 *
		 * */
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
	
	/*
	//������ ���� ���� �޼ҵ�
	private void randomSize(int randXY[], int sizeWL[]) {
		//���� Ȯ��
		System.out.println("��� ������ ���� ���� ȣ��");
		
		//������ : 1���� 4������ ���� �� ���� ����
		
		////Width ���� ���ϱ�////
		int addWidth = 0;
		do {
			//Width ���̸� �������� ���� : sizeWL[0] <- 1 to 4 
			sizeWL[0] = rand.nextInt((4-1) + 1) + 1;
			
			//(x+1)���� (����)���� ��ǥ �˻� : index <- 0+1 to 2+1
			while(addWidth < sizeWL[0]-1) {
				addWidth++;
				//null ���� �ƴ� ��� ���� while ���� -> do �ݺ�
				if (null != GameField.gamefield.checkElement(randXY[0]+addWidth, randXY[1])) {
					addWidth = 0;
					break;
				}
			}
			
		//���� while���� ������ �˻��ϸ� do ����
		} while(addWidth != sizeWL[0]-1);
		
		
		////Length ���� ���ϱ�////
		int addLength = 0;
		do {
			//Length ���̸� �������� ���� : sizeWL[1] <- 1 to 4
			sizeWL[1] = rand.nextInt((4-1) + 1) + 1;
			
			//(y+1)���� (����)���� ��ǥ �˻� : addLength <- 0+1 to 2+1
			while(addLength < sizeWL[1]-1) {
				addLength++;
				//null ���� �ƴ� ��� ���� while ���� -> do �ݺ�
				if (null != GameField.gamefield.checkElement(randXY[0], randXY[1]+addLength)) {
					addLength = 0;
					break;
				}
			}
			
		//���� while���� ������ �˻��ϸ� do ����
		} while(addLength != sizeWL[1]-1);
	} */
	
	//������ ���� ���� �޼ҵ�
	private void randomSize(int randXY[], int sizeWL[]) {
		//���� Ȯ��
		System.out.println("��� ������ ���� ���� ȣ��");
		
		//������ : 1���� 4������ ���� �� ���� ����

		
		/*
		 * 
		 *
		 * 
		 * */
	}
	

	
	public void createWormBody(/*�� �κ��� ��ü ���۷����� �޾ƿ;��� �� ����*/) {
		
	}
	


}
/*
 **�ʱ� ����**
 * ������ �Ӹ� ����
 * ��ϵ� ����
 * �����۵� ����
 * 
 **���� ��**
 * ���� ������ ������ �� ���� ������ ����
 * ���� ���� �߰�
 * ���� �ð� �� ȥ��, ���� ������ ���� �� ���� �ݺ�
 * */

/*
 ****���� 
 * 
 * 
 **����
 * 
 *
 **����
 *
 * */
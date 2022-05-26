package screen;

import element.Block;
import element.block.*;
import java.util.*;
import element.*;

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
		//������ �Ӹ� ����
		//WormHead wormHead = new WormHead(0, 0);
		//System.put.println("������ �Ӹ� ����");
		
		//��� �̴� ȣ��
		initBlock();
		
		//������ �̴� ȣ��
		//initItem();
		
		//���� Ȯ��
		System.out.println("��� init ����");
	}
	
	//��� ���� �޼ҵ�
	public void initBlock() {
		
		//���� ��� ����
		//createTelpoBlock();
		
		//ų ��� ����
		//createKillBlock();
		
		//�⺻ ��� ���� : 4��
		for (int num = 1; num <= 4; num++) {
			createBasicBlock();
		}
		
		//���� Ȯ��
		System.out.println("��� init ����");
	}
	
	public void createTelpoBlock() {
		
	}
	
	public void createKillBlock() {
		
	}
	
	public void createBasicBlock() {
		int randXY[] = new int[2]; //0 = X ��ǥ, 1 = Y ��ǥ
		int sizeWL[] = new int[2]; //0 = Width ����, 1 = Length ����
		
		//��ǥ ���ϱ�
		randomLocate(randXY);
		
		//������ ���ϱ�
		randomSize(randXY, sizeWL);
		
		//��ü �����ϱ�		
		for(int width = 0; width <= sizeWL[0]; width++) {
			BasicBlock basicBlock = new BasicBlock(randXY[0]+width, randXY[1]);
			
		}
		for(int length = 0; length <= sizeWL[1]; length++) {
			BasicBlock basicBlock = new BasicBlock(randXY[0], randXY[1]+length);
		}
		
		//���� Ȯ��
		System.out.println("�⺻ ��� ����");
	}
	
	
	//��ǥ ���� ���� �޼ҵ�
	private void randomLocate(int randXY[]) {
		//0���� (��� �ִ� ����-1)���� ���� �� ���� ����
		randXY[0] = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
		randXY[1] = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
		
		//�ش� ��ǥ�� ��ü�� ���� ������ ���ȣ��
		while (null != GameField.gamefield.checkElement(randXY[0], randXY[1])) {
			randomLocate(randXY);
		}
	}
	
	//������ ���� ���� �޼ҵ�
	private void randomSize(int randXY[], int sizeWL[]) {
		//0���� 3���� ���� �� ���� ���� -> ����/���� : (1 + 0) ~ (1 + 3)
		
		////Width ���� ���ϱ�////
		int index = 0;
		do {
			//Width ���̸� �������� ����
			sizeWL[0] = rand.nextInt(3) + 0;
			
			//(x+1)���� (x+����)���� ��ǥ �˻�
			while(index <= sizeWL[0]) {
				index++;
				//null ���� �ƴ� ��� ���� while ���� -> do �ݺ�
				if (null != GameField.gamefield.checkElement(randXY[0]+index, randXY[1])) {
					index = 0;
					break;
				}
			}
			
		//���� while���� ������ �˻��ϸ� do ����
		} while(index != sizeWL[0]);
		
		
		////Length ���� ���ϱ�////
		index = 0;
		do {
			//Length ���̸� �������� ����
			sizeWL[1] = rand.nextInt(3) + 0;
			
			//(y+1)���� (y+����)���� ��ǥ �˻�
			while(index <= sizeWL[1]) {
				index++;
				//null ���� �ƴ� ��� ���� while ���� -> do �ݺ�
				if (null != GameField.gamefield.checkElement(randXY[0+index], randXY[1]+index)) {
					index = 0;
					break;
				}
			}
			
		//���� while���� ������ �˻��ϸ� do ����
		} while(index != sizeWL[1]);
	}
	

	
	public void initItem() {
		
	}
	

	
	public void createGoodItem() {
		
	}
	
	public void createBadItem() {
		
	}
	
	public void createConfuseItem() {
		
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
 **�ʿ��� �޼ҵ�**
 * ���� ��ǥ �����
 * 
 * 
 * */
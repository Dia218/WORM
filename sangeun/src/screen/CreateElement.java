package screen;

import element.Block;

import java.util.Random;
import element.block.TelpoBlock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import screen.GameField;
import element.*;

//element ��ü�� �����ϴ� Ŭ����
public class CreateElement {

	//��һ��� ��ü�� �� ���� �����ȴ�
	public static final CreateElement createElement = new CreateElement();
	
	/*��� ���� Ŭ���� �ʵ�*/
	Random rand = new Random();

	/*���� Ŭ������ ������*/
	private CreateElement() {
		//WormHead wormHead = new WormHead(0, 0);
		//System.put.println("������ �Ӹ� ����");
	}
	
	
	/*���� Ŭ������ �޼ҵ�*/
	
	public void initBlock() {
		
	}
	
	public void createBasicBlock() {
		randomLocate();
	}
	
	public void createKillBlock() {
		
	}
	
	public void createTelpoBlock() {
		
	}
	
	public void createGoodItem() {
		
	}
	
	public void createBadItem() {
		
	}
	
	public void createConfuseItem() {
		
	}
	
	public void createWormBody(/*�� �κ��� ��ü ���۷����� �޾ƿ;��� �� ����*/) {
		
	}
	
	//��ǥ ���� ���� �޼ҵ�
	public void randomLocate() {
		//0���� (��� �ִ� ����-1)���� ���� �� ���� ����
		int randX = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
		int randY = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
		
		//�ش� ��ǥ�� ��ü�� ���� ���
		if(GameField.gamefield.checkLocate(randX, randY)) {
			//��ü ����
		}
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
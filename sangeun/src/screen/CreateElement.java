package screen;

import element.Block;

import java.util.Random;

import element.*;

//element ��ü�� �����ϴ� Ŭ����
public class CreateElement {

	//��һ��� ��ü�� �� ���� �����ȴ�
	public static final CreateElement createElement = new CreateElement();
	
	/*��� ���� Ŭ���� �ʵ�*/
	Random rand = new Random();
	int randX = 0;
	int randY = 0;
	
	/*���� Ŭ������ ������*/
	private CreateElement() {
		
		
	}
	
	
	/*���� Ŭ������ �޼ҵ�*/
	
	public void initBlock() {
		
	}
	
	public void BasicBlock() {
		
	}
	
	public void KillBlock() {
		
	}
	
	public void TelpoBlock() {
		
	}
	
	public void createGoodItem() {
		
	}
	
	public void createBadItem() {
		
	}
	
	public void createConfuseItem() {
		
	}
	
	public void createWormBody(/*�� �κ��� ��ü ���۷����� �޾ƿ;��� �� ����*/) {
		
	}
	
	public void check
	
	public void randomNum() {
		this.randX = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
		this.randY = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
		
		//�ش� ��ǥ�� ��ü�� ���� ���
		if(GameField.gamefield.checkLocate(randX, randY)) {
			
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
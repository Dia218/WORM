package screen;

import element.block.TelpoBlock;
import element.item.GoodItem;

//���� Ŭ����
public class Main {
		
	public static void main(String[] args) {
		GameFrame gameFrame = new GameFrame();	
		
		
		//�ӽ÷� ����!!
		TelpoBlock hhg = new TelpoBlock(1, 2);	
		GoodItem gi = new GoodItem(3,2);
		TelpoBlock block1 = new TelpoBlock(10, 10);
		TelpoBlock block2 = new TelpoBlock(15, 15);	
	}
}

/*
 * ���� �޼ҵ� ����
 * gameFrame ���� 
 * gameField ����
 * createElement ����
 * element ����
 * 
 * */
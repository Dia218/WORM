package screen;

import element.Worm;
import element.block.TelpoBlock;
import element.item.*;

//���� Ŭ����
public class Main {
		
	public static void main(String[] args) {
		GameFrame gameFrame = new GameFrame();	
		
		//�ӽ÷� ����!!
		TelpoBlock hhg = new TelpoBlock(1, 2);	
		GoodItem gi = new GoodItem(3,2);
		BadItem block1 = new BadItem(3, 3);
		ConfuseItem block2 = new ConfuseItem(3, 4);	
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
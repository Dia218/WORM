package screen;

import element.Block;
import element.block.*;
import element.Worm;
//���� Ŭ����
public class Main {
		
	public static void main(String[] args) {
		GameFrame gameFrame = new GameFrame();	
		
		
		//�ӽ÷� ����!!
		TelpoBlock block1 = new TelpoBlock(10, 10);
		TelpoBlock block2 = new TelpoBlock(15, 15);		
		TelpoBlock block3 = new TelpoBlock(20, 20);	
		for(int i =0;i<4;i++) {
			for(int j=0;j<6;j++) {
				new TelpoBlock(i,j);
	
			}
		}
		new Worm(3,7);
		
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
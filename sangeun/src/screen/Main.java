package screen;

import element.Block;

//���� Ŭ����
public class Main {
		
	public static void main(String[] args) {
		GameFrame gameFrame = new GameFrame();	
		

		//�ӽ÷� ����!!
		Block block1 = new Block(10, 10);
		Block block2 = new Block(15, 15);
		CreateElement creat = new CreateElement(block2); 
		GameField.gamefield.repaint();
	}
}

/*
 * ���� �޼ҵ� ����
 * gameFrame ���� 
 * gameField ����
 * createElement ����
 * element ����
 * 
 * 
 * */
package screen;

import operation.*;

//���� Ŭ����
public class Main {
	
	public static void main(String[] args) throws InterruptedException {

		System.out.println("*******************");
		System.out.println("���α׷� ����");
		System.out.println("*******************");
		
		GameFrame gameFrame = new GameFrame(); //���� ������ ����
		gameFrame.setContentPane(GameField.gamefield); //���� �����ӿ� ���� �ʵ� ��ġ

		ManageElement.elementManager.initElement();
	}
}
package screen;

import java.util.*;
import element.*;
import operation.*;
import operation.manager.CreateElement;
import element.block.*;
import element.item.*;
import element.worm.*;
import screen.*;

//���� Ŭ����
public class Main {
	
	public static void main(String[] args) throws InterruptedException {

		System.out.println("*******************");
		System.out.println("���α׷� ����");
		System.out.println("*******************");
		
		GameFrame gameFrame = new GameFrame(); //���� ������ ����
		gameFrame.setContentPane(GameField.gamefield); //���� �����ӿ� ���� �ʵ� ��ġ

		/*��ġ �ٲ� ����*/
		ManageElement.elementManager.initElement();
		
		/*�׽�Ʈ �� ��*/
		//GameOver gameover = new GameOver();
		
		//���¿��� �׽�Ʈ
//		Thread thread = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				
//				// TODO �ڵ� ������ �޼ҵ� ����
//			try {
//				Thread.sleep(1000);
//				new GameOver();
//			} catch (InterruptedException e) {
//				// TODO �ڵ� ������ catch ���
//				e.printStackTrace();
//			}
//			finally {
//				
//				
//			}
//			
//		}
//	
//		
//	});
//	thread.start();



	
		
		/*�׽�Ʈ �� ��*/

		
		/*1
		//�ӽ÷� ����!!
		GoodItem gi = new GoodItem(3,2);
		BadItem block3 = new BadItem(3, 3);
		ConfuseItem block4 = new ConfuseItem(3, 4);	
		
		GameField.gamefield.setHash(new GoodItem(2,3));
		for(int i = 0; i< 10; i++)
		createTelpoBlock();
		
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try { 
					tern t = new tern();
					while(true){
						Thread.sleep(100);
						t.tern();
						}
				}catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
		});
		th.start();
		*/
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
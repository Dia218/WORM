package screen;

import java.util.*;
import element.*;
import element.block.*;
import element.item.*;
import operation.*;
import element.block.*;
import element.item.*;

//���� Ŭ����
public class Main {
		
	
	public static void main(String[] args) {
		System.out.println("*******************");
		System.out.println("���α׷� ����");
		System.out.println("*******************");
		
		GameFrame gameFrame = new GameFrame();
		
		/*��ġ �ٲ� ����*/
		CreateElement createElement = new CreateElement();
		createElement.initElement();
		
		
		
		/*
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
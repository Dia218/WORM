package screen;

import java.util.*;
import element.*;
import element.block.*;
import element.item.*;
import operation.*;
import element.block.*;
import element.item.*;

//메인 클래스
public class Main {
		
	
	public static void main(String[] args) {
		System.out.println("*******************");
		System.out.println("프로그램 실행");
		System.out.println("*******************");
		
		GameFrame gameFrame = new GameFrame();
		
		/*위치 바꿀 예정*/
		CreateElement createElement = new CreateElement();
		createElement.initElement();
		
		
		
		/*
		//임시로 생성!!
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
 * 메인 메소드 실행
 * gameFrame 생성 
 * gameField 생성
 * createElement 생성
 * element 생성
 * 
 * */
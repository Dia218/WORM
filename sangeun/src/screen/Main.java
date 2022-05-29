package screen;

import java.util.*;
import element.*;
import operation.*;
import operation.manager.CreateElement;
import element.block.*;
import element.item.*;
import element.worm.*;
import screen.*;

//메인 클래스
public class Main {
	
	public static void main(String[] args) throws InterruptedException {

		System.out.println("*******************");
		System.out.println("프로그램 실행");
		System.out.println("*******************");
		
		GameFrame gameFrame = new GameFrame(); //게임 프레임 생성
		gameFrame.setContentPane(GameField.gamefield); //게임 프레임에 게임 필드 배치

		/*위치 바꿀 예정*/
		ManageElement.elementManager.initElement();
		
		/*테스트 한 것*/
		//GameOver gameover = new GameOver();
		
		//김태완이 테스트
//		Thread thread = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				
//				// TODO 자동 생성된 메소드 스텁
//			try {
//				Thread.sleep(1000);
//				new GameOver();
//			} catch (InterruptedException e) {
//				// TODO 자동 생성된 catch 블록
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



	
		
		/*테스트 한 것*/

		
		/*1
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
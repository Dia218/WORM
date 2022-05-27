package screen;

<<<<<<< HEAD
import element.Worm;
import element.block.*;
import element.item.*;
import operation.*;
=======
import java.util.Random;

import element.block.TelpoBlock;
import element.item.BadItem;
import element.item.ConfuseItem;
import element.item.GoodItem;
>>>>>>> d69ce17b51fc4208b7997c14e7de51a2b6fc6cfd

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
		
<<<<<<< HEAD
=======
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
		
	}
	
	//item
			//먹이 만들기
	static public void createTelpoBlock() {
		Random rand = new Random();
		int tpx1;
		int tpy1;
		int tpx2;
		int tpy2;
		do {
			tpx1 = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
			tpy1 = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
			tpx2 = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
			tpy2 = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
		}while((tpx1 == tpx2)&&(tpy1 == tpy2) || !GameField.gamefield.checkLocate(tpx1, tpy1) || !GameField.gamefield.checkLocate(tpx2, tpy2));
		TelpoBlock tb1 = new TelpoBlock(tpx1, tpy1);
		TelpoBlock tb2 = new TelpoBlock(tpx2, tpy2);
		GameField.gamefield.hashmap.put(new Locate(tpx1, tpy1),tb1);
		GameField.gamefield.hashmap.put(new Locate(tpx2, tpy2),tb2);
>>>>>>> d69ce17b51fc4208b7997c14e7de51a2b6fc6cfd
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
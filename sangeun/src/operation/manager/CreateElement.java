package operation.manager;

import java.util.*;
import element.*;
import element.block.*;
import element.item.*;
import element.worm.*;
import screen.GameField;

//element 객체 생성 기능 인터페이스
public interface CreateElement {
	
	/*생성 클래스의 필드*/
	Random rand = new Random();

	
	/*생성 클래스의 메소드*/
	default void initElement() {
		//동작 확인
		System.out.println("요소 init 실행");
		
		//필드 초기화 호출
		GameField.gamefield.initField();
		/*
		//지렁이 머리 생성
		WormHead wormHead = new WormHead(6,6);
		WormBody wormBody = new WormBody(wormHead.returnX(),wormHead.returnY());
		GameField.gamefield.setElement(wormBody);
		for(int i=0;i<4;i++) {
			new WormBody(Worm.bodyXY[0][i]+1,Worm.bodyXY[1][i]);
			wormBody.setdo(Worm.bodyXY[0][i]+1,Worm.bodyXY[1][i] );
			GameField.gamefield.setElement(wormBody);
				
		}
		*/
//		//지렁이 움직이는 알고리즘
//		if(Worm.size>=1){
//			GameField.gamefield.removeElement(Worm.bodyXY[0][Worm.size-1],Worm.bodyXY[1][Worm.size-1]);
//			for(int i=Worm.size-1;i>0;i--) {
//				Worm.bodyXY[0][i] = Worm.bodyXY[0][i-1];
//				Worm.bodyXY[1][i] = Worm.bodyXY[1][i-1];
//				wormBody.setdo(Worm.bodyXY[0][i], Worm.bodyXY[1][i]);
//				GameField.gamefield.setElement(wormBody);
//				
//			}
//		}
//		wormHead.setdo(wormHead.returnX()-1, wormHead.returnY()-1);
//		Worm.bodyXY[0][0] = wormHead.returnX();
//		Worm.bodyXY[1][0] = wormHead.returnY();
//		wormBody.setdo(Worm.bodyXY[0][0], Worm.bodyXY[1][0]);
//		GameField.gamefield.setElement(wormBody);
//		//여기까지
		/*
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO 자동 생성된 메소드 스텁
				try {
					for(int i = 0;i<10;i++) {
						Thread.sleep(100);
						Worm.wormMove(wormHead, wormBody);
							
					}
					
				} catch (InterruptedException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
			}
		
		});
		thread.start();
		*/
		//블록 이닛 호출
		initBlock();
		
		//아이템 이닛 호출
		initItem();
	}
	
	
	/*블록 생성 메소드*/
	
	//블록 초기화 메소드
	private void initBlock() {
		//동작 확인
		System.out.println("블록 init 실행");
		
		//텔포 블록 생성 호출
		createTelpoBlock();
		
		//킬 블록 생성 호출 : 2덩이
		for (int num = 1; num <= 2; num++) {
			createKillBlock();
		}
		
		//기본 블록 생성 호출 : 4덩이
		for (int num = 1; num <= 4; num++) {
			createBasicBlock();
		}
	}
	
	//텔레포트 블록 생성 메소드
	default void createTelpoBlock() {
		//동작 확인
		System.out.println("텔레포트 블록 생성 호출");
		
		int telpoArandXY[] = new int[2]; //0 = X 좌표, 1 = Y 좌표
		int telpoBrandXY[] = new int[2]; //0 = X 좌표, 1 = Y 좌표

		//좌표 정하기
		randomLocate(telpoArandXY);
		randomLocate(telpoBrandXY);
		
		//텔레포트 블록 객체 생성 - A, B
		TelpoBlock telpoBlockA = new TelpoBlock(telpoArandXY[0], telpoArandXY[1], telpoBrandXY);
		TelpoBlock telpoBlockB = new TelpoBlock(telpoBrandXY[0], telpoBrandXY[1], telpoArandXY);
		GameField.gamefield.setElement(telpoBlockA);
		GameField.gamefield.setElement(telpoBlockB);		
	}
	
	//킬 블록 생성 메소드
	default void createKillBlock() {
		//동작 확인
		System.out.println("킬 블록 생성 호출");
		
		int randXY[] = new int[2]; //0 = X 좌표, 1 = Y 좌표
		int sizeWL[] = new int[2]; //0 = Width 넓이, 1 = Length 길이
		
		//2 * 2 사이즈로 고정
		sizeWL[0] = 2;
		sizeWL[1] = 2;
		
		//2 * 2 크기가 들어갈 수 있는 좌표 선정
		do {
			//좌표 정하기
			randomLocate(randXY);
			
			//맨 끝의 좌표가 게임 필드를 벗어날 경우 바로 do 다시 실행
			if(randXY[0] + sizeWL[0] - 1 >= GameField.gamefield.elementNum) {
				continue;
			}
			if(randXY[1] + sizeWL[1] - 1 >= GameField.gamefield.elementNum) {
				continue;
			}
			
			//사이즈 테스트를 통과하면 do-while 반복문 종료
			if(testSize(randXY, sizeWL) == true) {
				break;
			}
		} while(true);
		
		//킬 블록 객체 생성
		for(int x = randXY[0]; x <= randXY[0] + sizeWL[0] - 1; x++) {
			for(int y = randXY[1]; y <= randXY[1] + sizeWL[1] - 1; y++) {
				KillBlock killBlock = new KillBlock(x, y);
				GameField.gamefield.setElement(killBlock);
			}
		}
	}
	
	//기본 블록 생성 메소드
	default void createBasicBlock() {
		//동작 확인
		System.out.println("기본 블록 생성 호출");
		
		int randXY[] = new int[2]; //0 = X 좌표, 1 = Y 좌표
		int sizeWL[] = new int[2]; //0 = Width 넓이, 1 = Length 길이
		
		//좌표 정하기
		randomLocate(randXY);
		
		//사이즈 정하기
		randomSize(randXY, sizeWL);
		
		//기본 블록 객체 생성
		for(int x = randXY[0]; x <= randXY[0] + sizeWL[0] - 1; x++) {
			for(int y = randXY[1]; y <= randXY[1] + sizeWL[1] - 1; y++) {
				BasicBlock basicBlock = new BasicBlock(x, y);
				GameField.gamefield.setElement(basicBlock);		
			}
		}
	}
	
	
	/*아이템 생성 메소드*/
	
	//아이템 초기화 메소드
	private void initItem() {
		//동작 확인
		System.out.println("아이템 생성 호출");
		
		//좋은 아이템 생성 호출
		createGoodItem();
		
		//나쁜 아이템 생성 호출
		createBadItem();
		
		//혼란 아이템 생성 호출
		createConfuseItem();
	}
	
	//좋은 아이템 생성 메소드
	default void createGoodItem() {
		//동작 확인
		System.out.println("좋은 아이템 생성 호출");
		
		int randXY[] = new int[2]; //0 = X 좌표, 1 = Y 좌표

		//좌표 정하기
		randomLocate(randXY);
		
		//좋은 아이템 객체 생성
		GoodItem goodItem = new GoodItem(randXY[0], randXY[1]);
		GameField.gamefield.setElement(goodItem);
	}
	
	//나쁜 아이템 생성 메소드
	default void createBadItem() {
		//동작 확인
		System.out.println("나쁜 아이템 생성 호출");
		
		int randXY[] = new int[2]; //0 = X 좌표, 1 = Y 좌표

		//좌표 정하기
		randomLocate(randXY);
		
		//나쁜 아이템 객체 생성
		BadItem badItem = new BadItem(randXY[0], randXY[1]);
		GameField.gamefield.setElement(badItem);
	}
	
	//혼란 아이템 생성 메소드
	default void createConfuseItem() {
		//동작 확인
		System.out.println("혼란 아이템 생성 호출");
		
		int randXY[] = new int[2]; //0 = X 좌표, 1 = Y 좌표

		//좌표 정하기
		randomLocate(randXY);
		
		//혼란 아이템 객체 생성
		ConfuseItem ConfuseItem = new ConfuseItem(randXY[0], randXY[1]);
		GameField.gamefield.setElement(ConfuseItem);
	}
	
	
	/*랜덤 생성 메소드*/
	
	//좌표 랜덤 생성 메소드
	private void randomLocate(int randXY[]) {
		//동작 확인
		System.out.println("좌표 랜덤 생성 호출");
		
		//0부터 (요소 최대 개수-1)까지 숫자 중 랜덤 생성
		randXY[0] = rand.nextInt(GameField.gamefield.elementNum) + 0;
		randXY[1] = rand.nextInt(GameField.gamefield.elementNum) + 0;
		
		//해당 좌표에 객체가 없을 때까지 재귀호출
		while (null != GameField.gamefield.checkElement(randXY[0], randXY[1])) {
			randomLocate(randXY);
		}
	}
	
	//사이즈 랜덤 생성 메소드
	private void randomSize(int randXY[], int sizeWL[]) {
		//동작 확인
		System.out.println("블록 사이즈 랜덤 생성 호출");

		do {
			//사이즈 : 1부터 4까지의 숫자 중 랜덤 생성
			sizeWL[0] = rand.nextInt((4-1) + 1) + 1;
			sizeWL[1] = rand.nextInt((4-1) + 1) + 1;

			//맨 끝의 좌표가 게임 필드를 벗어날 경우 바로 do 다시 실행
			if(randXY[0] + sizeWL[0] - 1 >= GameField.gamefield.elementNum) {
				continue;
			}
			if(randXY[1] + sizeWL[1] - 1 >= GameField.gamefield.elementNum) {
				continue;
			}
			
			//사이즈 테스트를 통과하면 do-while 반복문 종료
			if(testSize(randXY, sizeWL) == true) {
				break;
			}
			
		} while(true);
	}
	
	//생성된 사이즈가 올바른지 테스트 하는 메소드
	private Boolean testSize(int randXY[], int sizeWL[]) {
		//동작 확인
		System.out.println("블록 사이즈 테스트 호출");
		
		//좌표를 돌아가면서 검사
		int x = randXY[0]+1; int y = randXY[1]+1;
		while(x <= randXY[0]+sizeWL[0]-1) {
			while(y <= randXY[1]+sizeWL[1]-1) {
				//해당 좌표에 element가 있을 경우
				if(null != GameField.gamefield.checkElement(x, y)) {
					x = 100; y = 100; //반복문 빠져나가기
				}
				y++;
			}
			x++;
		}
		
		//끝까지 검사했다면 true
		if(x == randXY[0]+sizeWL[0] && y == randXY[1]+sizeWL[1]) {
			return true;
		}
		else {
			return false;
		}
	}
}

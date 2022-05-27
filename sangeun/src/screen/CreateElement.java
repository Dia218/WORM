package screen;

import java.util.*;
import element.*;
import element.block.*;
import element.item.*;

//element 객체를 생성하는 클래스
public class CreateElement {
	
	/*요소 생성 클래스 필드*/
	Random rand = new Random();

	/*생성 클래스의 생성자*/
	public CreateElement() {
		//동작 확인
		System.out.println("createElement 객체 생성");
	}
	
	
	/*생성 클래스의 메소드*/
	public void initElement() {
		//동작 확인
		System.out.println("요소 init 실행");
		
		//지렁이 머리 생성
		//WormHead wormHead = new WormHead(0, 0);
		//System.put.println("지렁이 머리 생성");
		
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
	public void createTelpoBlock() {
		//동작 확인
		System.out.println("텔레포트 블록 생성 호출");
		
		int telpoArandXY[] = new int[2]; //0 = X 좌표, 1 = Y 좌표
		int telpoBrandXY[] = new int[2]; //0 = X 좌표, 1 = Y 좌표

		//좌표 정하기
		randomLocate(telpoArandXY);
		randomLocate(telpoBrandXY);
		
		//텔레포트 블록 객체 생성 - A, B
		TelpoBlock telpoBlockA = new TelpoBlock(telpoArandXY[0], telpoArandXY[1]);
		TelpoBlock telpoBlockB = new TelpoBlock(telpoBrandXY[0], telpoBrandXY[1]);
		GameField.gamefield.setElement(telpoBlockA);
		GameField.gamefield.setElement(telpoBlockB);

		//텔레포트 블록 객체 서로 연결?
		
	}
	
	//킬 블록 생성 메소드
	public void createKillBlock() {
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
			
			//검사 다시 수정
		
			//(x+1) 좌표 검사
			if (null != GameField.gamefield.checkElement(randXY[0]+1, randXY[1])) {
				//비어있지 않으면 바로 do 반복
				continue;
			}
		
			//(y+1) 좌표 검사
			if (null != GameField.gamefield.checkElement(randXY[0], randXY[1]+1)) {
				//비어있지 않으면 바로 do 반복
				continue;
			}
			
			//검사를 다하면 do 반복문 종료
			break;
			
		} while(true);
		
		//킬 블록 객체 - 가로 생성
		for(int addWidth = 0; addWidth < sizeWL[0]; addWidth++) {
			KillBlock killBlock = new KillBlock(randXY[0]+addWidth, randXY[1]);
			GameField.gamefield.setElement(killBlock);	
		}
		//킬 블록 객체 - 세로 생성
		for(int addLength = 0; addLength < sizeWL[1]; addLength++) {
			KillBlock killBlock = new KillBlock(randXY[0], randXY[1]+addLength);
			GameField.gamefield.setElement(killBlock);
		}
	}
	
	//기본 블록 생성 메소드
	public void createBasicBlock() {
		//동작 확인
		System.out.println("기본 블록 생성 호출");
		
		int randXY[] = new int[2]; //0 = X 좌표, 1 = Y 좌표
		int sizeWL[] = new int[2]; //0 = Width 넓이, 1 = Length 길이
		
		//좌표 정하기
		randomLocate(randXY);
		
		//사이즈 정하기
		randomSize(randXY, sizeWL);
		
		//기본 블록 객체 - 가로 생성
		for(int addWidth = 0; addWidth < sizeWL[0]; addWidth++) {
			BasicBlock basicBlock = new BasicBlock(randXY[0]+addWidth, randXY[1]);
			GameField.gamefield.setElement(basicBlock);	
		}
		//기본 블록 객체 - 세로 생성
		for(int addLength = 0; addLength < sizeWL[1]; addLength++) {
			BasicBlock basicBlock = new BasicBlock(randXY[0], randXY[1]+addLength);
			GameField.gamefield.setElement(basicBlock);
		}
		
		
		/*
		 **오류가 나는 이유 추측
		 *
		 * 블록 사이즈가 필드를 넘어갈 수 있는데 그걸 체크하는 게 없다 
		 *
		 * */
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
	public void createGoodItem() {
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
	public void createBadItem() {
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
	public void createConfuseItem() {
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
	
	/*
	//사이즈 랜덤 생성 메소드
	private void randomSize(int randXY[], int sizeWL[]) {
		//동작 확인
		System.out.println("블록 사이즈 랜덤 생성 호출");
		
		//사이즈 : 1부터 4까지의 숫자 중 랜덤 생성
		
		////Width 넓이 정하기////
		int addWidth = 0;
		do {
			//Width 넓이를 랜덤으로 생성 : sizeWL[0] <- 1 to 4 
			sizeWL[0] = rand.nextInt((4-1) + 1) + 1;
			
			//(x+1)부터 (넓이)까지 좌표 검사 : index <- 0+1 to 2+1
			while(addWidth < sizeWL[0]-1) {
				addWidth++;
				//null 값이 아닐 경우 안쪽 while 종료 -> do 반복
				if (null != GameField.gamefield.checkElement(randXY[0]+addWidth, randXY[1])) {
					addWidth = 0;
					break;
				}
			}
			
		//안쪽 while에서 끝까지 검사하면 do 종료
		} while(addWidth != sizeWL[0]-1);
		
		
		////Length 길이 정하기////
		int addLength = 0;
		do {
			//Length 길이를 랜덤으로 생성 : sizeWL[1] <- 1 to 4
			sizeWL[1] = rand.nextInt((4-1) + 1) + 1;
			
			//(y+1)부터 (길이)까지 좌표 검사 : addLength <- 0+1 to 2+1
			while(addLength < sizeWL[1]-1) {
				addLength++;
				//null 값이 아닐 경우 안쪽 while 종료 -> do 반복
				if (null != GameField.gamefield.checkElement(randXY[0], randXY[1]+addLength)) {
					addLength = 0;
					break;
				}
			}
			
		//안쪽 while에서 끝까지 검사하면 do 종료
		} while(addLength != sizeWL[1]-1);
	} */
	
	//사이즈 랜덤 생성 메소드
	private void randomSize(int randXY[], int sizeWL[]) {
		//동작 확인
		System.out.println("블록 사이즈 랜덤 생성 호출");
		
		//사이즈 : 1부터 4까지의 숫자 중 랜덤 생성

		
		/*
		 * 
		 *
		 * 
		 * */
	}
	

	
	public void createWormBody(/*앞 부분의 객체 레퍼런스를 받아와야할 것 같다*/) {
		
	}
	


}
/*
 **초기 설정**
 * 지렁이 머리 생성
 * 블록들 생성
 * 아이템들 생성
 * 
 **게임 중**
 * 좋은 아이템 먹으면 새 좋은 아이템 생성
 * 몸통 길이 추가
 * 일정 시간 후 혼한, 나쁜 아이템 생성 및 삭제 반복
 * */

/*
 ****관리 
 * 
 * 
 **생성
 * 
 *
 **삭제
 *
 * */
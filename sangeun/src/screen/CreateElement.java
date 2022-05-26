package screen;

import element.Block;
import element.block.*;
import java.util.*;
import element.*;

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
		//지렁이 머리 생성
		//WormHead wormHead = new WormHead(0, 0);
		//System.put.println("지렁이 머리 생성");
		
		//블록 이닛 호출
		initBlock();
		
		//아이템 이닛 호출
		//initItem();
		
		//동작 확인
		System.out.println("요소 init 실행");
	}
	
	//블록 생성 메소드
	public void initBlock() {
		
		//텔포 블록 생성
		//createTelpoBlock();
		
		//킬 블록 생성
		//createKillBlock();
		
		//기본 블록 생성 : 4개
		for (int num = 1; num <= 4; num++) {
			createBasicBlock();
		}
		
		//동작 확인
		System.out.println("블록 init 실행");
	}
	
	public void createTelpoBlock() {
		
	}
	
	public void createKillBlock() {
		
	}
	
	public void createBasicBlock() {
		int randXY[] = new int[2]; //0 = X 좌표, 1 = Y 좌표
		int sizeWL[] = new int[2]; //0 = Width 넓이, 1 = Length 길이
		
		//좌표 정하기
		randomLocate(randXY);
		
		//사이즈 정하기
		randomSize(randXY, sizeWL);
		
		//객체 생성하기		
		for(int width = 0; width <= sizeWL[0]; width++) {
			BasicBlock basicBlock = new BasicBlock(randXY[0]+width, randXY[1]);
			
		}
		for(int length = 0; length <= sizeWL[1]; length++) {
			BasicBlock basicBlock = new BasicBlock(randXY[0], randXY[1]+length);
		}
		
		//동작 확인
		System.out.println("기본 블록 생성");
	}
	
	
	//좌표 랜덤 생성 메소드
	private void randomLocate(int randXY[]) {
		//0부터 (요소 최대 개수-1)까지 숫자 중 랜덤 생성
		randXY[0] = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
		randXY[1] = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
		
		//해당 좌표에 객체가 없을 때까지 재귀호출
		while (null != GameField.gamefield.checkElement(randXY[0], randXY[1])) {
			randomLocate(randXY);
		}
	}
	
	//사이즈 랜덤 생성 메소드
	private void randomSize(int randXY[], int sizeWL[]) {
		//0부터 3까지 숫자 중 랜덤 생성 -> 넓이/길이 : (1 + 0) ~ (1 + 3)
		
		////Width 넓이 정하기////
		int index = 0;
		do {
			//Width 넓이를 랜덤으로 생성
			sizeWL[0] = rand.nextInt(3) + 0;
			
			//(x+1)부터 (x+길이)까지 좌표 검사
			while(index <= sizeWL[0]) {
				index++;
				//null 값이 아닐 경우 안쪽 while 종료 -> do 반복
				if (null != GameField.gamefield.checkElement(randXY[0]+index, randXY[1])) {
					index = 0;
					break;
				}
			}
			
		//안쪽 while에서 끝까지 검사하면 do 종료
		} while(index != sizeWL[0]);
		
		
		////Length 길이 정하기////
		index = 0;
		do {
			//Length 길이를 랜덤으로 생성
			sizeWL[1] = rand.nextInt(3) + 0;
			
			//(y+1)부터 (y+길이)까지 좌표 검사
			while(index <= sizeWL[1]) {
				index++;
				//null 값이 아닐 경우 안쪽 while 종료 -> do 반복
				if (null != GameField.gamefield.checkElement(randXY[0+index], randXY[1]+index)) {
					index = 0;
					break;
				}
			}
			
		//안쪽 while에서 끝까지 검사하면 do 종료
		} while(index != sizeWL[1]);
	}
	

	
	public void initItem() {
		
	}
	

	
	public void createGoodItem() {
		
	}
	
	public void createBadItem() {
		
	}
	
	public void createConfuseItem() {
		
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
 **필요한 메소드**
 * 랜덤 좌표 만들기
 * 
 * 
 * */
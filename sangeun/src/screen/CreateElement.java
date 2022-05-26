package screen;

import element.Block;

import java.util.Random;
import element.block.TelpoBlock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import screen.GameField;
import element.*;

//element 객체를 생성하는 클래스
public class CreateElement {

	//요소생성 객체는 한 번만 생성된다
	public static final CreateElement createElement = new CreateElement();
	
	/*요소 생성 클래스 필드*/
	Random rand = new Random();

	/*생성 클래스의 생성자*/
	private CreateElement() {
		//WormHead wormHead = new WormHead(0, 0);
		//System.put.println("지렁이 머리 생성");
	}
	
	
	/*생성 클래스의 메소드*/
	
	public void initBlock() {
		
	}
	
	public void createBasicBlock() {
		randomLocate();
	}
	
	public void createKillBlock() {
		
	}
	
	public void createTelpoBlock() {
		
	}
	
	public void createGoodItem() {
		
	}
	
	public void createBadItem() {
		
	}
	
	public void createConfuseItem() {
		
	}
	
	public void createWormBody(/*앞 부분의 객체 레퍼런스를 받아와야할 것 같다*/) {
		
	}
	
	//좌표 랜덤 생성 메소드
	public void randomLocate() {
		//0부터 (요소 최대 개수-1)까지 숫자 중 랜덤 생성
		int randX = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
		int randY = rand.nextInt(GameField.gamefield.elementNum-1) + 0;
		
		//해당 좌표에 객체가 없을 경우
		if(GameField.gamefield.checkLocate(randX, randY)) {
			//객체 생성
		}
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
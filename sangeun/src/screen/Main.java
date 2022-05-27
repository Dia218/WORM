package screen;

import element.Worm;
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
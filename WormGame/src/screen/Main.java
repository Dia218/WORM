package screen;

import operation.*;

//메인 클래스
public class Main {
	
	public static void main(String[] args) throws InterruptedException {

		System.out.println("*******************");
		System.out.println("프로그램 실행");
		System.out.println("*******************");
		
		GameFrame gameFrame = new GameFrame(); //게임 프레임 생성
		gameFrame.setContentPane(GameField.gamefield); //게임 프레임에 게임 필드 배치

		ManageElement.elementManager.initElement();
	}
}
package screen;

import java.awt.*;
import javax.swing.*;



//게임 프레임 클래스
public class GameFrame extends JFrame {

	GameOver gameover = new GameOver();
	public GameFrame() throws HeadlessException {
		super();
		
		//필드 초기화 호출
		GameField.gamefield.initField();
		this.add(GameField.gamefield);
		this.revalidate();
		this.repaint();
		this.add(gameover);


		//this.addKeyListener(new InputKey(element));
		this.requestFocus();
				
		setSize(GameField.gamefield.returnFieldSize()+50, GameField.gamefield.returnFieldSize()+50); //사이즈 설정
		setLocationRelativeTo(null); //화면 중앙 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//창 닫으면 종료
		setResizable(false); //창 크기 조절 불가
		setVisible(true); //창을 보이게 설정

	}
}

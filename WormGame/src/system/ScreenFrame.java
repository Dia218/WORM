package system;
import java.awt.*;
import javax.swing.*;

//화면을 구성하는 클래스
public class ScreenFrame extends JFrame {

	//창
	public ScreenFrame() { 
		
		//프레임 - 기본 틀
		setTitle("지렁이 게임");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면
		Container mainScreen = this.getContentPane();
		mainScreen.setLayout(new FlowLayout());
		
		//게임 메뉴 버튼 패널
		JPanel menuPanel = new JPanel();
		JButton start = new JButton("게임시작"); 
		JButton exit = new JButton("게임종료"); 
		menuPanel.add(start); 
		menuPanel.add(exit);
		mainScreen.add(menuPanel);
		
		//게임 공간 패널
		JPanel playPanel = new JPanel();
		playPanel.setLayout(new GridLayout(20, 20));
		
		
		
		playPanel.add(new ScreenBox());
		mainScreen.add(playPanel);

			
		
	}

}

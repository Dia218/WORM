package screen;

import java.awt.HeadlessException;
import javax.swing.JFrame;


//게임 프레임 클래스
public class GameFrame extends JFrame {


	public GameFrame() throws HeadlessException {
		super();
		
		//gamefield.returnSize(Width,Height);
		this.add(GameField.gamefield);
		
		//this.addKeyListener(new InputKey(element));
		this.requestFocus();
		
		setSize(1000, 1000);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setResizable(false);
		setVisible(true);
	
	}
	
	

}

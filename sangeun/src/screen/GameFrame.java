package screen;

import java.awt.HeadlessException;
import javax.swing.JFrame;

import team.Element;

public class GameFrame extends JFrame {

	
	public GameFrame() throws HeadlessException {
		super();
		
		GameField gamefield = new GameField();
		//gamefield.returnSize(Width,Height);
		this.add(gamefield);
		
		//this.addKeyListener(new InputKey(element));
		this.requestFocus();
		
		setSize(Width, Height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setResizable(false);
		setVisible(true);
	
	}
	
	

}

package screen;

import java.awt.HeadlessException;
import javax.swing.JFrame;


//���� ������ Ŭ����
public class GameFrame extends JFrame {


	public GameFrame() throws HeadlessException {
		super();
		
		this.add(GameField.gamefield);
		this.revalidate();
		this.repaint();
		
		//this.addKeyListener(new InputKey(element));
		this.requestFocus();
		
		setSize(GameField.gamefield.returnSize(), GameField.gamefield.returnSize());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setResizable(false);
		setVisible(true);
	
	}
	
	

}

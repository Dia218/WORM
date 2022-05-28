package screen;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;


//���� ������ Ŭ����
public class GameFrame extends JFrame {


	public GameFrame() throws HeadlessException {
		super();
		try {
			this.add(GameField.gamefield);
			this.revalidate();
			this.repaint();
		
		}
		finally {
			new GameOver();
		}
			
	
		

//		try {
//			for(int i =0; i<24;i++) {
//				Thread.sleep(1);
//				this.add(new GameOver(i));
//				
//			}
//			
//		} catch (InterruptedException e) {
//			// TODO �ڵ� ������ catch ���
//			e.printStackTrace();
//		}
		
		
		
		
		//this.addKeyListener(new InputKey(element));
		this.requestFocus();
		setTitle("������ ����");
		setSize(GameField.gamefield.returnFieldSize(), GameField.gamefield.returnFieldSize());
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setResizable(false);
		setVisible(true);
	
	}
	
	

}

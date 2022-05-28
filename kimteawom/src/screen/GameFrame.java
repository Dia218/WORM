package screen;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;


//게임 프레임 클래스
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
//			// TODO 자동 생성된 catch 블록
//			e.printStackTrace();
//		}
		
		
		
		
		//this.addKeyListener(new InputKey(element));
		this.requestFocus();
		setTitle("지렁이 게임");
		setSize(GameField.gamefield.returnFieldSize(), GameField.gamefield.returnFieldSize());
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setResizable(false);
		setVisible(true);
	
	}
	
	

}

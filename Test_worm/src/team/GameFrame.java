package team;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	final static int Width = (Element.maxSize+2)*20-9;
	final static int Height = (Element.maxSize+3)*20+18;
	
	public GameFrame() throws HeadlessException {
		super();
		
		Element element = new Element();
//		element.setSize(Width,Height);
		add(element);
		
		this.addKeyListener(new InputKey(element));
		this.requestFocus();
		
		setSize(Width, Height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setResizable(false);
		setVisible(true);
	
	}
	
	

}

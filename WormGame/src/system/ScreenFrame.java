package system;
import java.awt.*;
import javax.swing.*;

//ȭ���� �����ϴ� Ŭ����
public class ScreenFrame extends JFrame {

	//â
	public ScreenFrame() { 
		
		//������ - �⺻ Ʋ
		setTitle("������ ����");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ȭ��
		Container mainScreen = this.getContentPane();
		mainScreen.setLayout(new FlowLayout());
		
		//���� �޴� ��ư �г�
		JPanel menuPanel = new JPanel();
		JButton start = new JButton("���ӽ���"); 
		JButton exit = new JButton("��������"); 
		menuPanel.add(start); 
		menuPanel.add(exit);
		mainScreen.add(menuPanel);
		
		//���� ���� �г�
		JPanel playPanel = new JPanel();
		playPanel.setLayout(new GridLayout(20, 20));
		
		
		
		playPanel.add(new ScreenBox());
		mainScreen.add(playPanel);

			
		
	}

}

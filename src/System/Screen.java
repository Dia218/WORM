package System;
import java.awt.*;
import javax.swing.*;

//ȭ���� �����ϴ� Ŭ����
public class Screen extends JFrame {


	//�ƹ��ų� ������ �� ��!! ������ ���Ӱ� ���þ���!!
	Screen () { 
		setTitle("������ ����"); 
		setSize(300,400); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout()); 
		JButton j = new JButton("Ȯ��"); 
		JButton j2 = new JButton("���"); 
		c.add(j); 
		c.add(j2); 
		setVisible(true); }

}

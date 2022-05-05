package System;
import java.awt.*;
import javax.swing.*;

//화면을 구성하는 클래스
public class Screen extends JFrame {


	//아무거나 복붙해 온 것!! 지렁이 게임과 관련없음!!
	Screen () { 
		setTitle("지렁이 게임"); 
		setSize(300,400); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout()); 
		JButton j = new JButton("확인"); 
		JButton j2 = new JButton("취소"); 
		c.add(j); 
		c.add(j2); 
		setVisible(true); }

}

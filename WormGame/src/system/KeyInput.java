package system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.TimerTask;

//������� Ű �Է��� �޾� ���� ��Ű�� Ŭ����
public class KeyInput extends ControlGame {
	private Head head = new Head(); 	//������ �Ӹ� �г�!
	
	public KeyInput() {
	
	Container c = getContentPane();		//�����̳� c ����
	c.setLayout(null);					
	
	c.addKeyListener(new MyKeyListener());
	head.setLocation(WormCreate.X, WormCreate.Y); //������ �Ӹ� ��ġ ����. create ���� ������ ��ǥ �� �Է�!
	head.setSize(Worm.X, Worm.Y); 			//������ �Ӹ� ũ�� ����. ������ ��ü���� ������ ũ�� �Է�!
	c.add(head);
	c.setFocusable(true); // ����Ʈ���� ��Ŀ���� ���� �� �ֵ��� ����
	c.requestFocus(); // ��Ŀ�� ����
	
	}	

	class MyKeyListener extends KeyAdapter {

		int keyCodetmp = 0;	// ��� ���� �Է��� Ű�ڵ� ����
		java.util.Timer timer = new java.util.Timer();	//Ÿ�̸� ��ü ����
		TimerTask task;		//TimerTask ����
		public void keyPressed(KeyEvent e) {	//Ű�� �Էµ� ��
			
			int keyCode = e.getKeyCode(); // �Էµ� Ű�ڵ�
			switch(keyCode) {		//�Էµ� Ű�ڵ�
		
			case KeyEvent.VK_UP: {	//���� ����Ű�� ���� ��
				if(keyCodetmp == KeyEvent.VK_DOWN || keyCodetmp == KeyEvent.VK_UP) 	//���� ����Ű�� �ݴ� ����Ű�� ���� ��
					break;			//�� switch ���� �����Ѵ�.
				else if(task != null)	//TimerTask�� ����� ��
					task.cancel();		//���� TimerTask�� �����Ѵ�.
				
				keyCodetmp = KeyEvent.VK_UP;	//��� ���� �Է��� Ű�ڵ� ������ ���� ����Ű�� �ִ´�.
				task = new UP();	//TimerTask UP ��ü ����
				timer.schedule(task, 0, 100);	//0.1�ʸ��� task�� �ݺ��ϴ� �������� ��� �����Ѵ�.
				break;
			}
			
			case KeyEvent.VK_DOWN: {	//�Ʒ��� ����Ű�� ���� ��
				if(keyCodetmp == KeyEvent.VK_UP || keyCodetmp == KeyEvent.VK_DOWN) 
					break;
				else if(task != null)
					task.cancel();
			
				keyCodetmp = KeyEvent.VK_DOWN;
				task = new DOWN();
				timer.schedule(task, 0, 100);
				break;
			}
			
			case KeyEvent.VK_LEFT: {	//���� ����Ű�� ���� ��
				if(keyCodetmp == KeyEvent.VK_RIGHT || keyCodetmp == KeyEvent.VK_LEFT) 
					break;
				else if(task != null)
					task.cancel();
			
				keyCodetmp = KeyEvent.VK_LEFT;
				task = new LEFT();
				timer.schedule(task, 0, 100);
					break;
			}	
			
			case KeyEvent.VK_RIGHT: {	//������ ����Ű�� ���� ��
				if(keyCodetmp == KeyEvent.VK_LEFT || keyCodetmp == KeyEvent.VK_RIGHT) 
					break;
				else if(task != null)
					task.cancel();
			
				keyCodetmp = KeyEvent.VK_RIGHT;
				task = new RIGHT();
				timer.schedule(task, 0, 100);
					break;
			}
			
			}
			
			}
		}

	
	class UP extends TimerTask {
		public void run() {
			head.setLocation(head.getX(), head.getY() - value); //	������ �Ӹ��� x, y ��ǥ�� �ű��. value���� �ʿ��� ������ ���� ũ�⸸ŭ �ű� ��!
		}
	}
	class DOWN extends TimerTask {
		public void run() {

			head.setLocation(head.getX(), head.getY() + value);
		}
	}
	class LEFT extends TimerTask {
		public void run() {

			head.setLocation(head.getX() - vlaue, head.getY());
		}
	}
	class RIGHT extends TimerTask {
		public void run() {

			head.setLocation(head.getX() + value, head.getY());
		}
	}
	
}

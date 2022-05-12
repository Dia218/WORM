package system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.TimerTask;

public class KeyInput extends GamePlay { //���� �޼ҵ忡�� KeyInput ���� �ʿ�!
	private Head head = new Head();		//������ �Ӹ� ����. worm�ʿ��� ������ �Ӹ� �г� �����ͼ� ����!
	public KeyInput() {
	
	Container c = getContentPane();		//�����̳� ����.
	c.setLayout(null);					//�̰� �ʿ��Ѱ�?

	c.addKeyListener(new MyKeyListener());
	head.setLocation(WormCreate.X, WormCreate.Y);	//������ �Ӹ� �г� ���� ��ġ. WormCreate���� ������ ������ �Ӹ� ��ǥ ���⼭ ������ ���ʿ��� ������!
	head.setSize(Worm.X, Worm.Y);		//������ �Ӹ� ũ��. Worm�ʿ��� ������ �Ӹ� �����ͼ� ������ ���ʿ��� ������
	c.add(head);						//�Ӹ� �����̳� �߰�
	c.setFocusable(true);				// ����Ʈ���� ��Ŀ���� ���� �� �ֵ��� ����
	c.requestFocus();					// ��Ŀ�� ����
	
	}	

	class MyKeyListener extends KeyAdapter {

		int keyCodetmp = 0;				//����� �Է��� Ű�ڵ�
		java.util.Timer timer = new java.util.Timer();
		TimerTask task;
		public void keyPressed(KeyEvent e) {
			
			int keyCode = e.getKeyCode(); // �Էµ� Ű�ڵ�
			switch(keyCode) {
		
			case KeyEvent.VK_UP: {			//���� ����Ű�� �Է��� ���
				if(keyCodetmp == KeyEvent.VK_DOWN || keyCodetmp == KeyEvent.VK_UP) //���� ����Ű�� �ݴ� ����Ű�� �Է��ߴٸ�
					break;					//Ż���Ѵ�.
				else if(task != null)		//TimerTask�� �����Ǿ��ٸ�
					task.cancel();			//TimreTask�� �����Ѵ�.
				
				keyCodetmp = KeyEvent.VK_UP;//����� �Է��� Ű�ڵ� ������ ���� �Է��� ����Ű�� �ִ´�.
				task = new UP();			//TimerTask ����
				timer.schedule(task, 0, 100);//task�� 0.1�ʰ� �ݺ��ϴ� schedule�� ���(0��) �����Ѵ�.
				break;
			}
			
			case KeyEvent.VK_DOWN: {		//�Ʒ��� ����Ű�� �Է��� ���
				if(keyCodetmp == KeyEvent.VK_UP || keyCodetmp == KeyEvent.VK_DOWN) 
					break;
				else if(task != null)
					task.cancel();
			
				keyCodetmp = KeyEvent.VK_DOWN;
				task = new DOWN();
				timer.schedule(task, 0, 100);
				break;
			}
			
			case KeyEvent.VK_LEFT: {		//���� ����Ű�� �Է��� ���
				if(keyCodetmp == KeyEvent.VK_RIGHT || keyCodetmp == KeyEvent.VK_LEFT) 
					break;
				else if(task != null)
					task.cancel();
				
				keyCodetmp = KeyEvent.VK_LEFT;
				task = new LEFT();
				timer.schedule(task, 0, 100);
					break;
			}	
			
			case KeyEvent.VK_RIGHT: {		//������ ����Ű�� �Է��� ���
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
	
	class UP extends TimerTask {	//���� �̵�
		public void run() {
			head.setLocation(head.getX(), head.getY() - value); 	//���� ������ �Ӹ� ��ǥ���� value�� ��ŭ �̵�.(value ���� �� ���ڸ�ŭ �̵�)
		}
	}
	class DOWN extends TimerTask {	//�Ʒ��� �̵�
		public void run() {

			head.setLocation(head.getX(), head.getY() + vlaue);
		}
	}
	class LEFT extends TimerTask {	//�������� �̵�
		public void run() {

			head.setLocation(head.getX() - value, head.getY());
		}
	}
	class RIGHT extends TimerTask {	//���������� �̵�
		public void run() {

			head.setLocation(head.getX() + value, head.getY());
		}
	}
	
}


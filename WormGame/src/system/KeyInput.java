package system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.TimerTask;

//사용자의 키 입력을 받아 동작 시키는 클래스
public class KeyInput extends ControlGame {
	private Head head = new Head(); 	//지렁이 머리 패널!
	
	public KeyInput() {
	
	Container c = getContentPane();		//컨테이너 c 생성
	c.setLayout(null);					
	
	c.addKeyListener(new MyKeyListener());
	head.setLocation(WormCreate.X, WormCreate.Y); //지렁이 머리 위치 설정. create 에서 생성한 좌표 값 입력!
	head.setSize(Worm.X, Worm.Y); 			//지렁이 머리 크기 설정. 지렁이 객체에서 생성한 크기 입력!
	c.add(head);
	c.setFocusable(true); // 컨텐트팬이 포커스를 받을 수 있도록 설정
	c.requestFocus(); // 포커스 지정
	
	}	

	class MyKeyListener extends KeyAdapter {

		int keyCodetmp = 0;	// 방금 전에 입력한 키코드 변수
		java.util.Timer timer = new java.util.Timer();	//타이머 객체 생성
		TimerTask task;		//TimerTask 선언
		public void keyPressed(KeyEvent e) {	//키가 입력될 때
			
			int keyCode = e.getKeyCode(); // 입력된 키코드
			switch(keyCode) {		//입력된 키코드
		
			case KeyEvent.VK_UP: {	//위쪽 방향키를 누를 떄
				if(keyCodetmp == KeyEvent.VK_DOWN || keyCodetmp == KeyEvent.VK_UP) 	//같은 방향키나 반대 방향키를 누를 때
					break;			//이 switch 문은 생략한다.
				else if(task != null)	//TimerTask가 실행될 때
					task.cancel();		//이전 TimerTask를 종료한다.
				
				keyCodetmp = KeyEvent.VK_UP;	//방금 전에 입력한 키코드 변수에 위쪽 방향키를 넣는다.
				task = new UP();	//TimerTask UP 객체 생성
				timer.schedule(task, 0, 100);	//0.1초마다 task를 반복하는 스케쥴을 즉시 시행한다.
				break;
			}
			
			case KeyEvent.VK_DOWN: {	//아랫쪽 방향키를 누를 때
				if(keyCodetmp == KeyEvent.VK_UP || keyCodetmp == KeyEvent.VK_DOWN) 
					break;
				else if(task != null)
					task.cancel();
			
				keyCodetmp = KeyEvent.VK_DOWN;
				task = new DOWN();
				timer.schedule(task, 0, 100);
				break;
			}
			
			case KeyEvent.VK_LEFT: {	//왼쪽 방향키를 누를 때
				if(keyCodetmp == KeyEvent.VK_RIGHT || keyCodetmp == KeyEvent.VK_LEFT) 
					break;
				else if(task != null)
					task.cancel();
			
				keyCodetmp = KeyEvent.VK_LEFT;
				task = new LEFT();
				timer.schedule(task, 0, 100);
					break;
			}	
			
			case KeyEvent.VK_RIGHT: {	//오른쪽 방향키를 누를 때
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
			head.setLocation(head.getX(), head.getY() - value); //	지렁이 머리를 x, y 좌표로 옮긴다. value값은 맵에서 생성한 격자 크기만큼 옮길 것!
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

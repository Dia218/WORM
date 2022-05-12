package system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.TimerTask;

public class KeyInput extends GamePlay { //메인 메소드에서 KeyInput 생성 필요!
	private Head head = new Head();		//지렁이 머리 생성. worm쪽에서 지렁이 머리 패널 가져와서 쓸것!
	public KeyInput() {
	
	Container c = getContentPane();		//컨테이너 생성.
	c.setLayout(null);					//이거 필요한가?

	c.addKeyListener(new MyKeyListener());
	head.setLocation(WormCreate.X, WormCreate.Y);	//지렁이 머리 패널 생성 위치. WormCreate에서 생성한 지렁이 머리 좌표 여기서 쓰던지 저쪽에서 쓰던지!
	head.setSize(Worm.X, Worm.Y);		//지렁이 머리 크기. Worm쪽에서 지렁이 머리 가져와서 쓰던지 저쪽에서 쓰던지
	c.add(head);						//머리 컨테이너 추가
	c.setFocusable(true);				// 컨텐트팬이 포커스를 받을 수 있도록 설정
	c.requestFocus();					// 포커스 지정
	
	}	

	class MyKeyListener extends KeyAdapter {

		int keyCodetmp = 0;				//방금전 입력한 키코드
		java.util.Timer timer = new java.util.Timer();
		TimerTask task;
		public void keyPressed(KeyEvent e) {
			
			int keyCode = e.getKeyCode(); // 입력된 키코드
			switch(keyCode) {
		
			case KeyEvent.VK_UP: {			//위쪽 방향키를 입력할 경우
				if(keyCodetmp == KeyEvent.VK_DOWN || keyCodetmp == KeyEvent.VK_UP) //같은 방향키나 반대 방향키를 입력했다면
					break;					//탈출한다.
				else if(task != null)		//TimerTask가 생성되었다면
					task.cancel();			//TimreTask를 종료한다.
				
				keyCodetmp = KeyEvent.VK_UP;//방금전 입력한 키코드 변수에 현재 입력한 방향키를 넣는다.
				task = new UP();			//TimerTask 생성
				timer.schedule(task, 0, 100);//task를 0.1초간 반복하는 schedule을 즉시(0초) 생성한다.
				break;
			}
			
			case KeyEvent.VK_DOWN: {		//아랫쪽 방향키를 입력할 경우
				if(keyCodetmp == KeyEvent.VK_UP || keyCodetmp == KeyEvent.VK_DOWN) 
					break;
				else if(task != null)
					task.cancel();
			
				keyCodetmp = KeyEvent.VK_DOWN;
				task = new DOWN();
				timer.schedule(task, 0, 100);
				break;
			}
			
			case KeyEvent.VK_LEFT: {		//왼쪽 방향키를 입력할 경우
				if(keyCodetmp == KeyEvent.VK_RIGHT || keyCodetmp == KeyEvent.VK_LEFT) 
					break;
				else if(task != null)
					task.cancel();
				
				keyCodetmp = KeyEvent.VK_LEFT;
				task = new LEFT();
				timer.schedule(task, 0, 100);
					break;
			}	
			
			case KeyEvent.VK_RIGHT: {		//오른쪽 방향키를 입력할 경우
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
	
	class UP extends TimerTask {	//위로 이동
		public void run() {
			head.setLocation(head.getX(), head.getY() - value); 	//현재 지렁이 머리 좌표에서 value값 만큼 이동.(value 값은 맵 격자만큼 이동)
		}
	}
	class DOWN extends TimerTask {	//아래로 이동
		public void run() {

			head.setLocation(head.getX(), head.getY() + vlaue);
		}
	}
	class LEFT extends TimerTask {	//왼쪽으로 이동
		public void run() {

			head.setLocation(head.getX() - value, head.getY());
		}
	}
	class RIGHT extends TimerTask {	//오른쪽으로 이동
		public void run() {

			head.setLocation(head.getX() + value, head.getY());
		}
	}
	
}


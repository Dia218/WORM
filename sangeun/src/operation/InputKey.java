package operation;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import operation.tern.Direction;


public class InputKey extends KeyAdapter {
	
	
	interface InputMethod {
		void LeftKeyPressed();
		void RightKeyPressed();
		void UpKeyPressed();
		void DownKeyPressed();
	}
	
	private InputMethod im;
	
	public InputKey() {
		return;
	}

	private void Log(String str) {
		System.out.println(str);
	}
	



	
	
	//키를 눌렀을 때 호출되는 메소드
	@Override
	public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub

		super.keyPressed(e);
		
		int keyCode = e.getKeyCode();
		
		//입력된 키를 체크해서 ?
		switch (keyCode) {
		
		//Left Key를 눌렀을 때
		case KeyEvent.VK_LEFT:
			
			//반대 방향키나 같은 방향키를 눌렀을 때
			if(t.getDirection() == Direction.RIGHT || t.getDirection() ==  Direction.LEFT) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(t.getisReverse() == true) {
				Log("Right Key");
				t.setDirection(Direction.RIGHT);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
			}
			
			//일반적인 상황일 때
			else {
				Log("Left Key");
				t.setDirection(Direction.LEFT);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Up Key를 눌렀을 때
		case KeyEvent.VK_UP:

			//반대 방향키나 같은 방향키를 눌렀을 때
			if(t.getDirection() == Direction.DOWN || t.getDirection() == Direction.UP) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(t.getisReverse() == true) {
				Log("DOWN Key");
				t.setDirection(Direction.DOWN);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
			}

			//일반적인 상황일 때
			else {
				Log("Up Key");
				t.setDirection(Direction.UP);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Right Key를 눌렀을 때	
		case KeyEvent.VK_RIGHT:

			//반대 방향키나 같은 방향키를 눌렀을 때
			if(t.getDirection() == Direction.LEFT || t.getDirection() == Direction.RIGHT) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(t.getisReverse() == true) {
				Log("LEFT Key");
				t.setDirection(Direction.LEFT);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
			}

			//일반적인 상황일 때
			else {
				Log("Right Key");
				t.setDirection(Direction.RIGHT);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Down Key를 눌렀을 때
		case KeyEvent.VK_DOWN:

			//반대 방향키나 같은 방향키를 눌렀을 때
			if(t.getDirection() == Direction.UP || t.getDirection() == Direction.DOWN) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(t.getisReverse() == true) {
				Log("UP Key");
				t.setDirection(Direction.UP);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
			}

			//일반적인 상황일 때
			else {
				Log("Down Key");
				t.setDirection(Direction.DOWN);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		default:
			break;
		}
	}
}

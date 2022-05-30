package operation;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import element.Worm;
import operation.WormDirection.Direction;


public class InputKey extends KeyAdapter {
	
	public enum Direction{
		NONE, RIGHT, LEFT, UP, DOWN
	}
	
	Direction direction;
	
	interface InputMethod {
		void LeftKeyPressed();
		void RightKeyPressed();
		void UpKeyPressed();
		void DownKeyPressed();
	}
	
	private InputMethod im;
	
	public InputKey() {
		this.direction = Direction.NONE;
		return;
	}
	
	

	private void Log(String str) {
		System.out.println(str);
	}

	WormDirection wormDirection = new WormDirection();
	
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
			if(this.direction == Direction.RIGHT || this.direction == Direction.LEFT) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(wormDirection.getisReverse() == true) {
				Log("Right Key");
				this.direction = Direction.RIGHT;
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
			}
			
			//일반적인 상황일 때
			else {
				Log("Left Key");
				this.direction = Direction.LEFT;
				System.out.println(this.direction);
				//im.LeftKeyPressed();
				break;
			}
			
		//Up Key를 눌렀을 때
		case KeyEvent.VK_UP:

			//반대 방향키나 같은 방향키를 눌렀을 때
			if(this.direction == Direction.DOWN || wormDirection.getDirection() == Direction.UP) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(wormDirection.getisReverse() == true) {
				Log("DOWN Key");
				wormDirection.setDirection(Direction.DOWN);
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
			}

			//일반적인 상황일 때
			else {
				Log("Up Key");
				wormDirection.setDirection(Direction.UP);
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Right Key를 눌렀을 때	
		case KeyEvent.VK_RIGHT:

			//반대 방향키나 같은 방향키를 눌렀을 때
			if(wormDirection.getDirection() == Direction.LEFT || wormDirection.getDirection() == Direction.RIGHT) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(wormDirection.getisReverse() == true) {
				Log("LEFT Key");
				wormDirection.setDirection(Direction.LEFT);
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
			}

			//일반적인 상황일 때
			else {
				Log("Right Key");
				wormDirection.setDirection(Direction.RIGHT);
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Down Key를 눌렀을 때
		case KeyEvent.VK_DOWN:

			//반대 방향키나 같은 방향키를 눌렀을 때
			if(wormDirection.getDirection() == Direction.UP || wormDirection.getDirection() == Direction.DOWN) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(wormDirection.getisReverse() == true) {
				Log("UP Key");
				wormDirection.setDirection(Direction.UP);
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
			}

			//일반적인 상황일 때
			else {
				Log("Down Key");
				wormDirection.setDirection(Direction.DOWN);
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		default:
			break;
		}
	}
}

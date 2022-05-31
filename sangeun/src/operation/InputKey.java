package operation;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import element.Worm;
import operation.WormDirection.Direction;


public class InputKey extends KeyAdapter {
	
	
	interface InputMethod {
		void LeftKeyPressed();
		void RightKeyPressed();
		void UpKeyPressed();
		void DownKeyPressed();
	}
	
	private InputMethod im;
	public InputKey() {
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
			if(ManageElement.elementManager.wormDirection.getDirection() == Direction.RIGHT || ManageElement.elementManager.wormDirection.getDirection() == Direction.LEFT) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(ManageElement.elementManager.wormDirection.getisReverse() == true) {
				Log("Right Key");
				ManageElement.elementManager.wormDirection.setDirection(Direction.RIGHT);
				System.out.println(ManageElement.elementManager.wormDirection.getDirection());
				//im.LeftKeyPressed();
			}
			
			//일반적인 상황일 때
			else {
				Log("Left Key");
				ManageElement.elementManager.wormDirection.setDirection(Direction.LEFT);
				System.out.println(ManageElement.elementManager.wormDirection.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Up Key를 눌렀을 때
		case KeyEvent.VK_UP:

			//반대 방향키나 같은 방향키를 눌렀을 때
			if(ManageElement.elementManager.wormDirection.getDirection() == Direction.DOWN || ManageElement.elementManager.wormDirection.getDirection() == Direction.UP) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(ManageElement.elementManager.wormDirection.getisReverse() == true) {
				Log("DOWN Key");
				ManageElement.elementManager.wormDirection.setDirection(Direction.DOWN);
				System.out.println(ManageElement.elementManager.wormDirection.getDirection());
				//im.LeftKeyPressed();
			}

			//일반적인 상황일 때
			else {
				Log("Up Key");
				ManageElement.elementManager.wormDirection.setDirection(Direction.UP);
				System.out.println(ManageElement.elementManager.wormDirection.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Right Key를 눌렀을 때	
		case KeyEvent.VK_RIGHT:

			//반대 방향키나 같은 방향키를 눌렀을 때
			if(ManageElement.elementManager.wormDirection.getDirection() == Direction.LEFT || ManageElement.elementManager.wormDirection.getDirection() == Direction.RIGHT) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(ManageElement.elementManager.wormDirection.getisReverse() == true) {
				Log("LEFT Key");
				ManageElement.elementManager.wormDirection.setDirection(Direction.LEFT);
				System.out.println(ManageElement.elementManager.wormDirection.getDirection());
				//im.LeftKeyPressed();
			}

			//일반적인 상황일 때
			else {
				Log("Right Key");
				ManageElement.elementManager.wormDirection.setDirection(Direction.RIGHT);
				System.out.println(ManageElement.elementManager.wormDirection.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Down Key를 눌렀을 때
		case KeyEvent.VK_DOWN:

			//반대 방향키나 같은 방향키를 눌렀을 때
			if(ManageElement.elementManager.wormDirection.getDirection() == Direction.UP || ManageElement.elementManager.wormDirection.getDirection() == Direction.DOWN) break;
			
			//혼란 아이템을 먹고 키입력을 반대로 받는 메소드가 true가 될 때
			else if(ManageElement.elementManager.wormDirection.getisReverse() == true) {
				Log("UP Key");
				ManageElement.elementManager.wormDirection.setDirection(Direction.UP);
				System.out.println(ManageElement.elementManager.wormDirection.getDirection());
				//im.LeftKeyPressed();
			}

			//일반적인 상황일 때
			else {
				Log("Down Key");
				ManageElement.elementManager.wormDirection.setDirection(Direction.DOWN);
				System.out.println(ManageElement.elementManager.wormDirection.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		default:
			break;
		}
	}
}

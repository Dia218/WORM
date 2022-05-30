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
	
	//Ű�� ������ �� ȣ��Ǵ� �޼ҵ�
	@Override
	public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub

		super.keyPressed(e);
		
		int keyCode = e.getKeyCode();
		
		//�Էµ� Ű�� üũ�ؼ� ?
		switch (keyCode) {
		
		//Left Key�� ������ ��
		case KeyEvent.VK_LEFT:
			
			//�ݴ� ����Ű�� ���� ����Ű�� ������ ��
			if(this.direction == Direction.RIGHT || this.direction == Direction.LEFT) break;
			
			//ȥ�� �������� �԰� Ű�Է��� �ݴ�� �޴� �޼ҵ尡 true�� �� ��
			else if(wormDirection.getisReverse() == true) {
				Log("Right Key");
				this.direction = Direction.RIGHT;
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
			}
			
			//�Ϲ����� ��Ȳ�� ��
			else {
				Log("Left Key");
				this.direction = Direction.LEFT;
				System.out.println(this.direction);
				//im.LeftKeyPressed();
				break;
			}
			
		//Up Key�� ������ ��
		case KeyEvent.VK_UP:

			//�ݴ� ����Ű�� ���� ����Ű�� ������ ��
			if(this.direction == Direction.DOWN || wormDirection.getDirection() == Direction.UP) break;
			
			//ȥ�� �������� �԰� Ű�Է��� �ݴ�� �޴� �޼ҵ尡 true�� �� ��
			else if(wormDirection.getisReverse() == true) {
				Log("DOWN Key");
				wormDirection.setDirection(Direction.DOWN);
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
			}

			//�Ϲ����� ��Ȳ�� ��
			else {
				Log("Up Key");
				wormDirection.setDirection(Direction.UP);
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Right Key�� ������ ��	
		case KeyEvent.VK_RIGHT:

			//�ݴ� ����Ű�� ���� ����Ű�� ������ ��
			if(wormDirection.getDirection() == Direction.LEFT || wormDirection.getDirection() == Direction.RIGHT) break;
			
			//ȥ�� �������� �԰� Ű�Է��� �ݴ�� �޴� �޼ҵ尡 true�� �� ��
			else if(wormDirection.getisReverse() == true) {
				Log("LEFT Key");
				wormDirection.setDirection(Direction.LEFT);
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
			}

			//�Ϲ����� ��Ȳ�� ��
			else {
				Log("Right Key");
				wormDirection.setDirection(Direction.RIGHT);
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Down Key�� ������ ��
		case KeyEvent.VK_DOWN:

			//�ݴ� ����Ű�� ���� ����Ű�� ������ ��
			if(wormDirection.getDirection() == Direction.UP || wormDirection.getDirection() == Direction.DOWN) break;
			
			//ȥ�� �������� �԰� Ű�Է��� �ݴ�� �޴� �޼ҵ尡 true�� �� ��
			else if(wormDirection.getisReverse() == true) {
				Log("UP Key");
				wormDirection.setDirection(Direction.UP);
				System.out.println(wormDirection.getDirection());
				//im.LeftKeyPressed();
			}

			//�Ϲ����� ��Ȳ�� ��
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

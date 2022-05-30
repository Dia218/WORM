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
			if(t.getDirection() == Direction.RIGHT || t.getDirection() ==  Direction.LEFT) break;
			
			//ȥ�� �������� �԰� Ű�Է��� �ݴ�� �޴� �޼ҵ尡 true�� �� ��
			else if(t.getisReverse() == true) {
				Log("Right Key");
				t.setDirection(Direction.RIGHT);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
			}
			
			//�Ϲ����� ��Ȳ�� ��
			else {
				Log("Left Key");
				t.setDirection(Direction.LEFT);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Up Key�� ������ ��
		case KeyEvent.VK_UP:

			//�ݴ� ����Ű�� ���� ����Ű�� ������ ��
			if(t.getDirection() == Direction.DOWN || t.getDirection() == Direction.UP) break;
			
			//ȥ�� �������� �԰� Ű�Է��� �ݴ�� �޴� �޼ҵ尡 true�� �� ��
			else if(t.getisReverse() == true) {
				Log("DOWN Key");
				t.setDirection(Direction.DOWN);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
			}

			//�Ϲ����� ��Ȳ�� ��
			else {
				Log("Up Key");
				t.setDirection(Direction.UP);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Right Key�� ������ ��	
		case KeyEvent.VK_RIGHT:

			//�ݴ� ����Ű�� ���� ����Ű�� ������ ��
			if(t.getDirection() == Direction.LEFT || t.getDirection() == Direction.RIGHT) break;
			
			//ȥ�� �������� �԰� Ű�Է��� �ݴ�� �޴� �޼ҵ尡 true�� �� ��
			else if(t.getisReverse() == true) {
				Log("LEFT Key");
				t.setDirection(Direction.LEFT);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
			}

			//�Ϲ����� ��Ȳ�� ��
			else {
				Log("Right Key");
				t.setDirection(Direction.RIGHT);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
				break;
			}
			
		//Down Key�� ������ ��
		case KeyEvent.VK_DOWN:

			//�ݴ� ����Ű�� ���� ����Ű�� ������ ��
			if(t.getDirection() == Direction.UP || t.getDirection() == Direction.DOWN) break;
			
			//ȥ�� �������� �԰� Ű�Է��� �ݴ�� �޴� �޼ҵ尡 true�� �� ��
			else if(t.getisReverse() == true) {
				Log("UP Key");
				t.setDirection(Direction.UP);
				System.out.println(t.getDirection());
				//im.LeftKeyPressed();
			}

			//�Ϲ����� ��Ȳ�� ��
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

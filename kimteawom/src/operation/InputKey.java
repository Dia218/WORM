package operation;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class InputKey extends KeyAdapter {
	
	/*
	interface InputMethod {
		void LeftKeyPressed();
		void RightKeyPressed();
		void UpKeyPressed();
		void DownKeyPressed();
	}
	
	private InputMethod im;
	
	public InputKey(InputMethod inputMethod) {
		this.im = inputMethod;
	}

	private void Log(String str) {
		System.out.println(str);
	}
	*/
	
	
	//Ű�� ������ �� ȣ��Ǵ� �޼ҵ�
	@Override
	public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub

		//tern t = new tern();
		//super.keyPressed(e);
		
		int keyCode = e.getKeyCode();
		
		//�Էµ� Ű�� üũ�ؼ� ?
		switch (keyCode) {
		//Left Key�� ������ ��
		case KeyEvent.VK_LEFT:
			//Log("Left Key");
			//im.LeftKeyPressed();
			break;
		//Up Key�� ������ ��
		case KeyEvent.VK_UP:
			//Log("Up Key");
			//im.UpKeyPressed();
			break;
		//Right Key�� ������ ��
		case KeyEvent.VK_RIGHT:
			//Log("Right Key");
			//im.RightKeyPressed();
			break;
		//Down Key�� ������ ��
		case KeyEvent.VK_DOWN:
			//Log("Down Key");
			//im.DownKeyPressed();
			break;
		default:
			break;
		}
		
		
		/*
		switch (e.getKeyCode()) {
		//Left Key
		case 39:
			Log("Left Key");
			im.LeftKeyPressed();
			break;
		//Up Key
		case 40:
			Log("Up Key");
			im.UpKeyPressed();
			break;
		//Right Key
		case 37:
			Log("Right Key");
			im.RightKeyPressed();
			break;
		//Down Key
		case 38:
			Log("Down Key");
			im.DownKeyPressed();
			break;
			default:
			break;
		}
		*/
	}
}

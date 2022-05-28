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
	
	
	//키를 눌렀을 때 호출되는 메소드
	@Override
	public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub

		//tern t = new tern();
		//super.keyPressed(e);
		
		int keyCode = e.getKeyCode();
		
		//입력된 키를 체크해서 ?
		switch (keyCode) {
		//Left Key를 눌렀을 때
		case KeyEvent.VK_LEFT:
			//Log("Left Key");
			//im.LeftKeyPressed();
			break;
		//Up Key를 눌렀을 때
		case KeyEvent.VK_UP:
			//Log("Up Key");
			//im.UpKeyPressed();
			break;
		//Right Key를 눌렀을 때
		case KeyEvent.VK_RIGHT:
			//Log("Right Key");
			//im.RightKeyPressed();
			break;
		//Down Key를 눌렀을 때
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

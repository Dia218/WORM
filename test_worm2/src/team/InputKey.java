package team;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class InputKey extends KeyAdapter{
	
		interface InputMethod{
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
		
		@Override
		public void keyPressed(KeyEvent e) {
			Gaming g = new Gaming();
			super.keyPressed(e);
				// TODO Auto-generated method stub
			if(!g.getisReverse()) {
				switch (e.getKeyCode()) {
				//Left Key
				case 37:
					Log("Left Key");
					im.LeftKeyPressed();
					
					break;
				//Up Key
				case 38:
					Log("Up Key");
					im.UpKeyPressed();
					break;
				//Right Key
				case 39:
					Log("Right Key");
					im.RightKeyPressed();
					break;
				//Down Key
				case 40:
					Log("Down Key");
					im.DownKeyPressed();
					break;

				default:
					break;
				}
				
			}
			else {
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
			}
		}
			
		
		
	}
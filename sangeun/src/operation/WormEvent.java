package operation;

import javax.swing.event.*;

//똠치가 제작함
public class WormEvent extends Thread {
	tern tern = new tern();
	public void event() {
		try { 
			for(int i = 0 ; i < 10 ; i++){
				Thread.sleep(500);
				}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while(!tern.isGameOver()) {
						Thread.sleep(tern.getSpeed());
						
						tern.tern();
							

					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//게임 오버
				/*
				finally{
						try {
							//게임 오버쪽에서 해야 하는 일
							//for(int p =0;p<maxSize+1;p++) {
								//Thread.sleep(100);
								//tern.GameOverScreen(p);
								//repaint();
							//}
							} 
						catch (InterruptedException e) {
							// TODO 자동 생성된 catch 블록
							e.printStackTrace();
						}
						finally {
							//게임  오버쪽에서 해야 하는 일
							//tern.end = true;
							//tern.endGame();
							//repaint();
						}
					}
				*/
				}
				
			
		});
		thread.start();
		
	}
	

	
}


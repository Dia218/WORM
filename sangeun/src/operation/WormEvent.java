package operation;

import javax.swing.event.*;

//�cġ�� ������
public class WormEvent extends Thread {
	WormDirection wormDirection = new WormDirection();
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
					while(!wormDirection.isGameOver()) {
						Thread.sleep(wormDirection.getSpeed());
						
						//wormDirection;
							

					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//���� ����
				/*
				finally{
						try {
							//���� �����ʿ��� �ؾ� �ϴ� ��
							//for(int p =0;p<maxSize+1;p++) {
								//Thread.sleep(100);
								//tern.GameOverScreen(p);
								//repaint();
							//}
							} 
						catch (InterruptedException e) {
							// TODO �ڵ� ������ catch ���
							e.printStackTrace();
						}
						finally {
							//����  �����ʿ��� �ؾ� �ϴ� ��
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


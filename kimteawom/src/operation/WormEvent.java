package operation;

//�cġ�� ������
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
	

	@Override
	public void LeftKeyPressed() {
	
			if(tern.getDirection().equals(tern.Direction.RIGHT))return;
			if(tern.isPermitRotation())
				tern.setDirection(tern.Direction.LEFT);
		
		
	}

	@Override
	public void RightKeyPressed() {
		if(tern.getDirection().equals(tern.Direction.LEFT))return;
			if(tern.isPermitRotation())
				tern.setDirection(tern.Direction.RIGHT);
		
			
	}

	@Override
	public void UpKeyPressed() {

			if(tern.getDirection().equals(tern.Direction.DOWN))return;
			if(tern.isPermitRotation())
				tern.setDirection(tern.Direction.UP);

	}

	@Override
	public void DownKeyPressed() {
			if(tern.getDirection().equals(tern.Direction.UP))return;
			if(tern.isPermitRotation())
				tern.setDirection(tern.Direction.DOWN);
		
			
		
	}
}


package operation;

import javax.swing.event.*;

import element.Worm;
import element.block.TelpoBlock;
import element.worm.WormBody;
import element.worm.WormHead;
import screen.*;


public class WormEvent extends Thread {
	
	WormDirection wormDirection = new WormDirection();

//똠치가 제작함
public class WormEvent {
	
	WormEvent(){
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO 자동 생성된 메소드 스텁
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
				finally {
					new GameOver();
				}
			}
			
		});
	}
	
	
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
				
		thread.start();
		
	}

			if(tern.getDirection().equals(tern.Direction.RIGHT))return;
			if(tern.isPermitRotation())
				tern.setDirection(tern.Direction.LEFT);
		
		
	}

	public void RightKeyPressed() {
		if(tern.getDirection().equals(tern.Direction.LEFT))return;
			if(tern.isPermitRotation())
				tern.setDirection(tern.Direction.RIGHT);
		
			
	}

	public void UpKeyPressed() {

			if(tern.getDirection().equals(tern.Direction.DOWN))return;
			if(tern.isPermitRotation())
				tern.setDirection(tern.Direction.UP);

	}

	public void DownKeyPressed() {
			if(wormDirection.getDirection().equals(wormDirection.Direction.UP))return;
			if(wormDirection.isPermitRotation())
				wormDirection.setDirection(wormDirection.Direction.DOWN);
		
			
		
	}
	
}


package operation;

import javax.swing.event.*;

import element.Worm;
import element.block.TelpoBlock;
import element.worm.WormBody;
import element.worm.WormHead;
import screen.*;

<<<<<<< HEAD
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
	
	
	tern tern = new tern();
=======
/*
public class WormEvent extends Thread {
	
	WormDirection wormDirection = new WormDirection();
	
>>>>>>> 9792229385d67fbd23921367b7154d5cf8b478ff
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
	
<<<<<<< HEAD
	
=======
	public static void wormMove() {
		System.out.println("지렁이 무브");
		//지렁이 움직이는 알고리즘
		WormHead wormHead = new WormHead(Worm.bodyXY[0][0],Worm.bodyXY[1][0]);
		WormBody wormBody = new WormBody();
		
		//맨 뒤칸 삭제
		if(GameField.gamefield.checkElement((Worm.bodyXY[0][Worm.size-1]),(Worm.bodyXY[1][Worm.size-1])) instanceof Worm){
			GameField.gamefield.removeElement(Worm.bodyXY[0][Worm.size-1],Worm.bodyXY[1][Worm.size-1]);
		}
		
		
		if(Worm.size>=1){
			for(int i=Worm.size-1;i>0;i--) {
				Worm.bodyXY[0][i] = Worm.bodyXY[0][i-1];
				Worm.bodyXY[1][i] = Worm.bodyXY[1][i-1];
				wormBody.setdo(Worm.bodyXY[0][i], Worm.bodyXY[1][i]);
				GameField.gamefield.setElement(wormBody);
			}
		}
		else {
			return;
		}
		
		//GameField.gamefield.removeElement(Worm.bodyXY[0][Worm.size-1],Worm.bodyXY[1][Worm.size-1]);
		wormHead.setdo(wormHead.returnX()-1, wormHead.returnY());
		
		Worm.bodyXY[0][0] = wormHead.returnX();
		Worm.bodyXY[1][0] = wormHead.returnY();
		wormBody.setdo(Worm.bodyXY[0][0], Worm.bodyXY[1][0]);
		GameField.gamefield.setElement(wormHead);
		//여기까지
	}
>>>>>>> 9792229385d67fbd23921367b7154d5cf8b478ff
	

	
<<<<<<< HEAD

}
=======
	public static void badItemEat() {
		GameField.gamefield.removeElement(Worm.bodyXY[0][Worm.size-1], Worm.bodyXY[1][Worm.size-1]);
		Worm.size--;
	}
}*/
>>>>>>> 9792229385d67fbd23921367b7154d5cf8b478ff


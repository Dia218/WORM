package operation;

import javax.swing.event.*;

import element.Worm;
import element.block.TelpoBlock;
import element.worm.WormBody;
import element.worm.WormHead;
import screen.*;

public class WormEvent extends Thread {
	
	//������ �̵��ӵ� (1000�� �ӽ�)
	int wormSpeed = 100;
	WormDirection wormDirection = ManageElement.elementManager.wormDirection;
	
	public WormEvent() {
	}
	
	@Override
	public void run() {

		while(true) {
			try {
				Thread.sleep(wormSpeed);
				if(wormDirection.getIsMove() == true) {
					switch(wormDirection.getDirection()) {
					case RIGHT: 
						System.out.println(wormDirection.getDirection() + "ȣ��"); break;
					case LEFT: 
						System.out.println(wormDirection.getDirection() + "ȣ��"); break;
					case UP: 
						System.out.println(wormDirection.getDirection() + "ȣ��"); break;
					case DOWN: 
						System.out.println(wormDirection.getDirection() + "ȣ��"); break;
					}
				}
				else {
					System.out.println(wormDirection.getIsMove());
				}
				wormDirection.setKeyPressed(false);
			}
			catch(InterruptedException e) {return;}
		}
	}
	
	//������ �̵��ӵ� return �޼ҵ�
	public int getWormSpeed() {
		return wormSpeed;
	}
	
	//������ �̵��ӵ� ���� �޼ҵ�
	public void setWormSpeed(int i) {
		wormSpeed += i;
	}
	
}


/*
public class WormEvent extends Thread {
	
	WormDirection wormDirection = new WormDirection();
	
//�cġ�� ������
public class WormEvent {
	
	WormEvent(){
		Thread thread = new Thread(new Runnable(){



	
	


public class WormEvent extends Thread {
	tern tern = new tern();	
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
	public static void wormMove() {
		System.out.println("������ ����");
		//������ �����̴� �˰���
		WormHead wormHead = new WormHead(Worm.bodyXY[0][0],Worm.bodyXY[1][0]);
		WormBody wormBody = new WormBody();
		
		//�� ��ĭ ����
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
		//�������
	

}
	public static void badItemEat() {
		GameField.gamefield.removeElement(Worm.bodyXY[0][Worm.size-1], Worm.bodyXY[1][Worm.size-1]);
		Worm.size--;
	}
}
*/

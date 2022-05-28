package element;

import java.awt.Color;

import screen.GameField;

public class Worm extends Element {
	public static int bodyXY[][] = new int[2][15];
	public static int size = 0;
	
	public Worm(int elementX, int elementY) {
		super(elementX, elementY);
		
		
		//동작 확인
		System.out.println("지렁이 만들기");
		// TODO Auto-generated constructor stub
	}
	
	public int[][] getBody(){
		return bodyXY;
	}
	public void setBody(int[][] a){
		this.bodyXY = a;
	}
	
	public static void wormMove(Element wormHead, Element wormBody) {
		//지렁이 움직이는 알고리즘
		if(Worm.size>=1){
			GameField.gamefield.removeElement(Worm.bodyXY[0][Worm.size-1],Worm.bodyXY[1][Worm.size-1]);
			for(int i=Worm.size-1;i>0;i--) {
				Worm.bodyXY[0][i] = Worm.bodyXY[0][i-1];
				Worm.bodyXY[1][i] = Worm.bodyXY[1][i-1];
				wormBody.setdo(Worm.bodyXY[0][i], Worm.bodyXY[1][i]);
				GameField.gamefield.setElement(wormBody);
				
			}
		}
		wormHead.setdo(wormHead.returnX()-1, wormHead.returnY());
		//이 아래 것을 추가하고 
		//GameField.gamefield.setElement(wormHead); 
		
		Worm.bodyXY[0][0] = wormHead.returnX();
		Worm.bodyXY[1][0] = wormHead.returnY();
		wormBody.setdo(Worm.bodyXY[0][0], Worm.bodyXY[1][0]);
		//이 아래 것을 삭제
		GameField.gamefield.setElement(wormBody); 
		//여기까지
	
	}


	
}	
	


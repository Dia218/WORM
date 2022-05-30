package element;

import java.awt.Color;

import element.worm.WormBody;
import element.worm.WormHead;
//import element.worm.*;
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
	
	public int returnSize() {
		return this.size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
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
//		
		//GameField.gamefield.removeElement(Worm.bodyXY[0][Worm.size-1],Worm.bodyXY[1][Worm.size-1]);
	//	wormHead.setdo(wormHead.returnX()+1, wormHead.returnY());
		
//		Worm.bodyXY[0][0] = wormHead.returnX();
//		Worm.bodyXY[1][0] = wormHead.returnY();
		GameField.gamefield.setElement(wormHead);
		//여기까지
	
	}	
}



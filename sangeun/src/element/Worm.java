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

}

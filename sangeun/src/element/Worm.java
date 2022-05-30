package element;

import java.awt.Color;
import java.util.*;
import element.worm.WormBody;
import element.worm.WormHead;
import screen.GameField;

public class Worm extends Element {
	private static int wormXY[][] = new int[2][15];
	public static int wormSize = 0;
	
	/*이상은 추가 - 벡터*/
	protected static Vector<Worm> wormVector = new Vector<>(15);
	
	public Worm(int elementX, int elementY) {
		super(elementX, elementY);
		
		
		//동작 확인
		System.out.println("지렁이 만들기");
		// TODO Auto-generated constructor stub
	}
	
	public int[][] getWormXY(){
		return wormXY;
	}
	public void setWormXY(int[][] wormXY){
		this.wormXY = wormXY;
	}
	
	/*이상은 추가 - 벡터*/
	public int returnWormSize() {
		int wormSize = wormVector.size();
		return wormSize;
	}
	public Worm getWorm(int index) {
		return wormVector.get(index);
	}

}

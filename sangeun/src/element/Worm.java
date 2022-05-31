package element;

import java.awt.Color;
import java.util.*;
import element.worm.WormBody;
import element.worm.WormHead;
import screen.GameField;

public class Worm extends Element {


	
	/*이상은 추가 - 벡터*/
	protected static Vector<Worm> wormVector = new Vector<>(15);
	
	public Worm(int elementX, int elementY) {
		super(elementX, elementY);
	
			
		
		//동작 확인
		System.out.println("지렁이 만들기");
		// TODO Auto-generated constructor stub
	}
	
	


	

	/*이상은 추가 - 벡터*/
	public int returnWormSize() {
		int wormSize = wormVector.size();
		return wormSize;
	}
	public Worm getWorm(int index) {
		return wormVector.get(index);
	}
	public Worm returnWorm() {
		return wormVector.get(0);
	}
	
	//김태완 추가
	public Vector returnWormVector() {
		return this.wormVector;
	}
	public Worm returnLastWormBody() {
		return wormVector.get(wormVector.size()-1);
	}
	
	


}

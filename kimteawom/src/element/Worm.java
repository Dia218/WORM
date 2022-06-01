package element;

import java.awt.Color;
import java.util.*;
import element.worm.WormBody;
import element.worm.WormHead;
import operation.ManageElement;
import screen.GameField;

public abstract class Worm extends Element {

<<<<<<< HEAD
	private static int wormXY[][] = new int[2][100];
	public static int wormSize = 0;
	
	protected static int wormHeadXY[] = new int[2]; 
	
	//지렁이 벡터
	protected static Vector<Worm> wormVector = new Vector<>(100);
=======
	//지렁이 벡터
	protected static Vector<Worm> wormVector = new Vector<>(30);
>>>>>>> 10bd8a1447f4220a256e2ed433d4ccfe307ef84c
	
	public Worm(int elementX, int elementY) {
		super(elementX, elementY);
		
		//동작 확인
		System.out.println("지렁이 생성자 호출");
		// TODO Auto-generated constructor stub
	}
	


	/*지렁이 벡터 메소드*/
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
	

	public Worm returnLastWormBody() {
		return wormVector.get(wormVector.size()-1);
	}
	public void lastWormBodyDelete() {
		wormVector.remove(ManageElement.elementManager.wormHead.returnWormSize()-1);
	}

	public void executeElement() {
		// TODO 자동 생성된 메소드 스텁
		executeWorm();
	}
	
	public abstract void executeWorm();

}

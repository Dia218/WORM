package element;

import java.awt.Color;
import java.util.*;
import element.worm.WormBody;
import element.worm.WormHead;
import operation.ManageElement;
import screen.GameField;

public abstract class Worm extends Element {

	private static int wormXY[][] = new int[2][100];
	public static int wormSize = 0;
	
	protected static int wormHeadXY[] = new int[2]; 
	
	//지렁이 벡터
	protected static Vector<Worm> wormVector = new Vector<>(100);
	
	public Worm(int elementX, int elementY) {
		super(elementX, elementY);
		
		//동작 확인
		System.out.println("지렁이 생성자 호출");
		// TODO Auto-generated constructor stub
	}
	
	public int[][] getWormXY(){
		return wormXY;
	}
	public void setWormXY(int[][] wormXY){
		this.wormXY = wormXY;
	}
	

	public int returnSize() {
		return this.wormSize;
	}
	public void setSize(int size) {
		this.wormSize = size;
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
	
	public Vector returnWormVector() {
		return this.wormVector;
	} //벡터 자체를 내보내는건 없는게 나을 것 같아
	public Worm returnLastWormBody() {
		return wormVector.get(wormVector.size()-1);
	}
	public Worm lastWormBodyDelete() {
		return wormVector.remove(ManageElement.elementManager.wormHead.returnWormSize()-1);
	}
	public int[] returnWormHead() {
		return wormHeadXY;
		
	}
	public void setWormHead(int[] wormHead) {
		this.wormHeadXY = wormHead;
	}
	public void executeElement() {
		// TODO 자동 생성된 메소드 스텁
		executeWorm();
	}
	
	public abstract void executeWorm();

}

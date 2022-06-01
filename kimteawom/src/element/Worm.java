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
	
	//������ ����
	protected static Vector<Worm> wormVector = new Vector<>(100);
	
	public Worm(int elementX, int elementY) {
		super(elementX, elementY);
		
		//���� Ȯ��
		System.out.println("������ ������ ȣ��");
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
	
	

	/*������ ���� �޼ҵ�*/
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
	} //���� ��ü�� �������°� ���°� ���� �� ����
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
		// TODO �ڵ� ������ �޼ҵ� ����
		executeWorm();
	}
	
	public abstract void executeWorm();

}

package element;

import java.awt.Color;
import java.util.*;
import element.worm.WormBody;
import element.worm.WormHead;
import screen.GameField;

public class Worm extends Element {


	
	/*�̻��� �߰� - ����*/
	protected static Vector<Worm> wormVector = new Vector<>(15);
	
	public Worm(int elementX, int elementY) {
		super(elementX, elementY);
	
			
		
		//���� Ȯ��
		System.out.println("������ �����");
		// TODO Auto-generated constructor stub
	}
	
	


	

	/*�̻��� �߰� - ����*/
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
	
	//���¿� �߰�
	public Vector returnWormVector() {
		return this.wormVector;
	}
	public Worm returnLastWormBody() {
		return wormVector.get(wormVector.size()-1);
	}
	
	


}

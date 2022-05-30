package element;

import java.awt.Color;
import java.util.*;
import element.worm.WormBody;
import element.worm.WormHead;
import screen.GameField;

public class Worm extends Element {
	private static int wormXY[][] = new int[2][15];
	public static int wormSize = 0;
	
	/*�̻��� �߰� - ����*/
	protected static Vector<Worm> wormVector = new Vector<>(15);
	
	public Worm(int elementX, int elementY) {
		super(elementX, elementY);
	
			
		
		//���� Ȯ��
		System.out.println("������ �����");
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
//		
		//GameField.gamefield.removeElement(Worm.bodyXY[0][Worm.size-1],Worm.bodyXY[1][Worm.size-1]);
	//	wormHead.setdo(wormHead.returnX()+1, wormHead.returnY());
		
//		Worm.bodyXY[0][0] = wormHead.returnX();
//		Worm.bodyXY[1][0] = wormHead.returnY();
		GameField.gamefield.setElement(wormHead);
		//�������
	
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
	public Vector returnWormVector() {
		return this.wormVector;
	}
	public Worm returnLastWormBody() {
		return wormVector.get(wormVector.size()-1);
	}


}



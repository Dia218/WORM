package element.item;

import java.awt.Color;

import element.Item;
import element.Worm;
import operation.ManageElement;
import screen.GameField;

public class BadItem extends Item {
	
	public BadItem(int elementX, int elementY) {
		super(elementX, elementY);
		super.color = Color.PINK;
		// TODO Auto-generated constructor stub
		
		//���� Ȯ��
		System.out.println("���� ������ ������ ȣ��");
	}
	
	public static void badItemEat() {
		ManageElement.elementManager.deleteWormBody();
	}
}

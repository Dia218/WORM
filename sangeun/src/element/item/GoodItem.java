package element.item;

import java.awt.Color;

import element.Item;
import element.Worm;

public class GoodItem extends Item {
	
	public GoodItem(int blockX, int blockY) {
		super(blockX, blockY);
		super.color = Color.GREEN;
		// TODO Auto-generated constructor stub
		
		//���� Ȯ��
		System.out.println("������ �����");
	}
	
	public static void goodItemEat() {
		if(Worm.size <= 5) {
			Worm.size++;
		}
		Worm.wormMove();
		
}
	
	
}

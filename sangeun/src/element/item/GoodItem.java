package element.item;

import java.awt.Color;

import element.Item;

public class GoodItem extends Item {
	
	public GoodItem(int blockX, int blockY) {
		super(blockX, blockY);
		super.color = Color.GREEN;
		// TODO Auto-generated constructor stub
		
		//���� Ȯ��
		System.out.println("������ �����");
	}
	
}

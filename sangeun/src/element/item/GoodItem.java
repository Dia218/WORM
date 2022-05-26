package element.item;

import java.awt.Color;

import element.Item;

public class GoodItem extends Item {
	
	public GoodItem(int blockX, int blockY) {
		super(blockX, blockY);
		super.color = Color.MAGENTA;
		// TODO Auto-generated constructor stub
		
		//동작 확인
		System.out.println("아이템 만들기");
	}
	
}

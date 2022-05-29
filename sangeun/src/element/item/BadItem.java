package element.item;

import java.awt.Color;

import element.Item;

public class BadItem extends Item {

	public BadItem(int elementX, int elementY) {
		super(elementX, elementY);
		super.color = Color.PINK;
		// TODO Auto-generated constructor stub
		
		//동작 확인
		System.out.println("나쁜 아이템 생성자 호출");
	}

}

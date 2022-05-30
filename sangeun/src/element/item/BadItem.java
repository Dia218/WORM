package element.item;

import java.awt.Color;

import element.Item;
import element.Worm;
import screen.GameField;

public class BadItem extends Item {

	public BadItem(int elementX, int elementY) {
		super(elementX, elementY);
		super.color = Color.PINK;
		// TODO Auto-generated constructor stub
	}
	
	public static void badItemEat() {
		GameField.gamefield.removeElement(Worm.bodyXY[0][Worm.size-1], Worm.bodyXY[1][Worm.size-1]);
		Worm.size--;
		Worm.wormMove();
	}
}

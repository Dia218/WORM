package element.item;

import java.awt.Color;

import element.Item;
import element.Worm;
import element.worm.WormBody;
import operation.ManageElement;

public class GoodItem extends Item {
	
	public GoodItem(int blockX, int blockY) {
		super(blockX, blockY);
		super.color = Color.CYAN;
		// TODO Auto-generated constructor stub
		
		//���� Ȯ��
		System.out.println("���� ������ ������ ȣ��");
	}
	
	public static void goodItemEat() {
		if(ManageElement.elementManager.wormHead.returnWormSize() < 14) {
			//ManageElement.elementManager.createWormBody(1, 1);
		}
		//Worm.wormMove(); -> ���� �������� ����
		
}
	
	
}

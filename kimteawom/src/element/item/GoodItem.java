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
<<<<<<< HEAD
		if(ManageElement.elementManager.wormHead.returnWormSize() < 99) {
=======
		if(ManageElement.elementManager.wormHead.returnWormSize() < 29) {
>>>>>>> 10bd8a1447f4220a256e2ed433d4ccfe307ef84c
			ManageElement.elementManager.createWormBody(1, 1);
		}
		System.out.print("���� �������� �Ծ���");
		
		
}

	@Override
	public void executeItem() {
		// TODO �ڵ� ������ �޼ҵ� ����
		goodItemEat();
		ManageElement.elementManager.wormDirection.setisReverse(false);
		ManageElement.elementManager.createGoodItem();
	}
	
	
}

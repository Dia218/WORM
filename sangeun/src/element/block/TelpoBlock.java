package element.block;
import java.awt.Color;

import element.Block;
import element.Worm;

public class TelpoBlock extends Block {

	Color color = super.color.MAGENTA;
			
	public TelpoBlock(int blockX, int blockY) {
		super(blockX, blockY);
		// TODO Auto-generated constructor stub
		//���� �߰�
		setColor(Color.magenta);
		
		//���� Ȯ��
		System.out.println("�ڷ���Ʈ ��� �����");
	}

}

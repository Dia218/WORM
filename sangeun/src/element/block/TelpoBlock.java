package element.block;
import java.awt.Color;

import element.Block;

public class TelpoBlock extends Block {

	Color color = super.color.MAGENTA;
			
	public TelpoBlock(int blockX, int blockY) {
		super(blockX, blockY);
		// TODO Auto-generated constructor stub
		
		//동작 확인
		System.out.println("텔레포트 블록 만들기");
	}

}

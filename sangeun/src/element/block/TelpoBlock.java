package element.block;
import java.awt.Color;

import element.Block;


public class TelpoBlock extends Block {
			
	public TelpoBlock(int blockX, int blockY) {
		super(blockX, blockY);
		super.color = Color.BLUE;
		// TODO Auto-generated constructor stub
		//내가 추가
		
		
		//동작 확인
		System.out.println("텔레포트 블록 생성자 호출");
	}

}

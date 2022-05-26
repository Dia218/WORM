package element.block;
import java.awt.Color;
import element.Block;

public class KillBlock extends Block {

	public KillBlock(int blockX, int blockY) {
		super(blockX, blockY);
		super.color = Color.RED;
		// TODO Auto-generated constructor stub
		
		//동작 확인
		System.out.println("킬 블록 만들기");
	}

}

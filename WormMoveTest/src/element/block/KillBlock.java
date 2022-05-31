package element.block;
import java.awt.Color;
import element.Block;

public class KillBlock extends Block {

	public KillBlock(int blockX, int blockY) {
		super(blockX, blockY);
		super.color = Color.RED;
		// TODO Auto-generated constructor stub
		
		//동작 확인
		System.out.println("킬 블록 생성자 호출");
	}

	@Override
	public void executeBlock() {
		// TODO Auto-generated method stub
		executeKillBlock();
	}
	private void executeKillBlock() {
		//지렁이를 죽인다 - 지렁이 머리를 없앤다
		//new GameOver();
		//IsGameOver = true;
	}
}

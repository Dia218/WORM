package create;
import block.BasicBlock;

//블록을 생성시키는 클래스
public class BlockCreate {
	
	
	//기본 블록 생성 - 3개?
	void createBasicBlock() {
		
		BasicBlock basicblock = new BasicBlock(blockX, blockY, blockLength, blockWidth);
		
	}
	
	
	
	int blockX = (int)Math.random(); //겹치지 않게...?
	int blockY = (int)Math.random(); //겹치지 않게...?
	int blockLength = (int)Math.random(); //3이하로 수정
	int blockWidth = (int)Math.random(); //3이하로 수정
		
	
	
	
	
	
	//킬 블록 생성 - 3개?
	
	
	
	
	
	//텔레포트 블록 생성 - 2개 고정
	
	
	
	
}

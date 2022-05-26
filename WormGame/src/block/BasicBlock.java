package block;

//기본 블록
public class BasicBlock extends BlockType {

	int blockX; //블록의 x축 좌표
	int blockY; //블록의 y축 좌표
	
	int blockLength; //블록의 세로 길이
	int blockWidth; //블록의 가로 넓이

	
	//기본 블록 생성자
	public BasicBlock(int blockX, int blockY, int blockLength, int blockWidth) {
		
		this.blockX = blockX;
		this.blockY = blockY;
		this.blockLength = blockLength;
		this.blockWidth = blockWidth; 
		
	}
	

	//지렁이를 막는 메소드
	void blockWorm() {
		
		/* 
		 * 키 입력 클래스에서 키 입력 무효화
		 * 
		 */
		
	}
	
}

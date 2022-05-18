package block;

//지렁이가 닿으면 죽는 블록, 지렁이의 길이를 초기화하고 게임 종료
public class KillBlock extends BlockType {

	int blockX; //블록의 x축 좌표
	int blockY; //블록의 y축 좌표
	
	int blockLength; //블록의 세로 길이
	int blockWidth; //블록의 가로 넓이
	
	
	//킬 블록 생성자
	public KillBlock(int blockX, int blockY, int blockLength, int blockWidth) {
		
		this.blockX = blockX;
		this.blockY = blockY;
		this.blockLength = blockLength;
		this.blockWidth = blockWidth; 
		
	}
	
	
	//지렁이를 죽이는 메소드
	void killWorm() {
		
	}
	
}

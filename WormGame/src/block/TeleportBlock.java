package block;

//지렁이를 이동시키는 블록, 두 개 생성 고정(짝 블록)
public class TeleportBlock extends BlockType {


	int blockX1; //1블록의 x축 좌표
	int blockY1; //1블록의 y축 좌표
	
	int blockX2; //2블록의 x축 좌표
	int blockY2; //2블록의 y축 좌표
	
	
	//텔레포트 블록 생성자
	public TeleportBlock(int blockX1, int blockY1, int blockX2, int blockY2) {
		
		this.blockX1 = blockX1;
		this.blockY1 = blockY1;
		this.blockX1 = blockX2;
		this.blockY1 = blockY2;
	}
	
	
	//지렁이를 이동시키는 메소드
	void telpoWorm() {
		
		/*
		 * 지렁이 클래스의 위치 좌표에 다른 텔레포트 블록의 좌표를 전달
		 */
		
	}
	
}

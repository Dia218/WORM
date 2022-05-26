package create;
import block.*;

//블록을 생성시키는 클래스
public class BlockCreate {
	
	//좌표를 일시적으로 저장할 수 있는 필드
	int blockX; //블록의 x축 좌표
	int blockY; //블록의 y축 좌표
	
	int blockLength; //블록의 세로 길이
	int blockWidth; //블록의 가로 넓이

	
	//랜덤 좌표 생성기
	void locateBlock() {
		//좌표 0~20
		int blockX = (int)(Math.random() * 19) + 0;
		int blockY = (int)(Math.random() * 19) + 0;

		//스크린박스의 메소드를 호출하여 해당 좌표에 객체가 들어있는지 확인
		// -> 아직 구현하지 않은 메소드
		if(checkScreenBox(blockX, blockY) != null) {
			//해당 좌표에 객체가 있다면 메소드 다시 호출
			locateBlock();
		}
		else {
			;
		}
		
		//해당 좌표에 객체가 없다면 좌표를 일시적으로 저장
		this.blockX = blockX;
		this.blockY = blockY;
	}
	
	
	//랜덤 크기 생성기
	void sizeBlock(int blockX, int blockY) {

		//추가 길이 0~4
		int blockLength = (int)(Math.random() * 5) + 0;
		int blockWidth = (int)(Math.random() * 5) + 0;

		
		for(int j = 0; j <= blockWidth; j++) {
			for (int i = 0; i <= blockLength; i++) {
				//스크린박스의 메소드를 호출하여 해당 좌표에 객체가 들어있는지 확인
				// -> 아직 구현하지 않은 메소드
				if(checkScreenBox(blockX + i, blockY + j) != null) {
					//해당 좌표에 객체가 있다면 메소드 다시 호출
					sizeBlock(this.blockX, this.blockY);
				}
				else {
					;
				}
			}
		}
		
		//해당 좌표에 객체가 없다면 크기를 일시적으로 저장
		this.blockLength = blockLength;
		this.blockWidth = blockWidth; 
	}
	
	
	
	//기본 블록 생성 - 5개
	void createBasicBlock() {
		
		//기본 블록 레퍼런스 배열 생성
		BasicBlock[] basicblock;
		basicblock = new BasicBlock[5];
		
		for(int i = 1; i <= 5; i++) {
			//랜덤 필드 값 생성 호출
			locateBlock();
			sizeBlock(this.blockX, this.blockY);
			//기본 블록 객체 생성
			basicblock[i] = new BasicBlock(this.blockX, this.blockY, this.blockLength, this.blockWidth );
		}
	}
	
	
	//킬 블록 생성 - 3개
	void createKillBlock() {
		
		//킬 블록 레퍼런스 배열 생성
		KillBlock[] killblock;
		 killblock = new KillBlock[5];
		
		for(int i = 1; i <= 3; i++) {
			//랜덤 필드 값 생성 호출
			locateBlock();
			sizeBlock(this.blockX, this.blockY);
			//킬 블록 객체 생성
			killblock[i] = new KillBlock(this.blockX, this.blockY, this.blockLength, this.blockWidth );
		}
	}
	
	
	//텔레포트 블록 생성 - 2개
	void createTelpoBlock() {
		
		//랜덤 좌표 값 생성 호출 - 텔레포트1 블록
		locateBlock();
		
		//텔레포트1 블록 좌표 저장
		int blockX1 = this.blockX; 
		int blockY1 = this.blockY;
				
		//랜덤 좌표 값 생성 호출 - 텔레포트2 블록
		locateBlock();
		
		//텔레포트1 블록 좌표 저장
		int blockX2 = this.blockX; 
		int blockY2 = this.blockY;
		
		//텔레포트1 블록 객체 생성
		TeleportBlock teleportblock1 = new TeleportBlock(blockX1, blockY1, blockX2, blockY2);
		
		//텔레포트2 블록 객체 생성
		TeleportBlock teleportblock2 = new TeleportBlock(blockX2, blockY2, blockX1, blockY1);
	}
	
	
	
}

package create;
import block.*;

//����� ������Ű�� Ŭ����
public class BlockCreate {
	
	//��ǥ�� �Ͻ������� ������ �� �ִ� �ʵ�
	int blockX; //����� x�� ��ǥ
	int blockY; //����� y�� ��ǥ
	
	int blockLength; //����� ���� ����
	int blockWidth; //����� ���� ����

	
	//���� ��ǥ ������
	void locateBlock() {
		//��ǥ 0~20
		int blockX = (int)(Math.random() * 19) + 0;
		int blockY = (int)(Math.random() * 19) + 0;

		//��ũ���ڽ��� �޼ҵ带 ȣ���Ͽ� �ش� ��ǥ�� ��ü�� ����ִ��� Ȯ��
		// -> ���� �������� ���� �޼ҵ�
		if(checkScreenBox(blockX, blockY) != null) {
			//�ش� ��ǥ�� ��ü�� �ִٸ� �޼ҵ� �ٽ� ȣ��
			locateBlock();
		}
		else {
			;
		}
		
		//�ش� ��ǥ�� ��ü�� ���ٸ� ��ǥ�� �Ͻ������� ����
		this.blockX = blockX;
		this.blockY = blockY;
	}
	
	
	//���� ũ�� ������
	void sizeBlock(int blockX, int blockY) {

		//�߰� ���� 0~4
		int blockLength = (int)(Math.random() * 5) + 0;
		int blockWidth = (int)(Math.random() * 5) + 0;

		
		for(int j = 0; j <= blockWidth; j++) {
			for (int i = 0; i <= blockLength; i++) {
				//��ũ���ڽ��� �޼ҵ带 ȣ���Ͽ� �ش� ��ǥ�� ��ü�� ����ִ��� Ȯ��
				// -> ���� �������� ���� �޼ҵ�
				if(checkScreenBox(blockX + i, blockY + j) != null) {
					//�ش� ��ǥ�� ��ü�� �ִٸ� �޼ҵ� �ٽ� ȣ��
					sizeBlock(this.blockX, this.blockY);
				}
				else {
					;
				}
			}
		}
		
		//�ش� ��ǥ�� ��ü�� ���ٸ� ũ�⸦ �Ͻ������� ����
		this.blockLength = blockLength;
		this.blockWidth = blockWidth; 
	}
	
	
	
	//�⺻ ��� ���� - 5��
	void createBasicBlock() {
		
		//�⺻ ��� ���۷��� �迭 ����
		BasicBlock[] basicblock;
		basicblock = new BasicBlock[5];
		
		for(int i = 1; i <= 5; i++) {
			//���� �ʵ� �� ���� ȣ��
			locateBlock();
			sizeBlock(this.blockX, this.blockY);
			//�⺻ ��� ��ü ����
			basicblock[i] = new BasicBlock(this.blockX, this.blockY, this.blockLength, this.blockWidth );
		}
	}
	
	
	//ų ��� ���� - 3��
	void createKillBlock() {
		
		//ų ��� ���۷��� �迭 ����
		KillBlock[] killblock;
		 killblock = new KillBlock[5];
		
		for(int i = 1; i <= 3; i++) {
			//���� �ʵ� �� ���� ȣ��
			locateBlock();
			sizeBlock(this.blockX, this.blockY);
			//ų ��� ��ü ����
			killblock[i] = new KillBlock(this.blockX, this.blockY, this.blockLength, this.blockWidth );
		}
	}
	
	
	//�ڷ���Ʈ ��� ���� - 2��
	void createTelpoBlock() {
		
		//���� ��ǥ �� ���� ȣ�� - �ڷ���Ʈ1 ���
		locateBlock();
		
		//�ڷ���Ʈ1 ��� ��ǥ ����
		int blockX1 = this.blockX; 
		int blockY1 = this.blockY;
				
		//���� ��ǥ �� ���� ȣ�� - �ڷ���Ʈ2 ���
		locateBlock();
		
		//�ڷ���Ʈ1 ��� ��ǥ ����
		int blockX2 = this.blockX; 
		int blockY2 = this.blockY;
		
		//�ڷ���Ʈ1 ��� ��ü ����
		TeleportBlock teleportblock1 = new TeleportBlock(blockX1, blockY1, blockX2, blockY2);
		
		//�ڷ���Ʈ2 ��� ��ü ����
		TeleportBlock teleportblock2 = new TeleportBlock(blockX2, blockY2, blockX1, blockY1);
	}
	
	
	
}

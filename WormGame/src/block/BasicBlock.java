package block;

//�⺻ ���
public class BasicBlock extends BlockType {

	int blockX; //����� x�� ��ǥ
	int blockY; //����� y�� ��ǥ
	
	int blockLength; //����� ���� ����
	int blockWidth; //����� ���� ����

	
	//�⺻ ��� ������
	public BasicBlock(int blockX, int blockY, int blockLength, int blockWidth) {
		
		this.blockX = blockX;
		this.blockY = blockY;
		this.blockLength = blockLength;
		this.blockWidth = blockWidth; 
		
	}
	

	//�����̸� ���� �޼ҵ�
	void blockWorm() {
		
		/* 
		 * Ű �Է� Ŭ�������� Ű �Է� ��ȿȭ
		 * 
		 */
		
	}
	
}

package block;

//�����̰� ������ �״� ���, �������� ���̸� �ʱ�ȭ�ϰ� ���� ����
public class KillBlock extends BlockType {

	int blockX; //����� x�� ��ǥ
	int blockY; //����� y�� ��ǥ
	
	int blockLength; //����� ���� ����
	int blockWidth; //����� ���� ����
	
	
	//ų ��� ������
	public KillBlock(int blockX, int blockY, int blockLength, int blockWidth) {
		
		this.blockX = blockX;
		this.blockY = blockY;
		this.blockLength = blockLength;
		this.blockWidth = blockWidth; 
		
	}
	
	
	//�����̸� ���̴� �޼ҵ�
	void killWorm() {
		
	}
	
}

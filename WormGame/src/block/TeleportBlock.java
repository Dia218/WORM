package block;

//�����̸� �̵���Ű�� ���, �� �� ���� ����(¦ ���)
public class TeleportBlock extends BlockType {


	int blockX1; //1����� x�� ��ǥ
	int blockY1; //1����� y�� ��ǥ
	
	int blockX2; //2����� x�� ��ǥ
	int blockY2; //2����� y�� ��ǥ
	
	
	//�ڷ���Ʈ ��� ������
	public TeleportBlock(int blockX1, int blockY1, int blockX2, int blockY2) {
		
		this.blockX1 = blockX1;
		this.blockY1 = blockY1;
		this.blockX1 = blockX2;
		this.blockY1 = blockY2;
	}
	
	
	//�����̸� �̵���Ű�� �޼ҵ�
	void telpoWorm() {
		
		/*
		 * ������ Ŭ������ ��ġ ��ǥ�� �ٸ� �ڷ���Ʈ ����� ��ǥ�� ����
		 */
		
	}
	
}

package element;

public abstract class Block extends Element {
	
	/*��� Ŭ���� ������*/
	public Block(int blockX, int blockY) {
		super(blockX, blockY);
		
		//���� Ȯ��
		System.out.println("��� ������ ȣ��");
	}
	
	/*��� Ŭ���� �߻� �޼ҵ�*/
	//����� ����� �۵� ��Ű�� �߻� �޼ҵ�
	public abstract void executeBlock();
	public void executeElement() {
		executeBlock();
		
	}
}
package element.block;
import java.awt.Color;

import element.Block;


public class TelpoBlock extends Block {
			
	/*�ڷ���Ʈ ��� �ʵ�*/
	int telpoOtherXY[] = new int[2]; //�ٸ� �ڸ���Ʈ ����� ��ġ ����
	
	/*�ڷ���Ʈ ��� ������*/
	private TelpoBlock(int blockX, int blockY) {
		super(blockX, blockY);
		super.color = Color.BLUE;
		// TODO Auto-generated constructor stub		
		
		//���� Ȯ��
		System.out.println("�ڷ���Ʈ ��� ������ ȣ��");
	}
	public TelpoBlock(int blockX, int blockY, int telpoOtherXY[]) {
		this(blockX, blockY);
		this.telpoOtherXY = telpoOtherXY; 
	}

	/*�ڷ���Ʈ ��� �޼ҵ�*/
	@Override
	public void executeBlock() {
		// TODO Auto-generated method stub
		
	}
	private void executeTelpoBlock() {
		//�ٸ� ��� ��ǥ�� ������ �Ӹ��� �̵���Ų��
		
	}
	
}

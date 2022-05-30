package element.block;
import java.awt.Color;

import element.Block;
import element.Worm;
import screen.GameField;


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
	
	
	//tp ��
	public int[] telpoOtherReturn() {
		return this.telpoOtherXY;
	}
	
	/*�ڷ���Ʈ ��� �޼ҵ�*/
	@Override
	public void executeBlock() {
		// TODO Auto-generated method stub
		
	}
	private void executeTelpoBlock() {
		//�ٸ� ��� ��ǥ�� ������ �Ӹ��� �̵���Ų��
		int telpoXY[] = telpoOtherReturn();
		Worm.bodyXY[0][0] = telpoXY[0]; 
		Worm.bodyXY[1][0] = telpoXY[1];
		Worm.wormMove();
	}
	
}

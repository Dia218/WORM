package element.block;
import java.awt.Color;
import element.*;

public class BasicBlock extends Block {

	public BasicBlock(int blockX, int blockY) {
		super(blockX, blockY);
		super.color = Color.ORANGE;
		// TODO Auto-generated constructor stub
		
		//���� Ȯ��
		System.out.println("�⺻ ��� ������ ȣ��");
	}

	@Override
	public void executeBlock() {
		// TODO Auto-generated method stub
		
	}
	private void executeBasicBlock() {
		//������ �Ӹ��� �ش� ��ǥ�� ���������� �Ѵ�
		
	}
}

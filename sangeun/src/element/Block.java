package element;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Block extends Element {

	protected Color color = super.color;
	
	/*��� Ŭ���� ������*/
	public Block(int blockX, int blockY) {
		super(blockX, blockY);
		
		//���� Ȯ��
		System.out.println("��� �����");
	}
	
}
package element;

import java.awt.*;
import screen.*;

public abstract class Element {
		
	/*��� Ŭ���� �ʵ�*/
	protected int elementX;
	protected int elementY;
	protected Color color;
	
	/*��� Ŭ���� ������*/
	public Element(int elementX, int elementY) {
		this.elementX = elementX;
		this.elementY = elementY;
		
		//����� �г� ��ü ����
		ElementPanel elementPanel = new ElementPanel(this);
		
		//���� Ȯ��
		System.out.println("��� �����");
	}
	
	/*��� Ŭ���� �޼ҵ�*/
	public int returnX() {
		return this.elementX;
	}
	public int returnY() {
		return this.elementY;
	}
	public Color returnColor() {
		return this.color;
	}
}

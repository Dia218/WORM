package element;

import java.awt.*;
import screen.*;

public class Element {
	
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
	
	//�����߰�
	public void setdo(int x, int y) {
		this.elementX = x;
		this.elementY =y;
		
	}
	
	/*��� Ŭ���� �޼ҵ�*/
	public int returnX() {
		return this.elementX;
	}
	public int returnY() {
		return this.elementY;
	}
	//�����߰�
	public void setColor(Color a) {
		color = a;
	}
	
	public Color returnColor() {
		return this.color;
	}
}

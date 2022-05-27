package screen;

import java.awt.*;

import javax.swing.*;

import element.*;

public class ElementPanel extends JPanel {

	/*��� �г��� �ʵ�*/
	
	//element ��ü ����
	Element element;
	
	//�׸��� ũ��
	final int drawSize = 16;
	
	/*��� �г��� ������*/
	public ElementPanel(int panelX, int panelY) {
		
		//��� �г��� ��ġ�� ũ�� ����
		setBounds(panelX*GameField.gamefield.elementSize, panelY*GameField.gamefield.elementSize, GameField.gamefield.elementSize, GameField.gamefield.elementSize);
		
		//���� ���� - ���� //��ġ �ٲ���Ҽ�������
		setOpaque(false);
		
		//���� �ʵ忡 ��ġ�ϱ�
		GameField.gamefield.add(this);
		
		//���� Ȯ��
		System.out.println("��� �г� ���� �� ��ġ : " + panelX + ", " + panelY);
	}

	
	/*��� �г��� �޼ҵ�*/
	
	//��� ���� �����ϴ� �޼ҵ�
	public void inputElement(Element element) {
		this.element = element;
		
		//�г� �ٽ� �׸���
		repaint();
	}
	
	@Override
	//��� �׸���
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//element�� ���� ��
		if(element == null) {
			;
		}
		
		//element�� ���� ��
		else {
			//element ��ü�� ���� ���� �޾ƿ���
			g.setColor(element.returnColor());
			
			//���� �׸��� �޼ҵ� ȣ��
			drawFigure(g);
		}
	}
	
	//element ������ ���� �׸��� ����
	public void drawFigure(Graphics g) { 
	
		//������ = ����
		if(element instanceof Worm) {
			g.fillOval(0, 0, drawSize, drawSize);
		}
		//��� = �簢��
		else if(element instanceof Block) {
			g.fillRect(0, 0, drawSize, drawSize);
		}
		//������ = ������
		else if(element instanceof Item) {
			int x[] = {drawSize /2, 0, drawSize / 2 , drawSize};
			int y[] = {0, drawSize / 2, drawSize, drawSize /2 };
			g.fillPolygon(x, y, 4);
		}
		//�ƹ� �͵� �ش����� ������ �׸��� ����
		else
			;
		
	}
	
	
	
}

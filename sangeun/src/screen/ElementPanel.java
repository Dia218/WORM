package screen;

import java.awt.*;

import javax.swing.*;

import element.*;

public class ElementPanel extends JPanel {

	/*��� �г��� �ʵ�*/
	
	//element ��ü ����
	Element element;
	final int MaxGraphicSize = 16;
	
	
	/*��� �г��� ������*/
	public ElementPanel(Element element) {
		this.element = element;
		
		//��� �г��� ��ġ�� ũ�� ����
		this.setBounds(element.returnX()*20, element.returnY()*20, 20, 20);
				
		//���� �ʵ忡 ��ġ�ϱ�
		GameField.gamefield.add(this);
		
		//���� �ʵ� �ٽ� �׸���
		GameField.gamefield.revalidate();
		GameField.gamefield.repaint();
		
		//���� Ȯ��
		System.out.println("��� �г� ���� �� ��ġ");
	}
	
	
	/*��� �г��� �޼ҵ�*/
	
	@Override
	//��� �׸���
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//element ��ü�� ���� ���� �޾ƿ���
		g.setColor(element.returnColor());
		//���� �׸��� �޼ҵ� ȣ��
		drawFigure(g);
		//���� �ʵ忡 ��� �г� ����
		GameField.gamefield.add(this);
	}
	
	//element ������ ���� �׸��� ����
	public void drawFigure(Graphics g) { 
	
		//������ = ����
		if(element instanceof Worm) {
			g.fillOval(0, 0, MaxGraphicSize, MaxGraphicSize);
		}
		//��� = �簢��
		else if(element instanceof Block) {
			g.fillRect(0, 0, MaxGraphicSize, MaxGraphicSize);
		}
		//������ = ������
		else if(element instanceof Item) {
			int x[] = {MaxGraphicSize /2, 0, MaxGraphicSize / 2 , MaxGraphicSize};
			int y[] = {0, MaxGraphicSize / 2, MaxGraphicSize, MaxGraphicSize /2 };
			g.fillPolygon(x, y, 4);
		}
		//�ƹ� �͵� �ش����� ������ �׸��� ����
		else
			;
	}
	
}

package screen;

import java.awt.*;

import javax.swing.*;

import element.*;

public class ElementPanel extends JPanel {

	/*요소 패널의 필드*/
	Element element;
	
	
	/*요소 패널의 생성자*/
	public ElementPanel(Element element) {
		this.element = element;
	}
	
	
	/*요소 패널의 메소드*/
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(getBackground());

	}
	public void drawFigure(Graphics g) { 
	
		if(element instanceof Worm) {
			g.fillOval(element.returnX()*20, element.returnY()*20, 20, 20);
		}
		else if(element instanceof Block) {
			g.fillRect(element.returnX()*20, element.returnY()*20, 20, 20);
		}
		else if(element instanceof Item) {
			int x[] = {element.returnX()*20, element.returnX()*20 + 20, element.returnX()*20 + 10};
			int y[] = {element.returnY()*20, element.returnY()*20, element.returnY()*20 + 20};
			g.fillPolygon(x, y, 3);	
		}
		else
			;
	}
	
}

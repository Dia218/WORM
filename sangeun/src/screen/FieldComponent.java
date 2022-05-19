package screen;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class FieldComponent extends JPanel {

	int elementX;
	int elementY;
	
	public FieldComponent(int elementX, int elementY) {
		this.elementX = elementX;
		this.elementY = elementY;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
	
}
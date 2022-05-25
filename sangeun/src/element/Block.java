package element;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Block extends Element {

	int blockX;
	int blockY;
	
	public Block(int blockX, int blockY) {
		this.blockX = blockX;
		this.blockY = blockY;
		new BlockComponent(blockX, blockY);
	}
	
}

class BlockComponent extends JPanel {

	int elementX;
	int elementY;
	
	public BlockComponent(int elementX, int elementY) {
		this.elementX = elementX;
		this.elementY = elementY;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.MAGENTA);
		g.fillRect(elementX*20, elementY*20, 20, 20);
	}
	
}
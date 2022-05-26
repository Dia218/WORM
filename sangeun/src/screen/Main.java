package screen;

import element.Block;
import element.block.*;
import element.Worm;
//皋牢 努贰胶
public class Main {
		
	public static void main(String[] args) {
		GameFrame gameFrame = new GameFrame();	
		
		
		//烙矫肺 积己!!
		TelpoBlock block1 = new TelpoBlock(10, 10);
		TelpoBlock block2 = new TelpoBlock(15, 15);		
		TelpoBlock block3 = new TelpoBlock(20, 20);	
		for(int i =0;i<4;i++) {
			for(int j=0;j<6;j++) {
				new TelpoBlock(i,j);
	
			}
		}
		new Worm(3,7);
		
	}
}

/*
 * 皋牢 皋家靛 角青
 * gameFrame 积己 
 * gameField 积己
 * createElement 积己
 * element 积己
 * 
 * */
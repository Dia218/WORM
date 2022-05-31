package team;

import java.util.Random;

public class makeElement {

	
	
	
	
	private void makeBadItem() {
		Random rand = new Random();
		do {
			this.BadItemX= rand.nextInt(Element.maxSize-1)+1;
			this.BadItemY = rand.nextInt(Element.maxSize-1)+1;
		}
		while((field[BadItemY][BadItemX]!=0));
	}
	
	private void makeConfuseItem() {
		Random rand = new Random();
		do {
			this.confuseItemX = rand.nextInt(Element.maxSize-1)+1;
			this.confuseItemY = rand.nextInt(Element.maxSize-1)+1;
		}
		while((field[confuseItemX][confuseItemY]!=0));
	}
	
	
	private void makeEatItem() {
		Random rand = new Random();
		do {
			Gaming.gaming.itemX = rand.nextInt(Element.maxSize-1)+1;
			this.itemY = rand.nextInt(Element.maxSize-1)+1;
		}
		while((field[itemX][itemY]!=0));
		System.out.println("eatxt: "+ itemX + ", " +itemY);
	}
	
	//block
		private void maketp() {
			Random rand = new Random();
			do {
				this.teleportBlock1X = rand.nextInt(Element.maxSize-1)+1;
				this.teleportBlock1Y = rand.nextInt(Element.maxSize-1)+1;
				this.teleportBlock2X = rand.nextInt(Element.maxSize-1)+1;
				this.teleportBlock2Y = rand.nextInt(Element.maxSize-1)+1;
			}
			while(((teleportBlock1X== teleportBlock2X)&&(teleportBlock1Y==teleportBlock2Y))||field[teleportBlock1X][teleportBlock1Y] != 0||field[teleportBlock2X][teleportBlock2Y] != 0);
			System.out.println("eatxt: "+ itemX + ", " +itemY);
		}
		
		private void makeBasicBlock() {
			Random rand = new Random();
			do {
				this.basicBlockX = rand.nextInt(Element.maxSize-1)+1;
				this.basicBlockY = rand.nextInt(Element.maxSize-1)+1;
			}while(field[basicBlockY][basicBlockY]!=0);
		}
		
}

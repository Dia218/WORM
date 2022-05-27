package team;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Gaming implements ElementFunction{
	
	private int maxSize = Element.maxSize;
	private final static int MAXSIZE = 100;
	private int[][] field = new int[maxSize+1][maxSize+1];
	private int headX,headY,itemX,itemY,size,score,speed;
	private static boolean isReverse = false;
	//[0][]Àº YÁÂÇ¥[1]Àº XÁÂÇ¥
	private int[][] bodyXY = new int[2][MAXSIZE];
	private Direction direction;

	private boolean gameOver,permitRotation;
	public boolean end=false;
	
	int teleportBlock1X, teleportBlock1Y, teleportBlock2X, teleportBlock2Y;
	int confuseItemX, confuseItemY;
	private ArrayList<Change> obs ;
	
	enum Direction{
		CENTER,LEFT,UP,RIGHT,DOWN
	}
	
	
	public Gaming() {
		this.headX=12;
		this.headY=12;
		this.size=0;
		this.score = 0;
		this.gameOver = false;
		this.direction = Direction.RIGHT;
		this.obs = new ArrayList<>();
		this.permitRotation = true;
		this.speed = 150;
		
		init();
		makeEat();
		init();
		maketp();
		init();
		makeConfuse();
		init();
	}
	
	public void init(){
		for(int i=0;i<maxSize+1;i++) {
			for(int j=0;j<maxSize+1;j++) {
				if(i==0||i==maxSize||j==0||j==maxSize)field[i][j] = 1;
				else field[i][j] = 0;
			}
		}
		
		field[headX][headY] = 2;
		for(int i=0;i<size;i++) {
			field[bodyXY[0][i]][bodyXY[1][i]] = 2;
		}
		field[itemX][itemY] = 3;
		field[teleportBlock1Y][teleportBlock1X] = 4;
		field[teleportBlock2Y][teleportBlock2X] = 5;
		field[confuseItemY][confuseItemX] = 6;
		field[3][3]=7;
		if(isGameOver())makeGameOver();
	}
	
	public void tern() {
	
		switch (direction) {
		
		case LEFT:
			if(field[headX][headY-1]==1 || field[headX][headY-1]==2) {
				gameOver = true;
				break;
			}else if(field[headX][headY-1]==0) {
				move();
			}else if(field[headX][headY-1]==3) {
				isReverse =false;
				eat();
			}
			else if(field[headX][headY-1]==4) {
				headX = teleportBlock2Y;
				headY = teleportBlock2X+1;
			}
			else if(field[headX][headY-1]==5) {
				headX = teleportBlock1Y;
				headY = teleportBlock1X+1;
			}
			else if(field[headX][headY-1]==6) {
				isReverse =false;
				confuseEat();
			}
			else if(field[headX][headY-1]==7) {
				break;
			}
			
			headY-=1;
			break;
		case RIGHT:
			if(field[headX][headY+1]==1 || field[headX][headY+1]==2) {
				gameOver = true;
				break;
			}else if(field[headX][headY+1]==0) {
				move();
			}else if(field[headX][headY+1]==3) {
				isReverse =false;
				eat();
			}
			else if(field[headX][headY+1]==4) {
				headX = teleportBlock2Y;
				headY = teleportBlock2X-1;
			}
			else if(field[headX][headY+1]==5) {
				headX = teleportBlock1Y;
				headY = teleportBlock1X-1;
			}
			else if(field[headX][headY+1]==6) {
				isReverse =true;
				confuseEat();
			}
			headY+=1;
			break;
		case UP:
			if(field[headX-1][headY]==1 || field[headX-1][headY]==2) {
				gameOver = true;
				break;
			}else if(field[headX-1][headY]==0) {
				move();
			}else if(field[headX-1][headY]==3) {
				isReverse =false;
				eat();
			}
			else if(field[headX-1][headY]==4) {
				headX = teleportBlock2Y+1;
				headY = teleportBlock2X;
			}
			else if(field[headX-1][headY]==5) {
				headX = teleportBlock1Y+1;
				headY = teleportBlock1X;
			}
			else if(field[headX-1][headY]==6) {
				isReverse =true;
				confuseEat();
			}
			
			headX-=1;
			break;
		case DOWN:
			if(field[headX+1][headY]==1 || field[headX+1][headY]==2) {
				gameOver = true;
		
						break;
			}else if(field[headX+1][headY]==0) {
				move();
			}else if(field[headX+1][headY]==3) {
				isReverse =false;
				eat();
			}
			else if(field[headX+1][headY]==4) {
				headX = teleportBlock2Y;
				headY = teleportBlock2X;
			}
			else if(field[headX+1][headY]==5) {
				headX = teleportBlock1Y;
				headY = teleportBlock1X;
			}
			else if(field[headX+1][headY]==6) {
				isReverse =true;
				confuseEat();
			}
			headX+=1;
			break;

		default:
			break;
		}
		permitRotation = true;
		init();
		updateElment();
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
	
	//item
	//¸ÔÀÌ ¸¸µé±â
	private void makeEat() {
		Random rand = new Random();
		do {
			this.itemX = rand.nextInt(Element.maxSize-1)+1;
			this.itemY = rand.nextInt(Element.maxSize-1)+1;
		}
		while((field[itemX][itemY]!=0));
		System.out.println("eatxt: "+ itemX + ", " +itemY);
	}
	
	private void makeConfuse() {
		Random rand = new Random();
		do {
			this.confuseItemX = rand.nextInt(Element.maxSize-1)+1;
			this.confuseItemY = rand.nextInt(Element.maxSize-1)+1;
		}
		while((field[confuseItemX][confuseItemY]!=0));
		System.out.println("ÇÏÇÏ");
		
	}
	
	//worm
	//¸ÔÀÌ¸¦ ¸Ô¾úÀ» ¶§
	private void eat() {
		plusScore(100);
		setSpeed(speedchange(10));
		if(size>=MAXSIZE)return;
		if(size>=1){
//			bodyXY[0][size] = bodyXY[0][size-1];
//			bodyXY[1][size] = bodyXY[1][size-1];
		}
		if(score %500==0) {
			maketp();
		}
		
		size++;
		changeSpeed();
		move();
		makeEat();
	}
	
	//worm
		//¸ÔÀÌ¸¦ ¸Ô¾úÀ» ¶§
		private void confuseEat() {
			
			plusScore(100);
			setSpeed(speedchange(10));
			if(size>=MAXSIZE)return;
			if(size>=1){
//				bodyXY[0][size] = bodyXY[0][size-1];
//				bodyXY[1][size] = bodyXY[1][size-1];
			}
			if(score %500==0) {
				maketp();
			}
			
			size++;
			changeSpeed();
			move();
			makeConfuse();
		}
	
	//worm
	//±×³É ¿òÁ÷ÀÏ ¶§
	private void move() {
		if(size==0)return;
		else if(size>=2){
			for(int i=size-1;i>0;i--) {
				bodyXY[0][i] = bodyXY[0][i-1];
				bodyXY[1][i] = bodyXY[1][i-1];
			}
		}
		bodyXY[0][0] = headX;
		bodyXY[1][0] = headY;
	}
	
	public int speedchange(int i) {
		speed -= i;
		return speed;
	}
	
	private void changeSpeed() {
		if(size==2)setSpeed(speedchange(10));
		if(size==4)setSpeed(speedchange(10));
		if(size==6)setSpeed(speedchange(10));
		if(size==12)setSpeed(speedchange(10));
		if(size==16)setSpeed(speedchange(10));
		if(size==25)setSpeed(speedchange(10));
		if(size==30)setSpeed(speedchange(10));
		if(size==40)setSpeed(speedchange(10));
		if(size==60)setSpeed(speedchange(10));
		if(size==70)setSpeed(speedchange(10));
		if(getSpeed() <= 150) return;
	}
	
	private void makeGameOver() {
		System.out.print("ÇÏÇÏ");
		int[][] gameoverField =  new int[maxSize+1][maxSize+1];
		for(int i =0; i<maxSize+1;i++) {
			for(int j =0; j<maxSize+1;j++) {
				gameoverField[i][j] = 0; 	  
						
			}
		}
		
		field = gameoverField;
		
		for(int i=0;i<maxSize+1;i++) {
			for(int j=0;j<maxSize+1;j++) {
				if(i==0||i==maxSize||j==0||j==maxSize)field[i][j] = 3;
			}
		}
	}
	public void GameOverScreen(int k) {
		
	
		for(int y = 0;y<maxSize+1;y++) {
			for(int x=0;x<maxSize+1;x++) {
				if(y<=k) {
					field[y][x]=1;
				}
				else {
					field[y][x]= 0;
				}
			}
		}
		
		for(int i=0;i<maxSize+1;i++) {
			for(int j=0;j<maxSize+1;j++) {
				if(i==0||i==maxSize||j==0||j==maxSize)field[i][j] = 3;
			}
		}
	}
	public void endGame() {
		
		for(int i=0;i<maxSize+1;i++) {
			for(int j=0;j<maxSize+1;j++) {
				if(i==0||i==maxSize||j==0||j==maxSize) {
					field[i][j] = 3;
				}
				else{
				
					field[i][j]=0;
				}
			}
		}
	}
	
	private void plusScore(int point) {
		score += point;
	}

	public int[][] getField() {
		return field;
	}
	
	public Direction getDirection() {
		return direction;
	}

	public int getSpeed() {
		return speed;
	}

	public int getScore() {
		return score;
	}

	public void setSpeed(int speed) {
		if(getSpeed() < 50)
			this.speed = 50;
		else
			this.speed = speed;
	}

	public boolean isGameOver() {
		return gameOver;
	}
	
	public boolean isPermitRotation() {
		return permitRotation;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
		this.permitRotation = false;
	}

	@Override
	public void add(Change ob) {
		obs.add(ob);
	}


	@Override
	public void updateElment() {
		if(obs==null) {
			return;
			
		}
			Iterator<Change> its = obs.iterator();
		while(its.hasNext()) {
			its.next().update();
		}
	}
	
	public boolean getisReverse() {
		return isReverse;
	}
	
	
}

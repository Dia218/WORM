package operation;

import element.block.*;
import element.item.*;
import screen.GameField;

//똠치가 제작함
public class WormDirection {

	//지렁이 움직이는 위치
	public Direction direction;
	public boolean isReverse = false;
	private boolean gameOver = false;

	private int headX,headY,itemX,itemY,size,score,speed;

	private boolean permitRotation;
	
	public enum Direction{
			NONE, RIGHT, LEFT, UP, DOWN
	}
	
	//움직일 때
	public WormDirection() {

		this.headX=12;
		this.headY=12;
		this.size=0;
		this.score = 0;
		this.gameOver = false;
		this.direction = Direction.NONE;
		this.permitRotation = true;
		this.speed = 150;
		
		System.out.println("tern 실tern 실행tern 실행tern 실행tern 실행tern 실행tern 실행tern 실행tern 실행tern 실행행");
		
		/*

		switch(direction) {
		case RIGHT:
			if (GameField.gamefield.checkElement((headX+1),(headY)) instanceof KillBlock)
				gameOver = true;
			else if(GameField.gamefield.checkElement((headX+1),(headY)) instanceof BasicBlock)
				break;
			else if(GameField.gamefield.checkElement((headX+1),(headY)) == null)
				move();
			else if(GameField.gamefield.checkElement((headX+1),(headY)) instanceof TelpoBlock)
				//?
				break;
			else if(GameField.gamefield.checkElement((headX+1),(headY)) instanceof BadItem)
				eatBI();
			else if(GameField.gamefield.checkElement((headX+1),(headY)) instanceof ConfuseItem)
				confuseEat();
			else if(GameField.gamefield.checkElement((headX+1),(headY)) instanceof GoodItem)
				eat();
			break;
		case LEFT:
			if (GameField.gamefield.checkElement((headX-1),(headY)) instanceof KillBlock)
				gameOver = true;
			else if(GameField.gamefield.checkElement((headX-1),(headY)) instanceof BasicBlock)
				break;
			else if(GameField.gamefield.checkElement((headX-1),(headY)) == null)
				move();
			else if(GameField.gamefield.checkElement((headX-1),(headY)) instanceof TelpoBlock)
				//?
				break;
			else if(GameField.gamefield.checkElement((headX-1),(headY)) instanceof BadItem)
				eatBI();
			else if(GameField.gamefield.checkElement((headX-1),(headY)) instanceof ConfuseItem)
				confuseEat();
			else if(GameField.gamefield.checkElement((headX-1),(headY)) instanceof GoodItem)
				eat();
			break;
		case UP:
			if (GameField.gamefield.checkElement((headX),(headY-1)) instanceof KillBlock)
				gameOver = true;
			else if(GameField.gamefield.checkElement((headX),(headY-1)) instanceof BasicBlock)
				break;
			else if(GameField.gamefield.checkElement((headX),(headY-1)) == null)
				move();
			else if(GameField.gamefield.checkElement((headX),(headY-1)) instanceof TelpoBlock)
				//?
				break;
			else if(GameField.gamefield.checkElement((headX),(headY-1)) instanceof BadItem)
				eatBI();
			else if(GameField.gamefield.checkElement((headX),(headY-1)) instanceof ConfuseItem)
				confuseEat();
			else if(GameField.gamefield.checkElement((headX),(headY-1)) instanceof GoodItem)
				eat();
			break;
		case DOWN:
			if (GameField.gamefield.checkElement((headX),(headY+1)) instanceof KillBlock)
				gameOver = true;
			else if(GameField.gamefield.checkElement((headX),(headY+1)) instanceof BasicBlock)
				break;
			else if(GameField.gamefield.checkElement((headX),(headY+1)) == null)
				move();
			else if(GameField.gamefield.checkElement((headX),(headY+1)) instanceof TelpoBlock)
				//?
				break;
			else if(GameField.gamefield.checkElement((headX),(headY+1)) instanceof BadItem)
				badEat();
			else if(GameField.gamefield.checkElement((headX),(headY+1)) instanceof ConfuseItem)
				confuseEat();
			else if(GameField.gamefield.checkElement((headX),(headY+1)) instanceof GoodItem)
				eat();
			break;
		}
		*/
	}

	//위치 return
	public Direction getDirection() {
		return this.direction;
	}
	
	//위치 설정 메소드
	public void setDirection(Direction direction) {
		this.direction = direction;
		this.permitRotation = false;
	}
	
	//방향 입력 반대 여부 return
	public boolean getisReverse() {
		return isReverse;
	}

	public boolean isGameOver() {
		return gameOver;
	}
	
	public int getSpeed() {
		return speed;
	}

	public boolean isPermitRotation() {
		return permitRotation;
	}
}

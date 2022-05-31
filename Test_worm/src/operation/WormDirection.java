package operation;

import element.Worm;
import element.block.*;
import element.item.*;
import screen.GameField;

//똠치가 제작함
public class WormDirection {

	//지렁이 움직이는 위치
	public Direction direction;
	public boolean isReverse = false;
	
	//없어도 될것
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
		
		//없어도 될것
		this.gameOver = false;
		this.direction = Direction.NONE;
		this.permitRotation = true;
		this.speed = 150;
		
		//동작 확인
		System.out.println("방향 전환 실행");
		
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

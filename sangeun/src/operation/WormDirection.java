package operation;

import element.Worm;
import element.block.*;
import element.item.*;
import screen.GameField;

//�cġ�� ������
public class WormDirection {

	//������ �����̴� ��ġ
	public Direction direction;
	public boolean isReverse = false;
	
	//��� �ɰ�
	private boolean gameOver = false;

	private int headX,headY,itemX,itemY,size,score,speed;

	private boolean permitRotation;
	
	public enum Direction{
			NONE, RIGHT, LEFT, UP, DOWN
	}
	
	//������ ��
	public WormDirection() {

		this.headX=12;
		this.headY=12;
		this.size=0;
		this.score = 0;
		
		//��� �ɰ�
		this.gameOver = false;
		this.direction = Direction.NONE;
		this.permitRotation = true;
		this.speed = 150;
		
		//���� Ȯ��
		System.out.println("���� ��ȯ ����");
		
	}

	//��ġ return
	public Direction getDirection() {
		return this.direction;
	}
	
	//��ġ ���� �޼ҵ�
	public void setDirection(Direction direction) {
		this.direction = direction;
		this.permitRotation = false;
	}
	
	//���� �Է� �ݴ� ���� return
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

package operation;

import element.Worm;
import element.block.*;
import element.item.*;
import screen.GameField;

//�cġ�� ������
public class WormDirection {
	
	
	//������ �����̴� ��ġ
	public Direction direction;
	//������ ������ ������ ����
	private boolean isReverse = false;
	//������ ������ ���� ����
	private boolean isMove = true;
	//Ű�Է� ���� ����
	public boolean keyPressed = false;

	public enum Direction {
		RIGHT, LEFT, UP, DOWN
	}
<<<<<<< HEAD
=======

	private int headX,headY,itemX,itemY,size,score;


>>>>>>> 10bd8a1447f4220a256e2ed433d4ccfe307ef84c
	
	
	//������ ��
	public WormDirection() {
		
<<<<<<< HEAD
=======
		this.headX=12;
		this.headY=12;
		this.size=0;
		this.score = 0;
		

		
>>>>>>> 10bd8a1447f4220a256e2ed433d4ccfe307ef84c
		//���� �ʱ� ����
		direction = Direction.RIGHT;
		
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
<<<<<<< HEAD
=======
		
>>>>>>> 10bd8a1447f4220a256e2ed433d4ccfe307ef84c
	}
	
	//���� �Է� �ݴ� ���� return
	public boolean getisReverse() {
		return isReverse;
	}
	public void setisReverse(boolean bool) {
		isReverse = bool;
	}
<<<<<<< HEAD
	
=======

>>>>>>> 10bd8a1447f4220a256e2ed433d4ccfe307ef84c
	//������ ���� ���� �޼ҵ�
	public void setIsMove(boolean isMove) {
		this.isMove = isMove;
	}
	
	//������ ���� return �޼ҵ�
	public boolean getIsMove() {
		return isMove;
	}
	
	//Ű�Է� ���� ���� �޼ҵ�
	public void setKeyPressed(boolean keyPressed) {
		this.keyPressed = keyPressed;
	}
	
	public boolean getKeyPressed() {
		return keyPressed;
	}


	
}

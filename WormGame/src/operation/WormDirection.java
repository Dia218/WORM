package operation;

//������ ����
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
	
	//������ ��
	public WormDirection() {
		
		
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
		
	}
	
	//���� �Է� �ݴ� ���� return
	public boolean getisReverse() {
		return isReverse;
	}
	public void setisReverse(boolean bool) {
		isReverse = bool;
	}

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
package worm;

public class Worm {
<<<<<<< HEAD

=======
	int headX; int headY;
	int[] bodyX;
	int[] bodyY;
	int size = 0;
	int Max_Size= 1000;
	public void wormHead(){
		//������ǥ
		this.headX = 12;
		this.headY = 12;
	}
	
	public void headMove() {
		switch(/*����*/) {
		case LEFT:
			//���������� �Ӹ��� ���̳� ���� �΋H���� ���� ����
			if(map[headX][headY-1]==1 || map[headX][headY-1]==2) {
				//���ӿ���
				break;
			//���������� �ƹ��͵� ���� ���̸� �׳� �̵�
			}
			else if(map[headX][headY-1]==0) {
				move();
			//���������� ���Ű� �ִٸ� �Ա�(eat) ����
			}
			//3->����
			else if(map[headX][headY-1]==3) {
				eat();
			}
			//�Ӹ� �����̱�
			headY-=1;
			break;
		case RIGHT:
			//���������� �Ӹ��� ���̳� ���� �΋H���� ���� ����
			if(map[headX][headY+1]==1 || map[headX][headY+1]==2) {
				//���ӿ���
				break;
			//���������� �ƹ��͵� ���� ���̸� �׳� �̵�
			}
			else if(map[headX][headY+1]==0) {
				move();
			//���������� ���Ű� �ִٸ� �Ա�(eat) ����
			}
			else if(map[headX][headY+1]==3) {
				eat();
			}
			//�Ӹ� �����̱�
			headY+=1;
			break;
		case UP:
			//���������� �Ӹ��� ���̳� ���� �΋H���� ���� ����
			if(map[headX-1][headY]==1 || map[headX-1][headY]==2) {
				//���ӿ���
				break;
			//���������� �ƹ��͵� ���� ���̸� �׳� �̵�
			}
			else if(map[headX-1][headY]==0) {
				move();
			//���������� ���Ű� �ִٸ� �Ա�(eat) ����
			}
			else if(map[headX-1][headY]==3) {
				eat();
			}
			//�Ӹ� �����̱�
			headX-=1;
			break;
		case DOWN:
			//���������� �Ӹ��� ���̳� ���� �΋H���� ���� ����
			if(map[headX+1][headY]==1 || map[headX+1][headY]==2) {
				//���ӿ���
				break;
			//���������� �ƹ��͵� ���� ���̸� �׳� �̵�
			}
			else if(map[headX+1][headY]==0) {
				move();
			//���������� ���Ű� �ִٸ� �Ա�(eat) ����
			}
			else if(map[headX+1][headY]==3) {
				eat();
			}
			//�Ӹ� �����̱�
			headX+=1;
			break;

		default:
			break;
		}
				
		}
	}
	
	public void move() {
		if(size==0)return;
		else if(size>=2){
			for(int i=size-1;i>0;i--) {
				bodyX[i] = bodyX[i-1];
				bodyY[i] = bodyY[i-1];
			}
		}
		bodyX[0] = headX;
		bodyX[0] = headY;
	
	}
	
	public void eat() {
		//���� ���� �����ֱ�
		
				//������ ũ�Ⱑ �ִ��
				if(size>=Max_Size)return;
				if(size>=1){
					bodyX[size] = bodyX[size-1];
					bodyY[size] = bodyY[size-1];
				}
				size++;
				
				move();
				//���� �ٽû���.
	}
>>>>>>> 51d5d777255111818abe20cf918f94e5ee91179a
}

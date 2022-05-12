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
		//시작좌표
		this.headX = 12;
		this.headY = 12;
	}
	
	public void headMove() {
		switch(/*방향*/) {
		case LEFT:
			//움직였을때 머리가 벽이나 몸에 부딫히면 게임 오버
			if(map[headX][headY-1]==1 || map[headX][headY-1]==2) {
				//게임오버
				break;
			//움직였을때 아무것도 없는 곳이면 그냥 이동
			}
			else if(map[headX][headY-1]==0) {
				move();
			//움직였을때 열매가 있다면 먹기(eat) 실행
			}
			//3->열매
			else if(map[headX][headY-1]==3) {
				eat();
			}
			//머리 움직이기
			headY-=1;
			break;
		case RIGHT:
			//움직였을때 머리가 벽이나 몸에 부딫히면 게임 오버
			if(map[headX][headY+1]==1 || map[headX][headY+1]==2) {
				//게임오버
				break;
			//움직였을때 아무것도 없는 곳이면 그냥 이동
			}
			else if(map[headX][headY+1]==0) {
				move();
			//움직였을때 열매가 있다면 먹기(eat) 실행
			}
			else if(map[headX][headY+1]==3) {
				eat();
			}
			//머리 움직이기
			headY+=1;
			break;
		case UP:
			//움직였을때 머리가 벽이나 몸에 부딫히면 게임 오버
			if(map[headX-1][headY]==1 || map[headX-1][headY]==2) {
				//게임오버
				break;
			//움직였을때 아무것도 없는 곳이면 그냥 이동
			}
			else if(map[headX-1][headY]==0) {
				move();
			//움직였을때 열매가 있다면 먹기(eat) 실행
			}
			else if(map[headX-1][headY]==3) {
				eat();
			}
			//머리 움직이기
			headX-=1;
			break;
		case DOWN:
			//움직였을때 머리가 벽이나 몸에 부딫히면 게임 오버
			if(map[headX+1][headY]==1 || map[headX+1][headY]==2) {
				//게임오버
				break;
			//움직였을때 아무것도 없는 곳이면 그냥 이동
			}
			else if(map[headX+1][headY]==0) {
				move();
			//움직였을때 열매가 있다면 먹기(eat) 실행
			}
			else if(map[headX+1][headY]==3) {
				eat();
			}
			//머리 움직이기
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
		//점수 증가 시켜주기
		
				//지렁이 크기가 최대면
				if(size>=Max_Size)return;
				if(size>=1){
					bodyX[size] = bodyX[size-1];
					bodyY[size] = bodyY[size-1];
				}
				size++;
				
				move();
				//먹이 다시생성.
	}
>>>>>>> 51d5d777255111818abe20cf918f94e5ee91179a
}

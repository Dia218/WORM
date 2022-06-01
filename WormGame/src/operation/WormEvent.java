package operation;

public class WormEvent extends Thread {
	
	//������ �̵��ӵ�
	int wormSpeed = 120;

	WormDirection wormDirection = ManageElement.elementManager.wormDirection;
	
	public WormEvent() {
		
	}
	
	@Override
	public void run() {

		while(true) {
			try {
				Thread.sleep(wormSpeed);
				if(wormDirection.getIsMove() == true) {
					switch(wormDirection.getDirection()) {
					//������ : x+1, y
					case RIGHT: 
						ManageElement.elementManager.checkMove(+1, 0);
						ManageElement.elementManager.moveWorm(+1, 0);
						System.out.println(wormDirection.getDirection() + "ȣ��"); 
						break;
					//���� : x-1, y
					case LEFT: 
						ManageElement.elementManager.checkMove(-1, 0);
						ManageElement.elementManager.moveWorm(-1, 0);
						System.out.println(wormDirection.getDirection() + "ȣ��"); 
						break;
					//���� : x, y+1
					case UP:
						ManageElement.elementManager.checkMove(0, -1);
						ManageElement.elementManager.moveWorm(0, -1);
						System.out.println(wormDirection.getDirection() + "ȣ��"); 
						break;
					//�Ʒ��� : x, y-1
					case DOWN:
						ManageElement.elementManager.checkMove(0, +1);						
						ManageElement.elementManager.moveWorm(0, +1);
						System.out.println(wormDirection.getDirection() + "ȣ��"); 
						break;
					}
				}
				else {
					System.out.println(wormDirection.getIsMove());
				}
				wormDirection.setKeyPressed(false);
				wormDirection.setIsMove(true);
				if( ManageElement.elementManager.returnisGameOver()) {
					break;
				}
			}
			catch(InterruptedException e) {return;}
		}
	}
	
	//������ �̵��ӵ� return �޼ҵ�
	public int getWormSpeed() {
		return wormSpeed;
	}
	
	//������ �̵��ӵ� ���� �޼ҵ�
	public void setWormSpeed(int i) {
		wormSpeed += i;
	}
	
}

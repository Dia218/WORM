package element.worm;

import java.awt.Color;
import element.Worm;
public class WormBody extends Worm {
	
	public WormBody() {
		super(1,1);
		super.color = Color.green;

		System.out.println("�����̹ٵ� �����");
	}
	public WormBody(int wormX, int wormY) {
		super(wormX,wormY);
		int [][] a = super.getWormXY();
		a[0][super.wormSize]= wormX;
		a[1][super.wormSize++]= wormY;
		super.setWormXY(a);

<<<<<<< HEAD
		System.out.print(super.bodyXY[0][super.size-1]);
		System.out.println(super.bodyXY[1][super.size-1]);
=======
		System.out.print(super.getWormXY()[0][super.wormSize-1]);
		System.out.print(super.getWormXY()[1][super.wormSize-1]);
>>>>>>> 9792229385d67fbd23921367b7154d5cf8b478ff
		super.color = Color.GREEN;
		// TODO Auto-generated constructor stub

		/*�̻��� �߰� - ����*/
		wormVector.add(this);
		
		//���� Ȯ��
		System.out.println("�����̹ٵ� ������ ȣ��");
	}
	private void executeWormBody() {
		//�����̰� �״´�.
		//new GameOver();
		//IsGameOver = true;

	}
}

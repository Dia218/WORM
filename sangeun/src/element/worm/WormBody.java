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
		int [][] a = super.getBody();
		a[0][super.size]= wormX;
		a[1][super.size++]= wormY;
		super.setBody(a);

		System.out.print(super.bodyXY[0][super.size-1]);
		System.out.println(super.bodyXY[1][super.size-1]);
		super.color = Color.GREEN;
		// TODO Auto-generated constructor stub
		//���� �߰�
	
		
		//���� Ȯ��
		System.out.println("�����̹ٵ� �����");
	}
	private void executeWormBody() {
		//�����̰� �״´�.
		//new GameOver();
		//IsGameOver = true;

	}
}

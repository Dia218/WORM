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
	@Override
	public void executeWorm() {
		// TODO �ڵ� ������ �޼ҵ� ����
		executeWormBody();
	}
}
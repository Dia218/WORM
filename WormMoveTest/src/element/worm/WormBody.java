package element.worm;

import java.awt.Color;
import element.Worm;
public class WormBody extends Worm {
	   
	   public WormBody() {
	      super(1,1);
	      super.color = Color.green;

	      System.out.println("지렁이바디 만들기");
	   }
	   public WormBody(int wormX, int wormY) {
	      super(wormX,wormY);
	      int [][] a = super.getWormXY();
	      a[0][super.wormSize]= wormX;
	      a[1][super.wormSize++]= wormY;
	      super.setWormXY(a);


		super.color = Color.GREEN;
		// TODO Auto-generated constructor stub


	      /*이상은 추가 - 벡터*/
	      wormVector.add(this);
	      
	      //동작 확인
	      System.out.println("지렁이바디 생성자 호출");
	   }
	   private void executeWormBody() {
	      //지렁이가 죽는다.
	      //new GameOver();
	      //IsGameOver = true;

	   }
	@Override
	public void executeWorm() {
		// TODO 자동 생성된 메소드 스텁
		executeWormBody();
	}
}
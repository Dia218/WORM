package element.worm;

import java.awt.Color;
import element.Worm;
import screen.GameOver;

public class WormBody extends Worm {
	   
	   public WormBody(int wormX, int wormY) {
	      super(wormX,wormY);
	      super.color = Color.GREEN;
	      // TODO Auto-generated constructor stub

	      /*지렁이 벡터*/
	      wormVector.add(this);
	      
	      //동작 확인
	      System.out.println("지렁이바디 생성자 호출");
	   }
	   
	   private void executeWormBody() {
		    //지렁이가 죽는다.
		    new GameOver();
	   }
	   
	   @Override
	   public void executeWorm() {
		   // TODO 자동 생성된 메소드 스텁
		   executeWormBody();
	   }
}

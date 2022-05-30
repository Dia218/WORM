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

<<<<<<< HEAD
		System.out.print(super.bodyXY[0][super.size-1]);
		System.out.println(super.bodyXY[1][super.size-1]);
=======
		System.out.print(super.getWormXY()[0][super.wormSize-1]);
		System.out.print(super.getWormXY()[1][super.wormSize-1]);
>>>>>>> 9792229385d67fbd23921367b7154d5cf8b478ff
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
}

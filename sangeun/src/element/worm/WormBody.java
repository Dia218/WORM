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
		int [][] a = super.getBody();
		a[0][super.wormSize]= wormX;
		a[1][super.wormSize++]= wormY;
		super.setBody(a);

		System.out.print(super.wormXY[0][super.wormSize-1]);
		System.out.print(super.wormXY[1][super.wormSize-1]);
		super.color = Color.GREEN;
		// TODO Auto-generated constructor stub
		//내가 추가
	
		
		//동작 확인
		System.out.println("지렁이바디 만들기");
	}
}

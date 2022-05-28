package element.worm;

import java.awt.Color;
import element.Worm;
public class WormBody extends Worm {
	
	public WormBody(int wormX, int wormY) {
		super(wormX,wormY);
		int [][] a = super.getBody();
		a[0][super.size]= wormX;
		a[1][super.size++]= wormY;
		super.setBody(a);

		System.out.print(super.size+""+super.bodyXY[0][super.size-1]);
		System.out.print(super.bodyXY[1][super.size-1]);
		super.color = Color.GREEN;
		// TODO Auto-generated constructor stub
		//내가 추가
	
		
		//동작 확인
		System.out.println("지렁이 몸 만들기");
	}

	public void setdo(int i, int j) {
		// TODO 자동 생성된 메소드 스텁
		
	}
}

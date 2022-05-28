package element.worm;

import java.awt.Color;
import element.Worm;

public class WormHead extends Worm{
	public WormHead(int WormX, int WormY) {
		super(WormX,WormY);
		super.color = Color.RED;
		// TODO Auto-generated constructor stub
		//내가 추가
	
		
		//동작 확인
		System.out.println("지렁이헤드 만들기");
	}
}

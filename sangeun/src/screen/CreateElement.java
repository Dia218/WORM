package screen;

import element.Block;
import element.*;

//element 객체들을 생성하는 클래스
public class CreateElement {

	/*요소 생성 클래스의 생성자*/
	public CreateElement(Element element) {
		inputElement(element);
		System.out.println("생성 객체 생성");
	}
	
	/*요소 생성 클래스의 메소드*/
	public void inputElement(Element element) {
		GameField.gamefield.setElement(element);
		System.out.println("요소 넣기 호출");
	}
}
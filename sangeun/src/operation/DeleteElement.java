package operation;

import screen.*;

public class DeleteElement {

	/*삭제 클래스의 생성자*/
	public DeleteElement() {
		//동작 확인
		System.out.println("deleteElement 객체 생성");
	}
	
	public void deleteElement(int elementX, int elementY) {
		//게임 필드에서 메소드 호출
		GameField.gamefield.removeElement(elementX, elementY);
	}
}

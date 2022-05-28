package operation.manager;

import screen.*;

//element 객체 삭제 기능 인터페이스
public interface DeleteElement {

	default void deleteElement(int elementX, int elementY) {
		//게임 필드에서 삭제 메소드 호출
		GameField.gamefield.removeElement(elementX, elementY);
	}
}

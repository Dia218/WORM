package operation.manager;

import screen.*;

//element ��ü ���� ��� �������̽�
public interface DeleteElement {

	default void deleteElement(int elementX, int elementY) {
		//���� �ʵ忡�� ���� �޼ҵ� ȣ��
		GameField.gamefield.removeElement(elementX, elementY);
	}
}

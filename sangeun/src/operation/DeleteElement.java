package operation;

import screen.*;

public class DeleteElement {

	/*���� Ŭ������ ������*/
	public DeleteElement() {
		//���� Ȯ��
		System.out.println("deleteElement ��ü ����");
	}
	
	public void deleteElement(int elementX, int elementY) {
		//���� �ʵ忡�� �޼ҵ� ȣ��
		GameField.gamefield.removeElement(elementX, elementY);
	}
}

package screen;

import element.Block;
import element.*;

//element ��ü���� �����ϴ� Ŭ����
public class CreateElement {

	/*��� ���� Ŭ������ ������*/
	public CreateElement(Element element) {
		inputElement(element);
		System.out.println("���� ��ü ����");
	}
	
	/*��� ���� Ŭ������ �޼ҵ�*/
	public void inputElement(Element element) {
		GameField.gamefield.setElement(element);
		System.out.println("��� �ֱ� ȣ��");
	}
}
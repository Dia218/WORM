package operation;

import element.worm.WormHead;
import operation.manager.*;
import screen.GameField;

//element ���� Ŭ����
public class ManageElement implements CreateElement, DeleteElement {
	
	//���α׷� ���� �� elementManager ��ü ����, ���� �߰� ���� �Ұ� 
	public static final ManageElement elementManager = new ManageElement();
	
	private ManageElement() {
		//���� Ȯ��
		System.out.println("��� �Ŵ��� ��ü ����");
		
		
		
	}
}
/*
 **�ʱ� ����**
 * ������ �Ӹ� ����
 * ���ϵ� ����
 * �����۵� ����
 * 
 **���� ��**
 * ���� ������ ������ �� ���� ������ ����
 * ���� ���� �߰�
 * ���� �ð� �� ȥ��, ���� ������ ���� �� ���� �ݺ�
 * */
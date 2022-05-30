package operation;

import operation.manager.*;
import element.block.TelpoBlock;
import element.worm.WormHead;
import operation.manager.*;
import screen.GameField;

//element ���� Ŭ����
public class ManageElement implements CreateElement, DeleteElement, MoveElement {
	
	/*���� Ŭ������ �ʵ�*/
	
	//���α׷� ���� �� elementManager ��ü ����, ���� �߰� ���� �Ұ� 
	public static final ManageElement elementManager = new ManageElement();
	
	//���� �ʵ��� ���۷��� ����
	public GameField gamefield;
	
	//������ ���� ���۷��� ����
	public WormDirection wormDirection;
	
	//������ �Ӹ��� ���۷��� ����
	public WormHead wormHead;
	
	//�ڷ���Ʈ ����� ���۷��� ����
	public TelpoBlock telpoBlockA;
	public TelpoBlock telpoBlockB;
	
	//������ �̵� ī��Ʈ
	public int moveCount = 0;
	
	
	/*���� Ŭ������ ������*/
	
	private ManageElement() {
		//���� Ȯ��
		System.out.println("��� �Ŵ��� ��ü ����");

	}
	
	
	/*���� Ŭ������ �޼ҵ�*/
	
	public void addManageWorm(WormHead wormHead) {
		this.wormHead = wormHead;
	}
	
	public void addManageTelpo(TelpoBlock telpoBlockA, TelpoBlock telpoBlockB) {
		this.telpoBlockA = telpoBlockA;
		this.telpoBlockB = telpoBlockB;
	}
}
/*
 **�ʱ� ����**
 * ������ �Ӹ� ���� 
 * ��ϵ� ����
 * �����۵� ����
 * 
 **���� ��**
 * ���� ������ ������ �� ���� ������ ����
 * ���� ���� �߰�
 * ���� �ð� �� ȥ��, ���� ������ ���� �� ���� �ݺ�
 * */
package Item;

public class BadItem {

	private String type = "BadItem"; //������ ����
	private int point = -100;	 //������ ����
	private double speedChange = -10; //������ �ӵ� ��ȭ ��ġ
	
	public String returnType() {	//������ ������ ����
		return type;
	}
	public int returnPoint() {		//������ ������ ����
		return point;
	}
	public void returnSpeed() {		//������ �ӵ� ��ȭ ��ġ�� ����
		worm.speed += speedChange;
	}
	public void LengthDec() {		//������ ���̸� ����
		Worm.length -= 1;
	}
}

package Item;

public class GoodItem extends ItemType {
	
	private String type = "GoodItem"; //������ ����
	private int point = 100;	 //������ ����
	private double speedChange = 10; //������ �ӵ� ��ȭ ��ġ
	
	public String returnType() {	//������ ������ ����
		return type;
	}
	public int returnPoint() {		//������ ������ ����
		return point;
	}
	public void returnSpeed() {		//������ �ӵ� ��ȭ ��ġ�� ����
		worm.speed += speedChange;
	}
	public void Life() {			//������ ����� �ø�
		Worm.life += 1;
	}
	public void LengthInc() {		//������ ���̸� �ø�
		Worm.Length += 1;
	}
}

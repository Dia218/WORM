package item;

//�����۵��� �߻� Ŭ����
public abstract class ItemType {
	
	private String type; //������ ����
	private int point;	 //������ ����
	private double speedChange; //������ �ӵ� ��ȭ ��ġ
	
	public String returnType() {	//������ ������ ����
		return type;
	}
	public int returnPoint() {		//������ ������ ����
		return point;
	}
	public double returnSpeed() {	//������ �ӵ� ��ȭ ��ġ�� ����
		return speedChange;
	}
}

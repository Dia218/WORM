package Item;

public class ConfuseItem {
	
	private String type = "ConfuseItem"; //������ ����
	private int point = -100;	 //������ ����
	private double speedChange = 0; //������ �ӵ� ��ȭ ��ġ
	
	public String returnType() {	//������ ������ ����
		return type;
	}
	public int returnPoint() {		//������ ������ ����
		return point;
	}
	public double returnSpeed() {	//������ �ӵ� ��ȭ ��ġ�� ����
		return speedChange;
	}
	public void invertMove() {		//�Է¹޴� ������ �ݴ�� �ٲ����
		KeyInput.up = down;
		KeyInput.down = up;
		KeyInput.right = left;
		KeyInput.left = right;
	}
}

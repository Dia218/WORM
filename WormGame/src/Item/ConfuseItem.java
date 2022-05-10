package Item;

public class ConfuseItem {
	
	private String type = "ConfuseItem"; //아이템 종류
	private int point = -100;	 //아이템 점수
	private double speedChange = 0; //지렁이 속도 변화 수치
	
	public String returnType() {	//아이템 종류를 리턴
		return type;
	}
	public int returnPoint() {		//아이템 점수를 리턴
		return point;
	}
	public double returnSpeed() {	//지렁이 속도 변화 수치를 리턴
		return speedChange;
	}
	public void invertMove() {		//입력받는 방향을 반대로 바꿔버림
		KeyInput.up = down;
		KeyInput.down = up;
		KeyInput.right = left;
		KeyInput.left = right;
	}
}

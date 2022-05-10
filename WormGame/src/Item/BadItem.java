package Item;

public class BadItem {

	private String type = "BadItem"; //아이템 종류
	private int point = -100;	 //아이템 점수
	private double speedChange = -10; //지렁이 속도 변화 수치
	
	public String returnType() {	//아이템 종류를 리턴
		return type;
	}
	public int returnPoint() {		//아이템 점수를 리턴
		return point;
	}
	public void returnSpeed() {		//지렁이 속도 변화 수치를 리턴
		worm.speed += speedChange;
	}
	public void LengthDec() {		//지령이 길이를 줄임
		Worm.length -= 1;
	}
}

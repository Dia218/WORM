package screen;

import java.util.*;
import javax.swing.JPanel;
import element.*;

//게임 필드 패널 클래스
public class GameField extends JPanel {
	
	//게임 필드 객체는 한 번만 생성된다
	public static final GameField gamefield = new GameField(); 
	
	/*게임 필드 필드*/

	int size;
	static HashMap<Locate, Element> hashmap = new HashMap<Locate, Element>(); //좌표와 요소를 저장하는 해시맵 
	static Set<Locate> keys = hashmap.keySet(); //좌료 객체 키를 저장하는 set 컬렉션 
	static Iterator<Locate> iterator = keys.iterator(); //좌표 객체를 저장하는 이터레이터 
	
	
	/*게임 필드 생성자*/
	
	private GameField() {
		//this.setSize();
	}
	
	
	/*게임 필드 메소드*/
	
	//게임 필드 크기를 리턴해주는 메소드
	public int returnSize() {
		return this.size;
	}
	
	//해시맵을 초기화하는 메소드
	void initElement() {
		//좌료 : (0~23, 0~23)
		for(int x = 0; x < 24; x++) {
			for(int y = 0; y < 24; y++) {
				//해시맵 키: Locate(좌표) 객체 순차적으로 생성 후 삽입 
				//해시맵 값: null 
				hashmap.put(new Locate(x, y), null);
			}
		}
	}
	
	//해당 좌표에 element가 들어있는 지 확인하는 메소드
	public boolean checkLocate(int checkX, int checkY) {
		//해당 좌표와 일치하는 좌표 값에 들어있는 element가 null이면 true
		if (null == hashmap.get(new Locate(checkX, checkY)))
			return true;
		else
			return false;
	}
	
	//생성된 객체를 받아서 해당 좌표에 저장하는 메소드
	public void setElement(Element element) {		
		Locate locate = new Locate(element.returnX(), element.returnY());
		hashmap.replace(locate, element);
		//저장된 걸 그려주는 메소드 만들어서 호출하기
	}
	
	//저장된 좌표에 들어있는 element에 따라 해당 객체 그리는 메소드
	public void drawField() {
		while(iterator.hasNext()) {
			Locate indexLocate = iterator.next();
			Element element = hashmap.get(indexLocate);
			ElementPanel elementPanel = new ElementPanel(element);
		}
	}
	
}

class Locate {
	
	/*좌표 클래스 필드*/
	private int X; //X좌표, Y좌표
	private int Y;
	
	/*좌표 클래스 메소드*/
	public int returnX() {
		return this.X;
	}
	public int returnY() {
		return this.Y;
	}
	
	/*좌표 클래스 생성자*/
	public Locate(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	/*오버라이딩*/
	//equals 오버라이딩
	@Override
	public boolean equals(Object object) {
		Locate locateObject = (Locate) object;
		if (this.X == locateObject.X && this.Y == locateObject.Y)
			return true;
		else
			return false;
	}
	
	//해시코드 오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(X, Y);
	}
}


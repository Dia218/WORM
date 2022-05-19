package screen;

import java.util.*;
import javax.swing.JPanel;

public class GameField extends JPanel {
	
	int size;
	HashMap<Locate, Element> hashmap = new HashMap<Locate, Element>(); 
	Set<Locate> keys = hashmap.keySet();
	Iterator<Locate> iterator = keys.iterator();
	
	public GameField() {
		
		this.setSize();
	}
	
	
	public int returnSize() {
		return this.size;
	}
	
	//좌표 생성 및 각 좌표마다 요소 객체 값 null로 초기화하는 메소드
	void initElement() {
		for(int x = 0; x < 24; x++) {
			for(int y = 0; y < 24; y++) {
				//해시맵 키: Locate(좌표)클래스 객체 생성 후 삽입 
				//해시맵 값: null 
				hashmap.put(new Locate(x, y), null);
			}
		}
	}
	
	//특정 좌표와 일치하는 좌표 키를 찾는 메소드
	Locate fineLocate(int findX, int findY) {
		/*
		 * 아래와 같이 하려면 equals 오버라이딩 필요
		//해당 좌표와 일치하는 좌표 값에 들어있는 element가 null이면 true
		Locate locate = new Locate(findX, findY);
		Element element = hashmap.get(equals(locate));
		 */
		
		//해시맵의 좌표 키 순차적으로 검색
		while(iterator.hasNext()) {
			Locate locate = iterator.next();
			//해시맵의 좌표 키와 검사할 좌표가 일치할 때 해당 좌표 키 리턴
			if (locate.X == findX && locate.Y == findY) {
				return locate;
			}
		}
		//일치하는 좌표 값이 없으면 (없을 일은 없음)
		return null;
	}
	
	//해당 좌표에 들어있는 지 확인하는 메소드
	public boolean checkLocate(int checkX, int checkY) {
		//해당 좌표와 일치하는 좌표 값에 들어있는 element가 null이면 true
		if (null == hashmap.get(fineLocate(checkX, checkY)))
			return true;
		else
			return false;
	}
	
	//생성된 객체를 받아서 해당 좌표에 저장하는 메소드
	public void inputElement(Element element) {
		
		Locate locate = fineLocate(element.returnX(), element.returnY());
		hashmap.replace(locate, element);
	}
	
	//저장된 좌표에 들어있는 객체에 따라 해당 객체의 그리기 메소드 호출
	void drawField() {
		while(iterator.hasNext()) {
			Locate locate = iterator.next();
			
			//FieldComponent fieldComponent = new FieldRectangle(xy.X, xy.Y);
		}
		
	}
	
}

class Locate {
	
	public int X;
	public int Y;
	
	public Locate(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	@Override
	public boolean equals(Object val) {
		Locate locateVal = (Locate) val;
		if (this.X == locateVal.X && this.Y == locateVal.Y)
			return true;
		else
			return false;
	}
	
	//해시코드 오버라이딩이 필요할 수도 있음

}


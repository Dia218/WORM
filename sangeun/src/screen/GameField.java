package screen;

import java.util.*;
import javax.swing.JPanel;
import element.*;
import element.item.GoodItem;

//게임 필드 패널 클래스
public class GameField extends JPanel {
	
	//게임 필드 객체는 한 번만 생성된다
	public static final GameField gamefield = new GameField(); 
	
	/*게임 필드 필드*/
	final int elementNum = 24; //요소의 갯수
	final int elementSize = 20; //요소의 크기
	HashMap<Locate, Element> hashmap = new HashMap<Locate, Element>(); //좌표와 요소를 저장하는 해시맵 
	Set<Locate> keys = hashmap.keySet(); //좌료 객체 키를 저장하는 set 컬렉션 
	Iterator<Locate> iterator = keys.iterator(); //좌표 객체를 저장하는 이터레이터 

	
	/*게임 필드 생성자*/
	private GameField() {
		//배치 관리자 제거
		this.setLayout(null);
		//게임 필드의 크기와 위치
		this.setBounds(elementSize*elementNum, elementSize*elementNum, 0, 0);
		
		//해시맵 초기화 호출
		initElement();
	}
	
	
	/*게임 필드 메소드*/
	
	//게임 필드 크기를 리턴해주는 메소드
	public int returnFieldSize() {
		return this.elementNum*20;
	}
	
	//해시맵을 초기화하는 메소드
	private void initElement() {
		//좌료 : (0~23, 0~23)
		for(int x = 0; x < elementNum; x++) {
			for(int y = 0; y < elementNum; y++) {
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
	
	//생성된 객체를 받아서 해당 좌표 키의 해시맵에 저장하는 메소드
	public void setHash(Element element) {		
		Locate locate = new Locate(element.returnX(), element.returnY());
		hashmap.replace(locate, element);
		
		//동작 확인
		System.out.println("해시맵에 요소 set");
	}
	
	/*
	//해시맵에 따라 게임 필드 전체를 그리는 메소드
	public void drawField() {
		//좌표 키 값을 순차적으로 방문
		while(iterator.hasNext()) {
			//방문한 좌표 키 값
			Locate indexLocate = iterator.next();
			//방문한 좌표 키 값에 있는 element 객체
			Element element = hashmap.get(indexLocate);
		}
		//게임 필드 다시 그리기
		this.revalidate();
		this.repaint();
		
		//동작 확인
		System.out.println("게임 필드 그리기");
	}
	*/
	
	
	
}

//좌표 키 클래스
class Locate {
	
	/*좌표 클래스 필드*/
	private int X; //X좌표, Y좌표
	private int Y;
	
	
	/*좌표 클래스 생성자*/
	public Locate(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	/*좌표 클래스 메소드*/
	public int returnX() {
		return this.X;
	}
	public int returnY() {
		return this.Y;
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


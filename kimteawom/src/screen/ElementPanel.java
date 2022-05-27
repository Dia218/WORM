package screen;

import java.awt.*;

import javax.swing.*;

import element.*;

public class ElementPanel extends JPanel {

	/*요소 패널의 필드*/
	
	//element 객체 저장
	Element element;
	//그리기 크기
	final int drawSize = 15;
	
	/*요소 패널의 생성자*/
	public ElementPanel(Element element) {
		this.element = element;
		
		//요소 패널의 위치와 크기 설정
		this.setBounds(element.returnX()*GameField.gamefield.elementSize, element.returnY()*GameField.gamefield.elementSize, GameField.gamefield.elementSize, GameField.gamefield.elementSize);
				
		//게임 필드에 배치하기
		GameField.gamefield.add(this);
		
		//게임 필드 다시 그리기 
		
		GameField.gamefield.revalidate();
		GameField.gamefield.repaint();
		
		//동작 확인
		System.out.println("요소 패널 생성 및 배치");
	}
	
	
	/*요소 패널의 메소드*/
	
	@Override
	//요소 그리기
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//element 객체로 부터 색깔 받아오기
		g.setColor(element.returnColor());
		//도형 그리기 메소드 호출
		drawFigure(g);
		
		//게임 필드에 요소 패널 부착
		GameField.gamefield.add(this);
		
	}
	
	//element 종류에 따라 그리는 도형
	public void drawFigure(Graphics g) { 
	
		//지렁이 = 원형
		if(element instanceof Worm) {
			g.fillOval(0, 0, drawSize, drawSize);
		}
		//블록 = 사각형
		else if(element instanceof Block) {
			g.fillRect(0, 0, drawSize, drawSize);
		}
		//아이템 = 삼각형
		else if(element instanceof Item) {
			int x[] = {0, drawSize, drawSize/2};
			int y[] = {0, 0, drawSize};
			g.fillPolygon(x, y, 3);
		}
		//아무 것도 해당하지 않으면 그리지 않음
		else
			;
		
		
	}
	
	
	
}

package screen;
import java.awt.*;
import javax.swing.*;
import screen.*;
import element.*;
import element.block.TelpoBlock;

//게임 오버 패널 클래스
public class GameOver extends JPanel {
	
	/*게임 오버 패널 생성자*/
	public GameOver() {
		//동작 확인
		System.out.println("게임 오버 생성");
		
		//게임 프레임 컨텐트팬을 게임오버 패널로 변경
		((JFrame) GameField.gamefield.getTopLevelAncestor()).setContentPane(this);
		
		//게임 오버 그리기
		getParent().revalidate();
		getParent().repaint();
	}
	
	/*게임 오버 패널 메소드*/
	@Override
	public void paintComponent(Graphics g) {
		//동작 확인
		System.out.println("게임오버 페인트컴포넌트 실행");
		
		//사각형 그리기
		g.setColor(Color.black);
		for(int i = 0; i <= GameField.gamefield.elementNum; i++) {
			for(int j = 0; j <= GameField.gamefield.elementNum; j++) {
				if(i==0||j==0||i==GameField.gamefield.elementNum||j==GameField.gamefield.elementNum)
				g.fillRect(i*GameField.gamefield.elementSize, j*GameField.gamefield.elementSize, 15, 15);
			}
			//글씨 그리기
			g.setFont(new Font("",Font.BOLD,30));
			g.drawString("GAME OVER!", 13*11, 20*11);
		}
	}
	
	Thread thread = new Thread(new Runnable() {

		@Override
		public void run() {
			System.out.print("sadsa");
			// TODO 자동 생성된 메소드 스텁
			try {
					Thread.sleep(100);
					
					System.out.print("asd");
						

			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally{
					
			}
		}
	});
}

class GameOverThread{
	
}

package screen;
import java.awt.*;
import javax.swing.*;
import screen.*;
import element.*;
import element.block.TelpoBlock;

//게임 오버 패널 클래스
public class GameOver extends JPanel {
	
	public void paintComponent(Graphics g) {
		System.out.print("페인트컴포넌트 실행");
		g.setColor(Color.black);
		for(int i =0;i<23;i++) {
			for(int j=0;j<22;j++) {
				if(i==0||j==0||i==22||j==21)
				g.fillRect(20*i, j*20, 15, 15);
			}
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

class GameOverThr{
	
}

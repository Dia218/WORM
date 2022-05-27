package screen;
import java.awt.*;

import javax.swing.*;

import screen.*;
import element.*;
import element.block.TelpoBlock;
//게임 오버 패널 클래스
public class GameOver extends JPanel {
	int x=0;	
	boolean isGameOver = false;
	boolean isEnd =false;
	public GameOver(){
		super();
	
	

		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				
				// TODO 자동 생성된 메소드 스텁
			try {
				
				for(int i=0;i<22;i++) {
					Thread.sleep(100);
					x++;
					isGameOver= true;
					revalidate();
					repaint();
						
				}
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			finally {
				isEnd =true;
				repaint();
			}
			
		}
	
		
	});
	thread.start();
}
	public void paintComponent(Graphics g) {
			super.paintComponent(g);

			
			setBackground(Color.black);
			if(isEnd) {
				g.setColor(Color.white);

				g.setFont(new Font("",Font.BOLD,30));
				g.drawString("수고하셨습니다.", 13*11-10, 20*11);
			}
			else if(this.isGameOver) {
				for(int i=0;i<23;i++) {
						for(int j=0;j<x;j++) {
							if(i==0||j==0||i==22||j==21) {
								continue;
							}
							if(x<9) {
								g.setColor(Color.white);
								g.setFont(new Font("",Font.BOLD,30));
								g.drawString("GAME OVER!", 13*11, 20*11);
							}
							g.setColor(Color.gray);
							g.fillRect(20*i, j*20, 15, 15);
						}
				}
			}
			
				System.out.print("게페 실sadd행");
				g.setColor(Color.yellow);
				for(int i =0;i<23;i++) {
					for(int j=0;j<22;j++) {
						if(i==0||j==0||i==22||j==21)
						g.fillRect(20*i, j*20, 15, 15);
					}
					
				}
				
						
	}
	
	
	
}

class GameOvertray extends JPanel {
	public boolean sda = true;
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(30, 30, 30, 30);
	}
	
	public boolean returnGameOver() {
		return sda;
	}
}
class GameOverThr{

	GameOverThr() throws InterruptedException{
		Thread.sleep(100);
		System.out.print("게임오버프린트 실행");
	}
}



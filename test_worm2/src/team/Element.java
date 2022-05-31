package team;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Element extends JPanel implements InputKey.InputMethod, Change{
	Gaming gaming;
	int[][] field;
	int p;
	public static int maxSize = 24;
	public Element() {
		super();
		this.setBackground(Color.black);
		gaming = new Gaming();
		gaming.add((Change)this);
		field = gaming.getField();
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while(!gaming.isGameOver()) {
						Thread.sleep(gaming.getSpeed());
							
							gaming.tern(); //방향키 입력받기
							repaint();

					}
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				finally{
						try {
							for(p =0;p<maxSize+1;p++) {
								Thread.sleep(100);
								 gaming.GameOverScreen(p);
								 repaint();
							}
							} 
						catch (InterruptedException e) {
							// TODO 자동 생성된 catch 블록
							e.printStackTrace();
						}
						finally {
							gaming.end = true;
							gaming.endGame();
							repaint();
						}
					}
				}
				
			
		});
		thread.start();
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		if(gaming.isGameOver()&&p<=10) {
			g.setColor(Color.white);
			g.setFont(new Font("",Font.BOLD,30));
			g.drawString("GAME", 100, 250);
			g.setColor(Color.white);
			g.drawString("OVER!", 300, 250);

			
			
		}
		
		if(!gaming.isGameOver()) {
			g.setColor(Color.white);
			g.drawString("SPEED: ", GameFrame.Width-150,20);
			g.drawString(gaming.getSpeed()+"",GameFrame.Width-100, 20);
		}	
		for(int i =0;i<maxSize+1;i++) {
				for(int j=0;j<maxSize+1;j++) {
					System.out.print(field[i][j]);
					//1은 블럭
					if(field[i][j]==1) {
						g.setColor(Color.gray);
						if(i==0&&j==0||i==maxSize&&j==0||i==0&&j==maxSize||i==maxSize&&j==maxSize
								||j==maxSize&&i==maxSize-1||i==maxSize-1&&j==0||i==0&&j==maxSize-1||i==maxSize&&j==maxSize-1) {
							g.fillRect(j*20, i*20+25, 15, 15);
						}
						else if(i==0||(i==maxSize)) {
							g.fillRect(j*20, i*20+25, 20, 15);
						}
						else if((i==0&&j==0)||j==0||j==maxSize&&i!=0) {
							g.fillRect(j*20, i*20+25, 15, 20);
						}
						else {
							g.fillRect(j*20, i*20+25, 15, 15);
						} 
					//2은 지렁이
					}else if(field[i][j]==2) {
						if(i%2!=j%2) {
							g.setColor(Color.green);	
						}
						else {
							g.setColor(Color.red);
						}
						g.fillRoundRect(j*20, i*20+25, 20, 20,20,20);
					}else if(field[i][j]==3) {
						g.setColor(Color.YELLOW);
						g.fillRect(j*20, i*20+25, 15, 15);
					}
					else if(field[i][j]==4) {
						g.setColor(Color.MAGENTA);
						g.fillRect(j*20, i*20+25, 15, 15);
					}
					else if(field[i][j]==5) {
						g.setColor(Color.MAGENTA);
						g.fillRect(j*20, i*20+25, 15, 15);
					}
					else if(field[i][j]==6) {
						g.setColor(Color.ORANGE);
						g.fillRect(j*20, i*20+25, 15, 15);
					}
					else if(field[i][j]==7) {
						g.setColor(Color.CYAN);
						g.fillRect(j*20, i*20+25, 15, 15);
					}
					else if(field[i][j]==8) {
						g.setColor(Color.WHITE);
						g.fillRect(j*20, i*20+25, 15, 15);
					}
					
		}
					
		

		System.out.println();
		}
		if(gaming.end) {
					g.setColor(Color.white);
					g.setFont(new Font("",Font.BOLD,30));
					g.drawString("점수는 : ", 100, 300);
					g.setColor(Color.white);
					g.drawString(gaming.getScore()+"점입니다.", 250, 300);
					g.drawString("플레이해주셔서 감사합니다",50,250);
			}
		
	}
	

	@Override
	public void LeftKeyPressed() {
	
			if(gaming.getDirection().equals(Gaming.Direction.RIGHT))return;
			if(gaming.isPermitRotation())
				gaming.setDirection(Gaming.Direction.LEFT);
		
		
	}

	@Override
	public void RightKeyPressed() {
		if(gaming.getDirection().equals(Gaming.Direction.LEFT))return;
			if(gaming.isPermitRotation())
				gaming.setDirection(Gaming.Direction.RIGHT);
		
			
	}

	@Override
	public void UpKeyPressed() {

			if(gaming.getDirection().equals(Gaming.Direction.DOWN))return;
			if(gaming.isPermitRotation())
				gaming.setDirection(Gaming.Direction.UP);

	}

	@Override
	public void DownKeyPressed() {
			if(gaming.getDirection().equals(Gaming.Direction.UP))return;
			if(gaming.isPermitRotation())
				gaming.setDirection(Gaming.Direction.DOWN);
		
			
		
	}

	@Override
	public void update() {
//		System.out.println("Element: update");
		field = gaming.getField();
		repaint();
	}
	
	
}

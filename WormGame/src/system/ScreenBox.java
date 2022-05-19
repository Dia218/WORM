package system;
import java.awt.*;
import javax.swing.*;

public class ScreenBox extends JPanel {

	//네모칸 크기
	int blocksize = 10;
	
	//게임 보드 2차원 배열
	int [][] gameboard = new int[20][20];

	//게임 보드 초기화를 진행시키는 메소드
	void setboard() {
		//게임보드 초기화 = 1
	    for(int y = 0; y < 20; y++) {
	    	for(int x = 0; x < 20; x++) {
	    		this.gameboard[x][y] = 1;
	        }
	    }
	}
	

	
	//게임 보드에 네모칸 그리기
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
        for(int y = 0; y < 20; y++) {
            for(int x = 0; x < 20; x++){
               if(gameboard[y][x] == 1) {
            	   g.setColor(Color.GREEN);
            	   g.drawRect(x*blocksize + blocksize, y*blocksize + blocksize, blocksize, blocksize);
               }
            }
        }
		
	}
	
}

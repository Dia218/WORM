package system;
import java.awt.*;
import javax.swing.*;

public class ScreenBox extends JPanel {

	//�׸�ĭ ũ��
	int blocksize = 10;
	
	//���� ���� 2���� �迭
	int[][] gameboard;
	gameboard = new int[20][20];
	
	//���Ӻ��� �ʱ�ȭ = 1
    for(int y = 1; y <= 20; y++) {
    	for(int x = 1; x <= 20; x++) {
    		gameboard[x][y] = 1;
        }
    }
	
	//���� ���忡 �׸�ĭ �׸���
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

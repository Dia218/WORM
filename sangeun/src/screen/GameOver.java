package screen;
import java.awt.*;
import javax.swing.*;
import screen.*;
import element.*;
import element.block.TelpoBlock;

//���� ���� �г� Ŭ����
public class GameOver extends JPanel {
	
	/*���� ���� �г� ������*/
	public GameOver() {
		//���� Ȯ��
		System.out.println("���� ���� ����");
		
		//���� ������ ����Ʈ���� ���ӿ��� �гη� ����
		((JFrame) GameField.gamefield.getTopLevelAncestor()).setContentPane(this);
		
		//���� ���� �׸���
		getParent().revalidate();
		getParent().repaint();
	}
	
	/*���� ���� �г� �޼ҵ�*/
	@Override
	public void paintComponent(Graphics g) {
		//���� Ȯ��
		System.out.println("���ӿ��� ����Ʈ������Ʈ ����");
		
		//�簢�� �׸���
		g.setColor(Color.black);
		for(int i = 0; i <= GameField.gamefield.elementNum; i++) {
			for(int j = 0; j <= GameField.gamefield.elementNum; j++) {
				if(i==0||j==0||i==GameField.gamefield.elementNum||j==GameField.gamefield.elementNum)
				g.fillRect(i*GameField.gamefield.elementSize, j*GameField.gamefield.elementSize, 15, 15);
			}
			//�۾� �׸���
			g.setFont(new Font("",Font.BOLD,30));
			g.drawString("GAME OVER!", 13*11, 20*11);
		}
	}
	
	Thread thread = new Thread(new Runnable() {

		@Override
		public void run() {
			System.out.print("sadsa");
			// TODO �ڵ� ������ �޼ҵ� ����
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

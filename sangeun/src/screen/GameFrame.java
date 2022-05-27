package screen;

import java.awt.*;
import javax.swing.*;



//���� ������ Ŭ����
public class GameFrame extends JFrame {

	GameOver gameover = new GameOver();
	public GameFrame() throws HeadlessException {
		super();
		
		//�ʵ� �ʱ�ȭ ȣ��
		GameField.gamefield.initField();
		this.add(GameField.gamefield);
		this.revalidate();
		this.repaint();
		this.add(gameover);


		//this.addKeyListener(new InputKey(element));
		this.requestFocus();
				
		setSize(GameField.gamefield.returnFieldSize()+50, GameField.gamefield.returnFieldSize()+50); //������ ����
		setLocationRelativeTo(null); //ȭ�� �߾� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//â ������ ����
		setResizable(false); //â ũ�� ���� �Ұ�
		setVisible(true); //â�� ���̰� ����

	}
}

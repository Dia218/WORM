package screen;

import java.awt.*;
import javax.swing.*;

//���� ������ Ŭ����
public class GameFrame extends JFrame {
	
	/*���� ������ ������*/
	public GameFrame() throws HeadlessException {
		super();		
				
		//this.addKeyListener(new InputKey(element));
		this.requestFocus();
	
		setSize(GameField.gamefield.returnFieldSize()+50, GameField.gamefield.returnFieldSize()+50); //������ ����
		setLocationRelativeTo(null); //ȭ�� �߾ӿ� â ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//â ������ ����
		setResizable(false); //â ũ�� ���� �Ұ�
		setVisible(true); //â�� ���̰� ����
	}
}

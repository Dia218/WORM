package screen;

import java.util.*;
import javax.swing.JPanel;
import element.*;

//���� �ʵ� �г� Ŭ����
public class GameField extends JPanel {
	
	//���� �ʵ� ��ü�� �� ���� �����ȴ�
	public static final GameField gamefield = new GameField(); 
	
	/*���� �ʵ� �ʵ�*/

	int size;
	static HashMap<Locate, Element> hashmap = new HashMap<Locate, Element>(); //��ǥ�� ��Ҹ� �����ϴ� �ؽø� 
	static Set<Locate> keys = hashmap.keySet(); //�·� ��ü Ű�� �����ϴ� set �÷��� 
	static Iterator<Locate> iterator = keys.iterator(); //��ǥ ��ü�� �����ϴ� ���ͷ����� 
	
	
	/*���� �ʵ� ������*/
	
	private GameField() {
		//this.setSize();
	}
	
	
	/*���� �ʵ� �޼ҵ�*/
	
	//���� �ʵ� ũ�⸦ �������ִ� �޼ҵ�
	public int returnSize() {
		return this.size;
	}
	
	//�ؽø��� �ʱ�ȭ�ϴ� �޼ҵ�
	void initElement() {
		//�·� : (0~23, 0~23)
		for(int x = 0; x < 24; x++) {
			for(int y = 0; y < 24; y++) {
				//�ؽø� Ű: Locate(��ǥ) ��ü ���������� ���� �� ���� 
				//�ؽø� ��: null 
				hashmap.put(new Locate(x, y), null);
			}
		}
	}
	
	//�ش� ��ǥ�� element�� ����ִ� �� Ȯ���ϴ� �޼ҵ�
	public boolean checkLocate(int checkX, int checkY) {
		//�ش� ��ǥ�� ��ġ�ϴ� ��ǥ ���� ����ִ� element�� null�̸� true
		if (null == hashmap.get(new Locate(checkX, checkY)))
			return true;
		else
			return false;
	}
	
	//������ ��ü�� �޾Ƽ� �ش� ��ǥ�� �����ϴ� �޼ҵ�
	public void setElement(Element element) {		
		Locate locate = new Locate(element.returnX(), element.returnY());
		hashmap.replace(locate, element);
		//����� �� �׷��ִ� �޼ҵ� ���� ȣ���ϱ�
	}
	
	//����� ��ǥ�� ����ִ� element�� ���� �ش� ��ü �׸��� �޼ҵ�
	public void drawField() {
		while(iterator.hasNext()) {
			Locate indexLocate = iterator.next();
			Element element = hashmap.get(indexLocate);
			ElementPanel elementPanel = new ElementPanel(element);
		}
	}
	
}

class Locate {
	
	/*��ǥ Ŭ���� �ʵ�*/
	private int X; //X��ǥ, Y��ǥ
	private int Y;
	
	/*��ǥ Ŭ���� �޼ҵ�*/
	public int returnX() {
		return this.X;
	}
	public int returnY() {
		return this.Y;
	}
	
	/*��ǥ Ŭ���� ������*/
	public Locate(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	/*�������̵�*/
	//equals �������̵�
	@Override
	public boolean equals(Object object) {
		Locate locateObject = (Locate) object;
		if (this.X == locateObject.X && this.Y == locateObject.Y)
			return true;
		else
			return false;
	}
	
	//�ؽ��ڵ� �������̵�
	@Override
	public int hashCode() {
		return Objects.hash(X, Y);
	}
}


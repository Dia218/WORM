package screen;

import java.util.*;
import javax.swing.JPanel;

public class GameField extends JPanel {
	
	int size;
	HashMap<Locate, Element> hashmap = new HashMap<Locate, Element>(); 
	Set<Locate> keys = hashmap.keySet();
	Iterator<Locate> iterator = keys.iterator();
	
	public GameField() {
		
		this.setSize();
	}
	
	
	public int returnSize() {
		return this.size;
	}
	
	//��ǥ ���� �� �� ��ǥ���� ��� ��ü �� null�� �ʱ�ȭ�ϴ� �޼ҵ�
	void initElement() {
		for(int x = 0; x < 24; x++) {
			for(int y = 0; y < 24; y++) {
				//�ؽø� Ű: Locate(��ǥ)Ŭ���� ��ü ���� �� ���� 
				//�ؽø� ��: null 
				hashmap.put(new Locate(x, y), null);
			}
		}
	}
	
	//Ư�� ��ǥ�� ��ġ�ϴ� ��ǥ Ű�� ã�� �޼ҵ�
	Locate fineLocate(int findX, int findY) {
		/*
		 * �Ʒ��� ���� �Ϸ��� equals �������̵� �ʿ�
		//�ش� ��ǥ�� ��ġ�ϴ� ��ǥ ���� ����ִ� element�� null�̸� true
		Locate locate = new Locate(findX, findY);
		Element element = hashmap.get(equals(locate));
		 */
		
		//�ؽø��� ��ǥ Ű ���������� �˻�
		while(iterator.hasNext()) {
			Locate locate = iterator.next();
			//�ؽø��� ��ǥ Ű�� �˻��� ��ǥ�� ��ġ�� �� �ش� ��ǥ Ű ����
			if (locate.X == findX && locate.Y == findY) {
				return locate;
			}
		}
		//��ġ�ϴ� ��ǥ ���� ������ (���� ���� ����)
		return null;
	}
	
	//�ش� ��ǥ�� ����ִ� �� Ȯ���ϴ� �޼ҵ�
	public boolean checkLocate(int checkX, int checkY) {
		//�ش� ��ǥ�� ��ġ�ϴ� ��ǥ ���� ����ִ� element�� null�̸� true
		if (null == hashmap.get(fineLocate(checkX, checkY)))
			return true;
		else
			return false;
	}
	
	//������ ��ü�� �޾Ƽ� �ش� ��ǥ�� �����ϴ� �޼ҵ�
	public void inputElement(Element element) {
		
		Locate locate = fineLocate(element.returnX(), element.returnY());
		hashmap.replace(locate, element);
	}
	
	//����� ��ǥ�� ����ִ� ��ü�� ���� �ش� ��ü�� �׸��� �޼ҵ� ȣ��
	void drawField() {
		while(iterator.hasNext()) {
			Locate locate = iterator.next();
			
			//FieldComponent fieldComponent = new FieldRectangle(xy.X, xy.Y);
		}
		
	}
	
}

class Locate {
	
	public int X;
	public int Y;
	
	public Locate(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	@Override
	public boolean equals(Object val) {
		Locate locateVal = (Locate) val;
		if (this.X == locateVal.X && this.Y == locateVal.Y)
			return true;
		else
			return false;
	}
	
	//�ؽ��ڵ� �������̵��� �ʿ��� ���� ����

}


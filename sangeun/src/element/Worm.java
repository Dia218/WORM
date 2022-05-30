package element;

import java.awt.Color;
import java.util.*;
import element.worm.WormBody;
import element.worm.WormHead;
import screen.GameField;

public class Worm extends Element {
   private static int wormXY[][] = new int[2][15];
   public static int wormSize = 0;
   
   protected static int wormHeadXY[] = new int[2]; 
   
   /*�̻��� �߰� - ����*/
   protected static Vector<Worm> wormVector = new Vector<>(15);
   
   public Worm(int elementX, int elementY) {
      super(elementX, elementY);
   
      //���� Ȯ��
      System.out.println("������ �����");
      // TODO Auto-generated constructor stub
   }
   
   public int[][] getWormXY(){
      return wormXY;
   }
   public void setWormXY(int[][] wormXY){
      this.wormXY = wormXY;
   }
   

   public int returnSize() {
      return this.wormSize;
   }
   public void setSize(int size) {
      this.wormSize = size;
   }
   
   public static void wormMove() {
      System.out.println("������ ����");
      //������ �����̴� �˰���
      
      WormHead wormHead = new WormHead(Worm.wormXY[0][0],Worm.wormXY[1][0]);
      WormBody wormBody = new WormBody();
      
      //�� ��ĭ ����
      
      
      if(GameField.gamefield.checkElement((Worm.wormXY[0][Worm.wormSize-1]),(Worm.wormXY[1][Worm.wormSize-1])) instanceof Worm){
         GameField.gamefield.removeElement(Worm.wormXY[0][Worm.wormSize-1],Worm.wormXY[1][Worm.wormSize-1]);
      }
      
      if(Worm.wormSize>=1){
         for(int i=Worm.wormSize-1;i>0;i--) {
            Worm.wormXY[0][i] = Worm.wormXY[0][i-1];
            Worm.wormXY[1][i] = Worm.wormXY[1][i-1];
            wormBody.setXY(Worm.wormXY[0][i], Worm.wormXY[1][i]);
            GameField.gamefield.setElement(wormBody);
            
         }
         
      }
      else {
         return;
      }
      
      GameField.gamefield.setElement(wormHead);
      //�������
   }   

   /*�̻��� �߰� - ����*/
   public int returnWormSize() {
      int wormSize = wormVector.size();
      return wormSize;
   }
   public Worm getWorm(int index) {
      return wormVector.get(index);
   }
   public Worm returnWorm() {
      return wormVector.get(0);
   }
   
   //���¿� �߰�
   public Vector returnWormVector() {
      return this.wormVector;
   }
   public Worm returnLastWormBody() {
      return wormVector.get(wormVector.size()-1);
   }
   
   public int[] returnWormHead() {
      return wormHeadXY;
      
   }


}
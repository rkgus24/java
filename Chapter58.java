package chapter58;

import javax.swing.JOptionPane;
class Three extends Thread{

   @Override
   public void run() {
      for(int i = 10;i>0;i--) {
         System.out.println(i);
         try {
            Thread.sleep(1000);//1초 = 1/1000
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
   
}

public class ThreadEx4 {

   public static void main(String[] args) {
      /*
      //싱글 스레드 
      String in = JOptionPane.showInputDialog("값을 입력하세요");
      System.out.println(in);
      for(int i = 10;i>0;i--) {
         System.out.println(i);
         try {
            Thread.sleep(1000);//1초 = 1/1000
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      System.out.println("Main Thread 종료!!!");
      */
      //멀티스레드
      //Main 스레드와 Three 스레드 동시에 작업
      Three th1 = new Three();
      th1.start();
      String in = JOptionPane.showInputDialog("값을 입력하세요");
      System.out.println(in);
      System.out.println("Main Thread 종료!!!");
   }

}

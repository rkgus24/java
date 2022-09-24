package chapter56;

public class ThreadEx2 {

   public static void main(String[] args) {
      //싱글 스레드(Main 스레드)
      for(int i = 0;i<300;i++) {
         System.out.print("$");
      }
      for(int i = 0;i<300;i++) {
         System.out.print("*");
      }
      
      System.out.println("Main Thread 종료!!!");
   }

}

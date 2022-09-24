package chapter59;

class Four implements Runnable{

   @Override
   public void run() {
      for(int i = 0;i<300;i++) {
         System.out.print("$");
      }
      System.out.println("Four 스레드 종료!!!");
   }
   
}

class Five implements Runnable{

   @Override
   public void run() {
      for(int i = 0;i<300;i++) {
         System.out.print("$");
      }
      System.out.println("Five 스레드 종료!!!");
   }
   
}




public class ThreadEx5 {

   public static void main(String[] args) {
      Runnable  r = new Four();
      Runnable  r1 = new Five();
      
      Thread th1 = new Thread(r, "Four스레드");
      Thread th2 = new Thread(r, "Five스레드");
      
      System.out.println("Thread 이름 : "+Thread.currentThread().getName());
      System.out.println("Thread ID : "+Thread.currentThread().getId());
      System.out.println("Thread 우선순위 : "+Thread.currentThread().getPriority());
      System.out.println("Thread 인스턴스 : "+Thread.currentThread().isInterrupted());
      System.out.println("---------------------");

      
      System.out.println("Thread 이름 : "+th1.currentThread().getName());
      System.out.println("Thread ID : "+th1.currentThread().getId());
      System.out.println("Thread 우선순위 : "+th1.currentThread().getPriority());
      System.out.println("Thread 인스턴스 : "+th1.currentThread().isInterrupted());
      System.out.println("---------------------");
      System.out.println("Thread 이름 : "+th2.currentThread().getName());
      System.out.println("Thread ID : "+th2.currentThread().getId());
      System.out.println("Thread 우선순위 : "+th2.currentThread().getPriority());
      System.out.println("Thread 인스턴스 : "+th2.currentThread().isInterrupted());
      System.out.println("---------------------");
      
      //스레드의 우선 순위 지정
      //우선 순위가 높은 스레드를 먼저 실행 한 다음 낮은 스레드를 실행한다
      //최소 우선 순위(1) ~ 최대 우선 순위(10) 까지 지정이 가능하다
      //우선 순위 가본값은 5(보통 우선 순위)이다
      th1.setPriority(1);
      th2.setPriority(8);
      System.out.println("th1 Thread ID : "+th1.currentThread().getPriority());
      System.out.println("th2 Thread ID : "+th2.currentThread().getPriority());
      System.out.println("---------------------");
      th1.start();
      th2.start();
      System.out.println("Main Thread 종료!!");
      
      
   }

}

package chapter57;
//첫번재 스레드 : Thread 클래스를 상속 받아서 run()메서드 오버라이드 시켜서 사용
class One1 extends Thread{

   @Override
   public void run() {
      for(int i = 0;i<300;i++) {
         System.out.print("$");
      }
      
   }
   
}
//두분째 스레드 : Runnable 인터페이스를 구현한 클래스를 사용
//-> run()메서들 오버라이드 시켜서 사용
class Two1 implements Runnable{
   @Override
   public void run() {
      for(int i = 0;i<300;i++) {
         System.out.print("*");
      }
      
   }
}






public class ThreadEx3 {
   public static void main(String[] args) {
      //멀티 스레드 : cpu가 수행할 여러개의 작업 단위의 코드 블럭을 작성(run() 메서드의 내용)
      //Thread 클래스릏 상속 받아서 작성한 단위를 수행 시키기
      
      One1 th = new One1();//Thread 클래스의 멤버들을 사용할 수 있다
      th.start();//run() 메서드내에서 오버라이드 되어서 수행해야 코드를 수행시킨다
      
      //Runnable 인터페이스로 구현한 작업 단위의 코드 블록을 작성 (run() 메서드의 내용)
      //인터페이스 변수명 = 구현 클래스 
      
      //-> Runnable 인터페이스를 구현한 클래스(Two1)의 객체를 Thread 클래스의 생성자의 매게 변수 인수로 넣어서 수행
      Runnable th1 = new Two1();
      Thread t = new Thread(th1);
      t.start();
      System.out.println("Main Thread 종료!!!");
      
   }
}

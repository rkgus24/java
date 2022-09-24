package chapter31;

//강제하는 기능이다!!!(메서드 원형만 만들어주고 구현클래스로 구현해서 사용할 수 있도록 만들어 놓은 구조이다
//->구현한느 클래스가 꼭 같이 있어야 한다 (인터페이스에서 만들어 놓은 메서드 원형을 오버라이드 시켜야 한다)
//클래스간의 상속 하느느 방법을 사용하지 않고 어느 클래스에서나 인터페이스 변수명으로 구현된 메서드를 호출해서 사용하는 방법이다
interface Etc{
   //1.추상 메서드 형식 : 메서드 원형만 작성되어 있다
   public abstract void anything();
   //2.default 메서드 형식
   default void anything1() {
      System.out.println("default는 인터페이스에서 구현되어진 메서드이다");
   }
   //3.상수값을 지정해 놓고 공통적으로 사용할 수 있다
   //변수는 선언하지 못하고 변수를 상수값 형태로 고정시켜서 사용할 수 있다
   public static final int COUNT = 10;
   //4.static 메서드 형식 : 객체를 생성하지 않고 메서드 호출이 가능하다
   static void anything2() {
      System.out.println("static은 객체가 새성되지 않아도 어디서나 호출이 가능하다");
   }
}

//구현 클래스
class EtcOther implements Etc{

   @Override
   public void anything() {
      System.out.println("추상 메서드를 강제롤 반드시 구현해야 한다");
   }
   //아무것도 오버라이드 시키지 않음
   
}

public class Interface5 {

   public static void main(String[] args) {
      EtcOther ec = new EtcOther();
      //default void anything1() 메서드 호출해서 수행
      ec.anything1();
      System.out.println("-------------------------------------------------");
      //2.public static final int COUNT = 10;
      //고정된 상수값으로 만들어 놓고 사용한다
      System.out.println(ec.COUNT);
      System.out.println("-------------------------------------------------");
      //3.static void anything2() 메서드 호출해서 수행 가능하다
      //인터페이스내에서 만들었기 때문에 인터페이스명.메서드명
      Etc.anything2();
      System.out.println("Etc.COUNT ="+Etc.COUNT);
      //4.public abstract void anything() 추상메서드를 구현하고 수행시켜 본다
      //구현 클래스를 생성해서 객체로 사용하는 방법
      ec.anything();
      //인터페이스로 구현클래스를 개개체 생성해서 오버라이드된 메서드를 호출해 오는 방법
      //인터페이스형 = 구현(오버라이드된 메서드)된 객체를 생성
      Etc e = new EtcOther();
      e.anything();
      
   }

}

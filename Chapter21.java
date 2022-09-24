package Chapter21;
//상속(Inheritance) : 새로운 클래스를 만들때 기존의 클래스의 멤버들을 가져와서 사용하는 것이다.
//상속해주는 클래스 :상위(부모) 클래스
//상속받는 클래스 : 하위 (자식) 클래스
class Phone{
   String name;
   String color;
   String company;
   void call() {
      System.out.println("전화를 건다.");
   }
   void receive() {
      System.out.println("전화를 건다.");
   }
}
//상속
//class 새로운클래스명 extends 상속해주는 클래스명
class SmartPhone extends Phone{
   void installApp() {
      System.out.println("앱설치");
   }
}
public class SmartPhoneMain {

   public static void main(String[] args) {
      SmartPhone sp = new SmartPhone();
      sp.name = "갤럭시";
      sp.company = "삼성";
      sp.color = "블랙";
      System.out.println(sp.name);
      System.out.println(sp.company);
      System.out.println(sp.color);
      System.out.println("--------------------------------");
      sp.call();
      sp.receive();
      sp.installApp();
   }

}

package chapter26;
//**toString() 메서드
//java.lang.Object 클래스는 모든 클래스의 최상위 클래스이다
//모든 클래스는 Object클래스를 상속 받는다
//Object 클래스는 자동으로 import되어 있다
//모든 틀래스는 Object클래스의 메서드를 사용할 수 있고, 일부 메서드는 오버라이드해서 사용할 수 있다
///**toString() 메서드 : 변수(객체)의 정보를 Sting(문자열)형으로 변환해서 표시해준다
//오버라이드(메서드 고쳐서 사용)하여 사용할 수 있다


class Animal{
   public int age;
   public String name;
   //기본 생성자 
   Animal(){
      age = 0;
      name = "동물이름";
   }
}
class Lion extends Animal{
   //사용자 정의 메서드
   public void lion() {
      System.out.println("사자 클래스 메서드!!!");
   }
   /*
   @Override
   public String toString() {
      return "나이 : " + age + ", 이름 : " + name;
      //return super.toString();
   }
   */
   public void allObject(Object obj) {
      System.out.println(obj.toString());
   }
   
}

public class Poly_2 {

   public static void main(String[] args) {
      Lion lion1 = new Lion();
      System.out.println("lion1 변수명 ="+lion1);
      System.out.println("lion1 변수명 ="+lion1.toString());
      lion1.lion();
      System.out.println("-----------------------------------------");
      System.out.println(lion1.getClass());
      System.out.println("-----------------------------------------");
      Lion lion2 = new Lion();
      System.out.println("lion1 변수명 ="+lion2);
      System.out.println("lion1 변수명 ="+lion2.toString());
      System.out.println("-----------------------------------------");
      lion1.allObject(new Lion());
      lion1.allObject("안녕");
      
   }

}
​

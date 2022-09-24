package chapter20;

class Parent{
   int number = 3;
   Parent(){//기본 생성자
      System.out.println("부모 객체 생성");
   }
}
//상속 클래스
class Child extends Parent{
   //int number = 2;
   Child(){//기본 생성자
      System.out.println("자식 객체 생성");
   }
   void print() {
      int number = 1;
      System.out.println(number);//함수내에서만 사용되는 지역변수 number
      System.out.println(this.number);//자신 객체의 number
      System.out.println(super.number);//부모 객체의 number
   }
}

public class SuperEx {

   public static void main(String[] args) {
      Child child = new Child();
      child.print();

   }

}

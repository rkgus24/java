package chapter27;
//추상메서드 
//1.메서드 선언부만 정의하고 구체적으로 처리할 내용은 비워놓은 메서드이다
//2.상속을 받은 하위 클래스에서 오버라이드 시켜서 실제 처리할 내용을 구현한다
//3.메서드 앞에 abstract 제어자를 붙여준다


//추상 클래스(basetract class) 
//1. 추상 메서드를 하나랃 가지고 있는 클래스는 추상 클래스라고 한다
//2.클래스 이름 앞에 abstract 제어자를 붙여준다
//3.추상 클래스는 객체를 생성하지 못한다

//final 제어자
//클래스 앞에 final : 상속 시킬수 없다
//메서드 앞에 final : 상속받은 클래스에서 메서드를 오버라이드 시킬 수 없다
//변수 앞에 final : 변수에 새로운 값을 대입 시킬 수 없다
abstract class Animal{
   String name;
   Animal(){
      name ="동물";
   }
   abstract void sound();//추상 메서드
   abstract void move();
   
   //final int number=1;
   final static int number=1;
   
}
class Lion extends Animal{
   Lion(){
      super();
      this.name = "사자";
   }

   @Override
   void sound() {
      System.out.println("어흥 !!!");
      
   }

   @Override
   void move() {
      System.out.println("달린다");
   }
}
class Rabbit extends Animal{
   Rabbit(){
      super();
      this.name = "토끼";
   }

   @Override
   void sound() {
      System.out.println("키득키득 !!!!");
   }

   @Override
   void move() {
      System.out.println("깡총깡총 !!!");
   }
   
}

public class Abstract1 {

   public static void main(String[] args) {
      //추상 클래스는 객체 생성ㅇ이 되지 않는다
      //상속 받은 하위 클래스에서 처리 내용을 구현해서 하위 클래스의 객체로 생성해서 사용해야 한다
      //Animal animal = new Animal();
      Lion lion = new Lion();
      System.out.println("이 동물은 :"+lion);
      System.out.println("이 동물은 :"+lion.name);
      lion.sound();
      lion.move();
      
      System.out.println("-----------------------------");
      Rabbit rabbit = new Rabbit();
      System.out.println("이 동물은 :"+rabbit);
      System.out.println("이 동물은 :"+rabbit.name);
      rabbit.sound();
      rabbit.move();
      System.out.println("-----------------------------");
      //System.out.println(rabbit.number);
      //rabbit.number = 2000;
      //System.out.println(rabbit.number);
      //System.out.println(Animal.number);
   }

}

package chapter23;
//상속, 생성자, getter/setter

//생성자(Constructor) : 객체 생성자에 반드시 자동으로 호출되는 특별한 함수
//1.기본 생성자 : 객체 생성시에 멤버 변수에 데이값을 직접 넣어줄 수 없는 형식
//2.일반 생성자 : 객체 생성시에 멤버 변수에 데이값을 직접 넣어줄 수 있는 형식

//this : 자신의 멤버에 접근
//this():자신의 생성자를 호출해서 멤버값 초기화
//super : 부모의 멤버에 접근 
//super():부모의 생성자를 호출해서 멤버 변수값 초기화
//상속 받은 클래스는 부모 클래스의 멤버 변수를 반드시 먼저 초기화시켜놓고 자신의 멤버 변수가 
class Car2{
   int wheel;
   int speed;
   String color;
   
   //기본 생성자
   Car2(){
      
   }
   //일반 생성자
   Car2(int wheel, int speed,String color){
      this.wheel = wheel;
      this.speed = speed;
      this.color = color;
   }
}
//상속
class SportsCar extends Car2{
   //Car2 클래스를 상속받은 SportsCar 클래스 생성
   int speedLimit;
   //일반 생성자
   /*
   SportsCar(int wheel, int speed,String color,int speedLimit){
      //super();
      super.wheel = wheel;
      super.speed = speed;
      super.color = color;
      this.speedLimit = speedLimit;
   }
   */
   SportsCar(int wheel, int speed,String color,int speedLimit){
      //제일 첫 줄에 부모의 생성자 중에서 호출해서 부모의 멤버 변수를 먼저 초기화해놓아야 한다
      //super(); //부모의 생성자 중에서 빌려와서(호출) 부모의 멤버 변수를 먼저 초기화시켜야 한다
      //Car2(int wheel, int speed,String color) 부모의 생성자 중에서 빌려롸서(호출) 부모의 멤버 변수를 먼저 초기화시켜야 한다
      //super(10,150,"Blue");
      //this.wheel = wheel;
      //this.speed = speed;
      //this.color = color;
      super(wheel,speed,color);
      this.speedLimit = speedLimit;
   }
}
public class superEx2 {

   public static void main(String[] args) {
      /*
      Car2 car = new Car2();//기본 생성자 호출해서 메메버 변수의 데이터값을 초기화
      System.out.println("바퀴수 ="+car.wheel);
      System.out.println("속도 ="+car.speed);
      System.out.println("색갈 ="+car.color);
      System.out.println("----------------------------------");
      //Car2(int wheel, int speed,String color) 일반 생성자 호출해서 메메버 변수의 데이터값을 초기화
      Car2 car1 = new Car2(5,100,"Black");
      System.out.println("바퀴수 ="+car1.wheel);
      System.out.println("속도 ="+car1.speed);
      System.out.println("색갈 ="+car1.color);
      System.out.println("----------------------------------");
      */
      //SportsCar(int wheel, int speed,String color,int speedLimit) 일반 생성자 호출
      SportsCar sportsCar = new SportsCar(4,80,"Red",250);
      System.out.println("바퀴수 ="+sportsCar.wheel);
      System.out.println("속도 ="+sportsCar.speed);
      System.out.println("색갈 ="+sportsCar.color);
      System.out.println("제한속도 ="+sportsCar.speedLimit);
      System.out.println("----------------------------------");
   }

}

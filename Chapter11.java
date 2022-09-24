package javastudy;
class Retrun{
   //반환값이 있고 매개변수는 없는는 경우
   String getName(){
      return "홍길동";//호출한 곳으로 반환값을 돌려준다.
   }
   //반환값이 있고 매개변수가 없는 경우
   int getAge() {
      return 30;//호출한 곳으로 반환값을 돌려준다.
   }
}



public class ReturnEx {

   public static void main(String[] args) {
      Retrun obj = new Retrun();
      String name=obj.getName();//호출도 하고 결과값도 가지고 있다
      int age = obj.getAge();
      System.out.println("name = "+name);
      System.out.println("age = "+age);
      
      System.out.println("name = "+obj.getName());
      System.out.println("age = "+obj.getAge());
   }

}

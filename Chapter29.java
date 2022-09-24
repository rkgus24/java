package chapter29;

interface Cellphone {
   //인터페이스 내에는 메서드의 원형(선언부)만 선언하다.(추상 메서드의 형태로 존재한다.)
   public abstract void photo();
   public abstract void calling();
   public abstract void memo();
   public abstract void clock();
}
//interface내의 메서드를 구현해 놓은 클래스 만들기
class MycellPhone implements Cellphone {
   @Override
   public void photo() {
      System.out.println("핸드폰은 사진을 찍을 수 있습니다");
   }

   @Override
   public void calling() {
      System.out.println("핸드폰은 전화를 걸 수 있습니다");
   }

   @Override
   public void memo() {
      System.out.println("핸드폰은 메모를 할 수 있습니다");
   }

   @Override
   public void clock() {
      System.out.println("핸드폰은 알람을 설정할 수 있습니다");
   }
}
class PhoneUser{
   //인터페이스형   = 구현 클래스
   Cellphone cp = new MycellPhone();
   public void inter() {
      cp.photo();
      cp.calling();
      cp.memo();
      cp.clock();
   }
}
public class Interface1 {

   public static void main(String[] args) {
      MycellPhone mp = new MycellPhone();
      mp.photo();
      mp.calling();
      mp.memo();
      mp.clock();
      System.out.println("-----------------------");
   }

}

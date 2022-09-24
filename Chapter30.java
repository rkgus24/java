package chpater30;

interface Camera{
   public abstract void photo();
}
interface Call{
   public abstract void calling();
}
interface Memo{
   public abstract void memo();
}
//인터페이스와 인터페이스는 상속이 가능하다(extends)
//인터페이스와 클래스는 상속이 되지 않는다(implements)
//클래스와 클래스 사이는 상속이 가능하다(다중 상속은 안된다 ->여러개의 클래스로 상속을 받을 수 없다)

interface Clock extends Camera,Call,Memo{
   public abstract void Clock();
}
//구현 클래스 (인터페이스의 메서드를 강제로 구현하는 클래스)
class mycellPhone implements Clock{

   @Override
   public void photo() {
      // TODO Auto-generated method stub
      System.out.println("핸드폰은 사진을 찍을 수 있습니다");
   }

   @Override
   public void calling() {
      // TODO Auto-generated method stub
      System.out.println("핸드폰은 전화를 걸 수 있습니다");
   }

   @Override
   public void memo() {
      // TODO Auto-generated method stub
      System.out.println("핸드폰은 메모를 할 수 있습니다");
   }

   @Override
   public void Clock() {
      // TODO Auto-generated method stub
      System.out.println("핸드폰은 알람을 설정할 수 있습니다");
   }
   
}

class phoneUser{
   Camera ca =new mycellPhone();
   Call ca1 =new mycellPhone();
   public void inter() {
      System.out.println("인터페이스 변수로 구현된 메서드를 호출합니다");
      ca.photo();
      ca1.calling();
   }
   //인터페이스의 다양성
   //Call인터페이스형으로 호출할 수 잇는 (오버라이드 되어 있는)메서드 call 내에서 호출해서 사용할 수 있다
   public void call(Call c) {
      System.out.println("핸드폰은 전화를 걸 수 있습니다");
   }
}



public class Interface2 {

   public static void main(String[] args) {
      mycellPhone phone = new mycellPhone();
      phone.photo();
      phone.calling();
      phone.memo();
      phone.Clock();
      System.out.println("-----------------------");
      //인터페이스로 구현 클래스의 오버라이드 시켜 놓은 메서드를 호출해서 사용
      //형식)인터페이스형 변수명 = new 구현 클래스명();
      Camera camera = new mycellPhone();
      camera.photo();
      System.out.println("-----------------------");
      Call call = new mycellPhone();
      call.calling();
      System.out.println("-----------------------");
      Memo memo = new mycellPhone();
      memo.memo();
      System.out.println("-----------------------");
      Clock clock = new mycellPhone();
      clock.photo();
      clock.calling();
      clock.memo();
      clock.Clock();
      System.out.println("-----------------------");
      phoneUser pu = new phoneUser();
      pu.inter();
      System.out.println("-----------------------");
      //인터페이스 다향성
      //public void call(Call c) 메서드 호출
      pu.call(콜);
      //pu.call(camera);
      //pu.call(memo);
      pu.call(call);
      pu.call(clock);
   }

}

package chpater33;

interface Fax{
   public static final String FAX_NUMBER = "02-1234-5678";//상수
   public abstract void send(String tel);//추상 메서드
   public abstract void receive(String tel);//추상 메서드
}


public class ComplexMain2 {

   public static void main(String[] args) {
      //익명 구현 객체 : 구현 클래스를 만들지 않고 한번만 수행하도록 하는 방법이다.
      //Fax fax = new Fax() //{오버라이드};
      //인터페이스명으로 객체 생성
      Fax fax = new Fax() {

         @Override
         public void send(String tel) {
            System.out.println(FAX_NUMBER+"에서"+tel+"로 FAX 전송");
         }

         @Override
         public void receive(String tel) {
            System.out.println(tel+"에서"+FAX_NUMBER+"로 FAX 전송");
         }
      };
      
      fax.send("1234");
      fax.receive("5678");
      
   }

}

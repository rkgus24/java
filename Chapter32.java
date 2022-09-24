package chapter32;

interface Printer{
   public static final int INK = 100;//상수
   public abstract void print();//추상 메서드
}
interface Scanner{
   public abstract void scan();//추상 메서드
}
interface Fax{
   public static final String FAX_NUMBER = "02-1234-5678";//상수
   public abstract void send(String tel);//추상 메서드
   public abstract void receive(String tel);//추상 메서드
}
//구현 클래스 설정
class Complxer implements Printer,Scanner,Fax{

   @Override
   public void send(String tel) {
      System.out.println(FAX_NUMBER+"에서"+tel+"로 FAX 전송");
   }

   @Override
   public void receive(String tel) {
      System.out.println(tel+"에서"+FAX_NUMBER+"로 FAX 전송");
   }

   @Override
   public void scan() {
      System.out.println("스캔 실행");
   }

   @Override
   public void print() {
      System.out.println("출력 실행");
   }
   
}




public class ComplewMain {

   public static void main(String[] args) {
      Complxer com = new Complxer();
      com.print();
      com.scan();
      com.send("02-8675-4321");
      com.receive("02-8675-4321");
      System.out.println("com.FAX_NUMBER = "+com.FAX_NUMBER);
      System.out.println("com.INK = "+com.INK);
      System.out.println("Complxer.FAX_NUMBER = "+Complxer.FAX_NUMBER);
      System.out.println("Complxer.INK = "+Complxer.INK);
      System.out.println(Fax.FAX_NUMBER);
      System.out.println(Printer.INK);
   }

}

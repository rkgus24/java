package chapter35;

public class ExceptionEx1 {

   public static void main(String[] args) {
      //try ~ catch ~ finally
      //예외 강제 발생(throw)
      //throw : 예외 강제 발생
      int num = 10;
      int num1 = 0;
      
      try {
      int result = num/num1;
      System.out.println("결과값 = "+result);
      if(num1==0) {
         //ArithmeticException e = new ArithmeticException();
         //throw e;
         throw new ArithmeticException("num1변수가 0입니다");
      }
      }catch(ArithmeticException e) {
         //System.out.println("0으로 나눌 수 없습니다");
         System.out.println(e.toString());
         //System.out.println(e.getMessage());
         //e.printStackTrace();
      }finally {
         System.out.println("예외가 발생하지 않아도 무조건 수행해야 한다");
      }
      System.out.println("---------------------------");
      System.out.println("main() 함수 수행 끝");
   }

}

package chapter36;

public class ExceptionEx2 {
   //throw키워드 : 강제(임의)로 예외 발생 
   //함수내에서 예외처리 ->throw
   /*
   public static int divide(int num,int num1) {
      
      if(num1==0) {
         //ArithmeticException e = new ArithmeticException();
         //throw e;
         throw new ArithmeticException("num1변수가 0입니다");
      }
      
      int d = num/num1;
      return d;//호출한 곳으로 d변수의 값을 돌려준다
   }
   */
   public static void divide(int num, int num1) {
      try {
         int  result = num/num1;
         System.out.println("결과값 = "+result);
      
      if(num1==0) {
         //ArithmeticException e = new ArithmeticException();
         //throw e;
         throw new ArithmeticException("num1변수가 0입니다");
         
         }
      }
      catch(ArithmeticException e){
         System.out.println("0으로 나눌 수 없습니다.");
         System.out.println(e.toString());
      }
      
      
   }
   
   public static void main(String[] args) {
      /*
      int num = 10;
      int num1 =0;
      try {
      int result = divide(num,num1);//함수내에서 돌려준 반환값을 받아서 가지고 있다
      System.out.println("결과값 = "+result);
      }catch(ArithmeticException e){
         System.out.println("0으로 나눌 수 없습니다.");
      }finally {
         System.out.println("예외가 발생하지 않아도 무조건 수행해야 한다");
      }
      System.out.println("---------------------------");
      System.out.println("main() 함수 수행 끝");
      */
      int num = 10;
      int num1 =0;
      divide(num,num1);
      System.out.println("---------------------------");
      System.out.println("main() 함수 수행 끝");
   }

}

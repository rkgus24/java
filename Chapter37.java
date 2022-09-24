package chapter37;

public class ExceptionEx3 {
   //throws 키워드 : 떠넘기다
   //현재 메서드가 예외처리를 하지 않고 자신을 호출한 쪽으로 에외처리를 떠넘긴다
   public static int divide(int num,int num1) throws ArithmeticException {
      int d = num/num1;
      return d;
   }
   public static void main(String[] args) {
      int num =10;
      int num1 = 0;
      try {
      //throws로 넘겨받은 메서드내의 예외처리를 함수를 호출한 이곳으로 catch 블록으로 처리한다
      int result = divide(num,num1);
      System.out.println("divide(num,num1)함수 수행 결과값 = "+result);
      }catch(ArithmeticException e) {
         System.out.println(e.toString());
      }finally {
         System.out.println("예외가 발생하지 않아도 무조건 수행해야 한다");
      }
      System.out.println("---------------------------");
      System.out.println("main() 함수 수행 끝");
   }

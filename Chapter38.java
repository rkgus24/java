package chapter38;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionEx4 {

   public static void main(String[] args) {
      // 3개의 정수를 입력받아 합계를 구하는 프로그램을 작성
      //1.정수값이 아닌 다른 자료형이 입력될 경우 예외처리
      //2.0으로 나누는 경우의 예외처리
      Scanner su = new Scanner(System.in);
      System.out.println("2개의 정수를 입력받아 사칙 연산을 수행하는 예외처리를 작성합니다");
      while(true) {
      try {
      System.out.println("num 변수 정수 입력>>>>");
      int num1 = su.nextInt();
      System.out.println("num1 변수 정수 입력>>>");
      int num2 = su.nextInt();
      System.out.println("어떤 계산을 원하시나요?");
      char num4 = su.next().charAt(0);
      if(num4=='+') {
         System.out.println("num1 + num2 = "+(num1+num2));
      }
      else if(num4=='-') {
         System.out.println("num1 - num2 = "+(num1-num2));
      }
      else if(num4=='*') {
         System.out.println("num1 * num2 = "+(num1*num2));
      }
      else if(num4=='/') {
         System.out.println("num1 / num2 = "+(num1/num2));
      }
      else if(num4=='%') {
         System.out.println("num1 % num2 = "+(num1%num2));
      }
      else {
         System.out.println("잘못된 입력을 하셨습니다");
      }
      }catch(ArithmeticException e) {
         System.out.println("0으로 나눌 수 없습니다.!!!! 다시 입력해 주세요");
         System.out.println(e.toString());
      }catch(InputMismatchException e) {
         System.out.println("정수가 아닙니다.!!! 다시 입력해 주세요");
         System.out.println(su.next()+" 는 무시했습니다");
      }catch(Exception e) {
         System.out.println("마지막 예외처리 입니다");
      }finally {
         System.out.println("더 수행하려면 1,종료하려면 0을 입력하세요");
         int num3 = su.nextInt();
         if(num3==0) {
            System.out.println("종료");
            break;
         }
      }
       }
   }
}
​

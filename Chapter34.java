package chapter34;

public class ExceptionEx {

   public static void main(String[] args) {
      //1.0으로 나누게 되면 예외가 발생한다!! ->예외발생됨 (프로그램 수행이 중지된다)
      /*
      System.out.println(1);
      System.out.println(2);
      System.out.println(3/0);//0으로 나누게 되면 예외가 발생한다!!
      System.out.println(4);
      System.out.println(5);
      System.out.println(6);
      */
      //2.예외처리를 해서 프로스램 수행이 중지되지 않도록 만들어야 한다
      /*
      System.out.println(1);
      
      try{
         System.out.println(2);
         System.out.println(3);//0으로 나누게 되면 예외가 발생한다!!
         System.out.println(4);
      }catch(ArithmeticException e) {
         System.out.println(5);
      }
      System.out.println(6);
      */
      //3.다중 예외 처리 
      try{
         int[] arr = {1,2,3};
         System.out.println(arr[5]);
         System.out.println(3/0);
         Integer.parseInt("a");
      }catch (ArithmeticException e) {
         System.out.println("0으로 나눌 수 없음");
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("인덱스 범위 초과");
      }
      catch (NumberFormatException e) {
         System.out.println("문자를 숫자로 변경할 수 없음");
      }catch(Exception e) {
         System.out.println("기타 예외 발생");
      }finally {
         System.out.println("예외와 상관없이 항상 수행되는 블록임1");
      }
      //ArrayIndexOutOfBoundsException
      //ArithmeticException
      //NumberFormatException
      
   }

}

package chapter39;

class AgeException extends Exception{
   //기본생성자 
   AgeException(){ }
   
   //일반생성자
   AgeException(String message){
      super(message);
   }
   
   
}


public class ExceptionEx {
   
   public static void ticketing(int age) throws AgeException{
      if(age<0) {
         //AgeException 클래스 객체 생성
         AgeException e = new AgeException("나이 입력이 잘못되었습니다.!!!");
         throw e;
         //throw new AgeException("나이 입력이 잘못되었습니다.!!!");
      }
   }

   public static void main(String[] args) {
      int age = -10;
      //ticketing(int age) 함수 호출 :throws로 떠넘긴 예외 처리 : 여기레에서 catch : 여기에 catch 처리 해주기
      try{
         ticketing (age);
         
      }catch(AgeException e) {
         //System.out.println(e.getMessage());
         e.printStackTrace();
      }
      
      
   }

}

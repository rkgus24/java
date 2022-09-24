package chapter47;

import java.util.Calendar;
import java.util.Date;

public class DateEx {

   public static void main(String[] args) {
      //Date 클래스로 날짜 객체 생성
      Date now = new Date();
      
      System.out.println(now);
      System.out.println("--------------------------");
      //calendar 클래스로 날짜 정보 생성
      Calendar ctime = Calendar.getInstance();
      System.out.println(ctime);
      System.out.println("--------------------------");
   }

}

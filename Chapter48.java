package chpater48;

import java.text.DecimalFormat;

public class CalendarEx {

   public static void main(String[] args) {
      
      
      //Calendar 클래스는 추상 클래스, 싱글톤 패턴 클래스
      //Calendar ctime = new Calendar();
      /*
      Calendar ctime = Calendar.getInstance();
      System.out.println(ctime);
      System.out.println("-------------------------");
      
      //get() 메서드러 멤버 변수의 값을 가져와서 날짜 형식으로 출력
      int year = ctime.get(Calendar.YEAR);
      int month = ctime.get(Calendar.MONTH);
      int day1 = ctime.get(Calendar.DATE);
      System.out.println(year+" 년 "+month+" 월 "+day1+" 일 ");
      System.out.println("-------------------------");
      //요일을 표시 : 숫자값을으로 변환 -> 일요일(1부터 시작)
      System.out.println("오늘은 무슨 요일 인가요?");
      System.out.println(ctime.get(Calendar.DAY_OF_WEEK));
      System.out.println("-------------------------");
      //
      System.out.println("이번 년도에서 오늘이 몇번째 날인가요?");
      System.out.println(ctime.get(Calendar.DAY_OF_YEAR)+"일째");
      System.out.println("-------------------------");
      //
      System.out.println("이번 달은 며칠까지 있나요?");
      System.out.println(ctime.getActualMaximum(Calendar.DATE));
      System.out.println(ctime.getActualMinimum(Calendar.DATE));
      System.out.println("-------------------------");
      //새로운 날짜 설정 (날자 수정하기)
      //2022년 12월 25일
      //ctime.set(2022, 11, 25);//월은 0월부터 시작한다
      ctime.set(2022, Calendar.DECEMBER, 25);
      int year2 = ctime.get(Calendar.YEAR);
      int month2 = ctime.get(Calendar.MONTH)+1;
      int day2 = ctime.get(Calendar.DATE);
      System.out.println(year2+" 년 "+month2+" 월 "+day2+" 일 ");
      System.out.println("-------------------------");
      //get() 메서드로 멤버 변수의 값을 가져와서 시간 형식으로 출력
      int hour = ctime.get(Calendar.HOUR);
      int minute = ctime.get(Calendar.MINUTE);
      int second = ctime.get(Calendar.SECOND);
      System.out.println(hour+" 시 "+minute+" 분 "+second+" 초 ");
      System.out.println("-------------------------");
      System.out.println("-----------------------------------");
      */
      /*
      System.out.println("------Date 클래스와 Calendar 클래스 형변환-----");
      //Date 클래스로 날짜 시간 객체 생성
      Date day = new Date();
      System.out.println(day);
      System.out.println("-------------------------");
      long a = System.currentTimeMillis();
      System.out.println("운영체제에서 가져온 시간 정보"+a);
      System.out.println("-------------------------");
      //Calendar을 섴선택하고 ctrl + shift + o를 쓰면 자동 완성이 됨
      Calendar ctime = Calendar.getInstance();
      System.out.println(ctime);
      System.out.println("-------------------------");
      ctime.setTime(day);
      int year3 = ctime.get(Calendar.YEAR);
      int month3 = ctime.get(Calendar.MONTH)+1;
      int day3 = ctime.get(Calendar.DATE);
      System.out.println(year3+" 년 "+month3+" 월 "+day3+" 일 ");
      System.out.println("-------------------------");
      */
      /*
      //Date 클래스로 날짜 시간 객체 생성
      Date day = new Date();
      System.out.println(day);
      System.out.println("-------------------------");
      System.out.println("--- SimpleDateFormat 클래스---");
      //날짜 표시 형식 만들기
      String pattenKorea = "yyyy-MM-dd";
      String pattenUSA = "MM-dd-yyyy";
      SimpleDateFormat p1 = new SimpleDateFormat(pattenKorea);
      SimpleDateFormat p2 = new SimpleDateFormat(pattenUSA);
      System.out.println("한국 형식(년-월-일) : "+p1.format(day));
      
      System.out.println("한국 형식(년-월-일) : "+p2.format(day));
      System.out.println("-------------------------");
      SimpleDateFormat p3 = new SimpleDateFormat("E요일 HH시 mm분 ss초");
      System.out.println("요일과 시간 표시 : "+p3.format(day));
      */
      System.out.println("--- DecimalFormat 클래스---");
      //숫자 표시 형식 만들기
      
      //정수 표시 형식
      int a = 123456789;
      DecimalFormat idf = new DecimalFormat("#,###");
      System.out.println("정수 3자리마다 콤마 붙이기 : "+idf.format(a));
      System.out.println("-------------------------");
      //실수형 표시 형식
      double num = 21.92645;
      DecimalFormat ddf = new DecimalFormat("#.##");
      System.out.println("소수 둘째 자리까지 표시(반올림) : "+ddf.format(num));
      System.out.println("-------------------------");
      
      num = 21.9;
      ddf = new DecimalFormat("#.00");
      System.out.println("소수 둘째 자리까지 표시(유효하지 않은 0을 표시해야 하는 경우) : "+ddf.format(num));
      System.out.println("-------------------------");
      
      //백분율 : 100% ->숫자로 환산 (1)
      //백분율 : 10% ->숫자로 환산 (0.1)
      num = 0.1;
      ddf = new DecimalFormat("#.#%");
      System.out.println("백분율 환산해서 표시 : "+ddf.format(num));
      System.out.println("-------------------------");
      
   }

}

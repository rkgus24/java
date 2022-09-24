package chapter45;

import java.util.Random;
import java.util.Scanner;

public class Random1 {

   public static void main(String[] args) {
      /*
      //임의의 수,난수 발생
      //1.math클래스 사용 :random()메서드
      //0.0~1.0 미만의 실수 형태로 난수를 발생시킨다
      System.out.println(Math.random());
      System.out.println("----------------------------");
      //1~5사이의 정수값을 무작위로 발생시키기
      System.out.println((int)(Math.random()*5+1));
      System.out.println("----------------------------");
      //1~45 사이의 정수값 6개를 무작위로 발생시키기
      for(int i=1;i<=6;i++) {//약간의 코드 수정 실행의 문제는 없다
         System.out.print((int)(Math.random()*45+1)+"\n");
      }
      System.out.println("----------------------------");
      //1~45 사이의 정수값 6개를 무작위로 발생시키기
      //2.Random 클래스 사용
      Random random = new Random();
      for(int i=1;i<=6;i++) {//약간의 코드 수정 실행의 문제는 없다
         System.out.print((random.nextInt(45)+1)+"\n");
      }
      System.out.println("----------------------------");
      //1~45 사이의 정수값 6개를 무작위로 발생시키기
      //객체 생성할 때 샹성자의 매게변수값을 지정해서 생성(정해져 있는 2번 페턴으로 생성)
      Random random1 = new Random();
      for(int i=1;i<=6;i++) {//약간의 코드 수정 실행의 문제는 없다
         System.out.print((random.nextInt(45)+1)+"\n");
      }
      //운영체재의 시간값을 가져온다
      //1970년 1월1일 ~ 현재까지의 밀리초(1/1000)단위로 누적시켜서 표시
      long speed = System.currentTimeMillis();
      System.out.println("운영체제의 시간 표시 : "+speed);
      System.out.println("----------------------------");
      for(int i=1;i<=6;i++) {//약간의 코드 수정 실행의 문제는 없다
         System.out.print((random.nextInt(45)+1)+"\n");
      }
      System.out.println("----------------------------");
      */
      //컴퓨터가 제시하는 월을 맞추는 프로그램 작성
      Random rand = new Random();
      Scanner sc = new Scanner(System.in);
      
      String [] monthString = {"1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"};
      //배열의 길이(갯수)
      System.out.println("배열의 개수 : "+monthString.length);
      System.out.println("----------------------------");
      for(int i=0;i<monthString.length;i++) {
         System.out.print("monthString["+i+"] = ");
         System.out.println(monthString[i]);
      }
      System.out.println("----------------------------");
      //
      int month = rand.nextInt(12);//0~11까지 monthString배열의 인덱스 번호로 적용
      System.out.print("컴퓨터가 발생시킨 임의의 수 month 변수 출력 : ");
      System.out.println(month);
      System.out.println("----------------------------");
      
      
      System.out.print("문제 : "+monthString[month]);
      while(true) {
         System.out.println("월을 입력하세요 >>>");
         int m = sc.nextInt();
         if(m == month+1) break;
         System.out.println("다른월입니다. 새로운 월을 입력하세요");
      }
      System.out.println("정답입니다");  
   }

}

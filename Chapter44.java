package chapter44;

import java.util.Scanner;
import java.util.StringTokenizer;
public class String3 {

   public static void main(String[] args) {
      /*
      System.out.println("=======StringTokenizer 클래스===");
      String query = "https://www.google.co.kr/webhp?tab=rw";//내용 바꿈
      StringTokenizer st = new StringTokenizer(query, "/.");
      //구분자로 분리된 토큰 개수
      int n = st.countTokens();
      System.out.println("토큰 개수 : "+n);
      System.out.println("----------------------------------");
      //구분자로 분리해 놓은 토큰 하나씩 읽어오기
      while (st.hasMoreTokens()) {
         String token = st.nextToken();//분리된 토큰 얻어오기
         System.out.println(token);//읽어온 토큰을 저장한 변수 token 출력
      }
      System.out.println("----------------------------------");
      */
      //Scanner 클래스
      Scanner sc = new Scanner(System.in);
      
      //+로 연결된 덧셈식을 입력받아 덧셈 결과를 출력하는 프로그램을 작성
      //StringTokenizer 클래스와 Integr클래스의 parsenInt(),String 클래스의 trim()을 이용
      //3+10+15+20  합계 : 48
      System.out.println("문자열을 입력하세요!!!");
      String s1 = sc.nextLine();//공백을 포함해서 enter 앞까지 모든 문자열을 반환한다
      //StringTokenizer st = new StringTokenizer(s1, "+");
      StringTokenizer st = new StringTokenizer(s1, " ");
      int sum = 0;
      int m = st.countTokens();
      System.out.println("토큰 개수 : "+m);
      System.out.println("-------------------------------");
      while(st.hasMoreTokens()) {
         String n = st.nextToken();//잘라놓은 토큰 하나씩 가져오기
         String s = n.trim();//앞뒤에 공백 제거
         sum += Integer.parseInt(s);//문자열을 정수 숫자로 만들어라(약간의 코드 변경 실해의 문제는 없음)
      }
      System.out.println("합계 : "+sum);//정수 숫자로 변경된 토큰을 모두 더한값 출력
      
   }

}

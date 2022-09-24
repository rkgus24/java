package chapter43;

import java.util.StringTokenizer;

public class String3Ex {

   public static void main(String[] args) {
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
   }

}
​

package chapter42;

public class String2Ex {

   public static void main(String[] args) {
      //StringBuffer 클래스
      StringBuffer sb = new StringBuffer("This");
      System.out.println(sb);
      System.out.println("---------------------------");
      //기존의 문자열 뒤에 추가
      sb.append(" is notebook");
      System.out.println(sb);
      System.out.println("---------------------------");
      //7번째 위치에 문자열 삽입
      sb.insert(7, " my");
      System.out.println(sb);
      System.out.println("---------------------------");
      //8~10번째 문자열 공간에 새로운 문자열로 바꾸기
      sb.replace(8, 10, "your");
      System.out.println(sb);
      System.out.println("---------------------------");
      //0번째 문자 삭제
      sb.deleteCharAt(0);
      System.out.println(sb);
      System.out.println("---------------------------");
      //0번째 부터 4개의 문자 삭제 -> 인덱스 번호는 0으로 시작하고 개수는 1부터 시작한다
      sb.delete(0, 4);
      System.out.println(sb);
      System.out.println("---------------------------");
   }

}

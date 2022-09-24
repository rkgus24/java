package chapter53;

import java.util.ArrayList;
import java.util.Scanner;

class Member1{
   String id,password;
   //기본 생성자
   Member1(){}
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
   
}



public class ArrayListEx1 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //제네릭 설정 : Member1 클래스의 객체만 돌아온다
      ArrayList<Member1> join = new ArrayList<Member1>();
      Member1 member = new Member1();//Member1클래스의 객체 생성
      String memberid, memberpassword, memberpassword2;
      join.add(member);//member 객체 넣기
      System.out.println("1.회원가입");
      System.out.println("아이디를 입력하세요");
      memberid = sc.next();
      //public void setId(String id) 함수 호출
      member.setId(memberid);
      System.out.println("비밀번호를 입력하세요");
      memberpassword = sc.next();
      //public void setPassword(String password)함수 호출
      member.setPassword(memberpassword);
      //setter / getter 함수로 대입한 join.add(member)로 넣어준 객체 데이터 갓 확인
      System.out.println(join.get(0).getId());
      System.out.println(join.get(0).getPassword());
      System.out.println("---------------------------------");
   }

}

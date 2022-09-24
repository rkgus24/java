package chapter49;

import java.util.ArrayList;
import java.util.Iterator;

public class pp {

   public static void main(String[] args) {
      ArrayList alist = new ArrayList();
      //데어터 넣기 (객체형만 기능 -> 기본형은 넣을 수 없다)
      //alist.add(new String("사과"));
      alist.add("사과");//객체형으로 만들어서 넣어준다
      alist.add("배");
      alist.add("오렌지");
      alist.add("바나나");
      alist.add("멜론");
      System.out.println("초기 상태 : "+alist);
      System.out.println("------------------------");
      //읽어 오기 : alist[0]
      System.out.println(alist.get(0));
      System.out.println(alist.get(1));
      System.out.println(alist.get(2));
      System.out.println(alist.get(3));
      System.out.println(alist.get(4));
      System.out.println("------------------------");
      //새로운 요소 (객체)만들기 
      alist.add("키위");//마지막 위치에 추가
      alist.add(1,"딸기");//1번째 위치에 추가
      System.out.println("새로운 여소 추가 : ");
      System.out.println(alist);
      System.out.println("------------------------");
      //지정된 요소(객체) 삭제
      alist.remove(0);
      System.out.println("0번재 위치 객체 삭제 : ");
      System.out.println(alist);
      System.out.println("------------------------");
      //객체의 전체 개수, 크기, 길이 구하기
      System.out.println("객체의 전체 요소의 개수 : ");
      System.out.println(alist.size());
      System.out.println("------------------------");
      //요소값 수정
      alist.set(0, "사과");
      System.out.println("객체의 전체 요소의 개수 : ");
      System.out.println(alist);
      System.out.println("------------------------");
      //요소값 모두 출력
      for(int i= 0;i<alist.size();i++) {
         System.out.println(alist.get(i));
      }
      System.out.println("------------------------");
      //반복자(Iterator)
      Iterator iter = alist.iterator();
      while(iter.hasNext()) {
         System.out.println(iter.next());
      }
      
   }

}

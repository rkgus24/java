package chapter52;

import java.util.ArrayList;

public class GenericEx {

   public static void main(String[] args) {
      
      //** 제네릭(Generic) : 컬랙션 프레임워크 종류 (list, set, map .....)로 생성된 객체 제외
      //들어올 데이터 타입을 외부에서 지정하는 방법이다.(지정된 데이터 타입이외에는 들어오지 못하게 한다)
      //ArrayList alist = new ArrayList(); // 모든 지료형의 데이터값(객체)이 들어 올 수 있다
      //ArrayList<E> alist = new ArrayList<E>();
      ArrayList<String> alist = new ArrayList<String>();
      //ArrayList<Integer> alist = new ArrayList<Integer>();
      //alist.add(new String("사과"));
      alist.add("사과");//객체형으로 만들어서 넣어준다
      alist.add("배");
      alist.add("오렌지");
      alist.add("바나나");
      alist.add("멜론");
      //alist.add(100);//요소의 자료형이 String형이 아니기 때문에 객체에 넣울 수 없다
      //alist.add(true);
      System.out.println("초기 상태 : "+alist);
      System.out.println("------------------------");
   }

}

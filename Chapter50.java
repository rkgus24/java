package chapter50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

   public static void main(String[] args) {
      /*
      //Set(집합) : 중복을 허용하지 않는다. 순서가 없다
      //HashSet 객체 생성
      HashSet hs = new HashSet();
      //hs.add(new String("one"));
      hs.add("one");
      hs.add("two");
      hs.add("three");
      hs.add("four");
      hs.add("five");
      //TreeSet 객체 생성 : 정렬을 해서 저장한다
      TreeSet ts = new TreeSet();
      ts.add("one");
      ts.add("two");
      ts.add("three");
      ts.add("four");
      ts.add("five");
      //반복자(Iterator)
      Iterator iter = hs.iterator();
      while(iter.hasNext()) {
         System.out.println(iter.next());
      }
      System.out.println("--------------------------------");
      //반복자(Iterator)
      Iterator iter1 = hs.iterator();
      while(iter1.hasNext()) {
         System.out.println(iter1.next());
      }
      */
      //Object타입의 배열 생ㅇ성
      Object[] arr = {"홍길동","이순신","홍길동","이순신",1,2,1,2,"1","2"};
      //HashSet set = new HashSet();
      Set set = new HashSet();
      for(int i =0;i<arr.length;i++) {
         set.add(arr[i]);
      }
      System.out.println("--------------------------------");
      Iterator iter2 = set.iterator();
      while(iter2.hasNext()) {
         System.out.println(iter2.next());
      }
      System.out.println("--------------------------------");
      //출력
      System.out.println(set);
   }

}

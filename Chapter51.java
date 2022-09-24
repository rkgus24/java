package chapter51;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

   public static void main(String[] args) {
      /*
      //HashMap 객체 생성 : key : values -> <k,V>
      HashMap hm = new HashMap();
      
      Scanner sc = new Scanner(System.in);
      hm.put("apple", "사과");
      hm.put("paper", "종이");
      hm.put("flower", "꽃");
      hm.put("happy", "행복");
      while (true) {
         System.out.println("알고 싶은 단어룰 입력하세요");
         String voca = sc.nextLine();
         if(voca.equals("quit")) {
            System.out.println("프로그램 종료합니다");
            break;
         }
         if(hm.containsKey(voca)) {
            System.out.println("해당하는 뜻은"+hm.get(voca));//key로 일치하는 것을 찾아야 한다
         }else {
            System.out.println("다시 입력해 주세요!!!");
         }
      }
      */
      
      //Map 객체 생성
      Map map = new HashMap();
       String[] names = {"홍길동","김유신","이순신","강감찬","김유신"};
      //숫자가 담긴 정수 배열 생성
       int[] nums = {1234,4567,2350,9870,2345};
      //Map 객체에 두 배열의 값들을 key와 value 쌍으로 저장
       for(int i= 0;i<names.length;i++) {
          map.put(names[i],nums[i]);
       }
       System.out.println("홍길동 번호 : "+map.get("홍길동"));
       System.out.println("김유신 번호 : "+map.get("김유신"));
       System.out.println("이순신 번호 : "+map.get("이순신"));
       System.out.println("-------------------------------------");
       System.out.println(map);
   }

}

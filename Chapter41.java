package chapter41;

public class String1Ex {

   public static void main(String[] args) {
      /*
      //문자열(String)
      int a =10;
      String name = "StringAPI";
      String name1 = "StringAPI";
      String name2 = new String("StringAI");
      System.out.println(name);
      System.out.println(name.toString());
      System.out.println(name.hashCode());
      System.out.println("---------------------------");
      //문자열 비교
      //== 연산자 : 문장열이 만들어서 저장되는 주소가 같은지 비교한다
      System.out.println("name == name1 = "+(name == name1));
      System.out.println("name == name2 = "+(name == name2));
      System.out.println("---------------------------");
      //equals() 메서드 : 문자열이 만들어져서 저장되어 있는 내용만 가지고 비교한다
      System.out.println("name.equals(name) = "+(name.equals(name)));
      System.out.println("name.equals(name1) = "+(name.equals(name1)));
      System.out.println("name.equals(name2) = "+(name.equals(name2)));
      System.out.println("---------------------------");
      */
      
      //String 클래스의 메서드를 이용해서 문자열 다루기
      String a =new String("java ");
      String b = new String (",Programming");
      System.out.println("a = "+ a);
      System.out.println("b = "+ b);
      System.out.println("---------------------------");
      //문자열의 길이(문자 개수)
      System.out.println(a+"문자개수 : "+a.length());
      System.out.println("---------------------------");
      //문자열의 포함 관계
      System.out.println(a+" 문자열포함관계 : "+a.contains("a"));
      System.out.println("---------------------------");
      //문자열 연결
      a.concat(b);
      System.out.println(" 문자열 연결 : "+a);
      System.out.println(a+"문자개수 : "+a.length());
      System.out.println("---------------------------");
      //문자열 앞 뒤에 공백 제거
      a = a.trim();
      System.out.println(" 문자열 앞 뒤에 공백 제거 : "+a);
      System.out.println(a+"문자개수 : "+a.length());
      System.out.println("---------------------------");
      //문자열 변경
      a = a.replace(a, "Have a good time");
      System.out.println(" 문자열 변경 : "+a);
      System.out.println(a+"문자개수 : "+a.length());
      System.out.println("---------------------------");
      //어떤 자료형이라든지 모두 문자열로 변환
      String str1  = String.valueOf(100);
      System.out.println("정수를 문자열로 변환 : "+a);


      System.out.println("=========String.format()=======");
      String str2 =new String("Have a good time");
      System.out.println("str2 = "+str2);
      System.out.println("---------------------------");
      //문자열 표시 형식 설정 ->%s
      String str3 = String.format("%30s", str2);
      System.out.println("str3 = "+str3);
      System.out.println("---------------------------");
      //숫자 표시 형식 설정 : 정수 3자리마다 콤마로 표시 (1,100,000) ->%d
      int number = 123456789;
      String str4 = String.format("%
   }

}
​

package javastudy;
import java.util.Arrays;
public class test4 {

   public static void main(String[] args) {
      //배열의 복사
      /*
      //원본 배열
      int arrInt[] = {1,2,3};
      
      //복사할 배열
      int arrInt2[] = new int[5];
      
      //
      System.out.println("arrInt[] = "+Arrays.toString(arrInt));
      System.out.println("arrInt2[] = "+Arrays.toString(arrInt2));
      System.out.println("-----------------------------");
      for(int i=0;i<arrInt.length;i++) {
         arrInt2[i] = arrInt[i];//배열의 복사
         
         System.out.print("arrInt2["+i+"] = ");
         System.out.println(arrInt2[i]);
         
      }
      System.out.println("arrInt2[] = "+Arrays.toString(arrInt2));
      */
      // 배열의 복사
      int a[]= {10,20,30,40,50,60};//원본 배열
      int b[] = {0,0,0,0,0,0};
      //int b[] = new int[6];
      /*
      System.out.println("a[] = "+Arrays.toString(a));
      System.out.println("b[] = "+Arrays.toString(b));
      System.out.println("-----------------------------");
      //앝은복사(주소만 복사 : 2개의 배열의 요소값을 공유해서 사용하게 된다)
      b =a;//a배열의 주소를 b배열에 대입(주소 복사 : 같은 곳을 가리킨다)
      System.out.println("a[] = "+a);
      System.out.println("b[] = "+b);
      System.out.println("-----------------------------");
      
      System.out.println("a[] = "+Arrays.toString(a));
      System.out.println("b[] = "+Arrays.toString(b));
      System.out.println("-----------------------------");
      
      a[0] = 100;
      b[2] = 500;
      System.out.println("a[] = "+Arrays.toString(a));
      System.out.println("b[] = "+Arrays.toString(b));
      System.out.println("-----------------------------");
      */
      //깊은 복사  :배열 요소 하나 하나씩 복사
      //1.배열의 처음부터 원하는 길이까지 복사
      //형식) Arrays.copyOf(원본 배열,복사할 길이)
      //int c[] = Arrays.copyOf(a,6);
      //System.out.println("a[] = "+Arrays.toString(a));
      //System.out.println("c[] = "+Arrays.toString(c));
      //System.out.println("-----------------------------");
      //2.원본 배열의 시작 요소를 기준으로 지정한 위치만큼 대상 배열에 복사
      //형식) Arrays.copyOf(원본 배열,복사할 시작 인덱스,복사할 끝 인덱스 (-1개))
      /*
      int d[] = Arrays.copyOfRange(a,1,3);
      System.out.println("a[] = "+Arrays.toString(a));
      System.out.println("d[] = "+Arrays.toString(d));
      System.out.println("-----------------------------");

      int f[]= {10,20,30,40,50,60};
      int g[]=new int[10];
      System.out.println("f[] = "+Arrays.toString(f));
      System.out.println("g[] = "+Arrays.toString(g));
      System.out.println("-----------------------------");
      //3.System.arraycopy(원본 배열명, 시작 위치,대상 배열명,복사될 위치,복사할 길이(개수))
      //->배열의 일부분만 복사하는 형식으로 사용
      System.arraycopy(f,0,g,2,3);
      System.out.println("f[] = "+Arrays.toString(f));
      System.out.println("g[] = "+Arrays.toString(g));
      System.out.println("-----------------------------");
      */
      //향상된 for문
      //for _ each문 (배열 전용 출력 for문)
      //형식>>for(배열 요소값을 저장할 변수 : 배열명){반복내용}
      String aa[]= {"java","Hello","Programming"};
      System.out.println("aa[] = "+Arrays.toString(aa));
      for (String i :aa) {
         System.out.println(i);
      }
      System.out.println("-----------------------------");
      int bb[]= {100,200,300,400,500};
      for (int k :bb) {
         System.out.println(k);
      }
      System.out.println("-----------------------------");
      String[] names = {"홍길동","이순신","김유신"};
      int [] scores = {90,80,100};
      int i=0;//초기화 변수
      for(String name: names) {
         System.out.println(name+":"+scores[i]);
         i++;
      }
      //2차원 배열
      String [][] str = {
            {"java","Hello","Programming"},//0행
            {"사과","배","바나나","체리","딸기","포도"}//1행
      };
      for(String[] x : str) {
         for(String y : x) {
            System.out.println(y);
         }
      }
      
      
   }

}

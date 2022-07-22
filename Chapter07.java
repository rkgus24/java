package javastudy;

import java.util.Scanner;

public class Chapter07 {

	public static void main(String[] args) {
		//while : 반복 횟수를 모르거나 무한 반복시켜야 하는 경우에 사용
		//1. 초기화 변수 : 반복을 시작하는 값을 저장해 놓은 변수
		//2. 조건식 : 반복 횟수를 정한다 (조건이 만족할 때 까지 반복 수행한다 -> 조건이 만족하면 계속 반복해서 수행한다)
		//3. 증감연산자 : 반복 횟수가 순차적으로 늘어나거나 줄어들어야 하기 때문에
		
		int i = 1; //초기화 변수 (초기값을 넣어 놓고 시작)
	
		while(i <= 5) { //조건식 : 반복 횟수
			System.out.println("Hello");
			i++; //i += 1 증감연산자
		}
		
		//1 ~ 100까지의 합계를 구하시오
		int j = 1; //초기화 변수 (초기값을 넣어 놓고 시작)
		int sum = 0;
		while (j <= 100) { //조건식 : 반복 횟수
			sum += j;
			j++; //증감연산자
		}
		System.out.println("1 ~ 100까지의 합 = " + sum);
		
		//do ~ while문 : 조건이 맞지 않아도 반드시 한 번은 수행을 해야한다
		int k = 105; //초기화 변수 (초기값을 넣어 놓고 시작)
		int value = 0;
		do{ //조건식 : 반복 횟수
			value += k;
			k++; //k += 1 증감연산자
		}while (k <= 100);
		//    105 <= 100
		//105가 들어온 것만 수행을 하게 된다
		//값이 들어오면 꼭 한 번은 수행을 한다 
		//그 후에 조건을 살펴보고 수행을 할 건지 안 할 것인지 판단을 하게 된다
		System.out.println("sum변수 = " + sum);
		
		//문자열
		int a = 10;
		
		//문자열 비교
		//비교연산자 : 같다 (==), 
		//String class에서 제공 : 같다 (변수명.equals(비교할 기준 값)) : 내용만 같으면 된다
		
		String s1 = "Hello Java";
		String s2 = "Hello Java"; 
		String s3 = "H";
		String s4 = new String("Hello Java"); //내용은 같지만 생성하는 메모리 공간이 다르기 때문에 s1과 같지 않다
		
		System.out.println("s1 == s1 : " + (s1 == s1)); //true
		System.out.println("s1 == s2 : " + (s1 == s2)); //true
		System.out.println("s1 == s3 : " + (s1 == s3)); //false
		System.out.println("s1 == s4 : " + (s1 == s4)); //false
		System.out.println("---------------------");
		
		System.out.println("s1.equals(s1) = " + s1.equals(s1)); //true
		System.out.println("s1.equals(s2) = " + s1.equals(s2)); //true
		System.out.println("s1.equals(s3) = " + s1.equals(s3)); //false
		System.out.println("s1.equals(s4) = " + s1.equals(s4)); //true
		
		//while 예제
		
		Scanner sc = new Scanner(System.in);
		
		String init = "Y"; //초기화 변수
		int count = 0;
		
		//while(init == "Y")
		while(init.equals("Y")) { //조건식으로 반복 횟수 지정 : 조건이 만족할 때 까지 수행
			System.out.println("반복해서 수행하고 싶으면 [Y]를 입력하세요 : ");
			init = sc.nextLine();
			
			if(init.equals("Y")) {
				System.out.println("수행 횟수는 " + (++count) + "번 입니다");
			}
		} //증감연산자가 없기 때문에 무한 반복이 된다
		System.out.println("반복 종료");
		System.out.println("---------------------");
		
		//do ~ while
		Scanner sc1 = new Scanner(System.in);
		
		String init1 = "N"; //초기화 변수
		int count1 = 0;
		
		do { //조건식으로 반복 횟수 지정 : 조건이 만족할 때 까지 수행
			System.out.println("반복해서 수행하고 싶으면 [Y]를 입력하세요 : ");
			init1 = sc.nextLine();
			
			if(init.equals("Y")) {
				System.out.println("수행 횟수는 " + (++count1) + "번 입니다");
			}
		} while(init.equals("Y")); //증감연산자가 없기 때문에 무한 반복이 된다
		System.out.println("반복 종료");
		System.out.println("---------------------");
		
		//무한 반복과 break문
		//break문 : 반복을 중지한다
		
		Scanner sc2 = new Scanner(System.in);
		
		int sum1 = 0;
		int a1;
		
		while (true) {
			System.out.println("더할 숫자를 입력하세요 (종료하려면 0입력) : ");
			a1 = sc2.nextInt();
			
			if (a1 == 0) {
				System.out.println("입력을 종료합니다");
				break;
			}
			sum1 += a1;
		}
		System.out.println("현재까지의 총합 = " + sum1);
		
		
	}

}

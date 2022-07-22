package javastudy;

public class Chapter07 {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		//원하는 만큼 값을 출력하고 싶은데 출력해야 하는 양이 많다면 하나하나 값을 출력하기가 번거롭다 이 문제를 반복문을 이용하면 해결할 수 있다
		
		//1. 증감연산자
		//a++, a-- : a에 들어가 있는 값을 반복 실행 한 뒤 1을 증가 / 감소한다
		//++a, --a : a에 들어가 있는 값에 1을 증가 / 감소시킨 후 반복 실행을 한다
		//2. 대입연산자 : a = a + 1, a += 1 a에 1을 증가한 값을 다시 a에 넣음
		//(== a++, ++a 더하는 시점은 다를 수 있지만 1을 더한다는 점은 같음)
		
		int a = 1;
		
		//대입연산자
		System.out.println(a);
		a = a + 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		System.out.println("-------------------------------");
		
		//1. for문 : 주로 반복 횟수를 알 때 사용
		//형식 ) for (초기값(초기화변수); 반복 횟수(조건식); 증감연산자) { 반복할 내용 }
		
		int i; //초기화 변수 : 반복을 시작하는 값을 저장해 놓은 변수
		
		for (i = 1; i <= 5; i++) {
			System.out.println("Hello");
			System.out.println(i);
			
		}
		
		int j; //초기화 변수
		int sum = 0; //j 변수값을 누적시켜서 저장하는 변수
		
		for (j = 1; j <= 10; j++) {
			System.out.println("j 변수값 = " + j);
			
			sum = sum + j; //sum += j;
			//System.out.println("sum 변수값 =" + sum); //반복할 때 마다 결과 값을 확인하고 싶을 때
		} //{} 안에 변수를 선언하면 {}밖에선 그 변수를 사용할 수 없게 됨
		System.out.println("sum 변수값 =" + sum); //최종 결과 값만 확인하고 싶을 때
		
		
		//짝수의 값만을 더하여 출력하는 프로그램을 작성하시오
		int k;
		int b = 0;
		for (k = 1; k <= 10; k++) {
			if ((k % 2) == 0) {
				b = b + k;	
			}
		}
		System.out.println("1 ~ 10중 짝수의 합 =" + sum);
		
		
		//이중 for문
		//바깥 for문이 한 번 수행될 동안 안쪽 for문은 지정된 반복 횟수만큼 모두 수행해야 한다
		
		//구구단
		//단수(2) * 곱하는 수(1 ~ 9까지 9번)
		//2 * 1 = 2, 2 * 2 = 4, 2 * 3 = 6, ....
		
		int x, y;
		
		//바깥 for문 : 단수 (2단 ~ 9단)
		for (x = 2; x <= 9; x++) {
			//안쪽 for문 : 단수에 곱해지는 값 (1 ~ 9)
			for (y = 1; y <= 9; y++) {
				System.out.println(x + "*" + y + "=" + (x * y));
				
			}
			System.out.println();
		}

	}

}
package javastudy;

public class Chapter02 {

	public static void main(String[] args) {
		//연산자
		int a2 = 10;
		int b2 = 3;
		int sum = a2 + b2;
		int sub = a2 - b2;
		int mul = a2 * b2;
		int div = a2 / b2;
		int rest = a2 % b2;
		
		System.out.println("더하기 = " + sum);
		System.out.println("빼기 = " + sub);
		System.out.println("곱하기 = " + mul);
		System.out.println("나누기 = " + div);
		System.out.println("나머지 = " + rest);
		System.out.println("-----------------");
		
		System.out.println("더하기 = " + (a2 + b2)); //사칙연산에는 순서가 있기 때문에 괄호로 묶어 주어야 한다
		System.out.println("빼기 = " + (a2 - b2));
		System.out.println("곱하기 = " + (a2 * b2));
		System.out.println("나누기 = " + (a2 / b2));
		System.out.println("나머지 = " + (a2 % b2));
		System.out.println("-----------------");
		//값은 똑같이 나옴, 구지 변수를 사용할 필요는 없다는 것을 알려주기 위함
		
		//문자와 문자열
		//1. 문자 : 글자 하나 표현, 자료형 - char(2byte), 작은 따옴표로 묶어서 사용 ex) ('A', '김')
		char ch1 = 'A';
		char ch2 = '김';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("-----------------");
		
		//2. 문자열(String) : 여러개의 글자가 하나의 단위를 이룬다. (단어), 
		//자료형 - String(정해져 있지 않음, 내가 넣는 만큼), 큰 따옴표로 묶어서 사용("happy", "안녕하세요")
		
		char ch3 = 'h';
		char ch4 = 'a';
		char ch5 = 'p';
		char ch6 = 'p';
		char ch7 = 'y';
		//char로 happy를 표현하려면 변수를 여러개 사용해야 한다
		
		char ch8= 'h';
		System.out.println(ch8);
		System.out.println((char)ch8);
		System.out.println((int)ch8);
		
		char ch9 = '김';
		System.out.println(ch9);
		System.out.println((char)ch9);
		System.out.println((int)ch9);
		System.out.println("\\uae40 = " + "\uae40");
		
		
		
		String s1 = "happy";
		System.out.println(s1);
		System.out.println("-----------------");
		
	}

}

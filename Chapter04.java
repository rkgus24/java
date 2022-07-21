package javastudy;

import java.util.Scanner; //단축키 : Ctrl + Shift + o

public class Chapter04 {

	public static void main(String[] args) {
		//키보드로 변수에 데이터값을 직접 입력 받기
		int a = 10;
		
		//import를 시켜 주어야 함
		Scanner sc = new Scanner(System.in);
		
		//정수 : nextInt()
		System.out.println("정수 입력 >>> ");
		int v1 = sc.nextInt(); //정수로 바꾸는 역할을 함
		System.out.println("v1 = " + v1);
		System.out.println(); //줄바꿈, 글자로 취급하여 읽어 들이지 않음
		//정수엔터
		
		//실수 : nextDouble()
		System.out.println("실수 입력 >>> ");
		double v2 = sc.nextDouble(); //실수로 바꾸는 역할을 함
		System.out.println("v2 = " + v2);
		System.out.println(); //줄바꿈, 글자로 취급하여 읽어 들이지 않음
		//정수엔터실수엔터
		
		//단어 : next() ENTER, SPACE에 민감
		System.out.println("단어 입력 >>> ");
		String v3 = sc.next(); //단어로 바꾸는 역할을 함
		System.out.println("v3 = " + v3);
		System.out.println(); //줄바꿈, 글자로 취급하여 읽어 들임
		//정수엔터실수엔터단어엔터
		
		//문장 : nextLine() ENTER에 민감
		sc.nextLine(); //이 문장을 써줘야 입력이 됨 
		//(ENTER키를 만나기 전까지의 공백을 포함한 모든 문자를 저장하기 때문)
		
		System.out.println("문장 입력 >>> ");
		String v4 = sc.nextLine(); //문장으로 바꾸는 역할을 함
		System.out.println("v4 = " + v4);
		System.out.println(); //줄바꿈, 글자로 취급하여 읽어 들임
		//정수엔터실수엔터단어엔터문장엔터
		
		//문자 하나 : next().charAt(0) -> charAt(0)가져올 번호는 0번째 부터 시작
		System.out.println("문자 입력 >>> ");
		char v5 = sc.next().charAt(0); 
		//문자로 바꾸는 역할을 함 
		//가져온 데이터값의 첫번째 문자 하나만 가져옴 
		//만약 두 번째 글자를 출력하고 싶다면 charAt(1)을 함
		System.out.println("v5 = " + v5);
		System.out.println(); //줄바꿈, 글자로 취급하여 읽어 들이지 않음
		//정수엔터실수엔터단어엔터문장엔터문자엔터
	}

}

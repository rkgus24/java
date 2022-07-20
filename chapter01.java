package javastudy;

public class Chapter01_1 {

	public static void main(String[] args) {
		
		//주석 처리 : 코딩해 놓은 내용을 수행하지 않은 구문으로 만든다
		// 1. 한줄 주석 : 구문 앞에 //를 붙여준다
		//2. 묶음 주석 : /* ~~~~~ */으로 붙여준다
		//Ctrl + F11 : 컴파일도 해주고 결과도 실행해서 보여준다
		
		//출력하기
		//System.out.println("Hello java");
		System.out.println("공부하고 있는 페이지는 32 페이지 입니다");
		System.out.println("바깥 온도는 33.5도 입니다");
		System.out.println("현금은 100000원을 가지고 있습니다");
		System.out.println("성별은 여 입니다");
		System.out.println("코딩은 할 수 있습니다");
		System.out.println("---------------------------");
		
		//변수(Variable) : 데이터 값을 담아두는 공간 (메모리 공간 주소명)
		//형식 ) 데이터타입(자료형) 변수명 = 값; ex) int a = 1;
		byte page = 32; // 변수가 선언됨과 동시에 메모리 공간에 값을 넣어주는 것 (초기화)
		float temp = 33.5f; //접미사 : 실수 데이터값을 float형으로 계산하라는 의미이다
		int cash = 100000;
		char gender = '여'; //글자 하나 - > 작은 다옴표로 묶어서 데이터값을 넣는다
		boolean coding = true; //
		System.out.println(page);
		System.out.println(temp);
		System.out.println(cash);
		System.out.println(gender);
		System.out.println(coding);
		System.out.println("---------------------------");
		
		//값을 변경시킴
		
		page = 50;
		temp = 28.5f;
		cash = 200000;
		gender = '남';
		coding = false;
		
		System.out.println("공부하고 있는 페이지는 " + page + "입니다");
		System.out.println("온도는 " + temp + "도 입니다");
		System.out.println("현금은 " + cash + "원 입니다");
		System.out.println("성별은 " + gender + "입니다");
		System.out.println("코딩은 " + coding + "입니다");
		System.out.println("---------------------------");
		
		//위쪽 코드는 컴퓨터 메모리 공간에 담겨있지 않지만 아래쪽 코드는 컴퓨터 메모리 공간에 담겨있어서 꺼내 쓸 수 있다
		
		//변수의 값을 고정시켜 놓고 사용해야 하는 경우 : 변수를 상수화 시킨다
		//상수 (constant) : 변하지 없는 값 - > 변수에 담겨 있는 값을 고정시켜서 사용할 경우 
		double PI = 3.14;
		System.out.println(PI);
		System.out.println("---------------------------");
		
		final int RATE = 1200; // 초기화된 값은 사용할 수 있고 새로운 값은 변수에 대입하지 못한다
		//RATE = 1500; // final을 적으면 값을 변경하려고 해도 바뀌지 않음
		
		//환율을 이용한 환산금액 구하기
		int won = 1 * RATE;
		int won1 = 2 * RATE;
		int won2 = 3 * RATE;
		int won3 = 4 * RATE;
		int won4 = 5 * RATE;
		System.out.println(won);
		System.out.println(won1);
		System.out.println(won2);
		System.out.println(won3);
		System.out.println(won4);
		System.out.println("---------------------------");
		
		int age = 20; //메모리 공간이 확보됨과 동시에 값이 들어감 (초기화)
		System.out.println("age = " + age);
		int age1; //메모리 공간만 확보하고 값은 넣지 않았기 때문에 컴파일 에러
		age1 = 100; //나중에 반드시 변수에 값을 대입시켜 주어야 한다
		System.out.println("age1 = " + age1);
		
		//약속
		//클래스 : 첫글자만 대문자
		//변수명 : 소문자
		//상수 : 대문자
		}

}
package javastudy;
import java.util.Scanner;
public class Chapter03 {
	public static void main(String[] args) {
		
		//조건문 : 1 ) if문
		//형식 ) if (조건식) { 조건이 참일 때 수행할 내용 } - > 조건이 참일때만 수행하고 조건이 거짓이면 수행하지 않는다
		/*
		int score = 70;
		System.out.println("시험 시작");
		//조건 작성 : 비교대상 비교 연산자 비교할 기준값 -> 참(true)과 거짓(false)
		
		//    70  >= 60  -> 조건이 참이기 때문에 if문이 동작하게 된다
		//만약 score에 들어가 있던 값이 30이라면 합격입니다를 출력하지 않고 시험 끝을 출력하게 된다
		if (score >= 60) {
			System.out.println("합격입니다");
		}
		System.out.println("시험 끝");
		
		//조건문 : 2 ) if ~ else문
		//형식 ) if (조건문) { 조건이 참일 때 수행할 내용 } else { 조건이 거짓일 때 수행할 내용 }
		// -> 조건이 참일 때 수행할 내용과 거짓일 때 수행할 내용을 각각 지정해준다
		
		int score = 70;
		System.out.println("시험 시작");
		//조건 작성 : 비교대상 비교 연산자 비교할 기준값 -> 참(true)과 거짓(false)
		
		//    70  >= 60  -> 조건이 참이기 때문에 if문이 동작하게 된다
		//만약 score에 들어가 있던 값이 30이라면 합격입니다를 출력하지 않고 불합격입니다를 출력하게 된다
		if (score >= 60) {
			System.out.println("합격입니다");
		}
		else {
			System.out.println("불합격입니다");
		}
		
		System.out.println("시험 끝");
		*/
		
		/*
		//조건문 3 ) if ~ else if ~ else문
		int score = 80;
		String grade = "";
		
		System.out.println("학점부여 시작");
		
		if (score >= 95) {
			grade = "A+";
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 85) {
			grade = "B+";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("당신의 학점은 " + grade + "입니다");
		System.out.println("학점부여 끝");
		}
	   */
		
		/*
		//조건문 3 ) if ~ else if ~ else문
		//논리 연산자 : 조건 수행 결과(참 or 거짓)을 가지고 다시 연산한다
		//1. AND : 조건 1 && 조건 2 -> 조건 두 개가 모두 참이어야만 수행된다
		//2. OR : 조건 1 || 조건 2 -> 조건 두 개 중 하나만 참이여도 수행된다
		//3. NOT : !(조건 1) -> 조건이 참이면 거짓이 되고, 조건이 거짓이면 참으로 바뀐다
		
		int score = 70;
		String grade = "";
		if ( (score <= 100) && (score >= 95) ) {
			grade = "A+";
		} else if ( (score <= 94) && (score >= 90) ) {
			grade = "A";
		} else if ( (score <= 89) && (score >= 85) ) {
			grade = "B+";
		} else if ( (score <= 84) && (score >= 80) ) {
			grade = "B";
		} else if ( (score <= 79) && (score >= 75) ) {
			grade = "C";
		} else if ( (score <= 74) && (score >= 70) ) {
			grade = "D";
		} else {
			grade = "재시험(계절학기)";
		}
		System.out.println("당신의 학점은 " + grade + "입니다");
		System.out.println("학점부여 끝");
		*/
		
		/*
		//중첩 if문 : 바깥쪽 if문의 조건이 맞지 않으면 안쪽 if문은 수행되지 않는다
		int math = 90;
		int eng = 95;
		
		if (math >= 60) {
			if (eng >= 60) {
				System.out.println("통과");
			}
		} else {
			System.out.println("탈락");
		}
		*/
		
		/*
		int math = 90;
		int eng = 95;
		
		if (math >= 60 && eng >= 60) {
			System.out.println("통과");
		} else {
			System.out.println("탈락");
		}
		*/
		
		/*
		//switch문 : 하나의 변수나 수식에 대한 여러 조건을 검사한다
		//앵간하면 비교 연산자를 붙이지 않고 붙이더라도 == 만 사용함
		// switch (변수명 or 하나의 수식), case, break 사용
		
		int number = 3;
		
		//조건 작성 : 비교 대상 비교 연산자 비교할 기준값 -> 참(true)과 거짓(false)
		switch (number) {
		case 1 :
			System.out.println("1번");
			break;
		case 2 :
			System.out.println("2번");
			break;
		case 3 :
			System.out.println("3번");
			break;
		case 4 :
			System.out.println("4번");
			break;
		case 5 :
			System.out.println("5번");
			break;
		default :
			System.out.println("1 ~ 5번까지만 입력할 수 있습니다");
			break;
			*/
		
		
		int month;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요 : ");
		month = sc.nextInt();
		
		switch (month) {
		case 12 :
			System.out.println("겨울");
			break;
		case 1 :
			System.out.println("겨울");
			break;
		case 2 :
			System.out.println("겨울");
			break;
		case 3 :
			System.out.println("봄");
			break;
		case 4 :
			System.out.println("봄");
			break;
		case 5 :
			System.out.println("봄");
			break;
		case 6 :
			System.out.println("여름");
			break;
		case 7 :
			System.out.println("여름");
			break;
		case 8 :
			System.out.println("여름");
			break;
		case 9 :
			System.out.println("가을");
			break;
		case 10 :
			System.out.println("가을");
			break;
		case 11 :
			System.out.println("가을");
			break;		
		}	
	}
}
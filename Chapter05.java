package javastudy;

import java.util.Scanner; //단축키 : Ctrl + Shift + o

public class Chapter05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int page; 30
		double temp; 33.5
		int cash; 200000
		String gender; 여
		boolean codeing; true
		*/
		
		System.out.println("페이지 입력 >>> ");
		int page = sc.nextInt();
		System.out.println("page = " + page);
		System.out.println();
		
		System.out.println("온도 입력 >>> ");
		double temp = sc.nextDouble();
		System.out.println("temp = " + temp);
		System.out.println();
		
		System.out.println("현금 입력 >>> ");
		int cash = sc.nextInt();
		System.out.println("cash = " + cash);
		System.out.println();
		
		System.out.println("성별 입력 >>> ");
		String gender = sc.next();
		System.out.println("gender = " + gender);
		System.out.println();
		
		System.out.println("코딩 능력 여부 입력 >>> ");
		boolean coding = sc.hasNext();
		System.out.println("coding = " + coding);
		System.out.println();
	}

}
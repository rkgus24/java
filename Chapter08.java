package javastudy;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter08 {

	public static void main(String[] args) {
		
		//반복을 중지 : break문, continue문
		//1. break문 : 반복을 중지한다
		for (int i = 0; i < 10; i++) {
			if (i == 5) break; //if문의 수행해야 할 내용이 한 줄이라면 중괄호를 하지 않고 옆에 적어도 됨
			System.out.println(i);
		}
		//2. continue문 : 현재 반복하는 수행만 중지하고 다음 반복을 수행하러 간다. 
		for (int i = 0; i < 10; i++) {
			if (i == 5) continue;
			
			System.out.println(i);
			
		}
		//입력 받은 숫자 중에서 홀수의 합계를 구하고 -1이 입력되면 반복을 종료한다
		Scanner sc = new Scanner(System.in);
		int j;
		int sum = 0;
		while(true) {
			System.out.println("더할 숫자를 입력하세요 : (종료하려면 -1 입력)");
			j = sc.nextInt();
			//짝수가 입력되면 처리하지 않기
			if (j %2 == 0) continue;
			if (j == -1) {
				System.out.println("종료");
				break;
			}	
			sum += j;
		}
		System.out.println("합 :" + sum);
	
		//배열 : 하나의 이름을 공유, - 접근 하기가 편리하다 메모리에 연속적으로 저장되어 수행속도가 빨라진다 
		// 인덱스(Index) 번호를 이용하여 배열 원소에 접근함
		// 변수 형식으로 사용
		int student1 = 100;
		int student2 = 90;
		int student3 = 95;
		
		System.out.println("student1 = " + student1);
		System.out.println("student2 = " + student2);
		System.out.println("student3 = " + student3);
		System.out.println("----------------------");
		
		//배열 (Array) : 메모리 공간에 담긴 여러개의 데이터를 하나의 변수로 묶어서 관리한다
		//int student4[];
		//student4 = new int[3];
		
		int student4[] = new int[3];
		System.out.println("student1[0] = " + student4[0]);
		System.out.println("student1[1] = " + student4[1]);
		System.out.println("student1[2] = " + student4[2]);
		System.out.println("----------------------");
		
		//배열의 요소에 데이터 값 넣기(수정)
		student4[0] = 100;
		student4[1] = 90;
		student4[2] = 95;
		System.out.println("student1[0] = " + student4[0]);
		System.out.println("student1[1] = " + student4[1]);
		System.out.println("student1[2] = " + student4[2]);
		System.out.println("----------------------");
		
		//배열을 생성과 동시에 배열 요소에 데이터 값을 초기화 시키기
		int a[] = {10,20,30,40,50};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("----------------------");
		
		a[1] = 200;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("----------------------");
		//                   [0] [1] [2] [3] [4]
		int b[] = new int[] {100,200,300,400,500,600,700};
		
		int k; //초기화 변수
		for (k = 0; k < b.length; k++) {
			System.out.print("b[" + k + "] = ");
			
			System.out.println(b[k]);
		}
		System.out.println("----------------------");
		
		//배열의 개수 자동으로 구하기
		System.out.println("배열의 개수 = " + b.length);
		
		//시험 점수의 합계, 평균 구하기
		int stu[] = {100,95,90,88, 93};
		int num = 0;
		double avg = 0.0;
		int g;
		
		//num = stu[0] + stu[1] + stu[2] + stu[3] + stu[4];
		//System.out.println("num = " + num);
		
		for (g = 0; g < stu.length; g++) {
			//System.out.println("stu[" + g + "] = ");
			System.out.print(stu[g]);
			num += stu[g]; 
			//System.out.println("시험 점수의 합계 = " + num);
		}
		System.out.println("시험 점수의 합계 = " + num);
		avg = num / 5.0;// / 5로 계산을 하면 정수의 형태로 나올 수 밖에 없으므로 정확한 값을 볼 수 없음
		//avg = num / (float)stu.length;
		System.out.println("시험 점수의 평균 = " + avg);
		
		//객체가 가지고 있는 정보나 값들을 문자열로 돌려주는 메서드
		System.out.println(stu);
		System.out.println(stu.toString());
		
		//배열의 요소 값들을 문자열로 표시(for문을 사용할 필요 없이 값을 확인할 수 있음) : Arrays.toString(배열명)
		System.out.println(Arrays.toString(stu));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}



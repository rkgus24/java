package javastudy;

public class Chapter09 {

	public static void main(String[] args) {
		//2차원 배열
		//                   행 열
		int stu[][] = new int[2][3];
		
		//행부터 찾고 열을 찾는 순서로 접근한다 -> 배열명[행번호][열번호]
		System.out.println("stu[0][0] = " + stu[0][0]);
		System.out.println("stu[0][1] = " + stu[0][1]);
		System.out.println("stu[0][2] = " + stu[0][2]);
		System.out.println("stu[1][0] = " + stu[1][0]);
		System.out.println("stu[1][1] = " + stu[1][1]);
		System.out.println("stu[1][2] = " + stu[1][2]);
		
		stu[0][0] = 100;
		stu[0][1] = 200;
		stu[0][2] = 300;
		
		System.out.println("stu[0][0] = " + stu[0][0]);
		System.out.println("stu[0][1] = " + stu[0][1]);
		System.out.println("stu[0][2] = " + stu[0][2]);
		System.out.println("stu[1][0] = " + stu[1][0]);
		System.out.println("stu[1][1] = " + stu[1][1]);
		System.out.println("stu[1][2] = " + stu[1][2]);
		
		//2차원 배열의 생성과 동시에 데이터 값 초기화
		int [][] stu1 = new int[][] {
			{100,200,300}, //[0]행 -> 행 구분은 콤마로 한다
			{400,500,600}  //[1]행
		};
		
		//이중 for문으로 2차원 배열 출력하기
		//이중 for문의 특징 : 바깥 for문이 1번 수행 될 동안 안쪽 for문은 반복 횟수를 모두 수행해야 한다
		
		int i, j;
		
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("stu1[" + i + "][" + j + "] = ");
				System.out.println(stu1[i][j]);
			}
		}
		System.out.println("------------------------");
		
		//
		int rowline = stu1.length; //행의 개수
		int col0 = stu1[0].length; //0행의 열의 개수
		int col1 = stu1[1].length; //1행의 열의 개수
		//         stu1[i].length
		
		System.out.println("2차원 배열 행의 개수 = " + rowline);
		System.out.println("0번째 행의 열 개수 = " + col0);
		System.out.println("1번째 행의 열 개수 = " + col1);
		
		for (i = 0; i < stu1.length; i++) { //2개
			for (j = 0; j < stu1[i].length; j++) {
				System.out.print("stu1[" + i + "][" + j + "] = ");
				System.out.println(stu1[i][j]);
			}
		}
		System.out.println("------------------------");
		
		//학점의 합계와 평균 구하기
		//학점의 평균 구하기
		double score[][] = {
				{3.3, 3.4}, // 1학년 1, 2학기 평점 (score[0]행
				{3.5, 3.6}, // 2학년 1, 2학기 평점 (score[1]행
				{3.7, 4.0}, // 3학년 1, 2학기 평점 (score[2]행
				{4.1, 4.2}  // 4학년 1, 2학기 평점 (score[3]행
		};
		
		double sum = 0;
		int year = 0; //초기화 변수 -> 바깥쪽 for문 초기화 변수 (행(학년) 초기화 변수)
		int term; //초기화 변수 -> 안쪽 for문 초기화 변수 (열(학기) 초기화 변수)
		
		int n = score.length; //행의 개수
		int m = score[year].length; //0행의 열의 개수
		
		for (year = 0; year < score.length; year++) { // 각 학년별로 반복 (행의 개수)
			System.out.println("학년 구분 -------" + (year + 1) + "학년");
			
			for (term = 0; term < score[year].length; term++) { //각 학년의 학기별로 반복 (열의 개수)
				System.out.print(score[year][term]);
				System.out.println(" -- score[" + year + "][" + term + "[");
				sum += score[year][term]; //sum = sum + score[year][term]; 전체 평점의 합
			}
		}
		System.out.println("------------------------");
		System.out.println("4학년 전체 평점 합계 = " + sum);
		System.out.println("4학년 전체 평점 평균 = " + sum / (n * m));
		System.out.println("========================");
	}

}

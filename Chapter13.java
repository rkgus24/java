package javastudy;

//메서드 오버로딩(Method Overloading)
//메서드 이름은 동일하지만 매개변수의 자료형이나 개수가 다르면 여러 개의 메서드를 만들어 놓고 사용할 수 있다


class Operator {
	
	//메서드 오버로딩
	//               4      3
	int multiply(int x, int y) { 
		return x * y; //곱한 결과 값을 호출한 곳으로 돌려준다
	}
	
	double multiply(double x, double y) { //매개변수의 자료형이 다르다
		return x * y; //곱한 결과 값을 호출한 곳으로 돌려준다
	}
	
	double multiply(int x, double y) {
		return x * y; //곱한 결과 값을 호출한 곳으로 돌려준다
	}
	
	double multiply(double x, int y) {
		return x * y; //곱한 결과 값을 호출한 곳으로 돌려준다
	}
	
	double multiply(double x) { //매개변수의 개수가 다르다
		return x * x; //곱한 결과 값을 호출한 곳으로 돌려준다
	}
}



public class Chapter13 {

	public static void main(String[] args) {
		
		Operator op = new Operator();
		
		//int multiply(int x, int y) 호출
		op.multiply(4, 3); //메서드 호출도 하고 함수 내에서 반환한 값도 가지고 있다
		
		int result1 = op.multiply(4, 3);
		System.out.println("result1 = " + result1);
		System.out.println("op.multiply(4, 3) = " + op.multiply(4, 3)); //호출, 결과 값을 가지고 있음
		System.out.println("-------------------");
		
		//double multiply(double x, double y) 호출
		double result2 = op.multiply(4.5, 3.5);
		System.out.println("result2 = " + result2);
		System.out.println("op.multiply(4.5, 3.5) = " + op.multiply(4.5, 3.5));
		System.out.println("-------------------");
		
		System.out.println(1);
		System.out.println(5.5);
	}
	

}

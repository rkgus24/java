package javastudy;

	class Avante {
		
		//클래스 변수
		static String company = "현대";
		
		//인스턴스(객체) 변수
		String color;
	}
	
public class Chapter15 {
		
	public static void main(String[] args) {
		
		//클래스 변수 사용 : 객체 생성 없이 사용할 경우 클래스명.변수명
		System.out.println("Avante 제조사 = " + Avante.company);
		System.out.println("-----------------------");
		
		Avante a1 = new Avante();
		System.out.println("a1 객체 제조사 = " + a1.company);
		System.out.println("a1 객체 색상 = " + a1.color);
		System.out.println("-----------------------");
		
		a1.company = "KIA";
		
		Avante a2 = new Avante();
		System.out.println("a2 객체 제조사 = " + a2.company);
		System.out.println("a2 객체 색상 = " + a2.color);
		System.out.println("-----------------------");
		
		//a1.company = "KIA";
		
		Avante a3 = new Avante();
		System.out.println("a3 객체 제조사 = " + a3.company);
		System.out.println("a3 객체 색상 = " + a3.color);
		System.out.println("-----------------------");
		
		Avante a4 = new Avante();
		System.out.println("a4 객체 제조사 = " + a4.company);
		System.out.println("a4 객체 색상 = " + a4.color);
		System.out.println("-----------------------");
		
	}

}

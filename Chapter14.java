package javastudy;

class  Car {
	
	//필드
	String color;
	String company;
	String type;
	
	void go() {
		System.out.println("전진");
	}
	void back() {
		System.out.println("후진");
	}
}

public class Chapter14 {

	public static void main(String[] args) {
		
		Car tico = new Car();
		System.out.println("색상 = " + tico.color);
		System.out.println("색상 = " + tico.company);
		System.out.println("색상 = " + tico.type);
		System.out.println("------------------");
		
		tico.color = "Red";
		tico.company = "대우";
		tico.type = "경차";
		System.out.println("색상 = " + tico.color);
		System.out.println("회사명 = " + tico.company);
		System.out.println("타입 = " + tico.type);
		System.out.println("------------------");
		
		tico.go();
		tico.back();
		System.out.println("------------------");
		
		Car pride = new Car();
		System.out.println("색상 = " + pride.color);
		System.out.println("회사명 = " + pride.company);
		System.out.println("타입 = " + pride.type);
		System.out.println("------------------");
		
		pride.color = "Black";
		pride.company = "기아";
		pride.type = "소형";
		System.out.println("색상 = " + pride.color);
		System.out.println("회사명 = " + pride.company);
		System.out.println("타입 = " + pride.type);
		System.out.println("------------------");
		
		pride.go();
		pride.back();
		System.out.println("------------------");

	}

}

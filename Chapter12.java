package javastudy;

//클래스 내에는 클래스 멤버, 인스턴스(객체) 멤버로 구분해서 작성한다
//클래스 멤버 : 객체를 생성하지 않아도 바로 사용이 가능하다
//-> 클래스 메서드 호출 : 클래스명.메서드명
//인스턴스(객체) 멤버 : 객체를 생성 해야만 사용이 가능하다
//-> 인스턴스(객체) 메서드 호출 : 객체를 생성하고 객체명(변수명).메서드명()


//static(클래스) 메서드는 static(클래스) 메서드만 호출할 수 있다 
//static(클래스) 메서드는 인스턴스(객체) 메서드를 호출할 수 없다 -> 아직 객체가 만들어지지 않았기 때문
//인스턴스(객체) 메서드는 static(클래스) 메서드를 호출할 수 있다

class Method {
	//메서드 작성 형식 ) 반환 값 자료형 메서드명 (매개변수 or 인수) { 처리 과정 return 반환 값; }
	static void printName() {
		System.out.println("printName 실행");
		//printId(); 클래스 메서드는 인스턴스 메서드를 호출할 수 없다
		return; //클래스 멤버
	}
	
	void printEmail() {
		System.out.println("printEmail 실행");
		printId(); //인스턴스는 인스턴스끼리 공유할 수 있다
		return; //인스턴스 멤버
	}
	
	void printId() {
		System.out.println("printId 실행");
		printName(); //static(클래스) 메서드를 호출할 수 있다
		//인스턴스 메서드는 객체를 만들어야만 호출이 가능한 것이기 때문에 
		//이미 만들어져 있는 static 메서드를 호출할 수 있다
		return; //인스턴스 멤버
	}
}

public class Chapter12 {

	public static void main(String[] args) {
		
		//객체를 생성하지 않고 바로 static(클래스) 메서드를 호출해서 사용
		//클래스명.메서드명();
		Method.printName();
		System.out.println("----------------");
		
		//객체 생성 : 인스턴스(객체) 메서드는 객체를 생성해야만 호출할 수 있다
		int a = 10;
		Method m = new Method();
		m.printName(); //static(클래스) 메서드는 객체를 생성해도, 안 해도 사용할 수 있음
		
		m.printId(); //인스턴스 메서드 호출
		System.out.println("----------------");
		
		m.printEmail(); //인스턴스 메서드 호출
		System.out.println("----------------");
		
		m.printEmail(); //인스턴스 메서드 호출
		System.out.println("----------------");
	}

}

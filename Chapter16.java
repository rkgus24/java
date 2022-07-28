package javastudy;
//생성자(Constructor)
//1.사용자 정의 함수 : 함수를 만들어 두고 필요시에 호출해서 사용하는 함수이다.
//2.특별한 함수 : 자동으로 호출되어 사용되는 함수이다
//1.객체 생성시에 멤버 변수에 데이값을 초기화시키는 기능을 하는 함수이다
//2.모든 클래스는 객체를 생성시에 반드시 자동으로 생성자 함수르르 호출해서 멤버 변수값을 초기화하게 된다

//생성자 형식
//1.기본 생성자 형식 : 객체를 생성시에 직접 멤버 변수에 데이터 값을 넣어 줄 수 없는 형식이다
//2.일반 생성자 형식 : 객체를 생성시에 직접 멤버 변수에 데이터 값을 넣어 줄 수 있는 형식이다
//**생성자 만들기
//1.생성자(함수) 이름은 클래스이름과 같아야한다
//2.반환값자료형 없다. (void 아니고 아예 없다)
//3.함수 작성내용{}내에는 멤버 변수에 값을 대입하는 기능만 적어야한다
//4.메서드 오버로딩으로 여러개를 만들어 놓고 사용할 수있다
class Student{
   String name;//이름 저장 변수
   int grade;//학년 저장 변수
   String department;//학과 저장 변수
   //기본 생성자 : 정의하지 않으면 컴파일러가 자동으로 추가해서 객체를 생성한다
   Student(){ }
   //일반 생성자 형식
   //          "김하나",   3,       "소프트웨어 공학과"
   Student(String n,int g,String d){
      name = n;
      grade = g;
      department = d;
   }
   
}

public class StudentMain1 {

   public static void main(String[] args) {
      /*
      String name;//이름 저장 변수
      int grade;//학년 저장 변수
      String department;//학과 저장 변수
      
      System.out.println(name);
      System.out.println(grade);
      System.out.println(department);
      */
      
      //객체 생성
      Student stu = new Student();
      System.out.println("이름 ="+stu.name);
      System.out.println("학년 ="+stu.grade);
      System.out.println("학과 ="+stu.department);
      System.out.println("-----------------------");
      stu.name = "홍길동";
      stu.grade = 1;
      stu.department="통계학과";
      System.out.println("이름 ="+stu.name);
      System.out.println("학년 ="+stu.grade);
      System.out.println("학과 ="+stu.department);
      System.out.println("-----------------------");
      System.out.println("===두번째 객체 생성===");
      //Student(String n,int g,String d)일반 생성자 형식을 호출해서 멤버 변수에 값을 초기화한다
      
      Student stu1 = new Student("김하나",3,"소프트웨어 공학과");
      System.out.println("이름 ="+stu1.name);
      System.out.println("학년 ="+stu1.grade);
      System.out.println("학과 ="+stu1.department);
      System.out.println("-----------------------");
   }

}
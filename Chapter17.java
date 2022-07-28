package javastudy;
//**this 키워드 : 클래스내에서 자신의 메버에 접근할 때 사용된다.
//멤버 변수에 접근
//-> this.멤버 변수명
//this() : 자신의 클래스내에서 임 만들어져 있는 생성자를 호출해서 멤버 변수에 데이터 값을 초기화한다
//하나의 생성자 내에서 다른 생성자를 호출해서 사용한다
//->다른 생성자를 빌려와서 값만 넣어서 사용할 때는 반드시 제일 첫번째 줄에 적어둔다
class Car2{
   String color;//색상
   String company;//제조회사
   String type;//크기
   //기본 생성자 : 객체를 생성시에 직접 멤버 변수에 데이터 값을 넣어 줄 수 없는 형식이다
   Car2(){
      this("Black","기아","소형차");
      //자신의 클래스에서 Car2(String color,String company,String type)호출
      //this.color = "Black";
      //this.company = "기아";
      //this.type = "소형차";
   }
   //일반 생성자: 객체를 생성시에 직접 멤버 변수에 데이터 값을 넣어 줄 수 있는 형식이다
   Car2(String color,String company,String type){
      this.color = color;
      this.company = company;
      this.type = type;
   }
}
public class Car2Main {

   public static void main(String[] args) {
      //white,현대,소형차
      //Car2(String color,String company,String type) 생성자 호출
      Car2 num1 = new Car2("white","현대","소형차");
      System.out.println("색상 = "+num1.color);
      System.out.println("제조회사 = "+num1.company);
      System.out.println("크기 = "+num1.type);
      System.out.println("--------------------------------");
      
      Car2 num2 = new Car2();
      System.out.println("색상 = "+num2.color);
      System.out.println("제조회사 = "+num2.company);
      System.out.println("크기 = "+num2.type);
      System.out.println("--------------------------------");

   }

}
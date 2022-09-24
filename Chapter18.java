package Chapter7_01;
//생성자(constructor)는 메서드 오버로딩으로 여러개를 만들어 놓고 사용할 수 있다
//멤버 변수의 접근제어가 private인 경우 : 멤버변수에 접근 할수 없다.
//접근하게 하려면 getter(접근자)/setter(설정자) 함수를 만들어서 사용해야한다
class Car2{
   private String color;//변수 , 필드
   private String company;
   private String type;
   //기본 생성자 : 컴파일러가 자동으로 추가해준다
   public Car2(){   }
   //일반 생성자 : 객체 생성시 직접 멤버 변수에 데이터값을 넣어서 초기화 시킬수 있는 형식
   //       "Black",   "현대",    "승용차"
   public Car2(String c,String co,String t){
      color = c;
      company = co;
      type = t;
   }
   /*
   //getter(접근자)/setter(설정자) 함수를 만들기
   public String getColor() {
      return color;//호출한 곳으로 결과값을 돌려준다
   }
   public String getCompany() {
      return company;//호출한 곳으로 결과값을 돌려준다
   }
   public String getType() {
      return type;//호출한 곳으로 결과값을 돌려준다
   }
    public void setColor(String color) {
       this.color = color;
    }
    public void setCompany(String company) {
       this.company = company;
    }
    public void setType(String type) {
       this.type = type;
    }
    */
   
}
public class CarMain2 {

   public static void main(String[] args) {
      /*
      Car2 c1 =new Car2();//기본 생성자가 호출되어서 멤버 변수에 데이터값을 초기화 한다.
      System.out.println("색상 = "+c1.color);
      System.out.println("제조사 = "+c1.company);
      System.out.println("타입 = "+c1.type);
      System.out.println("-----------------------------------");
      c1.color = "Grey";
      c1.company= "KIA";
      c1.type = "화물차";
      System.out.println("색상 = "+c1.color);
      System.out.println("제조사 = "+c1.company);
      System.out.println("타입 = "+c1.type);
      System.out.println("-----------------------------------");
      //Car2(String c,String co,String t) 일반 생성자 호출
      Car2 c2 = new Car2("Black","현대","승용차");
      System.out.println("색상 = "+c2.color);
      System.out.println("제조사 = "+c2.company);
      System.out.println("타입 = "+c2.type);
      System.out.println("-----------------------------------");
      c2.color = "Red";
      System.out.println("색상 = "+c2.color);
      System.out.println("제조사 = "+c2.company);
      System.out.println("타입 = "+c2.type);
      System.out.println("-----------------------------------");
      */
      Car2 c3 = new Car2("Blue","삼성","대형차");
      //public String getColor() 함수를 호출해서 멤버 변수값을 돌려준다
      System.out.println("색상 = "+c3.getColor());//호출하고 
      System.out.println("제조사 = "+c3.getCompany());
      System.out.println("타입 = "+c3.getType());
      System.out.println("-----------------------------------");
      // public void setColor(String color) 함수 호출해서 멤버 변수에 새로운 값을 대입한다
      c3.setColor("Green");
      c3.setCompany("대우");
      c3.setType("경차");
   }

}
​

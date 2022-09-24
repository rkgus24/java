package chapter40;
//Object 클래스
class Fruit{
   String name;
   String color;
   //일반 생성자
   public Fruit(String name,String color) {
      this.name = name;
      this.color = color;
   }
   //객체 내의 정보를 문자열로 변환한다
   //Object 클래스에서 지원하는 메서드를 오버라이드 시켜서 사용할 수 있다.
   //->객체내의 보여주는 정보를 바꿀 수 있다
   @Override
   public String toString() {
      return "과일 이름 : "+this.name+"\n과일 색상 : "+this.color;
   }
}



public class TostringEx {

   public static void main(String[] args) {
      Fruit f =new Fruit("사과","빨강");
      System.out.println(f);
      System.out.println(f.toString());
      System.out.println("--------------------------------");
      Fruit f1 =new Fruit("바나나","yellow");
      System.out.println(f1);
      System.out.println(f1.toString());
      System.out.println("--------------------------------");
   }

}

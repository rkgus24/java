package chapter28;

abstract class Shape{
   String type;
   
   Shape (String type){
      this.type = type;
   }
   abstract double area();
   abstract double length();
}
class Circle extends Shape{
   //원 넓이
   //원 둘레
   int r;
   Circle(int r){
      super("원");
      this.r = r;
   }
   @Override
   double area() {
      return r*r*Math .PI;//호출한 곳으로 돌려준다
   }
   @Override
   double length() {
      return 2*r*Math .PI;
   }
   public String toString() {
      return "Shape [type="+type+", r="+r+"]";
   }
}

class Rectangle extends Shape{
   //사각형 넓이
   //사각형 둘레
   int width, height;
   Rectangle(int width, int height){
      super("사각형");
      this.width = width;
      this.height = height;
      
   }
   @Override
   double area() {
      return width*height;
   }
   @Override
   double length() {
      return 2*(width+height);
   }
   public String toString() {
      return "Shape [type="+type+", width="+width+", height="+height+"]";
   }
}






public class ShapeEx {

   public static void main(String[] args) {
      //Circle(int r) 생성자 호출
      Circle cir = new Circle(10);
      System.out.println(cir);
      System.out.println(cir.toString());
      System.out.println("반지름 r변수 = "+cir);
      System.out.println("원의 넓이"+cir.area());//호출도 하고 결과값도 가지고 있다.
      System.out.println("원의 넓이"+cir.length());
      System.out.println("----------------------------------------");
      //Rectangle(int width, int height) 생성자 호출
      Rectangle rect = new Rectangle(5,5);
      System.out.println(rect);
      System.out.println(rect.toString());
      System.out.println("사각형 width변수 = "+rect.width);
      System.out.println("사각형 heigth변수 = "+rect.height);
      System.out.println("사각형의 넓이"+rect.area());//호출도 하고 결과값도 가지고 있다.
      System.out.println("사각형의 넓이"+rect.length());
      System.out.println("----------------------------------------");
      //객체 배열
      Shape[] shape = new Shape[2];
      shape[0]  = new Circle(10);
      shape[1]  = new Rectangle(5,5);
      
      for(Shape s : shape) {
         System.out.println(s);
         System.out.println("넓이 : "+s.area()+"둘레"+s.length());
      }
      
   }

}
​

package chapter25;
class GraphicCard{
   int memory;
   public void process(){
      System.out.println("그래픽 처리");
   }
}
class Amd extends GraphicCard{//상속
   public void process(){
      System.out.println("AMD 그래픽 처리");
   }
}
class Nvidia extends GraphicCard{//상속
   public void process(){
      System.out.println("Nvidia 그래픽 처리");
   }
}
class Game{
   /*
   void display(GraphicCard gc) {
      gc.process();
   }
   void display(Amd gc) {
      gc.process();
   }
   void display(Nvidia gc) {
      gc.process();
   }
   */
   void display(GraphicCard gc) {
      gc.process();
   }
}
public class Computer {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      GraphicCard gc = new GraphicCard();
      System.out.println(gc.toString());
      gc.process();
      gc = new Amd();
      //상위 클래스로 업케스팅된 상태에도 하위 클래스의 메서드가 동일한 메서가 있으면
      //상위 클래스의 메서드를 고쳐서 사용한다고 생각하기 때문에 하위 클래스의 메서드로 수행히게 된다
      gc.process();
      gc =new Nvidia();
      gc.process();
      Game g = new Game();
      GraphicCard gc1 = new GraphicCard();
      g.display(gc1);
      Amd gc2 = new Amd();
      g.display(gc2);
      Nvidia gc3 = new Nvidia();
      g.display(gc3);
   }

}

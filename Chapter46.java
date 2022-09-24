package chapter46;
class Singletone{
   
   //static 변수
   private static Singletone intstance = new Singletone();
   
   private int id;
   private String name;
   //기본 생성자
   private Singletone(){
      this.id = 1000;
      this.name = "java";
   }
   //static 메서드
   public static Singletone  getInstance() {
      System.out.println("객체 리턴");
      return intstance;//호출한 곳으로 결과값을 돌려준다!!!
   }
   /*
   @Override
   public String toString() {
      return "id = "+ id+", name = "+name;
   }
   */
   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
}

public class SingleToneMain {

   public static void main(String[] args) {
      //Singletone s =new Singletone();//새로운 객체가 생성되지 않는다
      //호출도 하고 결과 결과값도 가지고 있다
      Singletone s1 = Singletone.getInstance();
      
      //toString() 메서드를 오버라이드 시켜서 객체 내용을 그대로 출력해준다!!
      System.out.println("s1 = "+s1);
      System.out.println(s1.getId());
      System.out.println(s1.getName());
      System.out.println("---------------------------");
      //새로운 객체를 생성해도 객체 주소값이 동일하다
      Singletone s2 = Singletone.getInstance();
      //toString() 메서드를 오버라이드 시켜서 객체 내용을 그대로 출력해준다!!
      System.out.println("s2 = "+s2);
      System.out.println(s2.getId());
      System.out.println(s2.getName());
      System.out.println("---------------------------");
      //변수 데이터 값을 새로 지정하면 다음 객체를 생성하면 수정한 값으로 돌려준다
      //public void setId(int id) 함수 호출
      s2.setId(2000);
      //public void setName(String name) 함수 호출
      s2.setName("programming");
      System.out.println("s2 = "+s2);
      System.out.println(s2.getId());
      System.out.println(s2.getName());
      System.out.println("---------------------------");
      
      Singletone s3 = Singletone.getInstance();
      
      //toString() 메서드를 오버라이드 시켜서 객체 내용을 그대로 출력해준다!!
      System.out.println("s3 = "+s3);
      System.out.println(s3.getId());
      System.out.println(s3.getName());
      System.out.println("---------------------------");
   }

}

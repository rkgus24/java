package chapter55;

import java.io.IOException;

public class ThreadEx1 {
   public static void main(String[] args) {
      try {
         //메모장 실행
         Process p1 = Runtime.getRuntime().exec("notepad.exe");
         //그림파 실행
         Process p2 = Runtime.getRuntime().exec("mspaint.exe");
         p1.waitFor();//p1 프로세서가 종료될때 까지 대기
         p2.destroy();//p1 프로세서가 종료되면 실행
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
   }
}

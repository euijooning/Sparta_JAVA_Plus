package Prac20.clean;

public class CleanThread extends Thread {
  public void run() {
      System.out.println("직원 청소 시작 (Thread)~~~");

      // 짝수방 홀수방 서로 하기로 했으므로(직원은 2, 4, 6, 8, 10번 방)
      for (int i = 2; i <= 10; i+=2) {
        System.out.println("(직원) " + i + " 번 방 청소 중 (Thread)");
      }
      System.out.println("직원 청소 끝 (Thread) ~~~");
      }

}

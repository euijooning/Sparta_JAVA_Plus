package Prac20;

import Prac20.clean.CleanThread;

// day20 뒷부분
public class _01_Thread {
  public static void main(String[] args) {
     // 쓰레드
    // 실행 가능한 형태의 exe // 실행하는 형태는 프로세스 // 모든 프로그램은 하나의 쓰레드 안에서 하나의 프로세스가 실행되는 것.
    // 프로세스는 여러개의 쓰레드를 가질 수 있으나, 일반적으로 하나의 프로그램은 하나의 쓰레드가 있다고 생각하자.

    // 1 3 5 7 9
    // 2 4 6 8 10

    // 쓰레드는 별도의 패키지를 만들어서 실행
    // cleanByMySelf();

    CleanThread cleanThread = new CleanThread();
  //  cleanThread.run(); // 직원 청소
    cleanThread.start();

    cleanByBoss(); // 사장 청소

  }
  public static void cleanByMySelf() {
    System.out.println("혼자 청소 시작~~~");

    for (int i = 1; i <= 10; i++) {
      System.out.println("(혼자) " + i + " 번 방 청소 중");
    }
    System.out.println("혼자 청소 끝.");
  }

  public static void cleanByBoss() {
    System.out.println("사장 청소 시작~~~");

    for (int i = 1; i <= 10; i+=2) { // 1, 3, 5, 7, 9번 방 청소하기로 했으므로.
      System.out.println("(사장) " + i + " 번 방 청소 중");
    }
    System.out.println("사장 청소 끝~~.");
  }
}
/*
우리가 thread를 실행할 때, 지금 run() 이면 한 명이 청소가 끝나야 다른 한 명이 청소를 시작해서 끝내더라.
run() 메서드를 직접 호출하면 안 된다.
그러면 그냥 쓰레드 안에 있는 run() 메서드를 수행하는 것 뿐이고,
이를 별도의 Thread로 만들어서 수행하기 위해서는 run() 이 아니라 start() 메서드를 써줘야 한다.

 */

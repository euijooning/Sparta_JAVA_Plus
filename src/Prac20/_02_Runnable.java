package Prac20;

import Prac20.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable(); // 객체 생성
        Thread thread = new Thread(cleanRunnable);
        thread.start(); // run() 아님. CleanRunnable에서 정의되어 있는 동작을 새로운 쓰레드를 만들어서 수행하게 되는 것.

        cleanByBoss();

        // 실행을 할 때마다 순서가 조금씩 다르게 나올 수 있다. 순서를 확실하게 보장하는 건 아니기 때문이다.
    }

    // _01_Thread에서 만들었던 메서드와 동일
    public static void cleanByBoss() {
        System.out.println("--사장 청소 시작--");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i +" 번방 청소 중");
        }
        System.out.println("--사장 청소 끝--");
    }
}
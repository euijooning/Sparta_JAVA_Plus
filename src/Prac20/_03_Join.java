package Prac20;

import Prac20.clean.CleanRunnable;

public class _03_Join {
    // 사장이 직원 고용해놓고 청소를 시키는데, 얘가 잘 하고 있는지 의심이 드는 상황.
    // 그래서 사장이 직원 끝난 후에 자기도 청소를 시작하려고 한다. **
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
//            thread.join(); 이거 지연시간 2.5초 추가
            thread.join(2500); // try-catch로 감싸야 한다.
            // 사장이 온전히 기다렸다가 하면 직원채용의 의미가 없으니 2.5초만 참자 느낌으로 추가.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    //_01_Thread의 cleanByBoss와 동일.
    public static void cleanByBoss() {
        System.out.println("--사장 청소 시작--");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i +" 번방 청소 중");
            try {
                Thread.sleep(1000); //지연, 이것도 try-catch 감싸야.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("--사장 청소 끝--");
    }
}
/**
 * join()의 역할
 * 쓰레드가 시작해서 종료될 때까지 기다렸다가
 * 끝난 후 다음 메서드로 넘어가서 실행되는 것.
 */
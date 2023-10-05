package Prac20;

import Prac20.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        Room room = new Room();
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() { // MultiThread 메서드 그대로 가져오고 시간 지연 부분만 지운다. 반복문도 살짝 수정
                System.out.println("--직원1 청소 시작 --");
//                for (int i = 1; i <= 10; i+=2) {
                for (int i = 1; i <= 5; i++) {
//                    System.out.println("직원 1) " + i +" 번방 청소 중");
                     room.clean("직원1");

                     // 사고 났을 때 추가!!!
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if(i==2) {
                        throw new RuntimeException("못해 먹겠다~~");
                    }
                }
                System.out.println("--직원1 청소 끝 --");
            }
        };

        Runnable cleaner2 =() -> {
            System.out.println("--직원2 청소 시작 --");
//            for (int i = 2; i <= 10; i+=2) {
            for (int i = 1; i <= 5; i++) {
//                System.out.println("직원 2) " + i +" 번방 청소 중");
                room.clean("직원2");

                // 사고 났을 때 추가!!! 2222
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            System.out.println("--직원2 청소 끝 --");
        };

        Thread cleaner1Thread = new Thread(cleaner1);
        Thread cleaner2Thread = new Thread(cleaner2);

        cleaner1Thread.start();
        cleaner2Thread.start();

    }
}
/**
 * 두 쓰레드가 동시에 한 리소스에 접근하려고 하면 동시성 문제가 발생해서 똑같이 1번방이 두 번 나오는 이상한 경우도 발생한다.
 * 사실 이건 이상한 건 아니다.
 */

package Prac20;

public class _04_MultiThread {
    // 말 그대로 쓰레드가 두 개 이상인 것(여러 개)
    // 사장님이 감독도 해야 하고 자기도 청소도 해야 하니까 매우 비효율성을 느낌.
    public static void main(String[] args) {

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() { //CleanRunnable의 코드를 그대로 가져옴.
                System.out.println("--직원1 청소 시작 --"); // 1로 바꾸고, 쓸데 없는 부분 지움
                for (int i = 1; i <= 10; i+=2) { // 1번방이므로 1부터 시작
                    System.out.println("(직원1) " + i +" 번방 청소 중");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("--직원1 청소 끝 --");
            }
        };

        Runnable cleaner2 =() -> { // 이건 람다식을 이용해서 만들어봄.
            System.out.println("--직원2 청소 시작 --");
            for (int i = 2; i <= 10; i+=2) {
                System.out.println("(직원2) " + i +" 번방 청소 중 ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("--직원2 청소 끝 --");
        };

        // 두 명의 직원을 채용했으니 쓰레드 두 개 생성
        Thread cleaner1Thread = new Thread(cleaner1);
        Thread cleaner2Thread = new Thread(cleaner2);

        cleaner1Thread.start();
        cleaner2Thread.start();

    }
}
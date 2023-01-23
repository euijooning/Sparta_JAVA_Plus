package Prac11;

public class Taxi11 implements Meter11 {
    //Meter10 인터페이스의 start와 stop 메서드를 구현해야 한다.

    public int BASE_FARE = 3000;

    @Override
    public void start() {
        System.out.println("운행을 시작합니다.");

    }

    @Override
    public int stop(int distance) {
        int fare = BASE_FARE + distance * 2; //요금 책정하는 방식. 즉 운행이 종료되면 요금을 알 수 있도록 로직을 작성한다.
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원 입니다.");
        return fare;
    }
}

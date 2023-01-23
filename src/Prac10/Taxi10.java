package Prac10;

public class Taxi10 implements Meter10 {

    @Override
    public void start() {
        System.out.println("운행을 시작합니다.");

    }

    @Override
    public int stop(int distance) {
        int fare = BASE_FARE + distance * 2; //요금 책정하는 방식
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원 입니다.");
        return fare;
    }
}

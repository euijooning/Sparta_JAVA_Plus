package Prac10;

interface OperateCar10 {
    void start();
    void stop();
    void setSpeed(int speed);
    void turn(int degree);
}

class AutoCar10 implements OperateCar10 {
    @Override
    public void start() {
        System.out.println("자동차가 출발합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 멈춥니다.");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("자동차가 속도를 " + speed + "km/h 로 바꿉니다.");
    }

    @Override
    public void turn(int degree) {
        System.out.println("자동차가 방향을 " + degree + "도 만큼 바꿉니다.");
    }
}

public class Day10_6_OperateCar { // 인터페이스는 그 기능을 꼭 구현할 것을 강제하므로, 동작을 할 거라고 보장이 가능하다.
    public static void main(String[] args) {
        OperateCar10 car = new AutoCar10();
        car.start();
        car.setSpeed(70);
        car.turn(30);
        car.stop();
    }

}

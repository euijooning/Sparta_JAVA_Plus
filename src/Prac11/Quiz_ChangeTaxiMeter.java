package Prac11;

public class Quiz_ChangeTaxiMeter {
    public static void main(String[] args) {

        Taxi11 taxi = new Taxi11();
        taxi.start();
        taxi.stop(20);

        System.out.println("=====================");
        System.out.println("기본요금 인상 후");
        taxi.BASE_FARE = 4500;
        taxi.start();
        taxi.stop(20);
    }
}
/*
정리하자면, 인터페이스 내의 숫자는 상수가 된다.
다른 클래스에 final 키워드가 있기 때문에 인터페이스 내에서 변경이 불가능하다.
따라서 상수로 선언된 요금을 변경하고 싶다면, 요금에 관련된 내용을 Taxi클래스로 옮겨 오시구요.
그러고 나서 구현하는 부분에서 요금을 변경해서 사용하면 된다.
 */

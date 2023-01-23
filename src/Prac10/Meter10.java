package Prac10;
// 1) 인터페이스 실습예제 : 택시미터기

//Meter(택시 미터기)인터페이스는 start와 stop이라는 추상 메소드를 가지고 있습니다.
// stop메소드는 달린 거리에 해당하는 값(distance)를 매개변수로 받아
// 요금을 반환하는 메소드입니다.
// Meter인터페이스를 구현하는 택시 클래스를 완성해 보세요.
// 요금은 distance x 2로 계산이 됩니다. (stop 메서드)

public interface Meter10 {

        public int BASE_FARE = 3000;     // 기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없다.)

        public abstract void start();
        public abstract int stop(int distance);

}

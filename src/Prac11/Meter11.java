package Prac11;

public interface Meter11 {
   // public int BASE_FARE = 3000;     // 기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없다.)
    // 이걸 한 번 바꿔보고 싶어요! // 어떻게? 여기서는 지워주시고, 택시 클래스에서 멤버 변수로 선언해주시면 됩니다.


    public abstract void start();
    public abstract int stop(int distance);
}

package Prac11.Detector;

public interface Detectable {
    // <추가> 2. 인터페이스 내에서 어떤 변수를 정의한다고 해보면,
    // String name = "감지자";
    // 앞에 추가되어있는 거 잘 생각하자
    public static final String name = "감지자";

   // <추가> 1. 사실 숨겨져 있던 게 있다.
    public abstract void detect();

}

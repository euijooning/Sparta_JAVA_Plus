package Prac11.Camera;

public class SpeedCam11 extends Camera11 {
    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
        System.out.println("사고를 감지합니다.");
    }

    //기능추가
    public void report() {
        System.out.println("사고를 신고합니다.");
    }
}
// 부연설명
/*
그런데 이런 기능들이 점점 많아진다면, 기능의 중복이 발생할 수 있게 되겠지.
이러한 경우에 인터페이스로 빼서 꼭 필요한 기능을 구현할 수 있도록 만들어준다.
 */
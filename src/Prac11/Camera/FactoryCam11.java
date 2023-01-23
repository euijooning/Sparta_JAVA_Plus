package Prac11.Camera;

public class FactoryCam11 extends Camera11 { //Camera가 추상클래스이기 때문에 반드시 구현해야 할 것이 있음을 보여준다.


    @Override
    public void showMainFeature() { // 주요특징
        System.out.println("화재를 감지한다.");
    }

    //InterTest11 만들고 추가한 내용
    public void detect() {
        System.out.println("화재를 감지합니다.");
    }

    public void report() {
        System.out.println("화재신고를 진행합니다.");
    }
}

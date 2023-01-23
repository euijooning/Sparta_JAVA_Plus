package Prac11.Camera;

public class FactoryCam11 extends Camera11 { //Camera가 추상클래스이기 때문에 반드시 구현해야 할 것이 있음을 보여준다.


    @Override
    public void showMainFeature() {
        System.out.println("화재를 감지한다.");
    }
}

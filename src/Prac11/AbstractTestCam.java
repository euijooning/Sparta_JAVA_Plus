package Prac11;

import Prac11.Camera.FactoryCam11;
import Prac11.Camera.SpeedCam11;

public class AbstractTestCam {
    public static void main(String[] args) {
    //    Camera11 cam = new Camera11(); //처음에 빨간 줄이 뜨는 이유는 이게 추상클래스이기 때문에 객체 생성이 불가능하다.

        FactoryCam11 factoryCam = new FactoryCam11(); // Camera11 fcatoryCam = new Factorycam11(); 도 가능하다는 이야기
        factoryCam.showMainFeature();

        SpeedCam11 speedCam = new SpeedCam11();
        speedCam.showMainFeature();
    }
}
/*
<정리>
추상클래스를 상속받은 자손클래스는
부모타입으로 객체 생성도 가능하다. Camera11 fcatoryCam = new Factorycam11(); 도 가능하다는 이야기
 */

package Prac11.Camera;

import Prac11.Detector.Detectable;
import Prac11.Reporter.Reportable;

public class FactoryCam11 extends Camera11 implements Detectable, Reportable { //Camera가 추상클래스이기 때문에 반드시 구현해야 할 것이 있음을 보여준다.
//implement 뒷부분이 추가된 내용임. 안에 오버라이딩도 해줬어 헷갈리지 말 것.

    private Detectable detector;
    private Reportable reporter;
    // 요 선언한 변수의 값은 외부에서 Setter을 통해 값을 넣어주도록 하겠다.


    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }


    @Override
    public void showMainFeature() { // 주요특징
        System.out.println("화재를 감지한다.");
    }

    @Override
    public void detect() {
        detector.detect();

    }

    @Override
    public void report() {
        reporter.report();
    }
    /*
    우리는 이 객체를 만들 때, 전달받는(Setter을 통해) Detector와 Reporter을 통해서 이것들의 detect와 report기능들을 그대로 쓸 수 있게 된다.
     */

    /*
    이것들을 직접 여기서 구현하는 메서드를 쓰지 않구요.
    Detectable과 Reportable을 구현하는 클래스를 이용해서 만들어볼게요. 설명 이후 일단 주석처리함.(선후관계 잘 파악해라!)

    //InterTest11 만들고 추가한 내용
    public void detect() {
        System.out.println("화재를 감지합니다.");
    }

    public void report() {
        System.out.println("화재신고를 진행합니다.");
    }
}

     */
}
/*
FactoryCam에는 화재를 감지하는 기능과 신고하는 기능이 있었는데, 이것들을 직접 여기서 구현하는 메서드를 쓰지 않구요.
Detectable과 Reportable을 구현하는 클래스를 이용해서 만들어볼게요.
 */
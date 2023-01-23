package Prac11;

import Prac11.Camera.FactoryCam11;
import Prac11.Detector.AdvancedFireDetector;
import Prac11.Detector.Detectable;
import Prac11.Detector.FireDetector;
import Prac11.Reporter.AdvancedReporter;
import Prac11.Reporter.NomalReporter;

public class InterTest11 {
    public static void main(String[] args) {
        NomalReporter nomalReporter = new NomalReporter();
        nomalReporter.report();

        AdvancedReporter advancedReporter = new AdvancedReporter();
        advancedReporter.report();

        System.out.println();
        System.out.println("---------------구분선---------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println();
        System.out.println("---------------구분선---------------");

        FactoryCam11 factoryCam = new FactoryCam11();
        factoryCam.setDetector(fireDetector);  // 일반성능으로 화재를 감지합니다.
        factoryCam.setReporter(nomalReporter); // 텍스트로 일반 화재를 신고합니다.
        // factoryCam.setDetector(advancedFireDetector); // 향상된 성능으로 화재를 감지합니다.
        //factoryCam.setReporter(advancedReporter); 두개를 써도 됨 // 직전 30초 영상과 함께 신고를 진행합니다.

        factoryCam.detect();
        factoryCam.report();
    }
}

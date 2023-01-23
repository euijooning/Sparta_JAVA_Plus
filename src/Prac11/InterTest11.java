package Prac11;

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
    }
}

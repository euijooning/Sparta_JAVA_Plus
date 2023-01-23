package Prac11;

import Prac11.Reporter.AdvancedReporter;
import Prac11.Reporter.NomalReporter;

public class InterTest11 {
    public static void main(String[] args) {
        NomalReporter nomalReporter = new NomalReporter();
        nomalReporter.report();

        AdvancedReporter advancedReporter = new AdvancedReporter();
        advancedReporter.report();
    }
}

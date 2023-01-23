package Prac11.Reporter;

public class AdvancedReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("직전 30초 영상과 함께 신고를 제출합니다.");
    }
}

package Prac11.Reporter;

public class NomalReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("텍스트로 일반 화재를 신고합니다.");
    }
}

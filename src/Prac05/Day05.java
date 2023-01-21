package Prac05;

public class Day05 {
    // 메서드
    /*
    메서드 문법
    public 반환타입 메서드명(파라미터) {
        실행코드
        return ;
    }
     */

    public static void printInfo() {
        String title = "웹개발의 봄, Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);


    }
    public static void main(String[] args) {
        printInfo();
        printInfo();

    }
}

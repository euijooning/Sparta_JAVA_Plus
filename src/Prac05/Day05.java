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
/*
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
 */
    // 파라미터 X, 반환값 X
    // 메서드니까 public을 붙였고, main문 안에서 실행할 테니 static, 반환값 없으니 void
    // 넘겨받는 파라미터도 없는데, 그 이야기는 simplePrint를 호출했을 때, 요 실행문{ }안의 코드가 출력이 된다는 뜻
    public static void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }

    // 파라미터 O, 반환값 X
    // simpleSum 함수를 main문에서 호출했을 때, 두 개의 정수타입을 넘겨줘야 한다는 의미.
    // 두 개의 정수만 넘겨주면, 해당 함수가 실행된다.
    public static void simpleSum(int num1, int num2) {
        System.out.println("num1 :" + num1 + ", num2: " + num2);
    }

    // 파라미터 X, 반환값 O
    public static int simpleReturn() {
        return 3;
    }

    // 파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        simplePrint();
        simpleSum(1,3);
        simpleReturn(); // 이건 출력문이 없기 때문에 콘솔에서 받을 수 없겠죠.
        // 이게 int타입이었으니까, int 타입의 변수를 선언해줍니다.
        int ret = simpleReturn();
        System.out.println(ret);

        int ret1 = sum(4,9);
        System.out.println(ret1);
    }

}

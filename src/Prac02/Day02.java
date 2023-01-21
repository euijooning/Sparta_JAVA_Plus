package Prac02;

public class Day02 {
/*
    public static void main(String[] args) {

        //묵시적 형변환
        //자료형의 크기가 서로 다른 자료의 연산 결과는 크기가 큰 자료형으로 자동 변환된다.

        System.out.println(5 + "/" + 3 + "=" + 5 / 3);
        System.out.println(5 + "/" + 3 + "=" + 5 / 3.);
        System.out.println('A' + "+" + 32 + "=" + ('A' + 32)); //int가 더 크므로 숫자로 나오게 된다. 65+32 한 결과
        System.out.println('a' + "-" + 32 + "=" + ('a' - 32)); // 97-32 한 결과

        //명시적 형변환 => casting
        // 프로그래머가 그 순간의 자료형을 지정할 수 있다.
        System.out.println(5 + "/" + 3 + "=" + (int) 5 / 3);
        System.out.println(5 + "/" + 3 + "=" + (double) 5 / 3.);
        System.out.println('A' + "+" + 32 + "=" + (char) ('A' + 32));
        System.out.println('a' + "-" + 32 + "=" + (char) ('a' - 32));
    }
 */

    // 삼항 연산자
    // 조건식 ? 참 : 거짓 ;
    public static void main(String[] args) {


    int c = 5;
    String result = (c<10) ? "10보다 작다" : "10보다 크다";
        System.out.println(result);
    }
}

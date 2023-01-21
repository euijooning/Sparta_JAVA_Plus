package Prac02;

import java.util.Scanner;

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
/*
    // 삼항 연산자
    // 조건식 ? 참 : 거짓 ;
    public static void main(String[] args) {


    int c = 5;
    String result = (c<10) ? "10보다 작다" : "10보다 크다";
        System.out.println(result);
    }
 */
//실습01. 삼항연산자를 이용하여 12시보다 작으면 오전, 크면 오후를 출력
/*
    public static void main(String[] args) {
        int h = 11;
        String result2 = (h<12) ? "오전" : "오후";
        System.out.println(result2);

    }
 */

    //실습02. 알파벳 출력하기
/*
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        System.out.println("알파벳을 입력하세요:  ");

    char alpha = scanner.nextLine().charAt(0); //charAt은 문자를 하나하나 출력하는 내장함수.
    int ialpha = (int) alpha; // 문자열로 받았으니, alpha를 강제 형변환하여 새로운 변수에 저장.
        System.out.println(ialpha);

    // 출력 예시
    String str = "안녕하세요";
        System.out.println(str.charAt(1));
    }
 */

    // 전위 연산자와 후위 연산자
    /*
    public static void main(String[] args) {

        int a = 10;
        int b;

    b = a++;
        System.out.println(b); //b=10
        System.out.println("a =" + a + " b=  "+ b); //a=11, b=10

    b = ++a;
        System.out.println(b); // b=12
        System.out.println("a =" + a + " b=  "+ b); //a=12, b=12
    }
     */

// == 과 equals //reference type
public static void main(String[] args) {


        String text1 = "sample"; //리터럴 타입으로 생성
        String text2 = text1;

        String text3 = new String("sample"); //new 연산자를 이용한 방식
        String text4 = new String("sample");


        System.out.println(text1 == text2);            //true
        System.out.println(text1.equals(text2));    //true
        System.out.println(text3 == text4);            //false --> 주솟값 비교를 하기 때문에!!!
        System.out.println(text3.equals(text4));    //true
    }
}

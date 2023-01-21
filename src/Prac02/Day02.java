package Prac02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    /*
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
     */
// 배열
// 원격강의자료 복습

// 배열요소에 값을 넣으려면 어떻게 해야할지 작성을 해보세요.
// 이 문제는 배열을 생성한 후에 데이터 값을 입력하는 방법에 대해 아는 문제 입니다.
/*
        //[1]배열선언
        int[] num = new int[5]; // 선언과 동시에 크기 지정해준다.
        //[2] 선언한 배열공간에 값 입력하기
        num[0] = 3;
//      num[0] = 35; //배열변수[인덱스] = 값 의 형태로 기존 요소의 값을 덮어쓸 수 있습니다.
        num[1] = 11;
        num[2] = 22;
        num[3] = 33;
        num[4] = 44;

        //[3] 값출력하기
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[num.length - 1]); // 길이보다 하나 작은 위치에 있는 값 : 여기서는 44
        // 길이를 구할때
        System.out.println(num.length);

        // 아니면 아예 선언하면서 초기값을 줄 수도 있다.
        int[] num2 = {100, 200, 300, 400};
        System.out.println(num2); //이건 주솟값이 나왔어 : 보니까 완전 이상한 숫자네
        System.out.println(Arrays.toString(num2)); // 배열의 요소 출력 -> toString
 */
// 실습 : 봄, 여름, 가을, 겨울을 넣고 출력하라
    /*
    public static void main(String[] args) {


    String[] season = new String[4];
    season[0] = "봄";
    season[1] = "여름";
    season[2] = "가을";
    season[3] = "겨울";

    //또는
    String[] season1 = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season1));
    }


//List 설명
/* 정보를 묶을 때 List 라는 녀석을 사용합니다. 세 가지를 기억하시면 돼요.
1. 순서가 중요한 녀석이에요!
2. 같은 자료형만 넣을 수 있어요
3. 넣을 때는 add, 조회할 때는 get, 제거할 때는 remove를 사용합니다.
*/


        //리스트는 초기에 크기가 정해져있는게 아니라, 가변적으로 변할 수 있게 됨
        public static void main(String[] args) {


        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");
        System.out.println(fruits);
   }
}


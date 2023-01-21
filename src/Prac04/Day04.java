package Prac04;

import java.util.Scanner;

public class Day04 {

    /*
    //3일차 마지막 뮈즈
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 중 프로그래밍 언어가 아닌것은?");
        System.out.println("1. Javascript\n2. Java\n3. 망둥어\n4. HTML");
        int num = sc.nextInt();

        if (num == 3) {
            System.out.println("정답입니다.");
        } else if (num == 1 || num == 2 || num == 4) {
            System.out.println("오답입니다.");
        } else {
            System.out.println("잘못 입력 하셨습니다. ");

        }
    }

     */
/*
    // while문 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //변수 선언
        int num = 0;
        while (num != 3) {
            System.out.println("다음 중 프로그래밍 언어가 아닌것은?");
            System.out.println("1. Javascript\n2. Java\n3. 망둥어\n4. HTML\n0.프로그램에서 나가기 " );
            num = sc.nextInt();

            if (num == 3) {
                System.out.println("정답입니다.");
            } else if (num == 1 || num == 2 || num == 4) {
                System.out.println("오답입니다.");
            } else if (num==0) {
                System.out.println("프로그램에서 나갑니다.");
                break;
            } else {
                System.out.println("잘못 입력 하셨습니다. ");

            }
        }
    }
 */
/*
// [퀴즈] 1부터 10까지의 합 출력
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) { // 0부터 시작할것이므로 <10
            sum +=(i+1); // 그래서 1부터 누적되므로 i+1로 적어준다.
            // System.out.println(sum); => 여기다 쓰면 더하는 과정이 전부 보인다!
        }
        System.out.println(sum);
    }
 */
/*
    // for- each문 : 각각 하나씩을 돌면서 꺼내와줘!

    public static void main(String[] args) {
        String[] seasons = {"봄", "여름", "가을", "겨울"};

        for (String season : seasons) {// season은 for을 통해서 담을 변수 season은 꺼내올 곳 / 즉 seasons에서 꺼내서 하나씩 season에 담아줘.
            System.out.println(season);
        }
    }
 */
    /*
for-each문은 삼항연산자와 생긴 게 비슷하다고 느끼시는 분들이 있을 텐데요.
삼항연산자는 자료형이랑 변수명을 사용하고, 조건식을 쓰고, 참일 때 실행 코드, 거짓일 때 실행 코드를 사용했다면,
for-each문은 콜론을 기준으로 내가 담을 변수를 자료형과 함께 선언해주고, 기존에 있던 변수에서 하나씩 꺼내오는 형태로 쓰게 된다.
 */


// while문
    // while   VS   for
    // while: 반복횟수가 불확실할때, 무한히 반복해야 할 때
    // for: 명확할때, 배열과 함께

    // 코드의 간략화,간소화
    // 코드의 재사용성 증가 << 비용 절감

    // for문 문법
    // for(시작조건(초기식); 반복을 계속할조건(종결식); 더하기(증감식)) {실행문}

    // 문제 : for문처럼, 1에서 10까지 더하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        int i = 0;
        int sum1 = 0;

        while(i<10) { //괄호 안에 범위가 들어가지 않고 조건식이 들어간다.
            sum1 += (i+1);
            i++; // 이게 없으면 무한루프를 돈다.
        }
        System.out.println(sum1);
    }
}

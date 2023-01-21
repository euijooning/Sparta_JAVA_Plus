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

// [퀴즈] 1부터 10까지의 합 출력
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) { // 0부터 시작할것이므로 <10
            sum +=(i+1); // 그래서 1부터 누적되므로 i+1로 적어준다.
            // System.out.println(sum); => 여기다 쓰면 더하는 과정이 전부 보인다!
        }
        System.out.println(sum);
    }
}

package Prac04;

import java.util.Scanner;

public class Day04 {
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
}

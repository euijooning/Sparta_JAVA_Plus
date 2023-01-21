package Prac04;

import java.util.Scanner;

public class Quiz_Day04 {
    public static void main(String[] args) {
        // 퀴즈 01. 정수를 입력받아서 홀수의 개수를 구하는 프로그램 만들기.
            Scanner sc = new Scanner(System.in);
            System.out.println("정수를 입력해주세요:  ");
            int num = sc.nextInt();

            int i = 1; //i는 양의정수이므로.
            int total = 0; // 전체 개수 구하는 변수

            while (i<=num) {
                //홀수이면 값 증가하게
                if(i%2 == 1) {
                    total++;
                }
                i++;
            }
            System.out.println(num+ "까지의 홀수의 개수는 " + total + " 개 입니다.");
        }
}


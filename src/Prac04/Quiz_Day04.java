package Prac04;

import java.util.Scanner;

public class Quiz_Day04 {
    /*
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
     */
    /*
// 퀴즈 02. 자연수 n을 입력받아 n까지의 짝수합을 구하는 프로그램을 구현하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자연수 n을 입력하세요: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <=num; i++) {
            if(i%2==0) { // 짝수인지를 먼저 판별
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
     */
//퀴즈 03. 숫자 10개를 입력을 받아 짝수와 홀수의 개수를 구하는 프로그램을 작성하시오.
    // 힌트 : 각 숫자들을 변수에다 담아줄 것이고, 숫자의 홀짝을 판별하게 되고,
    // 출력할 때에는 각각의 개수가 계산되어 나오도록 짝수, 홀수 변수도 나오게 만들어야한다.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 10개 입력해주세요:  ");

        int even = 0; //짝수 판별 위한 변수
        int odd = 0; // 홀수 판별 위한 변수

        for (int i = 0; i < 10; i++) { //0번째 인덱스부터 10개를 돌 거니까
            System.out.println((i+1) + "번째 숫자 : ");
            int num = sc.nextInt();

            if(num%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("짝수의 개수: " + even + "  홀수의 개수: "  + odd); // for문 다 끝난 후에 써줘야하지.
    }
}


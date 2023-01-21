package Prac07;

import java.util.Scanner;

public class Day07 {
    // 퀴즈 : 숫자 거꾸로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        System.out.println("숫자를 입력하세요: ");

        // 숫자를 100개까지 입력받는 부분
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 입력받은 것을 배열의 i번째에다가 담아주자!
            if (arr[i] == 0)
                break;
        }
        // 거꾸로 출력하는 부분
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0)
                System.out.print(arr[i] + " ");

        }
    }
}

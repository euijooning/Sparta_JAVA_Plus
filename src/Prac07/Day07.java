package Prac07;

import java.util.Random;
import java.util.Scanner;

public class Day07 {
    /*
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
     */

/*
    // 퀴즈02 . Updown Game
    public static void main(String[] args) {


        Random random = new Random();
        // int num = (int) (Math.random() * 100);
        int num = random.nextInt(100)+1; // 100개의 숫자를 임의로 발생시킨다.
        Scanner scanner = new Scanner(System.in);

        int count = 0; // 총 횟수가 필요하므로 초기화

        while (true) { // 숫자를 맞출때까지 프로그램을 무한반복한다. 그래서 while을 true로 적었다.
            System.out.println("숫자를 입력하세요.");
//          cpu가 생성한 Random숫자 콘솔에서 확인(인쇄)할 수 있음.
//          System.out.println(num);

            int m = scanner.nextInt();

            if (num > m) {
                count++; // 정답을 맞출 때까지 횟수는 계속 늘어나므로!!!
                System.out.println("up");
            }
            if (num < m) {
                count++;
                System.out.println("down");
            }
            if (num == m) {
                count++;
                System.out.println(count + " 회쨰 정답!");
                break;
            }
        }
    }

 */
// 퀴즈 03. 묵찌빠 게임
    public static void main(String[] args) {

        Random random = new Random();
        int cpu = random.nextInt(3)+1;
//            System.out.println("CPU: " + cpu);

        Scanner sc = new Scanner(System.in);
        System.out.println("가위(1), 바위(2), 보(3): ");
        int user = sc.nextInt();



        if(cpu == 1 && user == 2 || cpu ==2 && user ==3 || cpu ==3 && user ==1) {
            System.out.println("이겼습니다.");
        } else if (cpu == user) {
            System.out.println("비겼습니다.");

        }else {
            System.out.println("졌습니다. ");
        }
    }
}

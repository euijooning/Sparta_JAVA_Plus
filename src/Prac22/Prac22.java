package Prac22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Prac22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Inflearn_Spring\\sparta_java_park\\src\\Prac22\\saying.txt"))) {
            // 파일경로
            System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
            System.out.println("---------------------------------------------------");

            String quiz; // 문제 변수
            String answer; // 정답 변수
            String input; // 입력 변수

            /**
             * 파일에서 내용을 읽어 오고 출력한 다음에
             * 사용자로부터 어떤 값을 입력 받고
             * 확인해서 값이 정답인지를 확인
             */
            while (true) { // 계속 반복
                quiz = br.readLine(); // 문제 내용 읽어오기
                answer= br.readLine(); // 정답 읽어오기
                if(quiz == null || answer == null) { // 더이상 읽어올 것이 없으면
                    break; //탈출
                }
                System.out.println("(문제) " + quiz); // 문제 입력 칸
                System.out.print(" 정답 입력 => "); // 줄바꿈 없이 정답 입력 값

                input = sc.next(); // 스캐너(문자입력)

                if(input.equals(answer)) { // 정답여부 확인
                    System.out.println("정답입니다!!!\n");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.\n");
                }
            }
            System.out.println("---------------------------------");
            System.out.println("모든 퀴즈가 완료되었습니다."); // 마무리 멘트
            System.out.println("수고하셨습니다. ^^");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package Prac06;

import java.util.Scanner;

public class CardPractice06 {
    public static void main(String[] args) {
        // 이름, 잔액, 비밀번호 등을 입력해야 하므로 스캐너 필요.
        Scanner sc = new Scanner(System.in);
        // 그래서 배열 형태가 필요

        Card[] c = new Card[3];

        // 3장이 발급될동안 해당 정보들이 반복될것이므로, for문을 사용해준다.
        for (int i = 0; i < 3; i++) {
            System.out.println("이름: ");
            String name = sc.nextLine();

            System.out.println("비밀번호: ");
            int pw = sc.nextInt();

            System.out.println("잔액: ");
            int bal = sc.nextInt();

            // 이렇게만 두면, 잔액이 버퍼에 남아있으므로, 버퍼를 일부러 한 번 비워주어야 한다.
            sc.nextLine();
            c[i] = new Card(name, pw, bal); //각각 i번째 카드에 정보 입력 후 카드 생성 가능
        }
    }
}

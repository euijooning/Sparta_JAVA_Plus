package Prac05;

import java.util.Scanner;

public class Quiz_Day05 {

    /*
    //퀴즈01. 계산기 만들기

    public static long add(long a, long b) {
        return a + b;
    }

    public static long subs(long a, long b) {
        return a - b;
    }

    public static long mult(long a, long b) {
        return a * b;
    }

    public static double divi(double a, double b) {
        return a / b;
    }


    public static void main(String[] args) {
        long return1 = add(10L, 7L);
        System.out.println(return1);
        long return2 = subs(10L, 7L);
        System.out.println(return2);
        long return3 = mult(10L, 7L);
        System.out.println(return3);
        double returm4 = divi(10L, 7L); // 자동 형변환됨
        System.out.println(returm4);
    }
*/
    // 퀴즈 2
/*
 1. main()에서 가로,세로 길이를 입력하면,
     f1()에서 가로,세로길이를 인자로 받아
    직사각형의 넓이를 리턴하는 함수 작성!

2. main()에서 실수를 1개 입력하면(sc.nextDouble로 실수를 받을 수 있음)
   f2()에서 실수를 인자로 받아서
   해당 실수의 절대값을 출력하는 함수 작성!

3. main()에서 정수 1개 입력하면,
   f3()에서 정수를 인자로 받아서
  홀/짝 출력하는 함수 작성!
 */


    // 직사각형의 넓이(양변의 곱이므로.)
    public static int f1(int x, int y) {
        return x * y;
    }

    //절댓값으로 받기
    public static void f2(double num) {
        // 음수를 받았을 경우에만 양수로 출력해 주면되니까
        // 양수는 그대로 출력하면되고
        // 따라서 음수일때의 경우만 if문으로 처리해 주면 됨.

        if (num < 0.0) { //num이 음수인 경우
            num *= (-1.0); // num=num*(-1.0)
        }
        System.out.println("절대값은 " + num); // 양수인 경우엔 그대로 출력하면 되기 때문에 이렇게만 써주면 된다.
    }

    //짝수/홀수 판별하는 메서드
    public static void f3(int num) {
        if (num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }

    public static void main(String[] args) {
        // 직사각형의 넓이
        Scanner sc = new Scanner(System.in);
        System.out.print("가로입력: ");
        int a = sc.nextInt();

        System.out.print("세로입력: ");
        int b = sc.nextInt();
        int area = f1(a, b);

        System.out.println("넓이: " + area);

        System.out.println(); // 출력시 보기 좋게 줄바꿈을 하기 위한 코드

        // 실수를 절대값
        System.out.print("실수입력: ");
        double d = sc.nextDouble();
        f2(d);

        System.out.println(); // 출력시 보기 좋게 줄바꿈을 하기 위한 코드

        //    홀/짝 출력하는 함수작성!

        System.out.print("정수입력: ");
        int n = sc.nextInt();
        f3(n); // 그냥 함수만 호출하면 콘솔에서 결과를 볼 수 있다.
    }


}

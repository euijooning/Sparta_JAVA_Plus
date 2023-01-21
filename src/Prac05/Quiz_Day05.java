package Prac05;

public class Quiz_Day05 {
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
}

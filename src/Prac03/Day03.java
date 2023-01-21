package Prac03;

public class Day03 {
    public static void main(String[] args) {

        int a = 31;
        if (a > 100) {
            System.out.println("100보다 큰 수입니다.");
        } else if (a <= 100 && a > 50) {
            System.out.println("100보다 작고 50보다 큰 수입니다.");
        } else {
            System.out.println("50보다 작습니다.");
        }
    }
}

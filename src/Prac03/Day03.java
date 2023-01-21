package Prac03;

public class Day03 {
    /*
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
     */
    /*
    public static void main(String[] args) {
        //퀴즈

        int age = 25;
        if(age > 19) {
            System.out.println("성인입니다");
        } else {
            System.out.println("청소년입니다.");
        }
    }

     */
    //삼항연산자로 출력하기
/*
    public static void main(String[] args) {

         int age = 25;
         String result = (age>=19) ? "성인입니다" : "청소년입니다";
         System.out.println(result);

    }
*/

// switch문은 구간처리가 좀 더 명확한 경우에 사용할 수 있다는 것.
    public static void main(String[] args) {


        char score = 'A';
        switch (score) {
            case 'A' :
                System.out.println("A등급");
                break;
            case 'B' :
                System.out.println("B등급");
                break;
            default :
                System.out.println("F등급");
        }
    }



}

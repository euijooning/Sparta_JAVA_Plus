package Prac01;

public class Day01 {
    /*
    public static void main(String[] args) {
     */
        /* 출력하기
        원하는 값으로 출력하기
        1) Hello World!
        2) 안녕 자바!
        3) 안녕
           자바!
        */

/*
        System.out.println("Hello World!");
        System.out.println("------1-------");
        System.out.println("안녕 자바!");
        System.out.println("안녕\t자바");
        System.out.println("------2-------");
        System.out.println("안녕");
        System.out.println("자바");
        System.out.println("안녕 \n자바");
        System.out.println("------3-------");


    }

 */

// 변수(변할 수 있는 값을 담는 저장공간)
// 코드는 오른쪽의 값을 왼쪽에 담는다.
// 변수의 선언방식
// 자료형 변수명 = 값; //변수의 선언과 코드의 흐름

    /*
    public static void main(String[] args) {


        int num = 3;
        System.out.println(num);

        String str = "반갑습니다";
        System.out.println(str);
        System.out.println(num);
    }

     */
/*
// 코드의 흐름
public static void main(String[] args) {

        String str  ="오늘은 화요일";
        // 하나의 스코프(예){}) 안에서는 기존요소의 값을 덮어쓸수 있습니다.

        System.out.println(str);
    }
// 컴파일시 코드는 아래서 흐르니까 변수에 값이 바뀐 시점에 이렇게 변경된 값을 출력해 줍니다.
 */

// 기본자료형 (몇가지 예)
    //char는 문자 하나를 담는 자료형으로 이렇게 작은 따옴표를 붙여서 작성을 합니다.
    // 2바이트의 저장공간을 차지합니다.

    public static void main(String[] args) {


        char c = 'A';
        int a = 10;
        double b = 1.234;
        float d = 1.234F;

        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);



// 자료형의 출력 범위 알아보기


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
    }
}





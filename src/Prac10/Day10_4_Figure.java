package Prac10;

// 추상클래스 실습 예제 2) 도형의 면적 구하기
/*
면적(Figure)라는 클래스는 추상클래스다.
가로와 세로를 파라미터로 받아 넓이(area)를 구하는 추상메서드가 있다.

사각형은 면적을 상속받아 넓이를 구하는 추상메서드를 완성합니다.
삼각형도 위와 동일 ...""  ""

메인클래스에서 삼각형과 사각형 객체를 생성하여
두 수를 인자로 넘겨받아 넓이를 구해 봅니다.
 */

abstract class Figure10 {    // 추상 클래스

    abstract void area(int a, int b); // 추상 메서드
// 넓이 구하는 공식을 바디(실행코드 부분)에 알맞게 구현.

}



// 사각형 클래스

class Square10 extends Figure10 {

    void area(int a, int b) {

        System.out.println("사각형의 넓이 : "+(a*b));

    }

}



class Triangle10 extends Figure10 {

    void area(int a, int b) {

        System.out.println("삼각형의 넓이 : "+(a*b/2));

    }

}



public class Day10_4_Figure {

    public static void main(String[] args) {

        Square10 square = new Square10();

        square.area(10, 7);



        Triangle10 triangle = new Triangle10();

        triangle.area(15, 8);

    }

}





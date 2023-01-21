package Prac09;
// public class Day09{

    /*
    public static void main(String[] args) {
        MathTest mt = new MathTest();
        System.out.println("add(3,3) : " + mt.add(3,3));
        System.out.println("add(3L, 3) : " + mt.add(3L, 3));
        System.out.println("add(1,2,3) : " + mt.add(new int[] {1,2,3}));
        System.out.println("add(1,2,3,4) : " + mt.add(new int[] {1,2,3,4}));

        // 가변인수 실행
        System.out.println("add(1,2,3,4,5,6) : " + mt.total(1,2,3,4,5,6));
        System.out.println("add(1,2,3,4,5,6,7,8,9,10) : " + mt.total(1,2,3,4,5,6,7,8,9,10));
    }
     */
    /*
    같은 기능을 수행하는 메서드의 경우 인수가 서로 다를 경우 많은 수의 메서드 오버로딩이 필요하게 되는데, 그 때에 매번마다 오버로딩을 해줘야 한다.
    배열로 구현하게 되면 메서드 자체는 하나만 선언해도 되지만, 출력을 할 때, 배열을 선언하고 배열의 초기치를 지정해서 호출되는 메서드로
    전달해야하는 번거로움이 있게 된다.
    */

/*
    // 오버라이딩
    class Point {
        int x;
        int y;

        String getLocation() {
            return "x: " + x + " y: " + y;
        }
    }

    //3차원 개념 추가 -> 상속시키면 된다.
    class Point3D extends Point {
        int z; //추가되는 것만 추가로 나타내주면 된다.

        String getLocation() {
            return "x: " + x + " y: " + y + " z: " + z;
        }

    }

 */
/*
// 오버라이딩 개념 체크 퀴즈!
// 오버로딩과 오버라이딩 개념 체크 퀴즈!
class Parent {
    void parentMethod () {

    }
}

class Child extends Parent {
    void parentMethod() {} // 오버라이딩 : 원래 @Override 쓰여있던 걸 내가 지웠어.
    void parentMethod(int i) {} // 오버로딩 : 파라미터를 재정의

    void childMethod() {}
    void childMethod(int i) {} // 오버로딩 : 파라미터를 재정의
    // void childMethod() {} : 에러 남. 중복 정의 되었다.
}
public class Day09 {
    public static void main(String[] args) {

    }
    /*
오버라이딩이라 함은, 부모클래스에 있는 메서드를 자식클래스에서 사용할 때, 그 자식에 맞게 변경해서 사용하는 경우를 말한다.
 */
//}
public class Day09 {

}


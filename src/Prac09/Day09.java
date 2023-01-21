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

//다형성
/*
Polymorphism
        (1)다형성이란?
        다형성이란 다양한 형태 또는 특성을 가진다는 의미.
        자바와 같은 객체 지향 언어에서의 의미는 부모클래스를 상속받은 자식 클래스의 인스턴스가 부모의 객체로도 사용되고, 뿐만 아니라, 자식 클래스의 객체로도 사용될 수 있는 다양한 상황을 의미한다.

        (2) 예시
        부모클래스에 Bird가 있고, 이를 상속받은 자식 클래스 Parrot이 있다고 가정하자.
        이때, “앵무새가 말을 하네~ 허허” 사람들이 이렇게 이야기 할 수 있다.
        그런데 앵무새는 새이기 때문에 “새가 말을 하네” 이렇게 말할수도 있다.

        (3) 결론
        정리하면 하위클래스의 인스턴스(객체)는 보다 위인 상위 클래스의 인스턴스(객체)로도 사용될 수 있다.
        그런데 그 반대는 안된다.
        왜냐하면 “앵무새”는 분명 그 상위 클래스인 “새”라고 말할 수 있지만, 새는 종류가 많기 때문에 모든새가 앵무새는 아니기 때문이다.
        따라서 상위(부모) 클래스의 인스턴스(객체)는 하위(자식) 클래스의 인스턴스(객체)로 사용될 수 없다.

        이런 논리라고 보면 된다.

        여러 형태를 받아들일 수 있는 성질, 상황에 따라 의미를 다르게 부여할 수 있는 특성 등으로 정의를 하기도 한다. 정리하면 다형성이란 하나의 타입에 여러 객체를 대입할 수 있는 성질로 이해하면 될 것이다.
*/

public class Day09 {

}


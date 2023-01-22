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
<추가>
오버로딩
•	메서드도 변수와 마찬가지로 같은 클래스 내에서 서로 구별될 수 있어야 하기 때문에 각기 다른 이름을 가져야 한다.
•	자바에서는 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도 매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메서드를 정의할 수 있다.
•	한 클래스 내에 같은 이름의 메서드를 여러개 정의하는 것을 ‘오버로딩’ 이라고 한다.

오버로딩의 조건
•	메서드 이름이 같아야 한다.
•	매개변수의 개수 또는 타입이 달라야 한다.
•	참고) 오버로딩된 메서드들은 매개변수에 의해서만 구별될 수 있으므로 반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다.

오버라이딩(overriding)
•	부모(조상)클래스로부터 상속받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 한다.
•	상속된 그대로 쓰는것이 아닌 자손클래스 자신에 맞게 메서드를 변경해야 하는 경우가 많은데, 이럴때 오버라이딩한다. (overwrite:덮어쓰다의 개념에서 유래)

오버라이딩의 조건
•	자손클래스에서 오버라이딩하는 메서드는 부모(조상)클래스의 메서드와
•	: 이름이 같아야 한다.
•	: 매개변수가 같아야 한다.
•	: 반환타입이 같아야 한다.
요약하자면 선언부가 서로 일치해야 한다는 것이다.

오버로딩 vs 오버라이딩
•	오버로딩(overloading) 기존에 없는 새로운 메서드를 정의하는 것(new)
•	오버라이딩(overriding) 상속받은 메서드의 내용을 변경하는것 (change, modify)

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

/*
//다형성 예시

class Person {}

class Student extends Person {}

public class Day09 {
    public static void main(String[] args) {
        Student s1 = new Student(); // 첫 번째 예시, 정상 작동

        Person s2 = new Student(); // 두 번째 예시 정상, 하위 클래스로 객체 생성하면서 타입은 부모타입으로 만든다.

        Person parent = new Person(); // 세 번째 예시, 정상, 자기 자신을 가져와서 만드는 거니까 아무 문제 없지

        // 에러! Student stu = new Person(); => 상위 클래스로 객체 생성하면서 타입은 하위 쓰면 무조건 에러.
    }
*/

//다형성 예시 2
class Person{
    String str1 = "난부모 클래스";
    void method1() {System.out.println("에이에이에이");}
    // 부모클래스의 독자적 메서드
    void ppp() {System.out.println("ppp");}
}


class Student extends Person{
    String str2 = "난자식 클래스";
    // 그 내용을 덮어쓴것, 재정의해서 사용하겠다
    void method1() { // 부모클래스에서 메서드를 받았으니까 오버라이딩이 되겠지.
        System.out.println("오버라이딩-AAA");
    }

    //독자적 메서드
    void sss() {
        System.out.println("sss");
    }

    // 마지막
    void x(){
        method1(); // 위의 메서드1 을 호출하는 것
        super.method1(); // 슈퍼는 부모를 가르키는것. 부모의 메서드를 자식 클래스에서 가져올 수 있음
    }
}
public class Day09 {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.str1); //부모 타입으로 선언한 멤버변수
        System.out.println(s1.str2); // 자식 자기자신이 선언한 멤버변수
        s1.method1(); // 똑같이 오버라이딩된 메서드를 불러왔을 때에는 자식에서 재정의된 메서드를 불러오게 된다.
        s1.sss(); // 독자적으로 정의된 자기 클래스의 메서드를 사용할 수도 있다. 이렇게.
        // 자식클래스에 있는 모든 자원 사용이 가능하다.
        // 부모클래스에 있는 모든 자원 사용이 가능하다.
        s1.ppp(); // 여기서 그럼 부모 타입의 메서드를 쓸 수 있냐 없냐? : 자식은 물려받았기 때문에 부모 것을 다 쓸 수 있다.

        //클래스명.부모클래스타입 도 자식은 가져다 쓸 수 있다.


        // 여기서 질문! 자식클래스에서 오버라이딩 된 부모클래스의 원본 메서드를 호출하고 싶다면?(AAA가 아니라 에이에이에이) > 슈퍼
        // d위의 void x 클래스 에서의 method1에 슈퍼를 붙이면 된다.
        s1.x();



// 정상, 하위 클래스로 객체를 만들면서 타입은 부모타입을 쓰는것이 가능(다형성) , 부모의 자원만 쓸수 있다(?)
        Person s2 = new Student();
        System.out.println(s2.str1);
//        System.out.println(s2.str2); //err : 우리가 객체생성을 할 때 부모 타입으로 만들었기 때문에 자식의 것은 가져다 쓸 수 없다.
        s2.ppp();
//        s2.sss(); err : // 자식의 자원을 쓸수 없다.
        s2.method1(); // 오버라이딩 - AAA --> 오버라이딩한거는 자식의 메서드로 실행.

        // 부모클래스에 없는 자식의 메서드를 바로 호출하고 싶다면? --> 캐스트 필요
        ((Student)s2).sss();


// 정상
        Person aaa = new Person();
        aaa.method1();// 에이에이에이
        //aaa.sss();


        // 상위 클래스로 객체를 생성하면서 타입은 하위타입을 쓰는경우는 에러
//        Student bbb = new Person();
    }
}



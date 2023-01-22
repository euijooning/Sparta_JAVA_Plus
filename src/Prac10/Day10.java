package Prac10;

abstract class Bird {
    //1) 변수 선언
    private int x, y, z;

    //4) 날아가는 메서드를 구현
    void fly(int x, int y, int z) {
        printLocation(); // 현재 위치
        System.out.println("이제, 이동합니다!");

        this.x = x;
        this.y = y;
        // 받은 축으로 이동

        if(flyable(z)) { // 날 수 있는지 여부를 따짐.
            this.z = z;
        } else {
            System.out.println("그 높이로는 날 수 없습니다...");
        }
        printLocation(); // 이동한 위치
    }


    //3) 날 수 있느냐 없느냐를 불린 타입으로 선언
    abstract boolean flyable(int z); // 원래 중괄호로 실행문장이 들어가야 하는데, Body가 없으므로 추상클래스로 정의된다.
    // 상속받은 클래스에서 반드시 구현되어야만이 정상적으로 구동이 된다.

    // 2) 위치 메서드 구현
    public void printLocation() {
        System.out.println("현재 위치:  ("+x+", "+y+", "+z+")");
    }
}

//Bird 상속받는 Pigeon(비둘기) 클래스 구현
class Pigeon extends Bird { //상속을 받으면 처음에 빨간줄이 뜬다. 이유는 미 구현된 무언가가 있기 때문에 반드시 구현하라는 뜻.

    @Override
    boolean flyable(int z) {
        return z<10000;
    }
}

// 날 수 없는 공작새 클래스 생성
class Peacock extends Bird {
    @Override
    boolean flyable(int z) {
        return false; // 날 수 없으므로 false 반환.
    }
}
public class Day10 {
    public static void main(String[] args) {

        /*
        cf. 첫 줄을 상속받은 자동객체로 구현하는 게 아니라, Bird pigeon = new Pigeon();으로 해도 가능하다!
        두번째 줄도, Bird peacock = new Peacock(); 도 가능하다.
        그 이유는 추상클래스에서 정의해 놓은 것을 자동객체에서 다 구현을 해 놓았기 때문에
        추상클래스 타입은 부모 클래스 타입으로 객체 생성이 가능하다!
        다형성 측면.
         */

        Pigeon pigeon = new Pigeon();
        Peacock peacock = new Peacock();

        System.out.println("====비둘기====");
        pigeon.fly(1,1,3);
        System.out.println();

        System.out.println("====공작새====");
        peacock.fly(1,1,3);
        System.out.println();

        System.out.println("====비둘기====");
        pigeon.fly(3,3,30000);

    }
}
/*
정리
: 추상클래스는 미구현된 내용을 가지고 있고, 그것을 상속받아서 사용하게 된다면, 사용할 때에 반드시 미구현된 내용은 구현해줘야 한다.
+ 구현을 할 때 부모 타입은 추상 클래스의 타입으로 쓸 수 있다.

다만, 위에서 Bird 타입으로는 인스턴스를 만들 수 없다. 추상클래스는 미구현된 부분이 있어서 그 자체로는 객체를 만들 수 없기 때문.
 */

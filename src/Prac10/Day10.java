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


}

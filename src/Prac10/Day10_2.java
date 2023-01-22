package Prac10;

interface Bird2 {

    void fly2(int x, int y, int z);


}

class Pigeon2 implements Bird2 {
    private int x, y, z;

    @Override
    public void fly2(int x, int y, int z) {
        printLocation2();
        System.out.println("지금부터 날아갑니다.");
         this.x = x;
         this.y = y;
         this.z = z;
         printLocation2();

    }

    public void printLocation2() {
        System.out.println("현재 위치:  ("+x+", "+y+", "+z+")");

    }
}
public class Day10_2 {
    public static void main(String[] args) {

        //Pigeon2 pigeon2 = new Pigeon2(); 가능
        Bird2 pigeon = new Pigeon2();
        pigeon.fly2(1,2,3);

    }
}
/*
인터페이스가 더 생략된 부분이 많다 => 즉, 구현해야 할 부분이 많다는 거지.
예를 들어 상수를 가져왔을 때, 상수 내용도 변경할 수 없다.
인터페이스도 추상클래스와 동일하게 미구현된 (Body 가 없는) 추상 메서드를 가지게 되고,
이럴 경우에는 자손 클래스에서 동작을 보장할 수 있도록 구현을 꼭 해줘야 한다는 특징을 지닌다.
 */

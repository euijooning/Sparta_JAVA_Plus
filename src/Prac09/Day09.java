package Prac09;

public class Day09 {
    public static void main(String[] args) {
        MathTest mt = new MathTest();
        System.out.println("add(3,3) : " + mt.add(3,3));
        System.out.println("add(3L, 3) : " + mt.add(3L, 3));
        System.out.println("add(1,2,3) : " + mt.add(new int[] {1,2,3}));
        System.out.println("add(1,2,3,4) : " + mt.add(new int[] {1,2,3,4}));

    }
    /*
    같은 기능을 수행하는 메서드의 경우 인수가 서로 다를 경우 많은 수의 메서드 오버로딩이 필요하게 되는데, 그 때에 매번마다 오버로딩을 해줘야 한다.
    배열로 구현하게 되면 메서드 자체는 하나만 선언해도 되지만, 출력을 할 때, 배열을 선언하고 배열의 초기치를 지정해서 호출되는 메서드로
    전달해야하는 번거로움이 있게 된다.
    */
}

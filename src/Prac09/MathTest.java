package Prac09;

public class MathTest {
    public int add(int a, int b) {
        System.out.println("int add(int a, int b) -");
        return a+b;
    }

    public int add(int a, int b, int c) {
        System.out.println("int add(int a, int b, int c) -");
        return a+b+c;
    }
    public long add (long a, int b){
        System.out.println("int add(long a, int b) -");
        return a+b;
    }
    public long add (long a, long b) {
        System.out.println("int add(long a, int b) -");
        return a+b;
    }
    // 배열로 선언
    public int add(int[] a) {
        System.out.println("int add(int[] a) - ");

        int result = 0; //결과값을 저장하는 변수 선언. 초기화해줌
        for (int i = 0; i < a.length; i++) { // 0번째 인덱스부터 a라는 변수의 length까지 돌면서 값을 누적시킨다.
            result +=a[i]; // result는 a의 i만큼 더한 값을 저장.
        }
        return result;
    }
    //가변인수 : 변수의 크기가 가변적일 수 있는 인수
    // 자료형 뒤에 ... 입력하고, 배열 이름을 입력하면 된다.

    // 나 두 개 짜리 해줘, 다섯개 짜리 해줘... 열 개 짜리 해줘 하더라도 이 메서드 하나를 통해서 다 계산이 가능하다는 이야기
    public int total(int... a) {
        // 작성 방법은  똑같다.
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}

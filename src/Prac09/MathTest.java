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
}

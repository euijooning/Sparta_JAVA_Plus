package Prac12;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // wrapper 클래스

        // 다양하게 형태 작성 가능
        Integer i = 123; // int i = 123;
        Double d = 1.0; // double d = 1.0;
        Character c = 'A'; // char c = 'A'

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("------------");

        // 이제 기능이랑 메서드를 활용해서 출력해보겠다.
        System.out.println(i.intValue());
        System.out.println(d.intValue()); // 실수를 형변환해서 int로 바뀐 것을 볼 수 있을 듯
        System.out.println(c.charValue());

        System.out.println("-----------");

        // 정수를 문자열 형태로 쉽게 바꾸기
        String s= i.toString();
        System.out.println(s);

        String str = "10";
        int num = Integer.parseInt(str);
        System.out.println(num);

        Integer ii = new Integer(10); // 박싱
        int num1 = ii.intValue(); // 언박싱
    }
}

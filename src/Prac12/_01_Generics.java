package Prac12;

public class _01_Generics {
    public static void main(String[] args) {
    // 제네릭스
    // 다양한 타입의 객체를 지원하는 클래스나 인터페이스 또는 메서드를 정의하는 방법

        // 앞을 대문자로 수정할거야
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"Aa", "Bb", "Cc", "Dd", "Ee"};
        
        printIntArray(iArray); // 아직 메서드를 만들지 않았기 때문에 빨간줄
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("----------------"); // 줄바꿈
        prinAntArray(iArray); // array 어떤 것도 호출할 수 있다.
        prinAntArray(dArray);
        prinAntArray(sArray); // 요것만 문제가 없다 . 제네릭스에서 제공하는 것은 객체입니다. 기본자료형은 제네릭스로 사용할 수 없기 때문에
        // 이것을 감싸주는 레퍼 클래스가 필요해요. 이건 다음번 시간에 자세히 할 것이다.
        // Integer.parseInt();
        // double.parseDouble(); 등
    }

    private static void printStringArray(String[] sArray) {
        for(String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }


    private static void printDoubleArray(Double[] dArray) {
        for(double d : dArray) {
            System.out.print(d + " "); // 1.0 2.0 3.0 4.0 5.0 출력
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        // for-each문 사용
        for(int i : iArray) {
            System.out.print(i + " "); //1 2 3 4 5 (한칸 띄고 출력)
        }
        System.out.println();
    }
    //T : Type, K: Key, V: Value, E: Element
    private static <T> void prinAntArray(T[] array) { // 왼쪽의 T와 오른쪽 T가 같아야 한다.
        for(T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

}
// 그 때마다 다른 자료형을 출력해야 하는 번거로움이 생김
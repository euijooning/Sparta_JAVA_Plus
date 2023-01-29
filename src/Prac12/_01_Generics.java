package Prac12;

public class _01_Generics {
    public static void main(String[] args) {
    // 제네릭스
    // 다양한 타입의 객체를 지원하는 클래스나 인터페이스 또는 메서드를 정의하는 방법

        // 제너릭스 만들면서 앞을 대문자로 수정할거야
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"Aa", "Bb", "Cc", "Dd", "Ee"};
        
        printIntArray(iArray); // 아직 메서드를 만들지 않았기 때문에 빨간줄
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("----------------"); // 줄바꿈
        prinAntArray(iArray); // array 어떤 것도 호출할 수 있다.
        prinAntArray(dArray);
        prinAntArray(sArray); // 요것만 문제가 없다 .
        // 제네릭스에서 제공하는 것은 객체입니다. 기본자료형은 제네릭스로 사용할 수 없기 때문에
        // 이것을 감싸주는 래퍼 클래스가 필요해요. 이건 다음번 시간에 자세히 할 것이다.
        // Integer.parseInt();
        // Double.toString(); 등
    }

    private static void printStringArray(String[] sArray) {
        for(String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println(); // 한 줄 공백
    }


    private static void printDoubleArray(Double[] dArray) {
        for(double d : dArray) {
            System.out.print(d + " "); // 1.0 2.0 3.0 4.0 5.0 출력
        }
        System.out.println(); // 한 줄 공백
    }

    private static void printIntArray(Integer[] iArray) {
        // for-each문 사용
        for(int i : iArray) { // for-each문 : 앞에는 넣은 변수를 선언하고 어떤 것으로 돌리겠느냐
            System.out.print(i + " "); //1 2 3 4 5 (한칸 띄고 출력)
        }
        System.out.println(); // 한 줄 공백
    }
    /*
우리가 코드를 보면, 메서드 내에서 자료형은 다 다르지만, for-each문으로 반복되는 것이 보인다. 추가가 된다고 하면, 그 때마다 다른 자료형을 만들어야 하는 번거로움이 생김
이 때 해결하는 것이 Generics
     */

    //T : Type, K: Key, V: Value, E: Element
    private static <T> void prinAntArray(T[] array) { // 왼쪽의 T와 오른쪽 T가 같아야 한다. T 배열 타입, 변수명은 array.
        for(T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
/*
제너릭스 부분을 살펴보면 우선 <T>는 꺽쇠 T. <>는 다이아몬드 기호, 이 속에 T를 집어 넣었고,
메소드 전달 값과 파라미터로 받는 값에 T라고 집어 넣고, 이렇게 자료형 자리에도 T를 집어 넣어 사용하면 된다.
그래서 메소드 하나만 가지고 서로 다른 자료형의 메소드를 모두 출력한 것을 볼 수 있었음.
그래서 우리가 중복되게 실행문에 같은 코드를 작성할 필요 없이, 서로 다른 타입이지만 T하나만 가지고 처리를 해버렸기 때문에
제너릭스는 불필요한 코드 중복을 줄여주는 장점이 있다고 말할 수 있는 것이다.
 */

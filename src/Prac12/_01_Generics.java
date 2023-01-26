package Prac12;

public class _01_Generics {
    public static void main(String[] args) {
    // 제네릭스
    // 다양한 타입의 객체를 지원하는 클래스나 인터페이스 또는 메서드를 정의하는 방법
    
        int[] iArray = {1,2,3,4,5};
        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"Aa", "Bb", "Cc", "Dd", "Ee"};
        
        printIntArray(iArray); // 아직 메서드를 만들지 않았기 때문에 빨간줄
        printDoubleArray(dArray);
        printStringArray(sArray);
    }

    private static void printStringArray(String[] sArray) {
        for(String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }


    private static void printDoubleArray(double[] dArray) {
        for(double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(int[] iArray) {
        // for-each문 사용
        for(int i : iArray) {
            System.out.print(i + " "); //1 2 3 4 5 (한칸 띄고 출력)
        }
        System.out.println();
    }
}
// 그 때마다 다른 자료형을 출력해야 하는 번거로움이 생김
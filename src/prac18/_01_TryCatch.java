
package prac18;

public class _01_TryCatch {

  public static void main(String[] args) {
    // 예외처리
    // 양말이 젖었을 때 조치, 약속시간에 고객이 많이 늦었을 때 업체가 취하는 행동 등...
    // 프로그램에는 두 가지 오류가 있는데,,,
    // 오류 : 컴파일 오류 , 런타임 오류(에러 error, 예외 exception)
    // 컴파일 오류 예시) int i = "문자열";
    // 런타임 오류 예시) int[] arr = new int[3];
    //                 arr[5] = 100; (공간이 벗어남) 실행 시에 오류 발생
    // 예외 - 파일을 읽으려고 하는데 그 경로에 파일이 없다던지, 배열에 접근하려는데 배열의 인덱스를 초과한다던지



/*
    S18 s = new S18();
      s.methodA();      // 스택오버플로우 - 에러
     *//*


 */
/*
    S18 s = null; // 객체 생성 자체가 안 됐는데,
    s.methodA(); //NullPointException
     *//*


 */
/*
 트라이에서는 시도하려는 내용
 catch에서 그와 관련된 처리, 문제 발생한 것을 짚어줌.

// 예시 1)
    try {
      System.out.println(3/0);
    } catch (Exception e) {
      System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
      e.printStackTrace();
    }
    System.out.println("프로그램 정상 종료");
  }
// ArithmeticException : / by zero 라는 오류 메시지 출력/
// 하지만 예외처리 해줬으므로, 프로그램 정상 종료 메시지는 나옴.

// 예시 2)
try {
    int[] arr = new int[3]
    arr[5] = 100;
  } catch (Exception e) {
    System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
    e.printStackTrace();
  }
    System.out.println("프로그램 정상 종료");
}
// ArrayIndexOutOfBoundsException : Index 5 가 3의 길이를 초과함. 요런 에러 뜬다.
// 하지만 예외처리 해줬으므로, 프로그램 정상 종료 메시지는 나옴.


     */

//예시 3)
try {
    Object obj = "test";
    System.out.println((int)obj);
    } catch (Exception e) {
    System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
    System.out.println();
    }
    System.out.println("프로그램 정상 종료"); // 출력되지 않는다.
    }

// ClassCastException : ~ String cannot be cast to Integer 뭐 요런 메시지 나옴.
}


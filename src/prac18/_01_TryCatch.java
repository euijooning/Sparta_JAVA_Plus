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

    /*
    S18 s = new S18();
      s.methodA();      // 스택오버플로우
     */

    /*
    S18 s = null;
    s.methodA(); //NullPointException
     */


    System.out.println("프로그램 정상 종료"); // 출력되지 않는다.
  }
}

class S18 {
  public void methodA() {
    this.methodA();
  }
}

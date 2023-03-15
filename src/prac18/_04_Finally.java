package prac18;

// catch문에서 처리한다고 해서 완전히 끝이 난 게 아닐 수도 있다.
public class _04_Finally {
  public static void main(String[] args) {
    try {
      System.out.println("택시의 문을 연다");
      // throw new Exception("휴무택시"); 예외삭제 => 문제 발생하지 않는 코드
      // System.out.println("택시에 탑승한다.");
    } catch (Exception e) {
      System.out.println("!! 문제 발생: " + e.getMessage());
    } finally {
      System.out.println("택시 문을 닫는다.");
    }
    // 어쨌건, finally는 마지막으로 실행된다!!!
    // try 구문에서 하던 것을 정리하는 구문을 넣어주면 된다.

    // try + catch(s)
    // try + catch(s) + finally
    // try + finally
    // try단독 x

    System.out.println("----------");

    //예시
    try {
      System.out.println(3/0);
    } finally {
      System.out.println("프로그램 정상 종료");
    }

  }
}

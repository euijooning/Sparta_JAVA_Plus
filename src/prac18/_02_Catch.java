package prac18;

public class _02_Catch {

  public static void main(String[] args) {

// catch 괄호 안의 Exception 클래스는 최고 조상 클래스라는 것을 잘 알아두자
// 그 말은, 원래 예외처리는 다양한 형태로 이루어질 수 있다는 뜻이지

// 아까 했던 예시 1)
    try {
      System.out.println(3/0);

    } catch (ArithmeticException e) {
      System.out.println("뭔가 잘못 계산하셨네요.");
      // 지금 상황에서는 여기서 끝. 아래로 안 넘어간다

    } catch (Exception e) {
      System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
      e.printStackTrace();
    }
    System.out.println("프로그램 정상 종료");
  }


}

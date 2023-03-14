package prac18;

public class _02_Catch {

  public static void main(String[] args) {

    /*
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

     */
    /*
    // 아까 했던 예시 2)
    try {
      int[] arr = new int[3];
      arr[5] = 100;

    } catch (ArithmeticException e) {
      System.out.println("뭔가 잘못 계산하셨네요."); // 이건 건너뜀

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("인덱스를 잘못 설정했어요."); // 여기서 처리된다.

    } catch (Exception e) {
      System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
      e.printStackTrace();
    }
    System.out.println("프로그램 정상 종료");
     */

    /*
    // 아까 했던 예시 3
    try {
      Object obj = "test";
      System.out.println((int)obj);

    } catch (ArithmeticException e) {
      System.out.println("뭔가 잘못 계산하셨네요."); // 이건 건너뜀

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("인덱스를 잘못 설정했어요."); // 이것도 건너뜀.

    } catch (ClassCastException e) {
      System.out.println("잘못된 형 변환입니다."); // 여기서 처리

    } catch (Exception e) {
      System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
      e.printStackTrace();
    }
    System.out.println("프로그램 정상 종료");
     */
/*
    // 예시 3 수정
    try {
      String s = null;
      s.toLowerCase(); // NullPointException 뜰 거야.

    } catch (ArithmeticException e) {
      System.out.println("뭔가 잘못 계산하셨네요.");

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("인덱스를 잘못 설정했어요.");

    } catch (ClassCastException e) {
      System.out.println("잘못된 형 변환입니다.");

    } catch (Exception e) {
      System.out.println("그 외의 모든 에러는 여기서 처리가 돼요.");
      e.printStackTrace();
    }
    System.out.println("프로그램 정상 종료");
 */

    // 두 에러를 한꺼번에 처리도 가능
    try {
    String s = null;
    s.toLowerCase();

  } catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {
    System.out.println("뭔가 실수하셨네요.");

    // } catch (ArrayIndexOutOfBoundsException e) {
    //  System.out.println("뭔가 실수하셨네요.");

  } catch (ClassCastException e) {
    System.out.println("잘못된 형변환입니다.");
  }

    catch (Exception e) { // Exception 은 모든 클래스의 조상 클래스이다.
    System.out.println("그 외의 모든 에러는 여기서 처리됩니다.");
    e.printStackTrace();
  }
    System.out.println("프로그램 정상 종료");
  }

}

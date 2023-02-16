package prac18;

public class _02_Catch {

  public static void main(String[] args) {
    try {
      // System.out.println(3/0);
      // int[] arr = new int[3];
      // arr[5] = 100;
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

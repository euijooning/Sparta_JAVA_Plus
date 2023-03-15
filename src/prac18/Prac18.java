package prac18;

// 에러코드
// Day 20에서 푼 문제이다.

// 에러 코드 0번일 때는
// 상품 구매를 완료하였습니다만 줓력하면 되고, try문 내에서만 처리하면 된다.
// 1번일 때는
// 예외 객체를 만들 때 "상품 구매 가능 시간이 아닙니다" 를 써넣고,
// 예외 처리 시에는 "상품 구매는 20시부터 가능합니다" 출력
// 2번일 때는
// 예외 객체를 만들 때 "해당 상품은 매진되었습니다."
// 예외처리 메시지는 "다음 기회에 이용해주세요" 를 써넣으면 된다.

public class Prac18 {
  public static void main(String[] args) {
    int errorCode = 0;
    // int errorCode = 1;
    // int errorCode = 2;

    try {
      if (errorCode == 0) {
        System.out.println("상품 구매를 완료하였습니다.");
      } else if (errorCode == 1) {
        throw new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
      } else if (errorCode == 2) {
        throw new SoldOutException("해당 상품은 매진 되었습니다.");
      }

    } catch (NotOnSaleException e) {
      System.out.println(e.getMessage());
      System.out.println("상품 구매는 20시부터 가능합니다.");

    } catch (SoldOutException e) {
      System.out.println(e.getMessage());
      System.out.println("다음 기회에 이용해주세요.");
    }
  }
}
class NotOnSaleException extends Exception {
  public NotOnSaleException(String message) {
    super(message);
  }
}

class SoldOutException extends Exception {

  public SoldOutException(String message) {
    super(message);
  }
}
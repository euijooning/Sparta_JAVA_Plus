package prac18;

public class _06_CustomException {

  public static void main(String[] args) {
    // 사용자 예외 정의 day19
    int age = 17; // 만 17세

    try {
      if (age < 19) {
//        throw new Exception("만 19세 미만에게는 판매하지 않아요.");
        throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지 않아요."); // 클래스로 만든 것을 가져옴.
      } else {
        System.out.println("주문하신 상품 여기 있습니다. ");
      }
    } catch (AgeLessThan19Exception e) { //클래스로 만들었기 때문에 따로 예외처리를 하는 catch를 만들어서 정리할 수 있다.
      System.out.println("조금 더 성장한 후에 오세요. ");
    } catch (Exception e){
      // e.printStackTrace();
      System.out.println("모든 예외를 처리합니다.");
    }
  }
}


// 사용자 정의 예외 생성
class AgeLessThan19Exception extends Exception{

  //자동으로 생성자 만들기
  public AgeLessThan19Exception(String message) {
    super(message); // 여기까지 하면 사용자 정의 예외가 하나 만들어진 것.
  }
}

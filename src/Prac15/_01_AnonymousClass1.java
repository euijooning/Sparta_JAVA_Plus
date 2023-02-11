package Prac15;

public class _01_AnonymousClass1 {
  public static void main(String[] args) {
    // 익명 클래스 : 이름이 없는 클래스
    // 우리는 지금까지 클래스는 최상단에 정의해 왔는데,
    // 사실은 클래스도 다른 클래스 내부에 만들 수 있다.(내부 클래스)
    // 내부 클래스 중 특이한 게 익명클래스

    Coffee c1 = new Coffee(); // 순서 2
    c1.order("아메리카노");
    System.out.println("--------");

    Coffee c2 = new Coffee(); // 순서 3
    c2.order("라테");
    System.out.println("-----------");

    // 순서 4
    // 내가 커피숍 사장인데,
    // 굉장히 친한 친구 방문. 절친이니까 커피에 조각케이크를 서비스를 주려고 한다.
    // 이 때 쓰는 게 익명클래스. 한 번 보자.

    Coffee specialCoffee = new Coffee() {
      @Override
      public void order(String coffee) {
        //order 쓰면 자동완성. 그것 선택하면 super()로 바뀐다.
        
        // 이게 무슨 뜻이냐면, Coffee 객체를 만들 때, specialCoffee 객체만을 위한 order라는 동작을 재정의 할 수 있다는 것.
        /*
        그럼 우리가 Coffee를 상속해가지고, 다른 specialCoffee라는 클래스를 만들 필요 없이,
        그냥 메서드만 재정의 해서 우리가 원하는 동작을 추가할 수 있는 거죠.
         */
        super.order(coffee); // 주문하신 (커피) 나왔습니다. 는 기본값이고
        System.out.println("(귓속말) 딸기 케이크는 서비스예요."); // 추가로...!
      }

      @Override
      public void returnTray() {
        System.out.println("(귓속말) 자리에 두시면 제가 치울게요.");
      }
    };
    specialCoffee.order("바닐라 라테"); // 주문하신 바닐라 라테 나왔습니다. // 순서 6
    specialCoffee.returnTray();
  }
}

class Coffee { //순서 1
  public void order(String coffee) {
    System.out.println("주문하신 " + coffee + " 나왔습니다.");
  }

  public void returnTray() { // 순서 7. 접시를 반남하는 기능을 추가
    System.out.println("커피 반납이 완료되었습니다. ");
  }
}

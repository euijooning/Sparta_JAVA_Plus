package Prac15;

public class _02_AnonymousClass2 {
  // 예시 : 집에서 만드는 수제버거

  // 자 그런데, 수제버거는 레시피가 집집마다 다를 수 있지.
  // 그래서 수제버거 추상클래스를 상속하지 않고 익명 클래스를 이용해서 처리해보도록 하겠다.
  public static void main(String[] args) {
    HomeMadeBurger momMadeBurger = getMomMadeBurger();
    momMadeBurger.cook();
    System.out.println("------------");

    HomeMadeBurger broMadeBurger = getBroMadeBurger();
    broMadeBurger.cook();
  }

  private static HomeMadeBurger getBroMadeBurger() {
    return new HomeMadeBurger() {
      @Override
      public void cook() {
        System.out.println("집에서 만드는 동생표 군대리아");
        System.out.println("재료: 빵, 치킨패티, 양배추 샐러드, 딸기잼, 치즈, 삶은 계란");
      }
    };
  }



  public static HomeMadeBurger getMomMadeBurger() {
    return new HomeMadeBurger() {
      @Override
      public void cook() {
        System.out.println("집에서 만드는 엄마표 수제 버거");
        System.out.println("재료 : 빵, 소고기패티, 해쉬브라운, 양상추, 마요네즈, 피클");

      }
    };

  }
}

    // 코드 한쪽에 다 때려넣으면 복잡하니까 별도의 메서드를 만들어서 처리하도록 하자.


  abstract class HomeMadeBurger {
  // 앞서 배운 것처럼 추상클래스이기 때문에 HomeMadebuger로는 바로 객체를 만들 수는 없고,
  // 이 클래스를 상속해서 cook() 메서드를 재정의 해야만 객체를 만들 수가 있지.
    public abstract void cook();
  }

  /*
  정리하자면 우리는 HomeMadeBuger라는 추상클래스 객체를 만드는 것인데,
  이 객체를 다른 곳에서 상속을 해가지고 클래스를 정의를 한 게 아니고, 그때 그때 새로운 익명클래스 객체를 만들어서
  반환을 해주는 것이다.
   */

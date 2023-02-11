package Prac15;

import Prac15.converter.Convertible16;
import Prac15.converter.ConvertibleWithNoParams;
import Prac15.converter.ConvertibleWithReturn;
import Prac15.converter.ConvertibleWithTwoParams;
import Prac15.converter.KRWConverter16;

public class _04_FunctionalInterFace {
// 달러 금액을 입력하면, 우리 돈으로 얼마인지를 알려주는(변환해주는) 프로그램 만들기

  public static void main(String[] args) {
    // KRWConverter 객체 만들어서 실행해보기
    KRWConverter16 converter = new KRWConverter16();
    //converter.convert(1); // 1 달러 = 1200 원 출력

    // convertUSD(converter, 2); // 2 달러 = 2400 원 출력.

    /*
    convertUSD(public void convert ( int USD){
      System.out.println(USD + " 달러 = " + (USD * 1200) + " 원");
    } ,2);
  }
  요 난잡한 모양에서, 람다식 이용해서 정리.
     */
    /*
    람다식 이용한 정리법(복잡하지만 한 번 더 써볼게.)
    1. 접근제어자 2. 함수명 3. 반환형 지우기
    4. 전달값 자료명 int 삭제 5. 전달값과 바디 사이에 -> 삽입
    5. 한 줄로 올린다. 그러면 한 줄일 때는 중괄호 삭제
    6. 세미콜론 삭제
     */
   // convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1200) + " 원") ,1);
  } // 실행하면 2 달러 = 2400 원 출력됨.

  /*
  // 이제 제가(튜터님)요. (USD) -> System.out.println(USD + " 달러 = " + (USD * 1200) + " 원")만 따로 떼서
  // 인터페이스의 객체로 만드는 일을 해보려고 합니다.
  Convertible16 convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1200) + " 원");
  convertUSD(convertible, 2); // 함수형 인터페이스

  보통의 프로그래밍 언어에서는
  메서드는 클래스 내부에서 어떤 일(기능)을 하는 것, 함수는 클래스 밖에서 어떤 정의한 것인데,
  자바는 객체지향 언어라서 모든 기능을 클래스 내에서만 정의할 수 있기 때문에 메서드라고 부르는 것 뿐

  함수형 인터페이스를 사용하려면,
  "인터페이스에는 오직 딱 하나의 추상 메서드가 존재해야 한다"는 조건이 있어야 한다.
  함수의 동작이 인터페이스의 추상 메서드 동작과 일대일 매핑이 되기 때문에,
  두 개 이상이 있으면 안 된다는 것

  개발자의 실수를 방지하기 위해서 코딩 시점에 @FunctionalInterface 어노테이션을 붙여준다.

   */


    /*
    첫 번째와 똑같은 결과가 나왔는데, 왜 그럴까?
    => 너무 당연하다. 우리는 converter.convert(1);에서 하는 동작을 아래의 convertUSD() 메서드로 옮긴 것일 뿐이다.

    그런데 코드를 잘 뜯어보면,
    convertUSD() 메소드를 호출하면, converter를 전달을 하는데, 아래에 있는 메서드 내에서 동작은,
    converter 내의 convert 메서드를 호출하는 것일 뿐.
    그래서 이 동작하는 convert(2) 부분은,
    우리가 Convertible16 인터페이스를 통해 구현한 KWRConverter의 convert(1) 메서드를 호출하는 것과 똑같다.
    (괄호안은 헷갈리지 말라고 위해 일부러 전달값을 넣어놓은 것임)

    <추가>
    자 그래서요. convertUSD(converter, 2); 에서 converter 부분을 삭제를 하고,
    지금 converter 부분은 KRWConverter 클래스에 있는 메서드와 완전히 동일한 기능을 수행하고 있으니 가져와서 붙여넣어 볼게요.
    그리고 람다식 이용해서 코드를 단순화시켜 보죠.
     */

     /*
     <또 추가 2>
     자 그런데, 지금 우리가 하고 있는 것이 무엇이냐면, convertUSD() 를 호출하는 것은 똑같다.
     여기서 우리는 전달값을 두 개를 주고 있지. 하나는 converter, 다른 하나는 USD
     지금 convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1200) + " 원") ,2);을 다시 보면
     USD는 정의가 되어 있다(값: 2). 그러면 converter는?
     (USD) -> System.out.println(USD + " 달러 = " + (USD * 1200) + " 원") 이 긴~ 걸로 대체되었음을 알 수 있음.
     즉, 아래 메서드 내려가서 비교해보면 Convertible16 인터페이스가 이 람다식으로 구현이 되어 있는 꼴
     이 코드는 인터페이스의 어떤 코드와 완벽하게 매칭된다는 뜻이지.
     따라서 우리는 지금 메서드를 변수처럼 쓰면서 호출하고 있다고 볼 수 있는 것이다.
      */



  // 아래에 메서드 분리해서 converter.convert()가 하는 내용을 출력해보자

  // 우리가 지금 환율을 변환하는 메서드를 만드는 것이므로,
  // 괄호 안에 인터페이스를 넣어주고(KRWConverter을 사용할 수도 있지만 다형성에 의해서 가능),
  // 얼마의 달러를 어떻게 변환해줄거냐를 계산 시켜야 하므로 int로 USD 달러를 받는다.
  public static void convertUSD(Convertible16 converter, int USD) { //원래는 convertiber16이어야 하지만 편의상  converter라고 썼음
   converter.convert(USD);

  }

}

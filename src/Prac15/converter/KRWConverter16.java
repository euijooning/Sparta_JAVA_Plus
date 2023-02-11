package Prac15.converter;

// USD 돈으로 우리 돈으로 얼마인지를 알려주는(변환해주는) 것을 구현해주는 클래스임
public class KRWConverter16 implements Convertible16 {

  // 환율은 1,200원이라고 가정하자.
  @Override
  public void convert(int USD) {
    System.out.println(USD + " 달러 = " + (USD*1200) + " 원");
    // 실행하면 "1 달러 = 1200 원" 이렇게 나올 듯.
    // 이 클래스를 객체로 만들어서 한 번 실행해보겠다. Class _04_로 간다.


  }
}

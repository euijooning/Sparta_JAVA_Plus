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
    converter.convert(1); // 1 달러 = 1200 원 출력
  }

}

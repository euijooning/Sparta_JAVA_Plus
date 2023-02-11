package Prac15;

//Day16
public class _03_Lamda {

  public static void main(String[] args) {
    //람다식 : 간결한 형태의 코드 뭉치
    // (전달값 1, 전달값 2 -> { 코드 }
  }

  // 뭔가를 출력하는 함수
  /*
  public void print() {
    String s = "test";
    System.out.println(s);
  }
   */

  // 이걸 람다식으로 바꾸는 연습
  // 1. 람다식은 public과 메서드 명이 필요가 없다(지움)
  // 2. 람다식에서는 무언가 리턴 타입이 필요한 부분이 있다면 자동으로 지정해주므로 void 삭제
  // 3. 전달값과 메서드 바디 사이에 화살표로 연결 필요
  // 지금까지 하면 print 메서드를 람다식으로 바꾸는 것 완성
  // 그런데 빨간 줄이 나타나는 이유는 이게 지금 바로 람다를 사용할 수 없기 때문(지금은 형태만 본다.
    /*
  위 식과 비교해보면
  접근제어자, 반환타입, 메서드명은 사라지고
  파라미터 받는 부분과 메서드 바디는 남아있고, 화살표가 생긴 모습을 확인할 수 있다.
     */
   /*
     () -> {
    String s = "test";
    System.out.println(s);
  }
   */

}

package prac18;


  // 손님 이름 및 나이 정보를 위한 Customer 클래스 생성
  // 입장료는 1인당 5천원
  // 20세 이상에게만 부과 나머진 무료

  // 힌트: map()을 이용하여 원하는 형태로 데이터 가공을 할 수 있음.
  // 삼항연산자 활용

// 메리 50
// 나나 42
// 벤자민 21
// 코코 18
// 마이클 5


// 미술관 입장료
// -----------
// 메리 50 5000원
// 나나 42 5000원
// 벤자민 21 5000원
// 코코 18 무료
// 마이클 5  무료

import java.util.ArrayList;

public class Quiz_Prac17 {
    public static void main(String[] args) {
      ArrayList<Customer17> list = new ArrayList<>();
      list.add(new Customer17("메리", 50));
      list.add(new Customer17("나나", 42));
      list.add(new Customer17("벤자민", 21));
      list.add(new Customer17("코코", 18));
      list.add(new Customer17("마이클", 2));

      System.out.println("미술관 입장료");
      System.out.println("------------------");

      //값을 다 찍어줘야하므로 filter을 쓰긴 곤란
      list.stream()
          .map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료")
          .forEach(System.out::println);

    }
}

class Customer17 {
    public String name;
    public int age;

  public Customer17(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

// 이 문제는 클래스를 사용하도록 낸 것.
// 객체 데이터는 어떻게 가공하는지, 복잡한 연산은 어떻게 하는지 확인 (day19 ~'10분)



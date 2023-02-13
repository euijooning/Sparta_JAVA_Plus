package Prac15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Day17
public class _05_Stream {

  public static void main(String[] args) {
    //스트림: 흐름. 데이터 가공에 매우 편리함을 선사 / 컬랙션 프레임워크, 배열, 파일 등에서 만들 수 있음

    // 먼저 배열에서
    // 다섯 명의 시험 점수를 관리하는 배열이 있다고 하자.
    int[] scores = {100, 95, 90, 85, 80};
    // Arrays.stream(scores); // 이렇게 만든 것을 객체로 받아와서 사용해야 ctrl alt v
    IntStream stream = Arrays.stream(scores);

     String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
    Stream<String> langStream = Arrays.stream(langs);
    List<String> langList = new ArrayList<>();
    // 값 집어넣으려면 add
    // langList.add("python");
    // langList.add("java"); 너무 귀찮으니 아래와 같은 방법 쓴다

    //리스트를 생성함과 동시에 초기화 가능하다
    langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
    System.out.println(langList.size()); // 개수 출력
    Stream<String> langListStream = langList.stream();

    Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");


    //스트림 사용
    // 중간 연산 (Intermediate Operation) : fillter, map, sorted, distint, skip, ...
    // ex. 정수기 필터
    // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch

    // 90점 이상인 점수만 출력
    Arrays.stream(scores).filter(x-> x >= 90).forEach(x-> System.out.println(x));
    // scores 안에서 90점 이상인 학생만 필터로 걸러진 것. 출력을 위해서는 forEach
    //Arrays.stream(scores).filter(x-> x >= 90).forEach(System.out::println); // 앞에서 오는 데이터가 자동으로 넘어와서 연산을 한다.

    System.out.println("---------------------");

    // 90점 이상인 사람의 수
    // long count = Arrays.stream(scores).filter(x-> x >= 90).count(); 또는 형변환 가능 반환타입이 long이었어.
    int count = (int) Arrays.stream(scores).filter(x-> x >= 90).count();
    System.out.println(count); // 3 출력
    System.out.println("-------------");

    // 90점 이상인 사람들의 점수의 합.
    int sum = Arrays.stream(scores).filter(x-> x>=90).sum(); // 반환타입이 int로 나온다.
    System.out.println(sum);
    System.out.println("-----------------");

    // 90점 이상인 사람들 정력해서 출력하기
    Arrays.stream(scores)
        .filter(x-> x>= 90)
        .sorted()
        .forEach(System.out::println);
    System.out.println("--------------");


    // ("python", "java", "javascript", "c", "c++", "c#")
    // c로 시작하는 프로그래밍 언어 출력
    Arrays.stream(langs)
        .filter(x-> x.startsWith("c"))
        .forEach(System.out::println);
    System.out.println("-----------");

    // java 글자를 표현하는 언어 출력
    Arrays.stream(langs)
        .filter(x->x.contains("java"))
        .forEach(System.out::println);
    System.out.println("--------------");

    // 글자 개수가 4자 이하인 언어 뽑아보기 + 정렬하기
    // 좀 다른 걸 써보자 Collections 이용
    langList.stream()
        .filter(x -> x.length() <= 4 )
        .sorted()
        .forEach(System.out::println);
    System.out.println("------------------");

    // 글자 개수가 4자 이하인 언어 중에서 c를 포함하는 언어 출력
    langList.stream()
        .filter(x->x.length() <= 4)
        .filter(x->x.contains("c"))
        .forEach(System.out::println);

    // 글자 개수가 4자인 언어 중에서 c를 포함하는 언어가 하나라도 있는지 확인
    boolean anyMatch = langList.stream()
        .filter(x -> x.length() <= 4)
        .anyMatch(x -> x.contains("c")); // 타입이 boolean
    System.out.println(anyMatch); // true 출력
    System.out.println("----------");

    // 글자 개수가 4자 이하인 언어들은 모두 c를 포함하는지 여부 확인
    boolean allMatch = langList.stream()
        .filter(x -> x.length() <= 4)
        .anyMatch(x -> x.contains("c")); // 타입이 boolean
    System.out.println(allMatch); // false  출력 : 자바 때문에...
    System.out.println("----------");

    // 글자 개수가 3자 이하인 언어들은 모두 c를 포함하는지 여부 확인
    boolean allMatch1 = langList.stream()
        .filter(x -> x.length() <= 3)
        .anyMatch(x -> x.contains("c")); // 타입이 boolean
    System.out.println(allMatch1); // false  출력 : 자바 때문에...
    System.out.println("----------");

  }

}

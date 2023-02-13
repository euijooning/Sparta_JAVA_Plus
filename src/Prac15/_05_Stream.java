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


  }

}

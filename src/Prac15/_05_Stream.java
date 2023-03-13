package Prac15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Day17
public class _05_Stream {

  public static void main(String[] args) {
    //스트림: 흐름. 데이터 가공에 매우 편리함을 선사 / 컬랙션 프레임워크, 배열, 파일 등에서 만들 수 있음
    //스트림 생성
//스트림: 흐름. 데이터 가공에 매우 편리함을 선사 / 컬랙션 프레임워크, 배열, 파일 등에서 만들 수 있음
// 사전적 의미는 '개울, 시내', 동사로는 "흐르다" 라는 뜻을 가지고 있음.
// 따라서 자바에서 스트림은 데이터가 흐른다고 생각하면 된다.

/*
정수기의 1차 필터, 2차 필터가 있다고 떠올려보자.
아주 많은 데이터에서 내가 원하는 만큼의 데이터를 얻기 위해 1차 필터링, 그리고 2차 필터링을 진행해서 찾아 올 수도 있구요.
필요 없는 것을 걸러낼 수도 있어요.

따라서 자바에서도 스트림을 이용하면 우리가 원하는 데이터를 편리하게 가공할 수 있다.
컬랙션 프레임워크에서, 또는 배열이나 파일에서 만들 수 있다.

*/

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
    System.out.println(langList.size()); // 개수 출력 6
    // langlist.stream(); 후 ctrl + alt + v
    Stream<String> langListStream = langList.stream();

    // Stream.of("python", "java", "javascript", "c", "c++", "c#"); 후 ctrl + alt + v
    Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");



    // 스트림 사용
    // 중간 연산 (Intermediate Operation) : filter, map, sorted, distint, skip, ...
    // => 정수기 안의 여러 개 필터라고 생각하면 된다.

    // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch

    // 한번 사용한 스트림은 재사용이 불가능하기 때문에
    // 데이터를 모두 처음부터 준비해놓은 상태에서 새롭게 필터링을 한다.

    // 90점 이상인 점수만 출력
    Arrays.stream(scores).filter(x-> x >= 90).forEach(x-> System.out.println(x));
    // scores 안에서 90점 이상인 학생만 필터로 걸러진 것. 출력을 위해서는 forEach
    //Arrays.stream(scores).filter(x-> x >= 90).forEach(System.out::println); // 앞에서 오는 데이터가 자동으로 넘어와서 연산을 한다.

    System.out.println("---------------------");



    // 90점 이상인 사람의 수
    // long count = Arrays.stream(scores).filter(x-> x >= 90).count(); 또는 형변환 가능 반환타입이 long이었어.
    // 90 점 이상인 사람의 수
    // long count = Arrays.stream(scores).filter(x -> x >= 90).count(); 이렇게 쓰든지, 아니면 아래처럼 형변환 해서 쓰든지 자유.
    int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
    System.out.println(count); // 3 출력
    System.out.println("----------");

    // 90점 이상인 점수만 출력
    Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
//        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
//  Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
/*
우리가 클래스 명을 먼저 쓰고, (System.out) :: 로 구분하고, 메서드 명을 쓰게 되면은,
앞에서 넘어오는 데이터가 자동으로 넘어와서 뒤에서 하는 동작과 동일한 동작을 하게 된다는 것을 알아두자.
*/

    // 90 점 이상인 사람들의 점수들의 합
    int sum = Arrays.stream(scores).filter(x -> x >=90).sum(); // sum 은 반환 타입 int
    System.out.println(sum); // 90 + 95 + 85 = 285 출력
    System.out.println("------------");

    // 90점 이상인 사람들 정력해서 출력하기
    Arrays.stream(scores)
        .filter(x-> x>= 90)
        .sorted()
        .forEach(System.out::println);
    System.out.println("--------------");


    // ("python", "java", "javascript", "c", "c++", "c#")
    // c로 시작하는 프로그래밍 언어 출력
    Arrays.stream(langs)
        .filter(x-> x.startsWith("c"))// "c", "c++", "c#" 출력됨.
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
        .anyMatch(x -> x.contains("c")); // 타입이 boolean // 뭐가 되든지 간에 하나라도 해당하는 게 있는지
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
    System.out.println(allMatch1); // false  출력 : 자바 때문에... // 모두 해당되는
    System.out.println("----------");


// ----------------------------------------------------------------------------------------------------------

    // Day18 이어서
    //4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어 뒤에 "어려워요" 라는 글자를 함께 출력
    // map 사용
//map은 우리가 사용하는 데이터를 어떤 원하는 형태로 가공을 하거나, 그 데이터가 객체라고 하면
// 그 객체 중에서 꺼내고자 하는 인스턴스들을 지정해주는 역할을 한다.
    langList.stream()
        .filter(x -> x.length() <= 4)
        .filter(x-> x.contains("c"))
        .map(x -> x + "(어려워요)") // x뒤에 "(어려워요)" 를 붙여서 출력함.
        .forEach(System.out::println);
    System.out.println("----------------");

    // 결과물을 대문자로 바꾸기
    // c라는 글자를 포함하는 언어를 대문자로 출력
    langList.stream()
        .filter(x -> x.contains("c"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
    System.out.println("------------------");

    // c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장하기
    //langList.stream() .filter~ 이거를 ctrl + alt + v 해서 변
    List<String> langListStartsWithC = langList.stream()
        .filter(x -> x.contains("c"))
        .map(String::toUpperCase)
        .collect(Collectors.toList());
    langListStartsWithC.stream().forEach(System.out::println);
/*
여기서 중요한 부분은, 우리가 이런 작업을 할 때, stream을 한 번 사용하게 되면, 다시 사용할 수가 없기 때문에,
매번 새로 만들어서 사용해야 한다는 것.

또한 스트림을 쓴다고 해서 원본 데이터가 훼손이 되거나 변경이 되는 것은 아니다.
스트림을 만들 때마다 원본 데이터로 만들기 때문에, 원본 데이터를 가지고 새롭게 작업을 할 수 있으니까 스트림은 마음껏 쓰셔도 괜찮습니다.
 */
    }
}



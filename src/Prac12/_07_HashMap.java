package Prac12;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // Map : Key와 Value의 쌍으로 이루어진 형태.
        /*
        열쇠로 열 수 있는 사물함이 있다고 가정하는데,
        그 사물함을 열 수 있는 열쇠는 딱 하나여야 한다.
        이런 것처럼 Key 값을 통해 value를 저장하고 가져오는 이런 작업을 용이하게 하는 것을 map

        아래 구현할 예시, 우리가 커피숍에 간다고 했을 때,
        휴대폰 번호를 입력해서 내 고객정보에 포인트를 적립하지.
        즉, 휴대폰 번호를 key값으로 받아, 내 고객정보에 value를 저장하는 것.
         */


        HashMap<String, Integer> map = new LinkedHashMap<>(); // 순서 보장하고 싶을 때 LinkedHashMap
        // Key는 이름이므로 String, Value값은 포인트 점수이므로 숫자기 때문에 Integer.

        // 데이터 추가 이거는 add가 아니라 put
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        //서장훈 있었다면?
        map.put("서장훈", 10);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("---------------");

        // 조회 map.get()
        System.out.println("유재석 님의 포인트: " + map.get("유재석")); // 괄호 안에 적어주면 그 값을 얻어온다.
        System.out.println("유재석 님의 포인트: " + map.get("박명수"));
        System.out.println("--------------");

        //확인 map.containsKey
        if (map.containsKey("서장훈")) {
            int humanspoint = map.get("서장훈");
            map.put("서장훈", ++humanspoint);
            System.out.println("서장훈 님의 누적 포인트: " + map.get("서장훈"));
        } else { // 서장훈이 리스트에 없는 경우
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 고객 등록");
            System.out.println("서장훈님 (포인트 1점)");
            // 있으면 11점 출력
        }

        // 삭제 map.remove()
        map.remove("유재석");
        System.out.println(map.get("유재석")); // null 출력
        // 유재석이라는 key 가 없으므로 null 값이 출력되는 것이다.
        System.out.println("-----------");

        //전체삭제
        map.clear();

        // 남은 데이터가 있는지 확인
        if (map.isEmpty()) {
            System.out.println("남은 고객 수: " + map.size());
            System.out.println("가게를 접어야겠다");
        }
        System.out.println("------------");

        // 다음날 다시 찾아왔어
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 10);

        // key 확인 ** map.keySet()
        for (String key: map.keySet()) {
            System.out.println(key);
        }
        System.out.println("------------");

        //value 확인 map.values()
        for(int value : map.values()) {
            System.out.println(value);
        }
        System.out.println("------------");

        // Key와 value 함께 확인
        for(String key: map.keySet()) {
            System.out.println("고객이름: " + key + "\t포인트" + map.get(key));
        }
        System.out.println("---------------");

        // map:순서 x, 중복 x
        map.put("김종국", 11);
        map.put("김종국", 30);
        map.put("김종국", 50);

        for(String key: map.keySet()) {
            System.out.println("고객이름: " + key + "\t포인트" + map.get(key));
            // 순서 난잡하게 박명수 서장훈 유재석 김종국 출력되고, 김종국은 마지막 입력값인 50으로 출력
        }
        System.out.println("---------------");

    }
}
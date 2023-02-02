package Prac12;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 설명 보충 필요 다시 듣고 정리

        HashMap<String, Integer> map = new LinkedHashMap<>();
        // Key는 자료형, Value값은 숫자기 때문에 Integer

        // 데이터 추가 이거는 add가 아니라 put
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        //서장훈 있었다면?
        map.put("서장훈", 1);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("---------------");

        // 조회
        System.out.println("유재석 님의 포인트: " + map.get("유재석")); // 괄호 안에 적어주면 그 값을 얻어온다.
        System.out.println("유재석 님의 포인트: " + map.get("박명수"));
        System.out.println("--------------");

        //확인
        if (map.containsKey("서장훈")) {
            int humanspoint = map.get("서장훈");
            map.put("서장훈", ++humanspoint);
            System.out.println("서장훈 님의 누적 포인트: " + map.get("서장훈"));
        } else { // 서장훈이 리스트에 없는 경우
            map.put("서장훈", 1);
            System.out.println("서장훈님 (포인트 1점)");
            // 있으면 11점 출력
        }
        map.remove("유재석");
        System.out.println(map.get("유재석"));
        System.out.println("-----------");

        //전체삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수: " + map.size());
            System.out.println("가게를 접어야겠다");
        }
        System.out.println("------------");

        // 다음날 다시 찾아왔어
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 1);

        // key 확인
        for (String key: map.keySet()) {
            System.out.println(key);
        }
        System.out.println("------------");

        //value 확인
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
        }
        System.out.println("---------------");

    }
}
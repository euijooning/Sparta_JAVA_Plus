package Prac12;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 설명 보충 필요 다시 듣고 정리

        HashMap<String, Integer> map = new HashMap<>();
        // Key는 자료형, Value값은 숫자기 때문에 Integer

        // 데이터 추가 이거는 add가 아니라 put
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);

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


        }
    }
}
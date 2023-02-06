package Prac12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        // 컬렉션 프레임워크의 데이터를 순회하는 거라고 생각하면 쉽다.

        List<String> list = new ArrayList<>();
        // ctrl하고 클릭해보면 List는 인터페이스이고, ArrayList는 클래스이다.
        // ArrayList는 List 인터페이스를 상속받는 형태로 구현이 되는 것이에요.
        // 그래서 이는 다형성 사례라고 할 수 있음. LinkedList 써도 마찬가지

        //추가
        // 알 수 없는 오류로 잘못 된 더미 값이 들어온다고 쳐보자
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        // 순회 후 확인
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("------------");

        // 이터레이터는 인텔리제이 내장이어서 편하게 쓸 수 있다.
        //it는 약자로 편하게 쓴 것.

        // 값 가져오기
        // list.iterator(); => 그런데, Ctrl + Alt + V 누르면 자동으로 Iterator<String> iterator = list.iterator(); 형식으로 바꿔줌!

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        // 하나하나씩 번갈아가면서 출력 // // 커서 위치를 처음으로 이동
        // 그리고 다음 데이터를 하나씩 하나씩 가지고 온다고 생각하면 된다. 유재석~4번째 알수없음까지

        // 그런데 이터레이터는 index가 없다. 몇 번째 까지 순회하징???
        //hasNext를 통해 순회함.

        System.out.println("---------");

        it = list.listIterator(); // 커서 위치를 다시 처음으로 이동
        while ((it.hasNext())) {
            System.out.println(it.next()); // 반복을 도는 동안 그 다음값들을 계속 찍어줘. 다음 값이 없으면 탈출.
        }
        System.out.println("------------");

    // 지우는 것부터 다음 시간에!

    //Day15 시작
    //커서 다시 처음으로 이동
        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if(s.contains("(알 수 없음)")) {
                it.remove(); // 삭제
            }
        }

        System.out.println("-----------");

        it = list.iterator();
        while (it.hasNext()) {
            System.out.println((it.next()));
        }
        System.out.println("----------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");

        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("-------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        //map.iterator(); 내장함수로 제공되지 않음.
        // 그럼 어떤식으로 불러와야할까. map.keuSet() 이용
        //map.keySet().iterator();
        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("-------------------");

        Iterator<Map .Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
        System.out.println("---------------------");
    }
}

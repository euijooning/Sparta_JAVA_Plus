package Prac12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

        it = list.listIterator(); // 커서 위치를 다시 처음으로 이동 객체를 처음 것을 불러오면 됨.
        while ((it.hasNext())) {
            System.out.println(it.next()); // 반복을 도는 동안 그 다음값들을 계속 찍어줘. 다음 값이 없으면 탈출.
        }
        System.out.println("------------");

    // 지우는 것부터 다음 시간에!

    //Day15 시작
    //커서 다시 처음으로 이동
        it = list.iterator();


        while (it.hasNext()) {

            // 먼저 데이터를 가지고 와서 우리가 삭제할 데이터인지를 확인해보자.
            String s = it.next(); // 현재 커서가 있는 위치에서부터 그 다음 데이터들을 차례로 찍어줌
            if(s.contains("(알 수 없음)")) { // 알 수 없음일 때,
                it.remove(); // 삭제
            }
        }

        System.out.println("-----------");

        //잘 삭제 되었는지 확인하기
        it = list.iterator();
        while (it.hasNext()) {
            System.out.println((it.next())); // 알 수 없음이 빠진 데이터들이 출력되겠지.
        }
        System.out.println("----------");

        //-------------------------------------
        //이터레이터를 맵이나 Set에서도 쓸 수 있다
        // 먼저 HashSet을 보자.
        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");

        //set.iterator()을 쓴 다음에, ctrl + alt + v 하면 자동으로 객체가 생성된다!
        // 편리한 기능이니까 참고하도록.
        Iterator<String> itSet = set.iterator(); // Set에서 포함된 데이터를 찍어보는 부분을 만들기
        while (itSet.hasNext()) {
            System.out.println(itSet.next()); // 근데 순서는 보장이 안 되기 때문에 어떤 식으로 나올지는 모른다.
        }
        System.out.println("-------------------");

        // HashMap에서 써보기.
        HashMap<String, Integer> map = new HashMap<>(); // 객체 생성
        map.put("유재석", 10);
        map.put("박명수", 5);

        //map.iterator(); 내장함수로 제공되지 않음.
        //그럼 어떤식으로 불러와야할까. map.keuSet() 이용
        // key와 value를 이터레이터 통해 순회 하면 됨
        //map.keySet().iterator(); // 역시 ctrl + alt + v를 통해 객체를 생성
        // map.keySet().iterator();
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("---------");

        // 이제는 value.
        //map.values().iterator();
        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next()); // 순서를 보장하지 않기 때문에
        }
        System.out.println("-------------------");

        //Key와 value를 한꺼번에 출력
        // map.entrySet().iterator();
        Iterator<Map .Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
        System.out.println("---------------------");
    }
}

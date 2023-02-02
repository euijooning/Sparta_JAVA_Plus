package Prac12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        // 알 수 없는 오류로 잘못 된 더미 값이 들어온다고 쳐보자
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("알 수 없음");
        list.add("김종국");
        list.add("알 수 없음");
        list.add("강호동");
        list.add("알 수 없음");
        list.add("박명수");
        list.add("알 수 없음");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("------------");

        // 이터레이터는 인텔리제이 내장이어서 편하게 쓸 수 있다.
        //it는 약자로 편하게 쓴 것.
        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next()); // 하나하나씩 번갈아가면서 출력 // 유재석~4번째 알수없음까지

        // 그런데 이터레이터는 index가 없다.
        //hasNext!

        System.out.println("---------");
        // 커서 위치를 처음으로 이동
        it = list.listIterator();
        while ((it.hasNext())) {
            System.out.println(it.next());
        }
        System.out.println("------------");
    }
}

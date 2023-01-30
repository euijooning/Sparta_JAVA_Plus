package Prac12;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        // 여러명이 앉을 의자가 있다고 가정한 설명
        /*
        먼저 어레이리스트는, 여러명이 앉을 의자가 연달아 있으면, 중간에 누가 앉으려고 한다면 그 사람의 위치로부터
        그 사람 뒤에 있는 사람들이 모두 일어나서 한 칸씩 이동해야 하는 번거로움이 있다.

        링크드 리스트는 의자 없이 사람들이 나란히 손을 잡고 있는 상황이다.
        중간에 한 명이 2-3번 사이로 들어간다고 하면, 잡았던 손을 놓고, 그 사이에 들어가고 나서 기존에 2-3번에 있는 사람과 손을 잡으면서
        쉽게 여러 사람들 사이로 들어갈 수 있다. 그냥 손을 놨다가 새로 들어온 사람과 손을 잡는..

        쓰는 방법은 두 가지가 거의 비슷하다.
         */

        // 선착순으로 수업 진행
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회
        System.out.println(list.get(0)); // 유재석 출력
        System.out.println(list.get(1)); // 조세호 출력
        System.out.println(list.getFirst()); // 편리하게 가장 첫번째 데이터 뽑을 수 있음 // 유재석 출력
        System.out.println(list.getLast()); // 마지막 데이터를 뽑을 수 있음 // 강호동 출력

        System.out.println("-----------");

        // 데이터 추가
        list.addFirst("서장훈"); // 처음으로 데이터가 들어가게 만든다.
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("--------");

        list.addLast("김희철");
        for(String s : list) {
            System.out.println(s);
        } // 7명이 됨

        System.out.println("-----");

        // 중간에 데이터를 추가하는 경우
        System.out.println("학생 추가 전: " + list.get(1)); // 유재석 출력
        list.add(1, "김영철"); // 유재석 씨 앞에 김영철 씨 추가됨
        System.out.println("학생 추가 후: " + list.get(1)); // 김영철 출력

        // 진짜 추가되었는지 확인해보기
        System.out.println("학생 추가 후: " + list.get(2)); // 유재석 출력 <== 이동한 위치
    }
}

// 어떤 상황에서 쓰는게 유리한지 비교해서 정리해두면 면접에 많은 도움이 될 거야.

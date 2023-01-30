package Prac12;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        // 여러명이 앉을 의자가 있다고 가정한 설명

        // 선착순으로 수업 진행
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst()); // 편리하게 가장 첫번째 데이터 뽑을 수 있음
        System.out.println(list.getLast());

        System.out.println("-----------");

        // 데이터 추가
        list.addFirst("서장훈"); // 처음으로 들어가게 만든다.
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
        System.out.println("학생 추가 후: " + list.get(2)); // 유재석 출력
    }
}

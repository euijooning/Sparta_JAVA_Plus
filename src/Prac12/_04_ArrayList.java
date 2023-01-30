package Prac12;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    // 컬랙션 프레임워크. 많은 데이터를 효과적으로 관리하기 위해서 자바가 제공하는 어떤 클래스의 모음.
    // List, Set, Map
    public static void main(String[] args) {

        // 우리가 이전에 두 개 이상의 데이터를 관리하기 위해서 배열을 배웠었지.
        // 하지만 배열은 크기 고정이므로, 새로운 데이터 추가 시 새로운 배열을 선언해줘야 해서 불편함이 있었다.
        /*
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
         */

        // ArrayList
        // 어떤 학원에서 진행하는 5명짜리 수업이 있다고 하자. 선착순 5명!

        // 데이터 추가
        ArrayList<String> list = new ArrayList<>(); //꺽쇠 안에는 받을 데이터 타입
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
        System.out.println("-------------"); // 줄변경

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        // 만약 박명수씨가 등록을 철회한다면?
        // 데이터 삭제
        // 한 개만 지워줄 때는 remove

        System.out.println("신청 학생 수 (등록 철회 전) : " + list.size());
        list.remove("박명수"); // ()괄호 안에 삭제할 데이터를 그대로 적어주면 됨.
        System.out.println("신청 학생 수 (철회 후) : " + list.size());

        System.out.println(list.get(3)); // 강호동 씨가 앞으로 올라온 것을 알 수 있음.

        System.out.println("-----------");
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size()-1); // 마지막 인덱스를 삭제
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        // 순회 : for each문 통해 확인
        for (String s : list) { // 좌측에 담을 변수, 우측엔 순회할 배열
            System.out.println(s); // 유재석, 조세호, 김종국 출력
        }

        System.out.println("-----------");

        // 데이터 변경
        // 유재석 씨가 다른분께 수강권 양도해서 다른 사람이 대신 등록
        System.out.println("수강권 양도 전: " + list.get(0)); // 유재석 출력
        list.set(0, "이수근"); //(바꿀 위치, 바꿀 데이터)
        System.out.println("수강권 양도 후: " + list.get(0)); // 이수근 출력

        System.out.println("------------");

        // 확인
        // 이번에는 김종국 씨가 자기 데이터를 확인하고 싶다고 학원에 문의가 왔다면
        System.out.println(list.indexOf("김종국")); // 괄호 안에 찾으려는 데이터를 넣어주면 된다. 여기서는 김종국씨의 위치를 찾겠지.

        // 리스트 안에 포함되어 있는지 아닌지 확인 //  선착순 5명 내에 포함되어 있는가?
        // contains() 메서드 => True, False로 반환값 출력
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        }
        else {
            System.out.println("수강 신청 실패");
        } // 수강 신청 성공 출력됨.

        System.out.println("---------------");

        // 리스트에 있는 내용 전체 삭제 : clear()
        list.clear();
        // 리스트가 비워져 있는지를 확인
        if(list.isEmpty()) {
            System.out.println("학생 수: " + list.size() );
            System.out.println("리스트가 비어 있습니다.");
        }

        System.out.println("-------------");

        // 여기까지 되면 완전히 리스트 깨끗해짐


        // 새로운 학기가 시작되어 새로운 학생 5명을 선착순으로 받아서 새로 공부를 시작한다.
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 출석부를 만들어보자. 가나다순으로 이름 정렬해서

        // 정렬
        Collections.sort(list); //(안에는 정렬하고 싶은 데이터의 이름)
        // for-each문을 통해 잘 정렬되었는지 확인
        for(String s : list) {
            System.out.println(s); // 강호동, 김종국, 박명수, 유재석, 조세호 순으로 출력 됨.
        }
    }
}

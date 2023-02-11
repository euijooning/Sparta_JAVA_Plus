package Prac12;

import java.util.ArrayList;

// 아이유 파이썬
// 정우성 자바
// 유재석 자바
// 한소희 C
// 강동원 파이썬

// 자바 자격증을 보유한 학생
// ----------------------
// 박명수
// 김종국

class Student15 {
  public String name;
  public String certification;

  public Student15(String name, String certification) {
    this.name = name;
    this.certification = certification;
  }
}
public class Day15Quiz {

  public static void main(String[] args) {
    ArrayList<Student15> list = new ArrayList<>();
    list.add(new Student15("아이유", "파이썬"));
    list.add(new Student15("정우성", "자바"));
    list.add(new Student15("유재석", "자바"));
    list.add(new Student15("한소희", "C"));
    list.add(new Student15("강동원", "파이썬"));

    System.out.println("자바 자격증을 보유한 학생");
    System.out.println("----------");

    for(Student15 student : list) {
      if(student.certification.equals("자바")) { //student의 certification에 "자바" 가 있니?
        System.out.println(student.name); //Sturdent의 이름을 뽑아달라.
      }
    }
  }
}

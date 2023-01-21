package Prac06;

public class Day06 {
    public static void main(String[] args) {
        //인스턴스 만들어서 다른 클래스 안의 요소를 사용함.

        // 그래서 요거는 기본생성자를 통해 값을 하나하나 부여해주고 그 값을 출력하는 형태
        Course course = new Course();
        course.title = "웹개발의 봄, 스프링";
        course.tutor = "남병관";
        course.days = 35;

        System.out.println(course.title);
        System.out.println(course.tutor);
        System.out.println(course.days);
    }
}

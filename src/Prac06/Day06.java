package Prac06;

public class Day06 {
    /*
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
     */

    /*
// 요번에는 객체화 시킬 때, 파라미터를 넘겨주는 예시
    // 아까는 기본생성자를 통해 값을 하나하나 넣어주고 출력한 것, 이거는 파라미터가 3개짜리인 생성자를 통해서 값을 출력해주는 방식

    public static void main(String[] args) {
        Course course1 = new Course();
        course1.title = "웹개발의 봄, 스프링";
        course1.tutor = "남병관";
        course1.days = 35;

        System.out.println(course1.title);
        System.out.println(course1.tutor);
        System.out.println(course1.days);
    }
     */
    /* 객체지향은 현실 세계를 빗대서 디지털 세계에서도 이 개념을 활용을 하자.
        즉, Course라는 공통된 정보가 있으면, 클래스에서 그 공통 정보를 묶어서 사용을 하자
        class에는 기본적으로 멤버변수가 들어가고, 생성자가 있고, getter와 setter가 있는 형태이고, 클래스에서 처리해줘야할 메서드들을 구현한다.
        그리고 다른 클래스에서 이 클래스를 사용할 수 있게 되는데, 이러한 과정을 우리는 인스턴스화 라고 한다.

        클래스와 객체는 같은 건가요? No.
        클래스는 공통된 정보를 묶은 것이고, 인스턴스가 객체와 유사한 개념이라고 생각하면 된다.

        생성자는 파라미터가 여러개인 것을 불러와서 생성하는 방식과, 기본생성자에 값을 넣어주는 방식이 있다.

        클래스를 잘 만들어놓게 되면, 클래스를 쉽게 가져다가 쓸 수 있으며, 코드의 재사용성이 높아지고, 코드의 관리가 용이해지므로,
        잘 만들어놓아야만 다른 코드에 안좋은 영향을 주지 않고, 튼튼한 프로그래밍을 할 수 있다.
     */

}

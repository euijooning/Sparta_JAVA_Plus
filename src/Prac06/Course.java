package Prac06;

public class Course {
    // 멤버변수
    // title, tutor, days 가 Course 라는 맥락 아래에서 의도가 분명히 드러나죠!
    public String title;
    public String tutor;
    public int days;

    //  멤버변수만 선언되어 있을 때는 기본생성자 자연스레 생성되어 있음.
    // 생성자 : 특별한 메서드
    // 기본생성자
    public Course (){}

    public Course(String title, String tutor, int days) {
        // 여기의 정보를 가지고 오고 싶다 하면, 이걸 가져와서 써주면 된다.
        this.title = title;
        this.tutor = tutor;
        this.days = days;
        // 요걸 써줘야만, 우리가 파라미터를 입력 받았을 때 정확한 값이 새겨진 값으로 클래스 안에서 정보가 생성되게 된다.
        // this를 파라미터가 있을 때는 반드시 작성해줘야 문양이 새겨진다!
    }
}

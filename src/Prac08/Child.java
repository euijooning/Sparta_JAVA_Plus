package Prac08;

public class Child extends Parent {


//	Child 클래스에는 Parent 클래스의 모든 멤버 변수와 메소드를 사용할 수 있다.
//	Child 클래스에서 필요한 기능을 정의한다.
// 지금 Parent를 상속받았기 때문에, name과 gender는 안 써줘도 된다!

    private int age;
    private String nickname;

    public Child() {

        super(); // 이 기능을 통해서 부모클래스의 기본생성자에 존재하는 내용을 가지고 올 수 있다.
//		super()가 있으면 자식 클래스의 생성자가 실행되기 전에 부모 클래스의 생성자가 먼저 실행된다.
//		자식 클래스의 생성자에 별도의 설정을 하지 않으면 무조건 첫 줄에 부모 클래스의 기본 생성자를 실행하는 super()를
//		자바 컴파일러가 자동으로 붙여준다.
//		super()를 생략한 경우 부모 클래스에 기본 생성자가 존재하지 않으면 에러가 발생되니 주의한다.
    }



    public Child(String name, boolean gender, int age, String nickname) { // 부모클래스에 있으므로!
        super(name, gender);
        this.age = age;
        this.nickname = nickname;
        // 파라미터 4개짜리 생성자 완성!
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    //	Override(재정의): 부모 클래스로 부터 상속받은 메소드의 기능을 무시하고 다시 만들어 사용한다.
    @Override
    public String toString() {

//		부모 클래스에서 상속받은 멤버 변수의 접근 권한이 protected일 경우 자식 클래스에서 접근할 수 있으므로
//		멤버 변수의 내용을 얻어올 수 있다.
// 이름 (남) - 7 , 별명 형식으로 출력하려고 한다면 아래와 같이 코드를 작성해 주면 된다.
        return name + "(" + (gender ? "남" : "여") + ") - " + age + ", " + nickname;
    }

}
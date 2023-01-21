package Prac08;

public class Parent {
    //	protected 접근 권한은 현재 클래스와 현재 클래스를 상속받은 자식 클래스에서만 접근 가능
    protected String name;
    protected boolean gender; // 트루펄스로 남녀를 구별

    public Parent() {
        this("무명", false); // 아무것도 안 적었을 때, 출력할 defalut값을 이처럼 설정해줄 수도 있음.
    }
    public Parent(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    // 김르탄(남) 과 클래스로 생성한 객체 정보를 출력하고 싶을때 (예쁘게 값을 가져오고 싶음)
    @Override
    // toString 메서드는 최상위 클래스인 Object 클래스에 속해있는 메서드
    //"toString" 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
    // 모든 클래스를 만들때 오브젝트 클래스를 상속받아 만들지는 않지만 오브젝트 클래스의 하위클래스에 만들어 진다.

    public String toString() {
//		조건식 ? 조건이 참일 때 실행할 문장 : 조건이 거짓일 때 실행할 문장
        return name + "(" + (gender ? "남" : "여") + ")"; // 삼항연산자로 true, false 나오게 하면 보기가 더 편하지.
    }
}

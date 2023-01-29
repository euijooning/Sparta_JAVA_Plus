package Prac12.user12;
/*
       이제 회원가입을 추가해서 관리했다고 가정하자. 휴대폰 번호 등을 이용해 포인트 적립 등으로 혜택
        */
public class User12 {
    public String name;

    public User12(String name) {
        this.name = name;
    }
    public void addPoint() {

        // 포인트 적립 메소드
        System.out.println(this.name + " 님, 포인트가 적립 되었습니다!");
    }
}

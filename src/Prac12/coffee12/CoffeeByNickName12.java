package Prac12.coffee12;

public class CoffeeByNickName12 {
    public String nickname;

    public CoffeeByNickName12(String nickname) {
        this.nickname = nickname;
    }

    public void ready() {
        System.out.println(" 커피 준비 완료: " + nickname);
    }
}

package Prac06;

public class Card {
    public String user;
    public int pw;
    public int bal;

    public Card(){;}

    public Card(String user, int pw, int bal) {
        this.user = user;
        this.pw = pw;
        this.bal = bal;
    }

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {
        this.pw = pw;
        System.out.println("비밀번호 변경 완료!");
    }
}

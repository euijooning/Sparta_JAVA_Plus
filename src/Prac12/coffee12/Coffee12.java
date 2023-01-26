package Prac12.coffee12;

public class Coffee12 <T> {
    public T name;

    public Coffee12(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + name);
    }
}

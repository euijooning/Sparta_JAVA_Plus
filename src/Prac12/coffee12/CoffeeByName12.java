package Prac12.coffee12;

public class CoffeeByName12 {
    public Object name;

    public CoffeeByName12(Object name) {
        this.name = name;
    }
    public void ready() {
        System.out.println("커피 준비 완료: " + name);
    }
}

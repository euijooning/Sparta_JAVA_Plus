package Prac12.coffee12;

public class CoffeeByNumber12 {
    public int waitingNumber;

    public CoffeeByNumber12(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + waitingNumber);
    }

}

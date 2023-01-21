package Prac09;

public class Car09 {
    String brand;
    String color;
    int price;

    public Car09() {;}


    public Car09(String brand, String color, int price) {
        super();
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


    void engineStart() {
        System.out.println(brand + " 열쇠로 시동 켜기");
    }

    void engineStop() {
        System.out.println(brand + " 열쇠로 시동 끄기");
    }
}


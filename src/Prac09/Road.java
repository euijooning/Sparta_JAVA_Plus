package Prac09;

public class Road {
    public static void main(String[] args) {
        Car09 car = new Car09 ("K5", "black", 5000 );
        SuperCar09 myCar = new SuperCar09 ("람보르기니" , "Black", 10000, "데일리");
        car.engineStart();
        myCar.engineStart();
    }

}


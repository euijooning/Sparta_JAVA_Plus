package Prac09;

public class SuperCar09 extends Car09 {
    // 상속 필드 추가
    String mode;

    public SuperCar09() {;}


    public SuperCar09(String brand, String color, int price, String mode) {
// 생성자는 자동으로 상속이 안됨, super(파라미터적어 주던지) or this.brand=brand ... 로 적어줘야함
        super(brand, color, price);
        this.mode = mode;
    }

    void engineStart() {
        System.out.println(brand+" 음성으로 시동 켜기");
    }

    void engineStop() {
        System.out.println(brand+" 음성으로 시동 끄기");
    }

    void roofOpen() {
        System.out.println(brand+" 뚜껑 열기");
    }
    void roofClose() {
        System.out.println(brand+" 뚜껑 닫기");
    }

}

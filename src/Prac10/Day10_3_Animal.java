package Prac10;

// 1) 추상클래스 실습예제 : Animal

abstract class Animal10 {
    String name;
    int age;
    String howling; // 이 울음 소리는 자손 클래스에서 정의하도록 하겠다.

    public Animal10(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void howl() {
        System.out.println(this.howling + " 내 이름은 " + this.name + ", " + age + "살 " + "이다!!!");
    }

    //동물들마다 매력포인트가 있다고 해보자 동물들마다 특징을 줄 거기 때문에 abstract 타입으로 선언을 하고, 자손 클래스에서 구현함
    abstract void charming();
    // 추상 메서드! => 상속받는 클래스는 무조건 오버라이딩 해야 한다. => 강제성 부여.
}

class Cat10 extends Animal10 {

    public Cat10(String name, int age) {
        super(name, age);
        this.howling = "야옹!";
    }

    @Override //매력포인트 드디어 구현
    void charming() {
        System.out.println("부비부비");
    }
}

class Dog10 extends Animal10 {

    public Dog10(String name, int age) {
        super(name, age);
        this.howling = "멍멍!";
    }

    @Override
    void charming() {
        System.out.println("배 까고 드러눕기!");
    }
}

public class Day10_3_Animal {
    public static void main(String[] args) {
        Cat10 cat = new Cat10("고양고양이", 5);
        Dog10 dog = new Dog10("바둑이", 10);

        cat.howl();
        dog.howl();

        cat.charming();
        dog.charming();
    }
}
/*
즉, 이것은 Animal에서 기본적인 기능만 구현을 해놓고, 나머지는 상속받은 자손클래스에서 동물들의 매력을 집어넣어서
생성자를 통해 객체를 생성할 수 있게 되고, 각각의 메서드들을 구현할 수 있게 마저 구현을 한 것.
 */
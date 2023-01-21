package Prac08;

public class Inheritance {
    public static void main(String[] args) {

        Parent parent = new Parent();
        System.out.println(parent);
        Parent parent2 = new Parent("고길동", true);
        System.out.println(parent2);
        System.out.println("=======================");

        Child child = new Child();
        System.out.println(child);
        Child child2 = new Child("둘리", true, 6, "호잇");
        System.out.println(child2);
    }
}

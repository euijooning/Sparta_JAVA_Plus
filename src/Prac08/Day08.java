package Prac08;

import Prac06.Tv;

public class Day08 {
    /*
개념설명
getter/setter
클래스에는 개인정보와 같이 민감하고 중요한 정보가 많이 있기 때문에 함부로 접근하고 값을 변경
하지 않도록 최소한의 허들을 두어야 하는데요.
지난시간에 배웠던 접근제어자 를 통해 해당 클래스의 접근 범위를 설정할 수 있었습니다.
일반적으로 멤버변수는 private로 설정이 되고,
해당 클래스의 인스턴스 생성시 값을 변경하거나 가져올때에는
클래스의 해당메서드를 통해서만 그 기능을 할 수 있도록 하고 있습니다.

따라서 접근제어자가 private 인 경우, 어떻게 다른 클래스에서 인스턴스를 생성하고
객체의 값을 넣고 가져오는지
getter/ setter 문법을 복습해 보도록 하는 시간입니다.

// setter
// 메서드 (public)
public 반환타입 메서드명 (파라미터) {
    예) this.title=title;
}

// setter 는 클래스의 객체를 활용해 값을 저장하는 것이므로
// setter 작성시 따로 반환타입(돌려줄값)은 없습니다.
// 메서드명은 관습적으로 setTitle;과 같은 형식으로 작성하고 있습니다.

예)
public void setTitle(String title) {
    this.title= title;
}


// getter
public String getTitle(String title) {
		return this.title= title;
}
// 값을 반환해 주는 것이므로 반환타입이 있다.
// 값을 반환해 주므로 return이 꼭존재한다.

*/
/*
    public static void main(String[] args) {

        String title = "Spirng";
        String tutor = "남병관";
        int days =35;

// 아래와 같이 값을 넣을때는 setter메서드를 통해 작성
        Course08 course = new Course08();
        course.setTitle(title);
        course.setTutor(tutor);
        course.setDays(days);

        // 인쇄해보기, 값을 가져올때도 아래와 같이 메서드를 가져와서 출력
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());
    }
 */
    // 퀴즈 1: 응용과 실습 (클래스와 메소드)
    // 1) Book 클래스를 만들고, 도서명(title)과 지은이(author), 출판사(publisher) ,가격(price) 멤버변수를 추가하세요.
    // 2) 그리고 각 변수를 private 선언하고, Getter와 Setter를 만들어 보세요.
    // 3) 마지막으로, 기본생성자와 title/ author/ price 입력받는 생성자 두개를 만들어 보세요.
    // 4) 메인클래스(Prac)에서 변수선언하여 값을 넣고, 인스턴스를 만들어 보세요.
    // setter을 이용하여 값을 넣는 문법을 구현하고 getter를 활용하여 책 한권의 정보를
    // 출력하는 화면을 구현합니다.

/*
    public static void main(String[] args) {
        String title = "데미안";
        String author = "헤르만 헤세";
        String publisher = "민음사";
        int price = 20000;

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setAuthor(author);
        book.setPrice(price);

        System.out.println(book.getTitle(title));
        System.out.println(book.getAuthor(author));
        System.out.println(book.getTitle(publisher));
        System.out.println(book.getPrice(price));

    }


*/
    /*
상속
OOP(객체지향)의 4대 원칙으로는 캡슐화, 상속, 다형성, 추상화가 있습니다.
캡슐화의 예로 접근제어자(은닉화)를 배웠고,
다음으로는 상속에 대한 문법과 이해도를 높이고자 실습을 하는 시간을 갖도록 합니다.

상속의 특징

class Parent{}
class Child extends Parent{}

예)
class Parent{
int age;
}

class Child extends Parent{
}

클래스 | 클래스의 멤버
Parent | age
Child  | age, play()
-------------------------------------------------------

- 생성자와 초기화 블럭은 상속되지 않는다. 멤버만 상속된다. (정확한 설명)
- 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
- 여러클래스를 한번에 상속 받을 수 없다.
- 아래와 같이 여러 클래스가 한 부모의 클래스를 상속받을 수 있다. (상속의 상속은 가능)
. 단일 상속의 법칙이 있음
. 하나의 클래스는 하나의 부모만을 상속 받을 수 있다.


class Parent{}
class Child extens Parent{}
class Child2 extens Parent{}

     */
/*
    class Tv1 {
        boolean power; //전원(on/off)
        int channel; // 채널

        void power() {
            power = !power;
        }

        void channelUp() {
            ++channel;
        }

        void channelDown() {
            --channel;
        }
    }

    // 자막 tv
    class captionTv extends Tv1 {
        // 추가로 필요한 멤버변수를 작성.
        boolean caption;

        // 메소드
        void displayCaption(String text) {
            if (caption) { // 캡션상태가 on(true)일때만 text를 보여 준다.
                System.out.println(text);
            }
        }
    }
            public static void main(String[] args) {
            captionTv ctv = new captionTv();
            ctv.channel = 10;
            ctv.channelUp();
            System.out.println(ctv.channel);
            ctv.displayCaption("Hello, World");
            ctv.caption = true;
            ctv.displayCaption("Hello, World");
        }
    }
    상속의 예시인데, 에러나는 원인을 잘 모르겠어, 일단 넘어가자
 */
}







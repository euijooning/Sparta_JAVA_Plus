package Prac06;

import java.util.Scanner;

public class Day06 {
    /*
    public static void main(String[] args) {
        //인스턴스 만들어서 다른 클래스 안의 요소를 사용함.

        // 그래서 요거는 기본생성자를 통해 값을 하나하나 부여해주고 그 값을 출력하는 형태
        Course course = new Course();
        course.title = "웹개발의 봄, 스프링";
        course.tutor = "남병관";
        course.days = 35;

        System.out.println(course.title);
        System.out.println(course.tutor);
        System.out.println(course.days);
    }
     */

    /*
// 요번에는 객체화 시킬 때, 파라미터를 넘겨주는 예시
    // 아까는 기본생성자를 통해 값을 하나하나 넣어주고 출력한 것, 이거는 파라미터가 3개짜리인 생성자를 통해서 값을 출력해주는 방식

    public static void main(String[] args) {
        Course course1 = new Course();
        course1.title = "웹개발의 봄, 스프링";
        course1.tutor = "남병관";
        course1.days = 35;

        System.out.println(course1.title);
        System.out.println(course1.tutor);
        System.out.println(course1.days);
    }
     */
    /* 객체지향은 현실 세계를 빗대서 디지털 세계에서도 이 개념을 활용을 하자.
        즉, Course라는 공통된 정보가 있으면, 클래스에서 그 공통 정보를 묶어서 사용을 하자
        class에는 기본적으로 멤버변수가 들어가고, 생성자가 있고, getter와 setter가 있는 형태이고, 클래스에서 처리해줘야할 메서드들을 구현한다.
        그리고 다른 클래스에서 이 클래스를 사용할 수 있게 되는데, 이러한 과정을 우리는 인스턴스화 라고 한다.

        클래스와 객체는 같은 건가요? No.
        클래스는 공통된 정보를 묶은 것이고, 인스턴스가 객체와 유사한 개념이라고 생각하면 된다.

        생성자는 파라미터가 여러개인 것을 불러와서 생성하는 방식과, 기본생성자에 값을 넣어주는 방식이 있다.

        클래스를 잘 만들어놓게 되면, 클래스를 쉽게 가져다가 쓸 수 있으며, 코드의 재사용성이 높아지고, 코드의 관리가 용이해지므로,
        잘 만들어놓아야만 다른 코드에 안좋은 영향을 주지 않고, 튼튼한 프로그래밍을 할 수 있다.
     */

    /*
    // 채널 오르락내리락하기
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.channel = 7;
        tv.channelDown();
        System.out.println("현재 채널은 " + tv.channel + "번 입니다.");
    }
     */

    //퀴즈 01.
    // Book 클래스 만들고 멤버변수로 4개 선언하기 (title, author, publisher, price)
    // 멤버변수의 접근제어자는 public (접근제어자) 으로 하기
    // 메인클래스에서 Book클래스를 이용하여 인스턴스를 만들기
    // 값을 넣어서 출력해보기
    // 기본생성자 만들기

            // 1-1

            // 파라미터 4개짜리 생성자 만들기
            // 파라미터가 4개짜리인 생성자를 통해 객체 만들기
            // 메인 클래스에서 변수와 값을 선언하고 파라미터 4개를 넘겨받는 방식으로 출력해보기

    /*
    public static void main(String[] args) {
// 1-1.
            Book06 book1 = new Book06();
            book1.title = "타이탄의 도구들";
            book1.author = "ABC";
            book1.publisher = "교보문고";
            book1.price = 23000;

            System.out.println(book1.title);
            System.out.println(book1.author);
            System.out.println(book1.publisher);
            System.out.println(book1.price);
            System.out.println("내가 산 책은 " + book1.title+"이고, "+ "작가는 "+ book1.author +" 이다.");

//1-2.
            String title ="타이탄의 도구들";
            String author ="ABC";
            String publisher = "교보문고";
            int price = 23000;

             Book06 book2 = new Book06(title, author, publisher, price);
             System.out.println(title);
             System.out.println(author);
             System.out.println(publisher);
             System.out.println(price);
        }
     */
    public static void main(String[] args) {
        // 이름, 잔액, 비밀번호 등을 입력해야 하므로 스캐너 필요.
        Scanner sc = new Scanner(System.in);
        // 그래서 배열 형태가 필요

        Card[] c = new Card[3];

        // 3장이 발급될동안 해당 정보들이 반복될것이므로, for문을 사용해준다.
        for (int i = 0; i < 3; i++) {
            System.out.println("이름: ");
            String name = sc.nextLine();

            System.out.println("비밀번호: ");
            int pw = sc.nextInt();

            System.out.println("잔액: ");
            int bal = sc.nextInt();

            // 이렇게만 두면, 잔액이 버퍼에 남아있으므로, 버퍼를 일부러 한 번 비워주어야 한다.
            sc.nextLine();
            c[i] = new Card(name, pw, bal); //각각 i번째 카드에 정보 입력 후 카드 생성 가능
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(c[i].user + " 님, 결제 진행 중입니다.");

            System.out.println("패스워드를 입력해주세요: ");
            int pw = sc.nextInt();
            // 비밀번호 일치하는 경우
            if(pw == c[i].getPw()) {
                if(c[i].bal<5000) {
                    System.out.println("잔액이 부족합니다!");
                }
                else {
                    c[i].bal -=5000; // c[i].bal = c[i].bal - 5000;
                    System.out.println("결제가 완료되었습니다!");
                }
            }
            // 비밀번호 불일치 하는 경우
            else {
                System.out.println("비밀번호가 일치하지 않습니다!");
            }
        }

        // 비밀번호 변경
        // 이번에는 새로운 값을 넣어줘야 하니, set이 필요할거야. Card클래스에 set을 써줘라.
        for (int i = 0; i<3; i++) {
            System.out.println(c[i].user + "님, 기존 패스워드를 입력하세요: ");
            int pw = sc.nextInt();

            // 비밀번호 일치, 변경
            if(pw==c[i].getPw()) {
                System.out.println("새로운 pw를 입력하세요: ");
                pw = sc.nextInt();

                // 변경한 비밀번호가 기존 비밀번호와 동일하다면 출력될 메시지는 아래에.
                if(pw == c[i].getPw()) {
                    System.out.println("기존 비밀번호와 동일합니다!");
                }
                else {
                    c[i].setPw(pw); // 동일하지 않은 경우, 새롭게 들어온 값으로 변경된다!
                }
            }
            // 비밀번호 불일치, 변경 불가 => if문 이외의 경우이므로, else문 처리를 통해 구현.
            else {
                System.out.println("비밀번호가 불일치하여 변경 불가!");
            }
        }
    }
}


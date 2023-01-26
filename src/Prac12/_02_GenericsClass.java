package Prac12;

import Prac12.coffee12.CoffeeByName12;
import Prac12.coffee12.CoffeeByNickName12;
import Prac12.coffee12.CoffeeByNumber12;

public class _02_GenericsClass {
    public static void main(String[] args) {
        // 다양한 형태의 메서드들을 받아서 하나로 처리하는 걸로 구현을 앞에서 했었지
        // 커피 실습할거야.

        CoffeeByNumber12 c1 = new CoffeeByNumber12(33); // 대기번호
        c1.ready(); //커피 준비 완료 : 33 출력

        // 이제 닉네임으로 불러드리는 고객님이 오셨다고 하자...
        // CoffeeByNumber12에서는 int로 받았으니까, 닉네임으로 받는 걸 만들어줘야지, 클래스 생성하자.

        CoffeeByNickName12 c2 = new CoffeeByNickName12("미연");
        c2.ready();
        System.out.println("-----------"); // 줄변경
        // c1이나 c2나 사실 동작은 똑같다. 값이 바뀌어야 한다고 하면 그때마다 새로운 클래스를 만들어야 해서 번거로움이 있을 것이다.

        /*
        방법: 1 Object클래스 사용
        모든 클래스의 조상이기 때문에 따로 상속을 해주지 않아도, 모든 클래스에서는 object 타입을 받을 수가 있다.
         */

        CoffeeByName12 c3 = new CoffeeByName12(34); // Object로 받았으므로 아무 문제가 없어요. 정수
        c3.ready();
        CoffeeByName12 c4 = new CoffeeByName12("조미연"); // 문자열
        c4.ready();
        System.out.println("------------------");

        // 이제 CoffeeByName12에서 name을 가져와서 이름과 주문번호를 확인하고 싶어요.

        int c3Name = (int)c3.name;
        System.out.println("주문 고객 변호: " + c3Name); // 반드시 형변환 해서 가져와야함.

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 변호: " + c4Name); // 반드시 형변환 해서 가져와야함. Object이므로



    }
}

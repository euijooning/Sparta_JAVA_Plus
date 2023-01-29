package Prac12.coffee12;

import Prac12.user12.User12;

//받는 형을 제한해주겠다~!
public class CoffeeByUser12 <T extends User12> { // 어떤 타입의 클래스를 써도 상관은 없는데, User12라는 클래스를 반드시 상속하는 T를 써야한다는 뜻 (형 제한).
    // 그러면 Camera클래스 같은 것은 받아올 수 없게 되겠지.
    public T user;

    public CoffeeByUser12(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + user.name); // 유저가 유저정보를 다 가지고 있으므로.
        user.addPoint();
    }
}

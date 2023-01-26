package Prac12.user12;
// 헤비유저가 있다고 치자
public class VipUser12 extends User12 {

    public VipUser12(String name) {
        super("특별한 " + name);
        //특별한 ..님 이렇게 불러주는게 user클래스예요.
    }
}

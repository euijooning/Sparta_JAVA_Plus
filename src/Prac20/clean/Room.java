package Prac20.clean;

public class Room {
    public int roomNumber = 1;

    // 이 싱크로나이즈드가 중요!!!
    synchronized public void clean(String name) { // 직원 누가 청소중인지 받기 위해서 name을 받음

        // ex. 직원 1 : 3번방 청소중
        System.out.println(name + ": " + roomNumber + "번방 청소중");
        roomNumber++;
    }
}
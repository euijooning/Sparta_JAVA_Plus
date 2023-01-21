package Prac06;

//예제: TV채널 오르락내리락 하기
public class Tv {
    public String color;
    public boolean power;
    public int channel;

    // 전원이 꺼져있으면 켜고 켜져있으면 끄라는 의미
    public void power() {
        power = ! power;

    }

    public void channelUp() {

        channel++;
    }

    public void channelDown() {

        channel++;
    }
}

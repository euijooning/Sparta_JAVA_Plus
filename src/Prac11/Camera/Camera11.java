package Prac11.Camera;

// 기능 2가지.
// 1) 사진 촬영 기능
// 2) 동영상 녹화 기능
public abstract class Camera11 {

    public void takePicture() {
        System.out.println("사진을 찍습니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature();


}

package Prac22;

import java.io.File;

public class _05_FileAndFolder {

  public static void main(String[] args) {
    // 여러 목록들을 가지고 와서 이게 파일인지 폴더인지를 구분하는 것을 해볼게요.

    // String folder = "."; // 현재 위치를 의미 이건 상대 경로
    // 절대경로로 변경 => 폴더 아이콘 우클릭 해서 경로/참조 복사
    String folder = "C:\\Users\\eui44\\OneDrive\\바탕 화면\\메가It\\추가공부\\후발대\\Java_park\\src\\Prac22";

    File filesAndFolders = new File(folder);
    System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());

    // for 반복문을 통해서 이 폴더의 목록과 하위폴더를 가지고 올 수 있다.
    for (File file : filesAndFolders.listFiles()) { // 모든 폴더와 파일 정보를 다 가지고 옴.listFiles()
      if (file.isFile()) { // 파일인지를 구분
        System.out.println("(파일) " + file.getName());
      } else if (file.isDirectory()) { // 폴더인지를 구분
        System.out.println("(폴더) " + file.getName());
      }
    }
  }
}

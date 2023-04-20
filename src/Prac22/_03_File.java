package Prac22;

import java.io.File;
import java.io.IOException;

public class _03_File {

  public static void main(String[] args)  {
    // 새로운 파일을 만들고 그 파일의 정보를 얻어오는 작업
    String fileName = "text.txt";
    File file = new File(fileName); // 괄호 속에는 만들고자 하는 경로
    try {
      file.createNewFile(); // 실행하게 되면 파일이 생성!!!
      if(file.exists()) { // 정보 얻어오기
        System.out.println("파일 이름 : " + file.getName());
        System.out.println("파일 절대 경로 : " + file.getAbsolutePath());
        System.out.println("파일 크기 (Byte) : " + file.length()); // 현재는 아무것도 없으므로 0.
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    // throws IOException 이렇게 메서드 옆에 붙일 수도 있고, try-catch로 감쌀 수도 있다.
  }

}

package Prac22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _06_2_ReadFile {
  // 파일 읽기
  // 기본적으로 쓰기와 비슷함. 매우

  public static void main(String[] args) {
    // 파일 읽기
    try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
      // 파일에 있는 줄 단위로 한줄씩 한줄씩 끝까지 불러오면 끝.
        String line;
        while ((line = br.readLine()) != null) { // 버퍼드리더를 통해 한 줄을 불러오고 그것을 line 변수에 저장.
          System.out.println(line);
        }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}

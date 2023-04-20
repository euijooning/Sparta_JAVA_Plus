package Prac22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _06_1_WriteFile {

  public static void main(String[] args) {
    /*
    우리가 프로그래밍을 할 때,
    새로운 파일을 만들어서 거기에 내용입력을 하고,
    파일에서 내용을 불러와서 코드 내에서 값을 사용할 수 있다.
     */
    // BufferedReader : 파일에서 내용을 읽어올 때
    // BufferedWriter : 파일에 내용을 쓸때
    // Bufferd : 데이터를 한 곳에서 다른 곳으로 보낼 때, 잠시동안 보관하는 장소 개념.
    // 마트에서 물건을 가져올 때 하나씩 들고오는 것보다 카드 사용이 더 효율적. 가져오는 카트 역할이 버퍼.

    // FileWriter fw = new FileWriter("goodjob.txt");
   // BufferedWriter bw = new BufferedWriter(fw); 이렇게 쓰는 게 정석
   // 이렇게 바꿈. BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt")); // 예외처리 감싸기
    try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) { //append 하고싶으면 true추가
      // 이렇게 하면 try구문이 끝날 때 자동으로 bw.close()를 호출해줌.
          bw.write("1. 이제 거의 끝이 보여요."); // 기본적으로 수정하면 원래 있던 문장 사라지고 덮어쓰기 됨.
          bw.newLine(); // 줄바꿈
          bw.write("2. 여기까지 오신 여러분들 정말 대단해요!");
          bw.newLine();
          bw.write("3. 조금만 더 힘내요!");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
}


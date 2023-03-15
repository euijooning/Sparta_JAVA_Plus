package prac18;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {

  public static void main(String[] args) {
    // 여기서는 surround with try-catch 선택
    try {
      writeFile();
    } catch (IOException e) {
      // throw new RuntimeException(e);
      e.printStackTrace();
      System.out.println("메인 메소드에서 해결할게요.");
    }
  }
  // 파일에다가 어떤 내용을 쓰는 동작을 하겠다.
  // 파일 입출력은 가장 마지막에 배울 테니 걱정하지 마세요.
  public static void writeFile() throws IOException {
    // try-catch로 감싸기 전에는 FileWriter writer = new FileWriter("test.txt"); 이렇게 되어 있었다.
    // surround with try-catch 선택
   /*
    try {
      FileWriter writer = new FileWriter("test.txt");
      throw new IOException("파일 쓰기에 실패했어요.");
    } catch (IOException e) {
      // throw new RuntimeException(e);
      e.printStackTrace(); // 우리가 생성할 때 발생했던 에러를 보여준다.
      System.out.println("writeFile 메소드 내에서 자체 해결했어요.");
    }
    */

    // 새로 시도할 방법 예시
    // FileWriter writer = new FileWriter("test.txt");여기서 add Exception to 메서드 시그니처 선택
    // rmfjaus throws IOException 이 옆에 붙더라.
    FileWriter writer = new FileWriter("test.txt");
    throw new IOException("파일 쓰기에 실패했어요.");
  }
}

/*
이건 기존에 했던 예외처리와 좀 다른 방법.
우리가 지금 main 메서드에서 writeFile이라는 메서드를 호출을 하는데, 여기 안에서 문제가 발생한다고 하면
이 메서드를 호출한 main 메서드에서 자체적으로 해결하는 방법.
 */

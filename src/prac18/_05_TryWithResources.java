package prac18;

import java.io.BufferedWriter;

public class _05_TryWithResources {
  public static void main(String[] args) {
    MyFileWriter writer1 = null; //현재는 객체가 없는 상태

    try {
      writer1 = new MyFileWriter(); // 객체 생성
      writer1.write("아이스크림 사주세요.");
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
     try {
       writer1.close(); // 처음엔 빨간줄 surround with catch 써서 try-catch문 한번 더 써준다.
     } catch (Exception e) {
       throw new RuntimeException(e);
     }
    }

    System.out.println("_______");

    try(MyFileWriter writer2 = new MyFileWriter()) {
      writer2.write("빵이 먹고 싶어요");
    } catch (Exception e) {
      e.printStackTrace();
    }
      /*
  try with resources
  try 내에서 사용할 파일 객체 등을 괄호 속에 정의해주게 되면, try-catch 문을 빠져 나올 때,
  자동으로 닫는 메서드(close)를 실행해준다.
  그런데 여기서 조건이 있는데, AutoCloseable 이라는 인터페이스를 구현해줘야 한다.
   */
  }
}

class MyFileWriter implements AutoCloseable {

  @Override
  public void close() throws Exception {
    System.out.println("파일을 정상적으로 닫습니다.");
  }

  BufferedWriter bw = null;


  public void write(String line) { //파일을 쓰는 메서드
    System.out.println("파일의 내용을 입력합니다.");
    System.out.println("입력 내용: " + line);
  }
  // 지금 MyfileWriter을 이용하게 되면, write 메서드 통해 파일 내용을 쓸 수가 있고,
  // close 메서드 통해 파일을 다 쓴 후에 닫을 수 있도록 코드를 작성해뒀음.

}

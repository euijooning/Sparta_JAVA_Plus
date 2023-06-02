package Prac22;

import java.io.File;

public class _07_DeleteFile {

  public static void main(String[] args) {
    File file = new File("goodjob.txt"); //괄호 안에는 삭제하고 싶은 파일명
    file.delete(); // 삭제됨

    // 여전히 존재하는지 확인
    if (file.exists()) { //있느냐 없느냐
      if (file.delete()) {
        System.out.println("파일 삭제 성공 : " + file.getName());
      } else {
        System.out.println("파일 삭제 실패 : " + file.getName()); // 없을 때는아무것도 출력 x
      }
    }

    File folder = new File("A"); // 처음에이러면 폴더 삭제 실패 나온다. 왜? 하위 폴더가 존재하고 있어서
    // 메서드 구현 하고 나면
    // 그래서 명령어를 정확하게 써줘야 함.
//    File folder = new File("A/B/C"); // C폴더를 지우는 것 삭제 바로 가능(가장 하위 폴더)
    if (folder.exists()) {
      if (folder.delete()) {
        System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
      } else {
        System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
      }
    }
    deleteFolder(folder);



    //deleteFolder(folder);
    if (deleteFolder(folder)) {
      System.out.println("*폴더 삭제 성공 : " + folder.getAbsolutePath());
    } else {
      System.out.println("*폴더 삭제 실패 : " + folder.getAbsolutePath());
    }
  }



//타고 들어오는 과정~
  // deleteFolder(A)
  //      deleteFoler(B)
  //          deleteFolder(c)

  // 이렇게 처리된다.
  //          C.delete() 삭제
  //      B.delete() 삭제
  // A.delete() 삭제
  // 가장 안쪽에 있는 것부터 바깥으로 삭제.

    // 한꺼번에 지우는 것은 메서드를 활용
    // 재귀함수 활용
    public static boolean deleteFolder(File folder) {
      if(folder.isDirectory()) {
        for (File file : folder.listFiles()) { //폴더 안에 있는 모든 목록을 가져오게 됨.
          deleteFolder(file); // 우리가 전달받은 것이 디렉토리인 경우 처리 완료
        }
      }
      System.out.println("삭제 대상 : " + folder.getAbsolutePath());
      return folder.delete();
  }
}


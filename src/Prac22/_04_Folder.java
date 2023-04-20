package Prac22;

import java.io.File;

public class _04_Folder {

  public static void main(String[] args) {
    String folderName = "A";
    File folder = new File(folderName); // 파일과 절차 같음.
    folder.mkdir(); //make directory => A 라는 이름의 폴더가 생성됨.

    if(folder.exists()) {
      System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());// 절대경로 가져오기
      // 실행하면 폴더 생성됨!!!
    }
    System.out.println("---------------------");
    System.out.println("---------------------");

    // 중첩으로 폴더 만들기 시도(하위폴더)
    folderName = "A/B/C";
//    "A" + File.separator + "B" + File.separator + "C" 이게 제대로 구분되는 방법;
    folder = new File(folderName); // 파일과 절차 같음.
    //folder.mkdir();
    // 윈도우 : C:\\Users\\hbd\\Desktop 형태로 만들어짐.
    // 그냥 이렇게만 쓰면 폴더 안 만들어지더라.
    // 그래서!!!
    folder.mkdirs();
    if(folder.exists()) {
      System.out.println("폴더가 존재합니다: " + folder.getAbsolutePath());
    } else {
      System.out.println("폴더 생성 실패 (nkdir)");
    }
  }
}
/*
왜 실패할까??
폴더에 상위폴더가 있는 상태에서는 내가 만들려는 Folder 하나는 만들 수가 있는데,
여러개는 만들 수 없다.
그래서 mkdirs라는 명령어를 대신 쓴다.
 */

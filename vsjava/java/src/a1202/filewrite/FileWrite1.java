package a1202.filewrite;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/abc/out.txt");
        // 경로에 폴더를 만든 후 실행하면 해당 파일이 생성
        output.close();
    }
}

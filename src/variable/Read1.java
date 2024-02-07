package variable;

import java.io.IOException;
import java.util.Scanner;

public class Read1 {
    public static void main(String[] args) throws IOException {
        int read = System.in.read();//시스템 입력장치에서 키를 읽어라
        // 읽은 결과는 KeyCode로 저장됨 (1글자만 가져옴)
        System.out.println(read);

        // 아스키코드(ASCII)

    }
}

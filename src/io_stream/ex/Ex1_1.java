package io_stream.ex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


// 다른 풀이방법
public class Ex1_1 {
    public static void main(String[] args) {
        System.out.println("텍스트를 입력하세요 ('종료' 입력 시 프로그램 종료):");

        String path = "src/io_stream/ex/output.txt";

        // try-with-resource 구문
        // 해당 블록에서만 사용하는 자원 () 안에 넣고, 블록 이후 자동 종료
        try (Scanner scanner = new Scanner(System.in);
             FileWriter writer = new FileWriter(path)) {
            while (true) {
                String input = scanner.nextLine();
                // 조건 검사
                if (input.equals("종료")) break;
                // 쓰기 이후 줄바꿈 문자
                writer.write(input + "\n");
            }
        } catch (IOException e) {
            System.out.println("예외 발생");
        }

    }
}

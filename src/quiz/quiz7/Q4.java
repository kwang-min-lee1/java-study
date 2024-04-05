package quiz.quiz7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*

입출력 스트림, 사용자 입력 문자열을 파일에 저장하기

    사용자로부터 문자열 입력을 받아 이를 "output.txt"라는 이름의 파일에 저장하는 프로그램을 작성하세요.

    요구 사항
    - 사용자 입력 받기: 사용자로부터 문자열을 계속해서 입력 받으세요. 입력은 터미널(콘솔)을 통해 이루어집니다.
    - 파일에 저장: 사용자가 입력한 문자열을 "output.txt" 파일에 저장하세요. 사용자가 새 문자열을 입력할 때마다, 이 문자열은 파일의 새로운 줄에 추가되어야 합니다.
    - 프로그램 종료 조건: 사용자가 "종료"라고 입력하면, 프로그램은 더 이상 입력을 받지 않고 종료됩니다. 이때, 지금까지 입력받은 모든 문자열이 "output.txt" 파일에 저장되어 있어야 합니다.

    실행예시
    ===
    텍스트를 입력하세요 ('종료' 입력 시 프로그램 종료):
    > 안녕하세요
    > 파일 입출력 연습입니다.
    > 종료

    output.txt
    ===
    안녕하세요
    파일 입출력 연습입니다.
 */
public class Q4 {
    public static void main(String[] args) {
        // Scanner 를 사용하여 사용자 입력을 읽고,
        // BufferedWriter 를 사용하여 파일을 쓰기 위해 try-with-resources 문을 사용
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            // 사용자에게 입력을 요청하는 메시지를 출력
            System.out.println("텍스트를 입력하세요 ('종료' 입력 시 프로그램 종료):");

            // 사용자가 "종료"를 입력하기 전까지 계속해서 사용자의 입력을 받는다.
            // 사용자 입력이 "종료"일 때까지 반복
            String input;
            while (!(input = scanner.nextLine()).equals("종료")) {
                // 사용자의 입력을 파일에 쓴다.
                // write() 메서드를 사용하여 입력을 쓰고, newLine() 메서드를 사용하여 새 줄을 추가
                writer.write(input);
                writer.newLine();
            }
            // 파일에 저장이 완료되었음을 사용자에게 알린다.
            System.out.println("output.txt 파일에 저장되었습니다.");
        } catch (IOException e) {
            // 파일 저장 중 오류가 발생할 경우 예외를 처리
            System.err.println("파일을 저장하는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

}

package quiz.quiz7;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;/*
디렉토리 내 파일 크기 계산

    지정된 디렉토리 내의 모든 파일 크기의 합을 계산하여 출력하는 프로그램을 작성하세요. 하위 디렉토리의 파일 크기도 포함되어야 합니다.

    요구사항:
    - 사용자로부터 디렉토리 경로를 입력받습니다.
    - 입력된 디렉토리 내의 모든 파일 크기의 합을 계산합니다.
    - 계산된 총 크기를 Byte 단위로 출력합니다.
    - 힌트 : nio.Files 의 walk 를 사용하면 내부 디렉토리 및 파일을 모두 탐색할 수 있습니다.
 */
public class Q5 {
    public static void main(String[] args) {
        // 예외 처리를 위한 try 블록을 시작
        try {
            // 사용자로부터 디렉토리 경로를 입력 받음
            // 사용자로부터 디렉토리 경로를 입력받아 Path 객체로 변환
            Path directoryPath = Paths.get(getUserInput("디렉토리 경로를 입력하세요: "));

            // 디렉토리 내의 모든 파일 크기의 합 계산
            // calculateTotalFileSize 메서드를 사용하여 디렉토리 내의 모든 파일 크기의 합을 계산
            long totalFileSize = calculateTotalFileSize(directoryPath);

            // 계산된 총 크기를 Byte 단위로 출력
            System.out.println("총 파일 크기: " + totalFileSize + " bytes");
        } catch (IOException e) {
            System.err.println("디렉토리를 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    // 사용자의 입력을 받는 메서드
    // getUserInput 메서드를 정의
    private static String getUserInput(String prompt) {
        // 사용자에게 입력을 요청하는 프롬프트 메시지를 출력
        System.out.println(prompt);
        // 사용자 입력을 받아 반환
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // 디렉토리 내의 모든 파일 크기의 합을 계산하는 메서드
    // calculateTotalFileSize 메서드를 정의
    private static long calculateTotalFileSize(Path directoryPath) throws IOException {
        // 총 파일 크기를 저장할 변수를 선언
        final long[] totalSize = {0}; // 총 파일 크기를 저장할 변수

        // Files.walkFileTree 메서드를 사용하여 디렉토리 내 파일 및 하위 디렉토리를 탐색하는 파일 탐색기를 정의
        Files.walkFileTree(directoryPath, new SimpleFileVisitor<Path>() {

            // 파일 탐색기의 visitFile 메서드를 오버라이드
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                // 파일 크기를 총 파일 크기에 추가하고, 파일 탐색을 계속
                totalSize[0] += Files.size(file); // 파일 크기를 총 파일 크기에 추가
                return FileVisitResult.CONTINUE; // 파일 탐색 계속
            }
        });
        return totalSize[0];
    }
}





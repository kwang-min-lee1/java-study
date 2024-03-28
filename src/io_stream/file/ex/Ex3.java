package io_stream.file.ex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/*
   연습문제 3: 디렉토리 크기 계산
   지정된 디렉토리 내의 모든 파일 크기의 합을 계산하여 출력하는 프로그램을 작성하세요.
   하위 디렉토리의 파일 크기도 포함되어야 합니다.

   요구사항:
   - 사용자로부터 디렉토리 경로를 입력받습니다.
   - 입력된 디렉토리 내의 모든 파일 크기의 합을 계산합니다.
   - 계산된 총 크기를 출력합니다.
   - 단위는 Byte 로 표시하고, 1024Byte 가 넘는 경우 단위를 변환하여 KB로 나타내주세요.
   (1KB = 1024Byte)

   - 힌트 : nio.Files 의 walk 를 사용하면 내부 디렉토리 및 파일을 모두 탐색할 수 있습니다.

   출력예시
   ===
   디렉토리 경로를 입력하세요: src
   총 크기: 147KB
    */
public class Ex3 {
    public static void main(String[] args) {

        // 사용자로부터 디렉토리 경로를 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("디렉토리 경로를 입력하세요: ");
        String dirPath = scanner.nextLine();

        // 디렉토리 경로를 기반으로 Path 객체를 생성
        Path path = Paths.get(dirPath);

        try {
            // 디렉토리 내의 모든 파일에 대해 크기를 합산
            // nio.Files 의 walk 를 사용하여 내부 디렉토리 및 파일을 모두 탐색
            // mapToLong 은 스트림의 각 요소를 long 값으로 매핑하는 메서드
            // 파일의 크기를 바이트 단위로 변환하여 각 파일의 크기를 long 값으로 매핑

            long totalSize = Files.walk(path).filter(Files::isRegularFile).mapToLong(file -> {
                        try {
                            return Files.size(file);
                        } catch (IOException e) {
                            System.err.println("파일 크기를 읽는 중 오류가 발생했습니다: " + file);
                            return 0;
                        }
                    })
                    .sum();

            // 바이트를 키로바이트로 변환
            long totalSizeInKB = totalSize / 1024;

            // 디렉토리 내의 파일 크기의 합을 출력
            System.out.println("디렉토리 내의 파일 크기의 합: " + totalSizeInKB + " bytes");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

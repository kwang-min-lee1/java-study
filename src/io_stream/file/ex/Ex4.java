package io_stream.file.ex;
/*
   연습문제: 자바 프로젝트 코드 분석

   문제 요구사항
   현재 Java 프로젝트의 src 디렉토리 내에 있는,
   모든 자바 파일(.java)에 대한 코드 분석을 수행하는 프로그램을 작성하세요.
   분석 결과로 다음 정보를 출력해야 합니다

   요구사항
   - src 디렉토리 내에 있는 총 자바 파일(.java)의 개수
   - 모든 자바 파일의 총 코드 라인 수
   - 실습문제(파일이름이 "EX")로 시작하는 파일의 수

   출력 예시
   ===
   자바 프로젝트 코드 분석 결과
   - 총 자바 파일 개수: xxx 개
   - 총 코드 라인 수: xxxxx 줄
   - 실습문제 풀이 수 : xxx
    */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex4 {
    public static void main(String[] args) {

        //Java NIO(Non-blocking I/O) 패키지에서 제공하는 클래스인
        // Paths 를 사용하여 상대 경로를 절대 경로로 변환
        Path srcPath = Paths.get("src");

        long javaFileCount = 0;
        long codeLineCount = 0;
        long exerciseCount = 0;

        try {
            // 1.
            javaFileCount = Files.walk(srcPath).filter(path -> path.toString().endsWith(".java")).count(); // .forEach(System.out::println);

            // 2.
            codeLineCount = Files.walk(srcPath)
                    // java 파일들만 찾아서
                    .filter(path -> path.toString().endsWith(".java"))
                    // 각줄의 갯수를 세어 정수로 반환
                    .mapToLong(path -> {
                        try {
                            return Files.lines(path).count();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .sum();

            // 3.
            exerciseCount = Files.walk(srcPath)
                    .filter(path -> path.getFileName().toString().startsWith("Ex"))
                    .count();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("프로젝트 코드 분석 결과");
        System.out.printf("- 총 자바 파일 수 : %,d 개%n", javaFileCount);
        System.out.printf("- 총 코드 라인 수 : %,d 줄%n", codeLineCount);
        System.out.printf("- 총 연습 문제 수 : %,d 문제%n", exerciseCount);


    }
}

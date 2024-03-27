package io_stream.file.ex;

import java.io.*;
import java.util.Scanner;

/*
  연습문제 1: 사용자 정보 저장 및 조회 시스템
  사용자로부터 이름, 이메일, 나이를 입력받아,
  각 사용자마다 개별 파일로 저장하는 프로그램을 작성하세요.
  그리고 저장된 사용자 정보 파일 목록을 조회할 수 있는 기능도 구현하세요.

  요구사항:

  - 사용자 정보는 "사용자이름.user" 형식의 파일에 저장합니다.
  - 파일에는 이름, 이메일, 나이가 각 줄에 저장되어야 합니다.
  - 프로그램 실행 시 사용자에게 "정보 저장"과 "정보 조회" 중 선택할 수 있게 합니다.
  - "정보 조회" 선택 시 저장된 모든 사용자 정보 파일 목록을 출력합니다.

  실행예시
  ===
  1: 정보 저장, 2: 정보 조회
  1
  이름: 홍길동
  이메일: abc@def.com
  나이: 30
  정보 저장 완료.


  1: 정보 저장, 2: 정보 조회
  2
  홍길동.user
   */
public class Ex1 {

    String FILE_DIRECTORY = "C:\\Users\\admin\\IdeaProjects\\java-study\\src\\io_stream\\file\\ex\\";
    public static void main(String[] args) {

        // 사용자의 입력을 받기 위해 Scanner 객체를 생성
        Scanner scanner = new Scanner(System.in);

        // 무한 루프를 시작, 사용자가 프로그램을 종료하기 전까지 계속해서 실행
        // 사용자에게 선택할 옵션을 출력하고, 사용자의 선택을 입력받습니다.
        // 사용자 입력은 정수로 받아들입니다.
        // 그리고 입력 버퍼에 남아있는 개행 문자를 소비합니다.
        while (true) {
            System.out.println("1: 정보 저장, 2: 정보 조회");
            int choice = scanner.nextInt();
            scanner.nextLine();

            // 사용자가 선택한 옵션에 따라 해당하는 기능을 수행
            // 1을 선택하면 사용자 정보를 저장하는 기능을 호출
            // 2를 선택하면 저장된 사용자 파일 목록을 출력하는 기능을 호출
            // 그 외의 경우에는 "올바른 옵션을 선택하세요."라는 메시지를 출력
            switch (choice) {
                case 1:
                    saveUser(scanner);
                    break;
                case 2:
                    listUserFiles();
                    break;
                default:
                    System.out.println("올바른 옵션을 선택하세요.");
            }
        }
    }

    // 사용자 정보를 저장하는 메서드를 정의
    // Scanner 객체를 매개변수로 받습니다.
    private static void saveUser(Scanner scanner) {
        // 사용자로부터 이름, 이메일, 나이를 입력받습니다.
        System.out.println("이름: ");
        String name = scanner.nextLine();
        System.out.println("에메일: ");
        String email =scanner.nextLine();
        System.out.println("나이: ");
        int age = scanner.nextInt();

        // 파일 이름을 사용자 이름에 .user 확장자를 붙여서 생성
        String fileName = name + ".user";
        try {

            //PrintWriter 를 사용하여 파일을 쓰기 위한 객체를 생성합니다.
            //try-with-resources 문법을 사용하여 자동으로 자원을 해제합니다.
            PrintWriter writer = new PrintWriter(fileName);

            // 파일에 사용자 정보를 한 줄씩 씁니다
            writer.println("이름: " + name);
            writer.println("이메일: " + email);
            writer.println("나이: " + age);
            System.out.println("정보 저장 완료");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // 저장된 사용자 파일 목록을 출력하는 메서드를 정의
    private static void listUserFiles() {
        // 현재 디렉토리를 나타내는 File 객체를 생성
        File directory = new File(".");

        // 현재 디렉토리에서 .user 로 끝나는 파일들을 필터링하여 배열로 가져옵니다.
        File[] files = directory.listFiles(((dir, name) -> name.endsWith(".user")));

        // 파일이 존재하는지 확인
        if (files != null && files.length > 0) {
            System.out.println("저장된 사용자 정보 파일 목록:");
            for (File file : files) {
                System.out.println(file.getName());
            }

        } else {
            System.out.println("저장된 사용자 정보 파일이 없습니다.");
        }
    }
}

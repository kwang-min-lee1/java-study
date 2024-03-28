package io_stream.file.ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


// 강사의 풀이 + 추출실행
public class Ex1_1_1 {
    public static void main(String[] args) {
        String currentPath = "src/io_stream/file/ex/";

        Scanner scanner = new Scanner(System.in);
        System.out.println("1: 정보 저장, 2:정보 조회");
        int choice = scanner.nextInt();

        scanner.nextLine();     // 개행문자 버퍼를 비워줌

        // 정보 저장
        if (choice == 1) {
            System.out.print("이름: ");
            String name = scanner.nextLine();
            System.out.print("이메일: ");
            String email = scanner.nextLine();
            System.out.print("나이: ");
            String age = scanner.nextLine();


            saveUser(currentPath, name);   // 추출
        } else if (choice == 2) {
            listFileInfo(currentPath);     // 추출
        } else {
            System.out.println("1또는 2를 선택하세요");
        }

    }

    // 추출 내용들
    private static void listFileInfo(String currentPath) {
        File currentDir = new File(currentPath);
        // File file = new File("."); 현재 경로를 반환
        File[] files = currentDir.listFiles();

        for (File f : files) {
            String fileName = f.getName();
            if (fileName.endsWith(".user")) {
                System.out.println(f.getName());
            }
        }
    }

     // 추출 내용들
    private static void saveUser(String currentPath, String name) {
        File file = new File(currentPath + name + ".user");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("이름: " + name);
            bw.newLine();
            bw.write("이메일: " + name);
            bw.newLine();
            bw.write("나이: " + name);
            bw.newLine();
            System.out.println("정보 저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

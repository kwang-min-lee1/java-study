package exception.ex.ex3;

import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


/* 방식1.
        if (email.contains("@")) {
            System.out.println("이메일 주소가 유효합니다.");
        } else {
            try {
                throw new InvalidEmailException("유효하지 않은 이메일주소입니다.");
            } catch (InvalidEmailException e) {
                System.out.println(e.getMessage());
            }
        }
*/
        // try with resource
        try (scanner) {
            System.out.println("이메일 주소를 입력하세요: ");
            String email = scanner.nextLine();
            validateEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println("예외가 발생했습니다. " + e.getMessage());
        }
        // 스캐너가 종료


    }

    private static void validateEmail(String email) throws InvalidEmailException {
        // 검증 코드
        if (!email.contains("@")) {
            throw new InvalidEmailException("유효하지 않은 이메일 주소입니다.");
        }
        // 실행 코드
        System.out.println("이메일 주소가 유효합니다.");

    }

}





package quiz.quiz3.q4;

import java.util.Scanner;

// 사용자 정의 예외 클래스 정의
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}
public class Quiz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 이메일 주소 입력 받기
            System.out.print("이메일 주소를 입력하세요: ");
            String email = scanner.nextLine();

            // 이메일 형식 검증
            validateEmail(email);

            // 올바른 형식이라면 메시지 출력
            System.out.println("이메일 주소가 유효합니다.");
        } catch (InvalidEmailException e) {
            // 예외 발생 시 메시지 출력
            System.out.println("예외 발생: " + e.getMessage());
        }
    }

    // 이메일 형식 검증 메소드
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("유효하지 않은 이메일 주소입니다.");
        }

    }
}

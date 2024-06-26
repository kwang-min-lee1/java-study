package exception.ex.ex5;

import java.util.Scanner;

public class Ex5 {
     /*
    연습문제 5: 비밀번호 검증 시스템

배경 설명:
당신은 사용자로부터 강력한 비밀번호를 입력받는 시스템을 개발하고 있습니다.
비밀번호는 최소 8자 이상이어야 하며, 최소 하나의 숫자와 하나의 대문자를 포함해야 합니다.
이 요구사항을 충족하지 않는 입력에 대해 시스템은 적절한 오류 메시지를 표시해야 합니다.

요구사항:

1. 사용자로부터 비밀번호를 입력받습니다.
2. 입력받은 비밀번호가 요구사항을 충족하는지 검증합니다.
- 최소 8자 이상
- 최소 하나의 숫자 포함
- 최소 하나의 대문자 포함
- 요구사항을 충족하지 않는 경우, 적절한 사용자 정의 예외를 발생시키고 다음과 같은 오류 메시지를 출력합니다:

비밀번호 길이 미달: "비밀번호는 최소 8자 이상이어야 합니다."
숫자 미포함: "비밀번호에는 최소 하나의 숫자가 포함되어야 합니다."
대문자 미포함: "비밀번호에는 최소 하나의 대문자가 포함되어야 합니다."
모든 요구사항을 충족하는 경우, "비밀번호가 성공적으로 설정되었습니다."라고 출력합니다.

실행 결과 예시
===
비밀번호를 입력하세요: password
비밀번호는 최소 8자 이상이어야 합니다.
비밀번호에는 최소 하나의 숫자가 포함되어야 합니다.
비밀번호에는 최소 하나의 대문자가 포함되어야 합니다.

비밀번호를 입력하세요: Password1
비밀번호가 성공적으로 설정되었습니다.

힌트
===
사용자 정의 예외를 만들 필요는 없으며, IllegalArgumentException을 활용하여 오류 메시지를 처리
패턴 매치는 문자열 정규식(regEx)를 활용할 수 있다.
password.matches(".*[0-9].*") // 최소 하나의 숫자 포함
password.matches(".*[A-Z].*") // 최소 하나의 대문자 포함
     */
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("비밀번호를 입력하세요: ");
          String password = scanner.nextLine();

          try {
               validatePassword(password); // 예외 발생 시 => catch
               // 예외가 발생하지 않을 경우 출력
               System.out.println("비밀번호가 성공적으로 설정되었습니다.");
          } catch (IllegalArgumentException e) {
               System.out.println(e.getMessage());
          }

     }

     private static void validatePassword(String password)  {
          StringBuilder exceptionMessage = new StringBuilder();
          if (password.length() < 8) {
               exceptionMessage.append("비밀번호는 최소 8자 이상이어야 합니다.\n");
               // throw new IllegalArgumentException("비밀번호는 최소 8자 이상이어야 합니다.");
          }
          if (!password.matches(".*[0-9].*")) {
               exceptionMessage.append("비밀번호에는 최소 하나의 숫자가 포함되어야 합니다.\n");
               //throw  new IllegalArgumentException("비밀번호에는 최소 하나의 숫자가 포함되어야 합니다.);
          }
          if (!password.matches(".*[A-Z].*")) {
               exceptionMessage.append("비밀번호에는 최소 하나의 대문자가 포함되어야 합니다.\n");
               //throw new IllegalArgumentException("비밀번호에는 최소 하나의 대문자가 포함되어야 합니다.\n");
          }
          if (!exceptionMessage.isEmpty()) {
               throw new IllegalArgumentException(exceptionMessage.toString());
          }
     }

}

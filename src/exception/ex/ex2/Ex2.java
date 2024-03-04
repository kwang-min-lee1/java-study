package exception.ex.ex2;

import java.util.Scanner;

public class Ex2 {
  /*
    연습문제 2: 사용자 정의 예외와 예외 떠넘기기

요구사항:
InvalidAgeException이라는 사용자 정의 예외를 생성합니다.
사용자로부터 나이를 입력받는 프로그램을 작성합니다.
나이가 18세 미만일 경우, InvalidAgeException을 발생시키고 "미성년자는 접근할 수 없습니다."라고 출력합니다.
이 예외는 메소드를 호출한 곳에서 처리해야 합니다(throws 사용).

예상 실행 결과
===
나이를 입력하세요: 16
미성년자는 접근할 수 없습니다.

나이를 입력하세요: 20
접근이 허용되었습니다.

     */
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      try {
          System.out.println("나이를 입력하세요: ");
          int age = scanner.nextInt();
          validAge(age); //나이를 검증하는 메서드
          // 예외가 발생할 경우 하단의 코드에 닿지 않는다.
          System.out.println("접근이 허용되었습니다.");
      } catch (InvalidAgeException e) { // 예외 발생 시
          System.out.println(e.getMessage());  // 예외 메시지 출력
      } finally {
          scanner.close(); // 리소스 종료
      }
  }
  public static void validAge(int age) throws InvalidAgeException {
      if (age < 18) {
          throw new InvalidAgeException("미성년자는 접근할 수 없습니다.");
        }
    }
}

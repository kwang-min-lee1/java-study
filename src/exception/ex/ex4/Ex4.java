package exception.ex.ex4;

import java.util.Scanner;

public class Ex4 {
      /*
    연습문제 4: 간단한 산수 퀴즈 앱

요구사항:
- 프로그램은 사용자에게 총 3개의 덧셈 문제를 제시합니다. 예를 들어, "3 + 5 = ?", "2 + 7 = ?", "4 + 6 = ?"와 같은 문제입니다.
- 사용자는 각 문제에 대한 답을 입력해야 합니다.
- 사용자가 입력한 답이 숫자가 아니면, NumberFormatException이 발생합니다. 해당 예외의 경우, "잘못된 입력입니다. 숫자로만 답해주세요."라는 메시지를 출력해야 합니다.
- 모든 문제에 대한 답변이 완료되면, "총 3문제 중 X문제를 맞혔습니다!"라는 메시지를 표시합니다. 여기서 X는 사용자가 맞힌 문제의 수입니다.

예상 실행 결과
===
문제 1: 3 + 5 = ?
답변: 8
문제 2: 2 + 7 = ?
답변: nine
잘못된 입력입니다. 숫자로만 답해주세요.
문제 3: 4 + 6 = ?
답변: 10

총 3문제 중 2문제를 맞혔습니다!
     */
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          // 문제 배열, 정답 배열
          String[] questions = {"3 + 5 = ?", "2 + 7 = ?", "4 + 6 = ?"};
          int[] answers = {8, 9, 10};
          int correctAnswers = 0;

          for (int i = 0; i < questions.length; i++) {
              System.out.println("문제 " + (i+1) + ": " + questions[i]);
              System.out.print("답: ");
              String inputAnswer = scanner.nextLine();
              try {
                  int answer = parseAnswer(inputAnswer);
                  // 오류가 발생할 경우 아래 구문에 닿지 않아서
                  // 오류가 발생하지 않을 때만 정답 로직이 실행됨.
                  if (answer == answers[i]) {
                      System.out.println("정답입니다.");
                      correctAnswers++;
                  }
              } catch (InvalidInputException e) {
                  System.out.println(e.getMessage());
              }
//            int answer = 0;
//            try {
//                answer = Integer.parseInt(inputAnswer); // 에러 발생 코드
//            } catch (NumberFormatException e) {
//                System.out.println("유효하지 않은 답변입니다.");
//            }

          }

          System.out.println("총 " + questions.length + "문제 중 " + correctAnswers + "문제를 맞혔습니다.");
      }

    private static int parseAnswer(String inputAnswer) throws InvalidInputException {
        try {
            return Integer.parseInt(inputAnswer); // 예외가 발생하는 코드
        } catch (NumberFormatException e) {
            throw new InvalidInputException("유효하지 않은 답변입니다.");
        }
    }
}





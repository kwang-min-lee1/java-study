package exception.ex.ex1;

// 강사 풀이

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("숫자 1을 입력하세요 : ");
            int number1 = scanner.nextInt();
            System.out.print("숫자 2를 입력하세요 : ");
            int number2 = scanner.nextInt();
            int result = number1 / number2;
        } catch (InputMismatchException e) {
            System.out.println("유효한 숫자를 입력해주세요.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

}

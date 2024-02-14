package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
// 숫자 맞추기 게임
        // 1~ 100까지의 랜덤한 숫자가 있습니다.
        // 응답한 숫자가 낮으면 낮다. 높으면 높다 고 대답하여 랜덤한 숫자를 추측합니다.
        // 정답을 맞추면 축하메시지를 출력해주세요
        Random random = new Random();
        int answer = random.nextInt(100) + 1; // 1 ~ 100까지 랜덤한 숫자
        // System.out.println(answer);  // 답안 확인

        // 반복문과 조건문을 통해서 숫자 추측 게임을 만들어보세요!
        Scanner scanner = new Scanner(System.in);
        int guessNumber;
        int tryCount = 0;

        do {
            // 질문 및 프롬프트
            System.out.print("1~100 중에서 숫자를 맞춰보세요 ");
            guessNumber = scanner.nextInt();
            tryCount++;

            if (guessNumber > answer) {
                System.out.println("큰 숫자를 말하셨네요. 낮은 숫자를 찾아주세요.");
            } else if (guessNumber < answer) {
                System.out.println("작은 숫자를 말하셨네요. 높은 숫자를 찾아주세요.");
            }
        } while (guessNumber != answer);

        System.out.println("정답을 맞추셨네요! 축하드려요. " + tryCount + "번만에 맞추셨네요");

        // 탐색하는 숫자를 절반씩 줄여나가는 방법 : 이진탐색 binarySearch

        // Try 1. 7  up
        // Try 2. 20 up
        // Try 3. 60 down
        // Try 4. 40 down
        // Try 5. 30 up
        // Try 6. 37 down
        // Try 7. 35 down
        // Try 8. 33 OK!
    }
}

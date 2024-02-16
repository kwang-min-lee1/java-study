package method;

import java.util.Scanner;

public class Ex7Ref {
    public static void main(String[] args) {
        /*
        [행맨게임 - 요구사항]
        단어 선정: 게임 시작 시 컴퓨터는 미리 정해진 단어 목록 중 하나를 무작위로 선택합니다.
        추측 진행: 사용자는 단어의 글자를 하나씩 추측합니다. 추측한 글자가 단어에 포함되어 있다면, 해당 글자가 단어의 어느 위치에 있는지를 보여줍니다.
        게임 종료 조건: 사용자가 단어를 모두 맞히면 게임에서 승리합니다. 사용자가 특정 횟수 이상 틀릴 경우 게임에서 패배합니다.
        게임 결과 출력: 게임이 끝난 후, 사용자의 승리 또는 패배 여부를 알려주고, 정답 단어를 보여줍니다
        ---
        사용자가 입력한 글자가 단어에 포함되어 있는지 검사하고, 해당 글자가 단어의 어느 위치에 있는지 displayArray에 업데이트합니다.
        매 추측마다 displayArray를 출력하여 사용자가 현재까지 맞힌 글자를 볼 수 있게 합니다.
        사용자가 단어를 모두 맞히거나, 최대 시도 횟수를 초과한 경우 게임을 종료합니다.
         */

        // 단어 목록에서 무작위로 선택될 단어들
        String[] words = {"java", "computer", "program", "kotlin", "game"};
        // 선택된 단어
        String selectedWord = words[(int) (Math.random() * words.length)];
        // 플레이어에게 보여줄 단어의 형태 ('_'로 가려진 형태)
        char[] displayArray = new char[selectedWord.length()];
        for (int i = 0; i < displayArray.length; i++) {
            displayArray[i] = '_';  // 기본값으로 '_' 가 주어진다.
        }

        int tries = 0; // 사용자가 시도한 횟수
        final int MAX_TRIES = 7; // 최대 시도 횟수
        Scanner scanner = new Scanner(System.in);
        boolean wordCompleted = false;


        // 최대시도 횟수를 넘어서거나, 단어가 완성되면 종료
        while (tries < MAX_TRIES && !wordCompleted) {
            System.out.print("단어 추측: ");
            printDisplayArray(displayArray); // 현재까지 맞춘 단어의 상태 출력하는 메서드
            String guess = scanner.nextLine();  // 사용자로부터 글자 추측 받기
            if (guess.length() != 1) {
                System.out.println("한 글자만 입력해주세요.");
                continue;
            }
            char guessLetter = guess.charAt(0);  // 추측한 글자
            boolean isCorrectGuess = false; // 글자가 정답에 포함되어 있는지 여부

            // 추측한 글자 처리 로직 구현
            // 선택된 단어를 순회하며 추측한 글자가 있는지 확인
            for (int i = 0; i < selectedWord.length(); i++) {
                if (selectedWord.charAt(i) == guessLetter) {
                    displayArray[i] = guessLetter;
                    isCorrectGuess = true;
                }
            }

            // 틀렸을 경우
            if (!isCorrectGuess) {
                tries++; //  시도회수를 증가시킨다.
                System.out.println("없는 글자입니다. 남은시도는 " + (MAX_TRIES - tries));
            }

            // 게임 종료 조건 검사 및 게임 결과 출력
            wordCompleted = isWordCompleted(displayArray);
        }

        // 게임 종료 후 정답 단어와 승리 또는 패배 메시지 출력
        if (wordCompleted) {
            System.out.println("축하합니다");
        } else  {
            System.out.println("틀렸습니다. 정답은"+ selectedWord);
        }
    }


    // 현재까지 맞춘 단어의 상태를 출력하는 메서드
    private static void printDisplayArray(char[] displayArray) {
        // {'j', '_', '_', '_'}
        for (char c : displayArray) {
            System.out.print(c + " "); // j _ _ _
        }
        System.out.println();   // 행 변경
    }

    // 단어가 모두 맞춰졌는지 확인하는 메서드
    private static boolean isWordCompleted(char[] displayArray) {
        for (char c : displayArray) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

}

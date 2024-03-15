package quiz.quiz4.q5;

import java.util.Scanner;

/*
가장 긴 단어 찾기

    요구사항:
    사용자로부터 한글 문장을 입력받아,
    문장 내에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
    단어는 공백으로 구분됩니다.

    예시 입력
    ===
    데이터 분석과 프로그래밍은 매우 재미있어요

    예시 출력
    ===
    프로그래밍은
 */
public class Q5 {
    public static void main(String[] args) {

        // Scanner 객체를 생성하여 표준 입력(System.in)을 읽어오기 위한 준비
        Scanner scanner = new Scanner(System.in);

        // 한글 문장 입력받기
        System.out.println("한글 문장을 입력하세요: ");
        String sentence = scanner.nextLine();

        // 공백을 기준으로 단어들을 분리하여, 배열로 저장
        String[] words = sentence.split(" ");

        // 가장 긴 단어를 저장할 변수를 선언하고 빈 문자열("")로 초기화
        String longestWord = "";

        // 단어 배열을 순회하면서 각 단어의 길이를 비교하여 가장 긴 단어 찾기
        for (String word : words) {
            // 현재 단어의 길이가 저장된 가장 긴 단어의 길이보다 더 길다면,
            // 가장 긴 단어를 현재 단어로 업데이트
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // 결과 출력
        System.out.println("가장 긴 단어:  " + longestWord);

    }
}

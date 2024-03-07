package library.lang.ex.ex11;

import java.util.Scanner;

public class Ex11 {
    /*
    연습문제: 가장 긴 단어 찾기

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
    public static void main(String[] args) {

        // 사용자로부터 입력 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        System.out.println("한글 문장을 입력하세요");
        String sentences = scanner.nextLine(); // 사용자 입력 받기

        // 입력된 문자열을 공백을 기준으로 분리하여 배열에 저장
        String[] words = sentences.split(" ");

        // 가장 긴 단어를 저장할 변수 초기화
        String longestWord = "";  // => null 을 사용할 경우 NullPointerException 발생함.
        //  아래 for 문에서 longestWord. (점)을 사용한 것이 원인임
        // .이 없을 경우에는 null 사용 가능함

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;  // 새로운 가장 긴 단어로 업데이트
            }
        }
        System.out.println(longestWord);


    }
}

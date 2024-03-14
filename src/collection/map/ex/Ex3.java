package collection.map.ex;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    /*
    연습문제 3: 도서관 책 대출 관리

    문제 설명
    도서관의 책 대출 상태를 관리하는 간단한 시스템을 구현하세요.
    각 책은 고유한 ID로 구분되며, 대출 상태는 boolean 값으로 관리됩니다
    (true 는 대출 중, false 는 대출 가능).
    책의 ID와 대출 상태를 HashMap 에 저장하고, 다음 기능을 수행해야 합니다:

    - 책을 추가하고 초기 대출 상태를 설정합니다.
    - 특정 책의 대출 상태를 변경합니다.
    - 모든 책의 ID와 대출 상태를 출력합니다.

    예시 데이터
    ===
    도서관 책 상태:
    도서 ID: 91011, 상태: (대출가능)
    도서 ID: 1234, 상태: (대출중)
    도서 ID: 5678, 상태: (대출중)
     */
    public static void main(String[] args) {
        String text = "나는 집에 간다. 나는 학교에 간다.";
        Map<String, Integer> wordMap = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            // 한글이 아닌것을 삭제
            word = word.replaceAll("[^가-힣]", "");

            // 단어가 존재하지 않으면 value에 0, 존재하면 기존 value + 1
            int frequency = wordMap.getOrDefault(word, 0) + 1;
            wordMap.put(word, frequency);
        }

        // 단어빈도수 출력
        System.out.println("단어 빈도수: ");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}

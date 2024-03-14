package collection.map.ex;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    /*
    연습문제 2: 단어 빈도수 계산
    문제 설명
    한 문장 내에서 각 단어가 몇 번 나타나는지 계산하는 프로그램을 작성하세요.
     대소문자는 구분하지 않으며, 단어는 공백으로 구분된다고 가정합니다.
     결과는 단어를 키로 하고, 빈도수를 값으로 하는 HashMap에 저장해야 합니다.

    입력 예시
    ===
    String text = "나는 집에 간다. 나는 학교에 간다.";

    출력 예시
    ===
    단어 빈도수:
    간다: 2
    집에: 1
    나는: 2
    학교에: 1

    힌트 :
    문자열 메서드 사용
    한글 정규식 "[^가-힣]"
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

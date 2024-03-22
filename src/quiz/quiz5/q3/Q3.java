package quiz.quiz5.q3;

import java.util.HashMap;
import java.util.Map;

/*
단어 빈도수 계산

     한 문장 내에서 각 단어가 몇 번 나타나는지 계산하는 프로그램을 작성하세요.
     대소문자는 구분하지 않으며, 단어는 공백으로 구분된다고 가정합니다.
     결과는 단어를 키로 하고, 빈도수를 값으로 하는 HashMap 에 저장해야 합니다.

     * 문자열 메서드 replaceAll 은 매개변수로 한글이 아닌 것을 찾는
     정규식 "[^가-힣]"을 매개변수로 받을 수 있습니다.

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
 */
public class Q3 {
    public static void main(String[] args) {

        // 분석할 텍스트를 문자열 변수에 저장
        String text = "나는 집에 간다. 나는 학교에 간다.";

        // calculateWordFrequency 메서드를 호출하여 텍스트의 단어 빈도수를 계산하고,
        // 결과를 wordFrequency 변수에 저장
        Map<String, Integer> wordFrequency = calculateWordFrequency(text);

        // 결과를 출력하기 위한 메시지를 출력
        System.out.println("단어 빈도수:");

        // wordFrequency 맵에 포함된 모든 키(단어)를 반복하여 접근
        for (String word : wordFrequency.keySet()) {
            // 각 단어와 해당하는 빈도수를 출력
            System.out.println(word + ": " + wordFrequency.get(word));
        }

    }

    // 텍스트에서 각 단어의 빈도수를 계산하기 위한 메서드를 선언
    public static Map<String, Integer> calculateWordFrequency(String text) {
        // 단어와 빈도수를 저장할 HashMap을 생성
        Map<String, Integer> wordFrequency = new HashMap<>();
        // 텍스트를 소문자로 변환하여 대소문자를 구분하지 않도록 한다.
        text = text.toLowerCase();
        // 텍스트를 공백을 기준으로 분할하여 각 단어를 추출
        String[] words = text.split("\\s+");
        // words 배열에 포함된 각 단어에 대해 반복
        for (String word : words) {
            // 단어 내의 구두점을 제거
            word = word.replaceAll("[^가-힣]", "");
            // HashMap 에 단어를 키로 하고, 해당하는 빈도수를 값으로 저장
            // 만약 단어가 이미 존재한다면 해당 단어의 빈도수를 증가
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        // 최종적으로 계산된 단어 빈도수를 담은 HashMap 을 반환
        return wordFrequency;
    }

}




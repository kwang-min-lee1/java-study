package lambda.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
문제: 문자열 리스트 정렬
요구사항: 주어진 문자열 리스트를 문자열의 길이에 따라 오름차순으로 정렬하세요.
정렬된 리스트의 각 요소를 출력합니다. Comparator 와 Consumer 를 사용하여 구현하세요.
List<String> languages = Arrays.asList("java", "python", "swift", "cpp", "ai");
출력예시
===
ai
cpp
java
swift
python
 */
public class Ex4 {
    public static void main(String[] args) {
        List<String> languages =
                Arrays.asList("java", "python", "swift", "cpp", "ai");

        // sort : 비교자(Comparator (인터페이스)를 매개변수(익명객체)로 입력)
        // 익명객체 -> 람다( compare 함수를 overriding)
        // 길이 순서로 정렬

        // languages.sort((o1, o2) -> o1.length() - o2.length());
        // IDE 에서 힌트를 받아 메서드 참조 변경
        languages.sort(Comparator.comparingInt(String::length));

        // 내부 요소를 하나씩 반복하여 출력 for-each
        languages.forEach(System.out::println);

        /*for (String language : languages) {
            System.out.println(language);
        }*/
    }
}

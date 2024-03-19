package stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
  문제 3: 알파벳 정렬
  알파벳이 뒤죽박죽인 리스트가 있습니다. 이를 알파벳 순으로 정렬한 후, 결과를 출력하세요.
  단, 대소문자 구분 없이 정렬하세요.

  List<String> alphabets = Arrays.asList("b", "A", "d", "C", "f", "e", "D", "c", "F", "B", "E");

  출력 결과:
  A
  B
  C
  D
  E
  F
  b
  c
  d
  e
   */
public class Ex3 {
    public static void main(String[] args) {

        // 알파벳 리스트 생성
        List<String> alphabets = Arrays.asList("b", "A", "d", "C", "f", "e", "D", "c", "F", "B", "E");

        //  리스트를 스트림으로 변환
        List<String> filteredAlphabets =  alphabets.stream()

                //  대소문자 구분없이, 알파벳 순으로 정렬
                .sorted(String.CASE_INSENSITIVE_ORDER)
                //.sorted(Comparator.comparing(String::toLowerCase))
                // 스트림의 요소들을 다시 리스트로 수집
                .toList();
                //.collect(Collectors.toList());

        // 결과 출력
        filteredAlphabets.forEach(System.out::println);
    }
}
// Comparator.comparing() 메서드는 비교할 키를 추출하는 방법을 제공한다
// 이 경우, 문자열의 소문자 변환 결과를 기준으로 정렬하도록 한다
// String::toLowerCase 는 메서드 레퍼런스
// 이것은 문자열에 대해 toLowerCase() 메서드를 호출하는 함수로써 사용된다.
// 즉, 문자열의 각 요소에 대해 소문자로 변환하는 함수를 의미한다.

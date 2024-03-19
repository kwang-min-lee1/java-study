package stream.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
   문제 1: 고양이 이름 필터링

   고양이 이름이 담긴 리스트가 있습니다.
   이름이 4글자 이상인 고양이들만 필터링하여
   그 이름을 대문자로 변환한 후, 결과를 출력하세요.

   List<String> catNames = Arrays.asList("Leo", "Milo", "Luna", "Oli", "Zoe", "Bella");

   출력 결과:
   MILO
   LUNA
   BELLA

    */
public class Ex1 {
    public static void main(String[] args) {

        // 고양이 이름이 담긴 리스트 생성
        List<String> catNames = Arrays.asList("Leo", "Milo", "Luna", "Oli", "Zoe", "Bella");

        // catNames 리스트를 스트림으로 변환.
        List<String> filteredCatNames = catNames.stream()
                // 이름이 4글자 이상인 고양이들만 필터링
                .filter(name -> name.length() >= 4)
                // 이름을 대문자로 변환
                .map(String::toUpperCase)
                // 스트림의 요소들을 다시 리스트로 수집
                .toList();  // 자바 16버젼 이상부터 사용가능
                //.collect(Collectors.toList());

        // 변환된 고양이 이름을 하나씩 출력
        // System.out::println은 각 요소를 표준 출력에 출력하는 메서드 레퍼런스
        filteredCatNames.forEach(System.out::println);


    }
}

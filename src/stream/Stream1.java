package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> numberList     =new ArrayList<>(
                List.of(7,2,5,3,4,6,8,9,1)
        );

        // 데이터에서 홀수만 골라서 1,3,5...와 같은 문자열로 변경해라.

        // 1. 반복문을 사용하는 방식
        // 1-1.홀수 골라내기
        List<Integer> oddList = new ArrayList<>();
        for (Integer n : numberList) {
            if (n%2==1) {
                oddList.add(n);
            }

        }
        System.out.println("oddList = " + oddList);
        // 1-2.정렬하기
        oddList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("oddList = " + oddList);

        // 1-3.문자열로 연결하기
        List<String> oddStringList = new ArrayList<>();
        for (Integer  n: oddList) {
            oddStringList.add(String.valueOf(n));
        }
        System.out.println("oddStringList = " + oddStringList);
        // String 정적 메서드 조인(구분자, 반복가능데이터) (구분자로 문자열 열결)
        String joinString = String.join("/", oddStringList);
        System.out.println("joinString = " + joinString);

        // 스트림 API 를 사용한 방식
        String finalString = numberList
                .stream()                      // 데이터의 스트림화
                .filter(number->number % 2  == 1) // 중간연산: 홀수만 찾기
                .sorted(Integer::compareTo) // 중간연산: 오름차순 정렬
               // .sorted((number1, number2) -> Integer.compare(number1, number2))
                .map(String::valueOf)  // 중간연산: 문자열로 바꾸기
                .collect(Collectors.joining("/"));  // 최종연산: 구분자로 연결해서 반환

        System.out.println(finalString);

    }
}

package collection.list.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    요소 제거

    문제: 문자열을 저장하는 ArrayList 를 생성하고, 여러 개의 문자열을 추가하세요.
    그 후, 특정 조건(예: 길이가 5 이하인 문자열)을 만족하는 요소들을 모두 제거하세요.
    최종 리스트를 출력하는 프로그램을 작성하세요.

    > 예시 문자열
    "Hello", "World", "Java" "Programming"
    > 제거 후 리스트에 남은 요소
    "Programming"
     */
public class Ex2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello"); // 0
        strings.add("World"); // 1
        strings.add("Java"); // 2
        strings.add("Programming"); // 3

        /*
        Java9 버전 이상인 경우 immutable List 를 만드는 of 메서드
        List<String> stringList = List.of("Hello", "World", "Java", "Programming");
        */

        // 1. 역순으로 for 문 접근
        for (int i = strings.size() -1; i >= 0 ; i--) {
            if (strings.get(i).length() <=5) {
                strings.remove(i);
            }
        }
        // 2. 제거할 때마다 인덱스 조정
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() <=5) {
                strings.remove(i);
                i--; // 요소를 제거할 떄 인덱스를 조정
            }
        }
        // 3. 반복자를 사용하여 제거하는 방법 (표준)
        strings.clear();
        strings.addAll(List.of("Hello", "World", "Java", "Programming"));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.length() <=5) {
                iterator.remove();
            }
        }
        System.out.println(strings);

    }
}

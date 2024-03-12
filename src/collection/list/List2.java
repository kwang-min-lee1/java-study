package collection.list;

import java.util.*;

public class List2 {
    public static void main(String[] args) {
        // 빈 리스트를 생성
        List<String> fruit1 = new ArrayList<>();
        fruit1.add("감");
        fruit1.add("수박");
        System.out.println("fruit1 = " + fruit1);

        //지정된 컬렉션 요소들을 포함하여 생성
        List<String> fruit2 = new ArrayList<>(
                List.of("바나나","딸기","사과")
        );
        System.out.println("fruit2 = " + fruit2);

        // addAll 지정된 컬렉션의 요소를 리스트 끝에 추가
        fruit1.addAll(fruit2);
        System.out.println("fruit1 = " + fruit1);

        // removeAll 매게변수로 주어진 컬렉션의 요소들을 삭제
        fruit1.removeAll(fruit2);
        System.out.println("fruit1 = " + fruit1);

        // Array.asList 배열을 리스트로 변경
        // ArrayList 아님
        List<String> fruit3 = Arrays.asList("체리", "토마토", "참외");

        // collection 타입의 매게변수를 넣는 곳에 넣을 수 있음
        fruit1.addAll(fruit3);
        System.out.println("fruit1 = " + fruit1);
        fruit1.addAll(Arrays.asList("망고","용과"));
        System.out.println("fruit1 = " + fruit1);

        // List.of Immutable 변경 불가 List 를 반환
        List<String> fruit4 = List.of("파파야", "망고스틴");
        // fruit4.add("밤"); 변경 가능한 메서드를 넣었을 때, Exception

        // mutable List 에 Immutable List 를 넣었을 때 => mutable
        fruit1.addAll(fruit4);
        System.out.println("fruit1 = " + fruit1);

        // subList() 리스트의 지정된 범위만큼을 반환 (시작인덱스 포함, 끝인덱스 포함하지 않음)
        List<String> fruit5 = fruit1.subList(3, 6);
        System.out.println("fruit5 = " + fruit5);

        // List 는 중복 요소를 허용
        fruit1.add("망고");
        fruit1.add("망고");
        System.out.println("fruit1 = " + fruit1);

        // indexOf: 객체로 인덱스를 반환, 가장 첫번째 인덱스를 찾고 없으면 -1 리턴
        int index = fruit1.indexOf("망고");
        System.out.println("index = " + index);

        // lastIndexOf: 지정된 객체의 마지막 인덱스 반환
        int lastIndex = fruit1.lastIndexOf("망고");
        System.out.println("lastIndex = " + lastIndex);

        // iterator 반복자 반환
        Iterator<String> iterator = fruit1.iterator();
        System.out.println("iterator = " + iterator);

        // sort: 요소를 정렬. Comparator (정렬자)를 매개변수로 받음.
        fruit1.sort(String::compareTo);
        // 문자열 오름차순으로 정렬
        System.out.println("fruit1 = " + fruit1);
        // 문자열 내림차순으로 정렬
        fruit1.sort(Comparator.reverseOrder());
        System.out.println("fruit1 = " + fruit1);
    }

}

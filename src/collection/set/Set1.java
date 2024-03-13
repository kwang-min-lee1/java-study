package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {

    // 컬렉션 프레임워크의 주요 인터페이스중 하나

    /* ## Set 의 특징
       1. 중복을 허용하지 않는다.
       2. 순서를 보장하지 않는다.
       (수학의 집합과 유사한 구조를 가짐)

       ## Set 구현체의 종류
       1. HashSet: 가장 많이 사용된 기본 Set, 순서 보장없고, 가장 뛰어난 성능.
       2. LinkedHashset: 요소가 추가된 순서를 보장함(예외)
       3. TreeSet: 요소가 자연 순서로 정렬되어 저장되는 구조
     */

    public static void main(String[] args) {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);
        System.out.println(numberSet);

        numberSet.add(1); // 중복이 허용되지 않음
        boolean addDuplicate = numberSet.add(2);// 중복 -> false
        System.out.println("addDuplicate = " + addDuplicate);
        System.out.println(numberSet);

        boolean addNewElement = numberSet.add(4);// 중복이 아닌 요소 -> true
        System.out.println("addNewElement = " + addNewElement);
        System.out.println(numberSet);

        // 반환되는 boolean 을 통해 조건문 사용가능
        if (numberSet.add(3) == false) {
            System.out.println("3은 이미 존재하는 값입니다.");
        }

        // contain: 포함여부 반환
        if (numberSet.contains(2)){
            System.out.println("Set에 2가 포함되어 있습니다.");
        }

        // size: 데이터의 크기
        System.out.println("데이터의 크기: " + numberSet.size());

        for (int i = 0; i < numberSet.size(); i++) {
            // 인덱스를 기존으로 요소를 순회할 수 없음 (순서를 보장하지 않음)
            //numberSet.get(i);
        }

        // 인덱스와 관련된 메서드 없음
        // numberSet.get();
        // numberSet.indexOf();

        // 향상된 for 문 사용하여 요소 순회 => 순서를 보장할 수 없음.
        for (Integer i : numberSet) {
            System.out.println(i + " ");
        }

        // 반복자를 사용한 요소 순환
        Iterator<Integer> iterator = numberSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        // 요소 제거: 제거 성공할 경우 true 로 반환
        boolean removeExist = numberSet.remove(3);
        boolean removeNone = numberSet.remove(5);
        System.out.println("removeExist = " + removeExist);
        System.out.println("removeNone = " + removeNone);
        System.out.println(numberSet);

        // 모든 요소 제거
        numberSet.clear();
        System.out.println("모든 요소 제거: " + numberSet);

        // 요소 한번에 추가하기
        numberSet.addAll(Arrays.asList(5,6,7,8));
        System.out.println(numberSet);

        // 배열로 반환하기
        Object[] array = numberSet.toArray();

    }

}

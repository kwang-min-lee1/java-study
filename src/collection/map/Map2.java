package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {

        Map<String,Integer> bookPageMap = new HashMap<>();
        bookPageMap.put("위대한 개츠비",180);

        // putIfAbsent : 키가 존재하지 않을 경우만 값을 추가
        bookPageMap.putIfAbsent("위대한 개츠비",200);
        bookPageMap.putIfAbsent("1984",328);

        // forEach: 모든 key-value 에 대해 실행문을 실행(반복문)
        bookPageMap.forEach((key,value) ->
                System.out.println(key + "는" + value + "쪽입니다."));

        // replace: 키의 값을 대체
        bookPageMap.replace("위대한 개츠비",180,300);
        System.out.println("대체된 페이지 수:  " + bookPageMap.get("위대한 게츠비"));

        // getOrDefault: 키가 존재하지 않을 때 디폴트(기본)값 반환
        Integer unknownPageOfBook = bookPageMap.getOrDefault("홍길동전", 250);
        System.out.println("unknownPageOfBook = " + unknownPageOfBook);

        // of("key, value, key, value, ...) => 수정불가 Map 반환
        Map<String, Integer> unmodifiableMap = Map.of("전우치전", 400, "홍길동전", 500, "허생전", 600);

        // putAll: 다른 맵을 한꺼번에 추가
        bookPageMap.putAll(unmodifiableMap);

        System.out.println(bookPageMap.entrySet());

        // containsKey: 키 포함 여부
        boolean b1 = bookPageMap.containsKey("허생전");

        // containsValue: 값 포함 여부
        boolean b2 = bookPageMap.containsValue(500);

        // 잘못된 키를 넣으면 null 을 반환
        Integer noneValue = bookPageMap.get("없는 책");
        System.out.println("noneValue = " + noneValue);

        // null 을 key 값으로 value 저장 가능 (중복 불가, 추천하지 않음)
        bookPageMap.put(null,100);
        bookPageMap.put(null,200);
        System.out.println("null : " + bookPageMap.get(null));

        // value 는 null 로 중복저장 가능
        bookPageMap.put("좋은책",null);
        bookPageMap.put("발간예정책",null);
        System.out.println("bookPageMap = " + bookPageMap);


    }


}

package stream.ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
  연습 문제: 온라인 도서관 시스템
  온라인 도서관 시스템에서 사용자들이 대출한 책 목록을 관리하고 있습니다.
  각 대출 기록은 사용자 ID와 대출한 책의 목록으로 구성됩니다.
  시스템은 사용자가 특정 조건을 만족하는지 여부에 따라 다음 단계의 작업을 수행해야 합니다.

  요구사항
  - 모든 사용자가 적어도 하나의 책을 대출했는지 검사합니다.
  - 적어도 한 명의 사용자가 "Java Programming" 책을 대출했는지 검사합니다.
  - 어떤 사용자도 "The Great Gatsby" 책을 대출하지 않았는지 검사합니다.

  데이터
  Map<String, List<String>> userBookRentals = Map.of(
      "user1", Arrays.asList("The Lord of the Rings", "Java Programming"),
      "user2", Arrays.asList("Java Programming", "Effective Java"),
      "user3", Arrays.asList("The Hobbit"),
      "user4", Collections.emptyList() // 이 사용자는 책을 대출하지 않았습니다.
  );

  출력예시
  ===
  책을 대출하지 않은 사용자가 있습니다.
  Java Programming 책을 대출한 사용자가 있습니다.
  아무도 The Great Gatsby 책을 대출하지 않았습니다.
*/
public class Ex8 {
    public static void main(String[] args) {

        // 데이터
        Map<String, List<String>> userBookRentals = Map.of(
                "user1", Arrays.asList("The Lord of the Rings", "Java Programming"),
                "user2", Arrays.asList("Java Programming", "Effective Java"),
                "user3", Arrays.asList("The Hobbit"),
                "user4", Collections.emptyList() // 이 사용자는 책을 대출하지 않았습니다.
        );

        //        - 모든 사용자가 적어도 하나의 책을 대출했는지 검사합니다.
        boolean isAllUserRental = userBookRentals.values().stream()
                .allMatch(booklist -> !booklist.isEmpty());  // 하나의 책을 대출하지 않은 사람이 한명이라도 있는지
        if (isAllUserRental) {
            System.out.println("모든 사용자가 책을 대출했습니다.");
        } else {
            System.out.println("책을 대출하지 않은 사용자가 있습니다.");
        }

//        - 적어도 한 명의 사용자가 "Java Programming" 책을 대출했는지 검사합니다.
        boolean isAnyRental = userBookRentals.values().stream()
                .anyMatch(bookList -> bookList.contains("Java Programming"));

        if (isAnyRental) {
            System.out.println("Java Programming 책을 대출한 사용자가 있습니다.");
        } else {
            System.out.println("Java Programming 책을 대출한 사용자가 없습니다.");
        }

//- 어떤 사용자도 "The Great Gatsby" 책을 대출하지 않았는지 검사합니다.
        if (userBookRentals.values().stream()
                .noneMatch(bookList -> bookList.contains("The Great Gatsby"))) {
            System.out.println("아무도 The Great Gatsby 책을 대출하지 않았습니다.");
        } else {
            System.out.println("The Great Gatsby 책을 대출한 사람이 있습니다.");
        }

    }
}

package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream6 {
    // 요소 정렬
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("아자차",80));
        studentList.add(new Student("가나다",95));
        studentList.add(new Student("마바사",92));

        studentList.stream()  // 스트림 생성
                // Comparator 매개변수로 하는 방법 or Comparable 인터페이스 구현
                .sorted()  // 중간: 정렬(Comparable)
                .map(Student::getName)  // 중간: 이름필드 스트림으로 변환
                .forEach(System.out::println); // 최종출력

        // 자연 순서에서 역순으로 정렬하기
        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .map(Student::getName)
                .forEach(System.out::println);



        // 최종연산 collect()
        // 스트림 요소를 수집해서 컬렉션으로 반환
        List<String> nameList = studentList.stream()
                .sorted()
                .map(Student::getName)
                .collect(Collectors.toList());

        Set<Integer> scoreSet = studentList.stream()
                .sorted()
                .map(Student::getScore)
                .collect(Collectors.toSet());

    }
}

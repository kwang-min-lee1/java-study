package stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream11 {
    // 스트림 요소 수집하기 collect()
    // 유연한 *최종연산* Collector 인터페이스의 구현을 매개변수로 받아 작업
    // Collector<T,A,R> collector
    // T는 스트림의 요소
    // A는 accumulator 누산기 ( T 타입의 요소를, A 누산기가 누적해서,R 타입에 저장한다.)
    // R은 반환될 컬렉션
    public static void main(String[] args) {
        record Student(String name, String gender, int age) {}

        List<Student> studentList = new ArrayList<>(
                Arrays.asList(
                        new Student("홍길동", "남", 30),
                        new Student("김영희", "여", 25),
                        new Student("이철수", "남", 20),
                        new Student("오해영", "여", 28)
                        )
        );

        // toList: 리스트로 수집
        List<Student> manList = studentList.stream()
                .filter(student -> student.gender.equals("님"))
                .toList();
                // .collect(Collectors.toList)

        // toSet: Set 으로 수집, 중복 제거할 때 유용
        Set<Student> manSet = studentList.stream()
                .filter(student -> student.gender().equals("남"))
                .collect(Collectors.toSet());

        // 키, 값 쌍으로 함수를 통해 각 요소에서 추출
        Map<String, Integer> manMap = studentList.stream()
                .filter(student -> student.gender().equals("남"))
                .collect(Collectors.toMap(
                        Student::name,  // Student 객체에서 Key 가 될 부분
                        Student::age    // Student 객체에서 Value 가 될 부분
                ));

        System.out.println("manList = " + manList);
        System.out.println("manSet = " + manSet);
        System.out.println("manMap = " + manMap);

        // joining: 스트림의 문자열 요소를 하나의 문자열로 만든다.
        // 구분된 문자열을 단일 문자열 연결로 만들 때 유용
        // JSON, HTML 문자열로 만들 때 사용
        Stream<String> stringStream = Stream.of("자바", "스트림", "람다식");
        String join1 = stringStream.collect(Collectors.joining());

        System.out.println("매개변수 없이 조인한 문자열  = " + join1);


        String join2 = Stream.of("자바", "스트림", "람다식")
                .collect(Collectors.joining(","));

        System.out.println("구분자를 첫번째 인자로 조인한 문자열 = " + join2);


        String join3 = Stream.of("자바", "스트림", "람다식")
                .collect(Collectors.joining(",","[","]"));

        System.out.println("접두사와 접미사를 사용해서 조인한 문자열 = " + join3);

        // groupingBy: 요소 그룹핑
        // 분류기(Function 람다식)를 기준으로 타입 T를 Key k로 매핑하고
        // List<T>를 V value 로 갖는 Map 컬렉션을 생성
        Map<String, List<Student>> genderMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::gender));

        System.out.println("genderMap = " + genderMap);

        // Key 를 기준으로 List 를 분류할 수 있다.
        List<Student> maleList =genderMap.get("남");
        List<Student> femaleList =genderMap.get("여");

        System.out.println("maleList = " + maleList);
        System.out.println("femaleList = " + femaleList);

        // 두번째 매개변수에 Collector 를 사용해서
        // 집계 메서드를 사용할 수 있음, summing, averaging, counting
        Map<String, Double> genderAgeMap = studentList.stream()
                // 성별 그룹별으로 나이를 평균한 값
                .collect(Collectors.groupingBy(Student::gender,
                        Collectors.averagingDouble(Student::age)
                ));
        System.out.println("genderAgeMap = " + genderAgeMap);

        // mapping:스트림의 요소를 변환한 후, 다른 컬렉터에서 수집
        // 인자1: mapper - 변환
        // 인자2: collector - 컬렉션으로 수집
        List<String> nameList = studentList.stream()
                .collect(
                        Collectors
                                .mapping(Student::name, Collectors.toList()));

        System.out.println("nameList = " + nameList);

        // partitioningBy : 스트림 요소를 특정한 기준에 따라
        // true 와 false 양쪽 리스트로 나누는 Map 을 반환
        Map<Boolean, List<Student>> age25Map = studentList.stream()
                .collect(Collectors.partitioningBy(student -> student.age > 25));
        List<Student> over25students = age25Map.get(true);
        List<Student> under25students = age25Map.get(false);

        System.out.println("over25students = " + over25students);
        System.out.println("under25students = " + under25students);

        // summarizing: 숫자 요소에 대한 요약 통계 제공
        // 반환 값으로 SummaryStatistics 타입을 받아서
        // 숫자에 관한 기본 통계들을 받을 수 있음.

        // 기본타입
        IntSummaryStatistics intSummaryStatistics = IntStream.rangeClosed(1, 100)
                .summaryStatistics();

        double average = intSummaryStatistics.getAverage();
        int max = intSummaryStatistics.getMax();
        int min = intSummaryStatistics.getMin();
        long sum = intSummaryStatistics.getSum();
        long count = intSummaryStatistics.getCount();

        System.out.println("count = " + count);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        // 객체타입
        IntSummaryStatistics collect = studentList.stream()
                .collect(Collectors.summarizingInt(Student::age));



    }


}

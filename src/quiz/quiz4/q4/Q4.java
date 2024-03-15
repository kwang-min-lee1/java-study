package quiz.quiz4.q4;
/*
제네릭 인터페이스를 이용한 데이터 처리 시스템

    제네릭 인터페이스 DataProcessor<T>를 정의하고,
    이를 구현하는 클래스를 작성하여 데이터 처리 시스템을 구현합니다.
    DataProcessor<T> 인터페이스는 데이터를 처리(processData)하고
    결과를 반환하는 메소드를 포함해야 합니다.

    요구 사항:
    DataProcessor<T> 인터페이스 정의:
    processData 메소드를 정의합니다.
    이 메소드는 T 타입의 데이터를 매개변수로 받고, 처리된 데이터의 결과를 T 타입으로 반환합니다.

    StringDataProcessor 클래스 구현:
    DataProcessor<String> 인터페이스를 구현합니다.
    문자열 데이터를 대문자로 변환하는 로직을 processData 메소드에 구현합니다.

    NumberDataProcessor 클래스 구현:
    DataProcessor<Integer> 인터페이스를 구현합니다.
    정수 데이터를 두 배로 증가시키는 로직을 processData 메소드에 구현합니다.

    main 메서드 구현:
    DataProcessor<String> 타입 객체와 DataProcessor<Integer> 타입 객체를 생성하고
    각각 “hello generics”, 100을 입력값으로 processData 메서드를 호출합니다.

    출력 예시
    ===
    HELLO GENERICS
    200
 */
public class Q4 {
}

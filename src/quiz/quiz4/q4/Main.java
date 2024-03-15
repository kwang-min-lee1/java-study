package quiz.quiz4.q4;
/*
main 메서드 구현:
DataProcessor<String> 타입 객체와 DataProcessor<Integer> 타입 객체를 생성하고
각각 “hello generics”, 100을 입력값으로 processData 메서드를 호출합니다.
 */
public class Main {
    public static void main(String[] args) {

        // DataProcessor<String> 타입 객체 생성
        DataProcessor<String> stringProcessor = new StringDataProcessor();

        // DataProcessor<Integer> 타입 객체를 생성
        DataProcessor<Integer> numberProcessor = new NumberDataProcessor();

        // 문자열 데이터를 대문자로 변환하여 출력
        System.out.println(stringProcessor.processData("hello generics"));
        System.out.println(numberProcessor.processData(100));
    }
}

package quiz.quiz4.q4;

// DataProcessor<T> 인터페이스 정의
// processData 메소드를 정의
// 이 메소드는 T 타입의 데이터를 매개변수로 받고, 처리된 데이터의 결과를 T 타입으로 반환
public interface DataProcessor<T> {
    T processData(T data);
}

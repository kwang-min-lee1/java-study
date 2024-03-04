package exception.ex.ex2;

// InvalidAgeException이라는 사용자 정의 예외를 생성.
public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }

}

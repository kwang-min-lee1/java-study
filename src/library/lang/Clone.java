package library.lang;

public class Clone {
    public static void main(String[] args) {
        Button button = new Button();
        int id = button.id;
        try {
            Button clonedButton = (Button) button.clone();
            int id2 = button.id;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

// Object clone() 메서드를 사용하기 위해서
// 1. Cloneable 인터페이스를 구현
// 2. 접근 제어자를 public 으로 확장
// 3. CloneNotSupportedException 예외 처리
// 4. (*) 깊은 복사를 위한 로직이 필요 = 기본적으로 얕은 복사
class Button implements Cloneable {
    int id; // 기본타입: 값을 복사
    String[] dataArray; // 참조타입: (참조)값을 복사
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

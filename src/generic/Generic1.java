package generic;

public class Generic1 {
    public static void main(String[] args) {
        Box box = new Box();
        box.content ="이번엔 문자열"; // 모든 종류의 데이터가 대입 가능.
        // box.content = 10;

        // box.content.length();
        // Object 타입은 자식객체의 메서드 정보를 가지고 있지 않다.

        int length = ((String) box.content).length();
        // 자식 타입의 메서드를 사용하려면 강제로 캐스팅해야 한다.

        // 다른 타입이 들어갈 경우 타입 체크를 해야 한다. instanceof 연산자 사용
        if (box.content instanceof String) {
            int result = ((String) box.content).length();
        }

        // 필드에 접근할 경우 Object 리턴 => 강제 캐스팅, 타입 체크 필요
        Object content = box.getContent();
        //content.lenth();

    }

    // 모든 타입을 다 담을 수 있는 박스
    static class Box{
        // 필드
        // Object 는 최상위 클래스이기 때문에 모든 객체가 대입이 가능하다.
        public Object content;
        public Object getContent(){
            return content;
        }
    }
}





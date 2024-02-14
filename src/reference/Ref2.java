package reference;

public class Ref2 {
    public static void main(String[] args) {
        /*
         null : 참조 타입의 변수가 객체를 참조하지 않는다는 것을 나타내는 값
         null 값을 가진 참조 타입의 변수
         - 변수가 초기화되지 않았을 떄
         - 객체가 명시적으로 null 값으로 설정되었을 때
         - 객체가 메모리에서 삭제되었을 떄
         */

        String str; // 변수 선언, 초기화 안됨 => null
        String str2 = null; // 객체가 명시적으로 null 값으로 설정되었을 때

        // NullpointException (NPE)
        // 참조 타입 변수가 null 값을 가지고 있는데, 메서드나 필드에 접근하려고 할 때 발생하는 예외
        if (str2 != null) { //NPE를 방지하는 방법
            str2.length(); // NPE
        }
        // 컴파일 단계에서는 확인할 수 없고, 실행 단계(런타임)에서 예외가 확인됨

    }
}

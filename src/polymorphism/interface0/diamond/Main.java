package polymorphism.interface0.diamond;

public class Main {
    public static void main(String[] args) {
        // 다형적 타입 참조
        // 부모 인터페이스 변수 = 자식 타입 객체
        First first = new ImplClass();
        first.firstMethod(); // 부모 타입 메서드 실행 가능
        first.commonMethod(); // 공통 메서드 실행
        //first.secondMethod(); // 다른 타입 인터페이스 실행 불가

        Second second = new ImplClass();
        second.secondMothod();
        second.commonMothod();
        //second.firstMethod();

        // 인터페이스 다중 구현 가능: 모든 메서드 구현하여 사용
        ImplClass implClass = new ImplClass();
        implClass.firstMethod();
        implClass.secondMothod();
        implClass.commonMethod();

    }
}

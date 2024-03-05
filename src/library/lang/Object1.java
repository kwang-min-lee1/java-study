package library.lang;

public class Object1 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();

        String string = object.toString();
        int hashCode = object.hashCode();
        boolean b = object.equals(object);

        // 객체가 속한 클래스의 메타 정보를 반환하는 메서드
        // Reflection 의 기본, 클래스 정보를 런타임 중에 조회
        Class<?> aClass = object.getClass();

        System.out.println("클래스의 이름: " + aClass.getName());
        System.out.println("단순 이름: " + aClass.getSimpleName());
        System.out.println("정식 이름: " + aClass.getCanonicalName());
        System.out.println("패키지 이름: " + aClass.getPackageName());

        System.out.println("배열 여부: " + aClass.isArray());
        System.out.println("인터페이스 여부: " + aClass.isInterface());
        System.out.println("기본타입 여부: " + aClass.isPrimitive());
        System.out.println("부모클래스 : " + aClass.getSuperclass());

        // 타입 정보를 조회 : 객체의 정확한 타입을 확인 가능
        // 런타임 도중에 다른 클래스의 메서드나, 필드, 생성자 등에 접근해서 객체를 생성하거나,
        // 메서드 호출하거나 필드 변경하거나 할 수 있음. -> Reflection

        // 스레드와 관련되어 있는 메서드
        object.notify();  // 객체를 기다리는 스레드 중 하나를 깨움
        object.notifyAll(); // 객체를 기다리는 모든 스레드를 깨움
        object.wait(); // 현재 스레드 일시 중단하고 꺠울때까지 기다림.
        object.wait(1000); // 스레드 중단하고 n 밀리초 기다림.
        object.wait(100,100); // 스레드 중단하고 n 밀리초, m 나노초 기다림

        // object.clone();  // 객체의 복제본을 생성하는 메서드
        // object.finalize();  // 더 이상 사용하지 않는 메서드 -> Garbage Collector 에 의해 객체가 삭제되기 전에 호출되는 메서드.
    }
}

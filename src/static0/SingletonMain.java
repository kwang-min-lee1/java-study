package static0;

public class SingletonMain {
    public static void main(String[] args) {
        // 일반적인 객체 생성 방법으로는 싱글톤 객체 생성 불가
        //Singleton singleton = new Singleton();

        // 싱글턴 타입의 객체 생성방법
        Singleton instance = Singleton.getInstance();  // Ctrl +Alt + V
        // getInstance 메서드를 2번 이상 사용하더라도 같은 객체로 보장한다.
        Singleton instance2 = Singleton.getInstance();

        if (instance == instance2) {
            System.out.println("같은 객체 입니다.");

        } else {
            System.out.println("다른 객체 입니다.");


        }
        // 리소스 중복 사용을 방지하고, 데이터 일관성을 유지할 때
        // 데이터베이스 연결, 로깅, 설정 등 컴포넌트 관리에 유용하게 사용됨
    }
}

package static0;

public class StringDecoUtil {

    //메서드를 static 키워드로 만들 경우
    //인스턴스(객체)를 생성하지 않고 사용 가능하다.
    static String decorate(String string) {
        return "==========" + string + "=======";
    }
    // static이 없는 경우 => 인스턴스 메서드
    /*String decorate(String string) {
        return "====== " + string + " ======";
    }*/
}

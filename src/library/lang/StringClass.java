package library.lang;

public class StringClass {
    public static void main(String[] args) {

        // String 클래스
        // 문자열은 상수(constant)이며, immutable(불변) 객체다.
        // 한번 만들어진 문자열은 변하지 않는다.

        // 네트워크를 통해 byte 배열을 받게 될 경우
        // 생성자 new String(byte[])을 통해 문자열로 디코딩된다.

        byte[] bytes = {104,101,108,108,111};
        String str = new String(bytes);
        System.out.println(str); // hello

        // 변경이 아니라 새로 생성하여 새 문자열을 만듬.
        String newStr = new String(bytes, 2,3);
        // byte 에서 인텍스 2부터 3길이만큼 잘라서 새로운 문자열 생성
        System.out.println(newStr); // llo

    }
}

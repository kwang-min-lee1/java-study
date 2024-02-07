package variable;

public class Type2 {
    public static void main(String[] args) {
        // 자바의 primitive tybe (기본 타입) 8가지
        // 논리값
        boolean bool = false; // ** true or false **
        char c = 'c';

        // 정수 (범위를 넘으면 컴파일 에러)
        byte b = 127; // -127 ~ 127 (2^8 만큼의 데이터를 저장 = 1byte)
        short s = 32726; // -32,768 ~ 23,767 (2^16 = 2byte)
        int i = 214748647; // **-214748648 ~ 214748647 (2^32 = 4byte)**
        long l = 9223372036854775807L; //** (2^64 = 8byte) **

        //실수
        float f = 10.0f; // 데이터 정밀도 7자리 (4byte = 32bit)
        double d = 10.0; // **정밀도 15자리 (8byte =64bit)**

        //리터럴 (Literal) => 문자 그대로
        //소스코드에서 개발자가 직접 적은 고정된 프로그래밍 값
        //100, 10.0, 'A', "안녕"



    }
}

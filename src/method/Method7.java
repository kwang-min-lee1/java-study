package method;

public class Method7 {
    public static void main(String[] args) {
        int number = 10;
        double number2 = 10.5;
        printNum(number);
        // printNum(number2);  // int 타입 매개변수에 double 타입을 대입하여 컴파일 에러
        printNum((int) number2);    // 타입 캐스팅을 통해 형 변환하여 호출

        printDouble(number2);       // double 타입에 double 매개변수
        printDouble(number);       // double 타입에 int 매개변수 => 프로모션 (자동 형변환)

    }

    public static void printNum(int number) {       // int를 매개변수로
        System.out.println("숫자는 " + number);
    }

    public static void printDouble(double number) {     // double을 매개변수로
        System.out.println("숫자는 " + number);
    }
}

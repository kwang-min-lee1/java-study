package operator;

public class Operator7 {
    public static void main(String[] args) {
        // 두 값을 비교하는데 사용하는 비교 연산자
        // == 같다 equal to
        // != 같지 않다 not equal to
        // >  크다 greater than
        // <  작다 less then
        // >= 크거나 같다 greater then equal to
        // <= 작거나 같다 less then equal to
        // 비교 연산자의 결과는 참 또는 거짓으로 결과가 나온다.
        // boolean 타입의 결과를 갖는다.

        int a = 5;
        int b = 10;
        System.out.println(a==b); // false
        System.out.println(a!=b); // true
        System.out.println(a>b); // false
        System.out.println(a<b); // true
        System.out.println(a>=b); // false
        System.out.println(a<=b); // true

        boolean result = a==b;
        System.out.println(result); //false

        // 조건문과 함께 자주 사용된다.


     }
}

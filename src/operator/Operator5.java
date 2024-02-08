package operator;

public class Operator5 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = ++x; //전위(Prefix) 증가 연산자
                 //x의 값을 먼저 증가 시키고, 그 결과를 y에 대입

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("===================");

        // 후위(Postfix) 증가 연산자 사용

        x = 1;
        y = 0;

        y = x++; // x의 현재 값을 y에 먼저 대입하고, 그 다음에 x의 값을 증가시킴
        System.out.println("x="+x);
        System.out.println("y="+y);

        // 증감 연산자를 단독으로 사용할 때는, 본인의 값만 증가하기 떄문에 전위 휘위 모두 결과가 같다.
    }
}

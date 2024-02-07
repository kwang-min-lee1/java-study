package variable;

public class Var4 {
    public static void main(String[] args) {
        // 두 변수의 값을 교환하기
        /*
        두 그릇의 내용을 바꾸는 순서
        A 그릇에는 10ml 물이 있고,
        B 그릇에는 20ml 오렌지 쥬스가 있다.
        어떻게 하면 내용물을 바꿀 수 있을까?

        1.  A그릇 = 10ml  변수 선언 및 초기화
            B그릇 = 20ml
        2.  A = B
         */

        int a = 10; //A 그릇 10ml
        int b = 20; //B 그릇 20ml
        int temp; // 빈 그릇

        temp = a; // 빈 그릇에 A 그릇의 내용물 10ml를 넣는다.
        a = b; //  B그릇의(20) 내용물을 A그릇으로 옮긴다.
        b = temp; // 임시그릇의(10) 내용물을 b그릇으로 옮긴다.

        System.out.println("a =" +a);
        System.out.println("b =" +b);
        System.out.println("temp =" +temp);


    }
}

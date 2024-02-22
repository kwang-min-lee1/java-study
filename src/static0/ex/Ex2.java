package static0.ex;

import static static0.ex.MathUtility.*;

public class Ex2 {
 /*
    MathUtility 클래스:

    static 메소드로 최대값을 찾는 max(int a, int b) 메소드를 구현합니다.
    static 메소드로 최소값을 찾는 min(int a, int b) 메소드를 구현합니다.
    static 메소드로 두 수의 합을 계산하는 sum(int a, int b) 메소드를 구현합니다.
    static 메소드로 팩토리얼을 계산하는 factorial(int n) 메소드를 구현합니다. 팩토리얼은 n!로 표현되며, 0! = 1입니다.


    Main 클래스:

    MathUtility 클래스의 메소드들을 호출하여 그 결과를 출력합니다

        public static void main(String[] args) {
            System.out.println("Max of 10, 20: " + MathUtility.max(10, 20));    -> 참고 :MathUtility 에 Art +Enter 클릭하여 스태틱 import 선택
            System.out.println("Min of 10, 20: " + MathUtility.min(10, 20));
            System.out.println("Sum of 10, 20: " + MathUtility.sum(10, 20));
            System.out.println("Factorial of 5: " + MathUtility.factorial(5));
        }

    실행결과
    =====
    Max of 10, 20: 20
    Min of 10, 20: 10
    Sum of 10, 20: 30
    Factorial of 5: 120
     */
 // 스태틱 import를 사용히면 클래스 이름 생략하고 메서드 호출 가능
 public static void main(String[] args) {
     System.out.println("Max of 10, 20: " + max(10, 20));
     System.out.println("Min of 10, 20: " + min(10, 20));
     System.out.println("Sum of 10, 20: " + sum(10, 20));
     System.out.println("Factorial of 5: " + factorial(5));
 }
}

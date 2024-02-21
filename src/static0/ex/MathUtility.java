package static0.ex;

public class MathUtility {
    // 유틸리티 클래스 : 필드 없음
//
//    static 메소드로 최대값을 찾는 max(int a, int b) 메소드를 구현합니다.
//    static 메소드로 최소값을 찾는 min(int a, int b) 메소드를 구현합니다.
//    static 메소드로 두 수의 합을 계산하는 sum(int a, int b) 메소드를 구현합니다.
//    static 메소드로 팩토리얼을 계산하는 factorial(int n) 메소드를 구현합니다. 팩토리얼은 n!로 표현되며, 0! = 1입니다.
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *=i;
        }
        return result;
    }

}

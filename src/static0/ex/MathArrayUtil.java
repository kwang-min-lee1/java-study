package static0.ex;

public class MathArrayUtil {
    //    sum(int[] array) : 배열의 모든 요소를 더하여 합계를 반환합니다.
//    average(int[] array) : 배열의 모든 요소의 평균값을 계산합니다.
//            min(int[] array) : 배열에서 최소값을 찾습니다.
//            max(int[] array) : 배열에서 최대값을 찾습니다.


    private MathArrayUtil() {
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    public static double average(int[] array) {
        return sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}

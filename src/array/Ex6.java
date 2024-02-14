package array;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 배열에서 최대값과 최소값을 구하기
        // 점수를 n개 입력 받아 배열에 저장하고, 그 중 가장 큰 수와 가장 작은 수를 구하는
        // 프로그램을 작성해보시오.
        /* 예시
        입력받을 숫자: 4
        4개의 정수를 입력하세요
        76
        5
        23
        9
        최댓값:76, 최솟값:5
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 받을 숫자: ");

        int n = scanner.nextInt(); // 입력 받은 숫자가 배열의 길이

        int[] nums = new int[n];
        int min, max;  // 최소값, 최댓값

        // 배열의 입력
        System.out.println( n + "개의 정수를 입력하세요");
        for (int i = 0; i< n; i++) {
            nums[i] = scanner.nextInt();
        }

        //
        min = nums[0];  // 첫번째 요소를 선택하여 최솟값에 대입
        max = nums[0];
        for (int num : nums) {  // 배열을 순회하면서
            if (num < min) {  // 기존의 최솟값보다 배열의 요소가 더 작다면
                min = num;  // 새로운 최솟값으로 배열의 요소를 대입
            }

            if (num < max) {  //기존의 최댓값보다 더 큰 요소를 발견하면
                max = num;   // 최댓값을 발견한 배열  요소로 업데이트하라.
            }


        }
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);







    }
}

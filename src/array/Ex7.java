package array;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // 선형탐색 linear Search
        // 정수 배열에 임의의 정수들이 존재합니다.
        // 해당 배열을 출력하고, 사용자에게 특정 값을 입력받아
        // 특정 값이 배열 내에 존재하는지 확인하는 프로그램을 작성하세요
        // 예시
        int[] numbers = {10, 54, 23, 45, 8, 5};
        /*
        찾는 값을 입력하세요 > 23
        배열의 3번째 위치에 존재합니다.
        (종료)
        찾는 값을 입력하세요 > 24
        배열에 존재하지 않습니다.
         */
        for (int number : numbers) {
            System.out.println(number + "");
        }
        System.out.println();

        //찾는 값을 입력받음
        Scanner scanner = new Scanner(System.in);
        System.out.println("찾는 값을 입력하세요 >");

        int target = scanner.nextInt(); // 찾는 값
        boolean found = false; // 탐색 여부를 확인하는 플래그

        //선형 탐색법으로 위치를 찾음.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println( "배열의" + (i+1) + "번쨰 위치에 존재합니다");
                found = true;
                break; //탐색했으므로 종료
            }
        }
        if (!found) {
            System.out.println("배열에 존재하지 않습니다.");
        }
        // Big 0 표기법으로 최악의 경우 0(n) 만큼 탐색한다.

    }
}

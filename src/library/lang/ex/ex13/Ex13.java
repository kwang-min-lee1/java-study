package library.lang.ex.ex13;

public class Ex13 {
    /*
    문제: 과일 가격표 포매팅하여 출력하기

요구사항:
여러분은 슈퍼마켓에서 일하며, 과일의 이름과 각 과일의 가격 정보를 포함한 가격표를 만들어 출력하는 작업을 맡게 되었습니다. 이 정보를 포매팅하여 사용자에게 보기 좋게 표시해야 합니다.

fruits 배열을 사용하여 과일의 이름을 저장합니다. 이 배열에는 "Apple", "Banana", "Cherry"가 포함되어 있습니다.
prices 배열을 사용하여 각 과일의 가격을 저장합니다. 이 배열에는 각각 1000, 500, 2000이 저장되어 있습니다(단위: 원).
"과일 가격표"라는 제목을 출력한 다음, 각 과일의 이름과 가격을 다음과 같은 포맷으로 출력하는 프로그램을 작성하세요. 이때, System.out.printf 메서드를 사용하여 과일 이름은 왼쪽 정렬, 가격은 오른쪽 정렬로 표시합니다.
가격은 천 단위 구분 기호(,)를 포함하여 출력해야 합니다.

출력 예시:
과일 가격표
Apple :  1,000원
Banana:    500원
Cherry:  2,000원
     */
    public static void main(String[] args) {

        System.out.println("과일 가격표");

        String[] fruits = {"Apple", "Banana", "Cherry"};
        int[] prices = {1000,500,2000};

        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("%-7s : %,8d원\n", fruits[i], prices[i]);
        }


    }
}

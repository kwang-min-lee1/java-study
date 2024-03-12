package collection.list.ex;

import java.util.ArrayList;
import java.util.List;

/*
   문제: 정수를 저장하는 ArrayList 를 생성하고, 1부터 10까지의 숫자를 추가하세요.
   그리고 이 리스트에서 짝수만 찾아 출력하는 프로그램을 작성하세요.
    */
public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }

        // 리스트 요소 접근학기
        for (Integer number : numbers) {
            if (number %2 == 0) {
                System.out.println(number);
            }
        }

    }
}

package condition;

import java.sql.SQLOutput;

public class Condition11 {
    public static void main(String[] args) {
        // 상항 연산자도 조건문처럼 사용 가능
        // if 문과 비교하여 코드를 간결하게 만들 수 있음.
        int age =15;
        String status = (age >= 18) ? "성인" : "미성년자";

        System.out.println(status + "입니다.");
    }
}

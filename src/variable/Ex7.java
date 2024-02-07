package variable;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /* Sacnner 를 이용해서 변수에 입력을 받고 출력하는 코드를 작성해주시오
        1. 이름:______ (enter)
        2. 주민번호앞자리:_______ (enter)
        3. 전화번호: _______ (enter)

        (입력한 이름, 주민번호, 전화번호 출력)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. 이름:");
        String name = scanner.nextLine();


        System.out.print("2. 주민번호앞자리:");
        String residentNumber = scanner.nextLine();


        System.out.print("3. 전화번호:");
        String phoneNumber = scanner.nextLine();

        System.out.println("이름:" + name);
        System.out.println("주민번호 앞자리:" + residentNumber);
        System.out.println("전화번호:" + phoneNumber);

    }
}

package library.lang.ex.ex12;

import java.util.Scanner;

public class Ex12 {
    /*
    연습문제: 주민등록번호로 생년월일과 성별 구별하기

    요구사항:
    사용자로부터 주민등록번호를 입력받습니다.
    입력 형식은 "YYMMDD-XXXXXXX"입니다.
    주민등록번호를 분석하여 생년월일과 성별을 출력하는 프로그램을 작성하세요.

    성별 구별 번호는 주민등록번호의 뒷자리 첫 번째 숫자로,
    홀수이면 "남성", 짝수이면 "여성"으로 구별합니다.
    생년월일 출력 시, 1900년 또는 2000년대 출생자 구분을 위해
    성별 구별 번호가 1, 2이면 1900년대,
    3, 4이면 2000년대 출생으로 가정합니다.

    입력:
    ====
    주민등록번호: 991231-1234567
    주민등록번호: 010203-4321765

    실행 결과 예시:
    =====
    생년월일: 1999년 12월 31일
    성별: 남성
    생년월일: 2001년 02월 03일
    성별: 여성
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("주민등록번호를 입력해 주세요: ");
        String residentNumber = scanner.nextLine();

         String year = residentNumber.substring(0,2);
         String month = residentNumber.substring(2,4);
         String day = residentNumber.substring(4,6);

         char genderNumber = residentNumber.charAt(7);



         String gender;
         if (genderNumber == '1'|| genderNumber == '3') {
             gender = "남성";
         }  else {
             gender = "여성";
         }

        // 위 코딩을 한줄로 표현
        // String gender = genderNumber == '1' || genderNumber == '3' ? "남성" : "여성";

         if (genderNumber == '1' || genderNumber == '2') {
             year = "19" + year;
         } else if (genderNumber == '3' || genderNumber == '4') {
             year = "20" + year;
         }
        System.out.printf("생년월일: %s년 %s월 %s일\n", year,month,day);
        System.out.println("성별 : " + gender);


    }
}

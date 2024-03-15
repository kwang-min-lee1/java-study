package quiz.quiz4.q2;

import java.util.ArrayList;

/*
사용자 정보 파싱 및 분석

    요구사항:
    사용자 정보가 담긴 문자열 데이터가 있습니다.
    각 사용자 정보는 세미콜론(;)으로 구분되어 있으며,
    각 사용자의 정보 내에서는 이름, 나이, 이메일이 콤마(,)로 구분되어 있습니다.
    이 데이터를 파싱하여 다음 정보를 출력하는 프로그램을 작성하세요.

    - 전체 사용자 수.
    - 각 사용자의 이름, 나이, 이메일 정보 출력.
    - 입력된 사용자 중 이메일 도메인이 "gmail.com"인 사용자의 이름을 출력.
    - 가장 나이가 많은 사용자의 이름과 나이 출력.
    - 이름에 "김"이 포함된 사용자 수.

    입력 예시 문자열
    ===
    김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;
    김민아,35,mina@gmail.com

    출력 예시
    ===
    전체 사용자 수: 4
    사용자 정보:
    - 이름: 김철수, 나이: 30, 이메일: kimcs@gmail.com
    - 이름: 이영희, 나이: 25, 이메일: younghee@naver.com
    - 이름: 박보검, 나이: 22, 이메일: bogum@daum.net
    - 이름: 김민아, 나이: 35, 이메일: mina@gmail.com
    "gmail.com" 도메인 사용자:
    - 김철수
    - 김민아
    가장 나이가 많은 사용자:
    - 이름: 김민아, 나이: 35
    이름에 "김"이 포함된 사용자 수: 2
 */
public class Q2 {
    public static void main(String[] args) {

        // 입력 예시 문자열 정보
        String input = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";

        // 사죵자 정보 파싱
        // 입력된 문자열을 세미콜론(;)을 기준으로 분할하여 각 사용자 정보를 배열에 저장
        String[] users = input.split(";");

        // 전체 사용자 수를 저장할 변수를 선언하고, 사용자 정보 배열의 길이를 할당
        int totalUsersNumber = users.length;

        // 전체 사용자 수를 출력하고, 사용자 정보의 출력을 시작함을 나타냄
        System.out.println("전체 사용자 수: " + totalUsersNumber);
        System.out.println("사용자 정보: ");

        // "gmail.com" 도메인 사용자, 가장 나이가 많은 사용자, 이름에 "김"이 포함된 사용자 수를
        //  추적하기 위한 변수들을 초기화
        ArrayList<String> gmailUsers = new ArrayList<>();
        int maxAge = Integer.MIN_VALUE;
        String oldestUser = "";
        int kimCount = 0;

        // 각 사용자 정보에 대한 반복문을 시작 및 users 배열의 각 요소를 순회
        for (String user : users) {

            // 각 사용자 정보를 콤마(,)를 기준으로 분할하여 이름, 나이, 이메일을 추출
            String[] userInfo = user.split(",");
            String name = userInfo[0];
            int age = Integer.parseInt(userInfo[1]);
            String email = userInfo[2];

            // 각 사용자 정보를 출력
            System.out.println("-이름: " + name + ", 나이: " + age +  ", 이메일: " + email);

            // 이메일 도메인이 "gmail.com"인 경우, 해당 사용자의 이름을 gmailUsers 리스트에 추가
            if (email.endsWith("gmail.com")) {
                gmailUsers.add(name);
            }

            // 현재 사용자의 나이가 최대 연령보다 클 경우, 최대 연령과 가장 나이가 많은 사용자의 이름을 업데이트
            if (age > maxAge) {
                maxAge = age;
                oldestUser = name;
            }

            // 사용자 이름에 "김"이 포함되어 있는 경우, kimCount 를 증가
            if (name.contains("김")) {
                kimCount++;
            }
        }

        // "gmail.com" 도메인 사용자 출력을 시작함을 나타냄
        System.out.println("\"gmail.com\" 도메인 사용자: ");

        // "gmail.com" 도메인 사용자의 이름을 출력
        for (String userName : gmailUsers) {
            System.out.println("- " + userName);
        }

        // 가장 나이가 많은 사용자의 이름과 나이를 출력합니다.
        System.out.println("가장 나이가 많은 사용자: ");
        System.out.println("- 이름:  " + oldestUser + ", 나이: " + maxAge);

        // 이름에 "김"이 포함된 사용자 수를 출력합니다.
        System.out.println("이름에 \"김\"이 포함된 사용자 수: " + kimCount);

    }
}

package library.lang.ex.ex10;

public class Ex10 {
    /*
    실습 문제: 사용자 정보 파싱 및 분석

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
김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com

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
    public static void main(String[] args) {

        // 데이터
        String data = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";

        // 데이터를 ";" 단위로 분류
        String[] users = data.split(";");

        // gmailUser 라는 이름의 StringBuilder 객체를 생성하고 초기화.
        // gmailUser 객체는 append(), .insert(), .delete(), .replace() 등의 메소드를 호출하여,
        // 문자열을 추가, 삽입, 삭제, 또는 교체할 수 있다.
        StringBuilder gmailUser = new StringBuilder();

        // maxAge 변수 선언하고 0으로 초기화
        int maxAge = 0;

        String oldestUser = null;

        int countKim = 0;

        // 1. 전체 사용자 수
        System.out.println("전체 사용자 수: " + users.length);

        // 2. 사용자 정보 출력
        for (String user :users) {
            String[] userInfo = user.split(",");
            String name = userInfo[0];
            String age = userInfo[1];
            String email = userInfo[2];
            System.out.println("이름: " + name + ", 나이: "+ age + ", 이메일: "+ email);


            // 3. gmail 사용자
            if (email.endsWith("gmail.com")) {
                gmailUser.append("\n - " + name);
            }


            // 4. 나이가 많은 사용자
            int intAge = Integer.parseInt(age);

            if (intAge > maxAge) {
                maxAge = intAge;
                oldestUser = name;
            }


            // 5. 김씨 성 수 세기
            if (name.startsWith("김")) {
                countKim++;
            }

        }

        // 출력
        System.out.println("Gmail 사용자: " + gmailUser);
        System.out.println("가장 나이가 많은 사용자 : " + oldestUser + "," + maxAge);
        System.out.println("김씨가 포함된 사용자 수: " + countKim);

    }
}

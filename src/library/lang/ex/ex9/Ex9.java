package library.lang.ex.ex9;


import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Ex9 {
    /*
    실습 문제: 문자열 정보 처리 및 분석

요구사항:
당신은 텍스트 기반 데이터를 처리하는 소프트웨어를 개발하고 있습니다.
사용자로부터 한 줄의 문자열을 입력받아,
다음과 같은 정보를 출력하는 프로그램을 작성하세요.

- 입력받은 문자열의 길이.
- 문자열에서 공백의 수.
- 문자열을 쉼표(,)로 분리한 후, 각 부분 문자열의 길이를 출력.
- 문자열이 "Java"를 포함하는지 여부.
- 문자열이 "프로그래밍"으로 끝나는지 여부.
- 문자열 중 "a" 문자가 몇 번 나타나는지 카운트. (대소문자 구분 없음)

입력 예시 문자열
===
Java 프로그래밍, 문자열 처리 연습

출력 예시
===
문자열 길이: 24
공백 수: 3
각 부분 문자열 길이: [13, 8, 2]
"Java" 포함 여부: true
"프로그래밍"으로 끝나는가: false
"a" 문자의 수: 2
     */
    public static void main(String[] args) {

        // 문자열 입력
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        String input = scanner.nextLine();

        // 문자열 길이
        int length = input.length();

        // 공백 수
        int spaceCount = input.length() - input.replace(" ", "").length();

        // 쉼표로 분리한 후, 각 부분 문자열 길이
        String[] parts = input.split(",");
        int[] partsLengths = new int[parts.length];
        for (int i =0; i < parts.length; i++) {
            partsLengths[i] = parts[i].trim().length();
        }

        // "Java" 포함 여부
        boolean containsJava = input.contains("Java");

        // "프로그래밍"으로 끝나는가
        boolean endsWithProgramming = input.endsWith("프로그래밍");

        // "a" 문자의 수
        int aCount = input.toLowerCase().length() - input.toLowerCase().replace("a","").length();

        // 결과 출력
        System.out.println("문자열의 길이: " + length);
        System.out.println("공백 수: " + spaceCount);
        System.out.println("각 부분 문자열 길이: "+ Arrays.toString(partsLengths));
        System.out.println("\"Java\" 포함 여부: " + containsJava);
        System.out.println("\"프로그래밍\"으로 끝나는가: " + endsWithProgramming);
        System.out.println("\"a\" 문자의 수: " + aCount );

    }

    /*
    강사 풀이
      public static void main(String[] args) {
        String input = "Java 프로그래밍, 문자열 처리 연습";

        // 1.
        System.out.println("문자열 길이 : " + input.length());

        // 2.
        int whiteSpaceCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                whiteSpaceCount++;
            }
        }

        System.out.println("공백 수 : " + whiteSpaceCount);

        // 3. 부분 문자열 길이
        System.out.print("부분 문자열의 길이 : [");
        String[] split = input.split(",");

        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i].trim().length());
            if (i != split.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 4. "Java" 포함 여부: true
        System.out.println("\"Java\" 포함 여부: " + input.contains("Java"));
        // 5. "프로그래밍"으로 끝나는가: false
        System.out.println("\"프로그래밍\"으로 끝나는가: " + input.endsWith("프로그래밍"));
        // 6. "a" 문자의 수: 2
        // a문자의 수 : 전체 길이의 수 - a를 제외한 수
        // 대문자A와 소문자a 모두 세어야 할 경우
        int countA = input.toLowerCase().length() - input.toLowerCase().replace("a", "").length();
        System.out.println("\"a\" 문자의 수: " + countA);

    }

     */
}

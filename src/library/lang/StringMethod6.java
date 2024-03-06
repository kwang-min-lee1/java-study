package library.lang;

import java.util.Arrays;

public class StringMethod6 {
    public static void main(String[] args) {
        // 반복, repeat(int) : count 횟수만큼 문자열 반복하여 문자열을 반환
        String bell = "딸랑";

        System.out.println(bell.repeat(2));
        System.out.println(bell.repeat(4));
        System.out.println(bell.concat(" ").repeat(3).trim()); // 리턴타입 중요(문자열)

        // substring(int, int): 문자열 지정된 부분 문자열 반환
        // 시작 인텍스는 포함, 끝 인덱스는 포함하지 않음.
        System.out.println("안녕하세요".substring(2));
        System.out.println("안녕하세요".substring(0,2));

        // 특정 문장에서 찾는 문자열을 잘라낼 경우
        String findText = "꽃이";
        String sentence = "무궁화 꽃이 피었습니다.";
        String substring = sentence.substring(
                sentence.indexOf(findText),                      // 시작 인덱스
                sentence.indexOf(findText)+ findText.length()); // 끝 인덱스(시작 인덱스 +길이)
        System.out.println(substring);

        // replace : 치환, 지정된 문자열에서 다른문자를 교체한 새 문자열 반환
        System.out.println("안녕하세요"
                .replace("안녕","평안")
        );

        String hello = "안녕하세요, 저는 안녕합니다.";
        String replaced = hello.replace("안녕", "평안");
        System.out.println(hello); // 원본은 변경되지 않음
        System.out.println(replaced); // 모든 교체 문자열을 교체

        // split: 지정된 구분자로 배열을 반환
        String memo = "사과, 체리, 바나나, 딸기, 복숭아";
        String[] fruit = memo.split(",");
        System.out.println(Arrays.toString(fruit));

        String todos = "청소하기 빨래하기 출근하기 잠자기";
        String[] todoArray = todos.split(" ");
        for (String todo : todoArray) {
            System.out.println(todo);
        }


    }
}

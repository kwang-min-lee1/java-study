package collection.ex;

import java.util.Stack;

public class Ex3 {
    /*
    문제 : 웹 브라우저 방문 기록 (Stack 활용)
    웹 브라우저에서 사용자가 방문한 페이지의 이력을 스택을 사용하여 관리하는 프로그램을 작성하세요.
    사용자가 새로운 페이지로 이동할 때마다 해당 페이지의 URL 을 스택에 push 하고,
    사용자가 뒤로 가기 버튼을 클릭할 때마다 스택에서 최근 페이지 URL 을 pop 하여
    이전 페이지로 이동할 수 있게 합니다.

    요구사항:
    사용자가 방문한 페이지 URL 을 순서대로 스택에 추가(push)합니다.
    사용자가 뒤로 가기를 선택하면, 현재 페이지를 스택에서 제거(pop)하고,
    이전 페이지를 조회(peek)합니다.

    입력 예시:
    데이터
    www.example.com
    www.example.com/about
    www.example.com/contact

    출력 예시:
    현재 페이지: www.example.com/contact
    이전 페이지로 돌아갑니다: www.example.com/about
     */
    public static void main(String[] args) {

        Stack<String> webHistory = new Stack<>();

        //  push : 스택에 마지막 요소를 추가
        webHistory.push("www.example.com");
        webHistory.push("www.example.com/about");
        webHistory.push("www.example.com/contact");

        //  pop : 가장 마지막에 있는 것부터 삭제하면서 반환
        String pop = webHistory.pop();
        System.out.println("현재 페이지: " + pop);

        // peek : 가장 마지막 요소 확인(반환)하고 제거하지 않음
        String peek = webHistory.peek();
        System.out.println("이전 페이지로 돌아갑니다.: " + peek);

    }
}

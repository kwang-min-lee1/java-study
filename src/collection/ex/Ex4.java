package collection.ex;

import java.util.LinkedList;
import java.util.Queue;

public class Ex4 {
     /*
    문제 : 인쇄 작업 대기열 (Queue 활용)
    사무실 인쇄기에서 여러 사용자의 인쇄 요청을 순서대로 처리할 수 있도록 큐를 활용하는 프로그램을 작성하세요. 사용자가 인쇄 요청을 할 때마다 해당 요청을 큐에 추가(offer)하고, 인쇄기는 큐에서 대기 중인 요청을 순서대로 가져와(poll) 처리합니다.

    요구사항:
    사용자의 인쇄 요청을 순서대로 큐에 추가합니다.
    큐가 비어있지 않은 동안, 인쇄 작업을 순서대로 처리하고, 처리된 작업을 큐에서 제거합니다.

    데이터 예시:
    과제.hwp
    보고서.docx
    자료.pdf

    출력 예시:
    과제.hwp 인쇄 중...
    보고서.docx 인쇄 중...
    자료.pdf 인쇄 중...
     */

     // Document 클래스 생성
     static class Document {
          String name;

          // 생성자
          public Document(String name) {
               this.name = name;
          }

          // 객체의 문자열 표현을 제공하기 위해 toString() 메서드를 재정의(Override)
          // 기본적으로 toString() 메서드는 객체의 클래스명과 해시코드(메모리 주소)를 문자열로 반환한다.
          // 하지만 이를 우리가 원하는 형태로 바꿀 수 있고,
          // 이때 해당 클래스에서 toString() 메서드를 재정의하여,
          // 우리가 원하는 형식의 문자열을 반환하도록 할 수 있다.

          // 클래스(name 이라는 필드를 갖는 클래스)의 인스턴스를 문자열로 표현할 때,
          // "name 인쇄 중.."와 같은 형식으로 반환하도록 재정의
          @Override
          public String toString() {
               return name + "인쇄 중..";
          }
     }
     public static void main(String[] args) {

          // Queue (대기열) 가장 먼저 추가된 요소가 가장 먼저 제거
          Queue<Document> printQueue = new LinkedList<>();
          // offer: 큐의 끝에 요소를 추가
          printQueue.offer(new Document("과제.hwp"));
          printQueue.offer(new Document("보고서.docx"));
          printQueue.offer(new Document("자료.pdf"));

          while (!printQueue.isEmpty()){
               // poll : 큐의 시작부분 요소를 제거하고 반환
               Document poll = printQueue.poll();
               System.out.println(poll);
          }
     }
}

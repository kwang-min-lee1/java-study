package collection.list.ex.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  연습문제

     간단한 투표 시스템
     목표: 주어진 후보 목록에서 사용자의 투표를 받아, 각 후보별 투표 수를 계산하고 결과를 출력하는 간단한 투표 시스템을 구현합니다.

     요구 사항

     1. 후보 목록 설정하기
     프로그램이 시작할 때, 사용자에게 4명의 후보 목록을 보여줍니다.
     예: "1. 고길동, 2. 둘리, 3. 마이콜, 4. 희동이"

     2. 투표 받기
     사용자로부터 원하는 후보의 번호를 입력받습니다.
     사용자가 '0'을 입력하면 투표를 종료합니다.

     3. 결과 출력하기
     모든 투표가 끝나면, 각 후보별로 받은 투표 수를 출력합니다.
     예: "고길동: 3, 둘리: 5, 마이콜: 2, 희동이: 4"

     출력예시
     ===
     후보 목록:
     1. 고길동
     2. 둘리
     3. 마이콜
     4. 희동이
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):
     2
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):
     2
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):
     3
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):
     4
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):
     1
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):
     0
     투표 결과:
     고길동: 1
     둘리: 2
     마이콜: 1
     희동이: 1

     /* 참고
     상세 요구사항
     Candidate 클래스 구현하기
     - 후보(Candidate)의 이름(name)과 투표 수(votes)를 필드로 가집니다.
     - 생성자(Constructor)를 통해 이름을 초기화하고, 투표 수는 0으로 설정합니다.
     - receiveVote() 메서드를 구현하여 호출될 때마다 해당 후보의 투표 수를 1 증가시킵니다.
     - getName() 메서드와 getVotes() 메서드를 구현하여 이름과 투표 수를 반환할 수 있게 합니다.
     - toString() 메서드를 오버라이드하여 후보의 이름과 투표 수를 문자열로 반환합니다.

     VotingSystem 클래스 구현하기
     - List<Candidate> 타입의 필드를 사용하여 후보 목록을 관리합니다.
     - 생성자에서 후보 목록을 초기화하고, 4명의 후보를 목록에 추가합니다.
     - startVoting() 메서드에서 투표 프로세스를 구현합니다.
         - 사용자로부터 투표할 후보의 번호를 입력받습니다.
         - 사용자가 '0'을 입력하면 투표를 종료합니다.
         - 유효한 번호를 입력받으면 해당 후보의 receiveVote() 메서드를 호출합니다.
         - 잘못된 번호를 입력받으면 오류 메시지를 출력하고 다시 입력을 요청합니다.
     - printResults() 메서드에서 최종 투표 결과를 출력합니다.
 */
public class Ex4 {
    public static void main(String[] args) {
        List<String> candidates = new ArrayList<>();    // 후보 정보
        List<Integer> votes = new ArrayList<>();        // 투표 받은 수

        // 후보 목록 등록 (초기화)
        candidates.add("고길동");
        candidates.add("둘리");
        candidates.add("마이콜");
        candidates.add("희동이");

        // 투표 받은 수 초기화
        for (int i = 0; i < candidates.size(); i++) {
            votes.add(0);
        }

        // 후보목록 출력하기
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println(i+1 +". "+candidates.get(i));
        }

        // 투표 받기
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("투표하고 싶은 번호를 입력하세요. 종료는 0 > ");
            int choice = scanner.nextInt();

            // 0이면 투표 종료하기
            if (choice == 0) break;
            else if (choice > 0 && choice <= candidates.size()){
                // 투표 카운트하기
                Integer vote = votes.get(choice - 1);  // 투표 수 가져오기 (인덱스 주의)
                votes.set(choice - 1, vote + 1);
            } else {
                System.out.println("번호를 맞게 입력해주세요");
            }
        }

        // 반복문 빠져나올 시 투표결과 출력
        System.out.print("[투표결과] ");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.printf("%s : %d   ", candidates.get(i), votes.get(i));
        }

    }
}

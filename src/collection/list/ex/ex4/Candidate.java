package collection.list.ex.ex4;

public class Candidate {

    // 필드
    String name;
    int Votes;

    // 생성자(Constructor)를 통해 이름을 초기화하고, 투표 수는 0으로 설정
    public Candidate(String name, String votes) {
        this.name = name;
        this.votes = 0;
    }

    // receiveVote() 메서드를 구현하여 호출될 때마다 해당 후보의 투표 수를 1 증가
    public void receiveVote() {
        this.votes ++ ;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }
}

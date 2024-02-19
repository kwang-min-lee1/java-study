package class1.ex;

public class Ex4 {
    /*
   1. Board 클래스의 생성자가 다음과 같이 오버로딩 되어 있습니다.
     생성자마다 중복 코딩 된 부분이 있습니다.
     this()를 활용해서 중복 코드를 제거해보세요 .
   2. main 메서드에서 Board 객체를 생성하는 네 가지 방법을 모두 사용해보세요.
    */
    public static void main(String[] args) {

    }
}

class Board {
    String title;
    String content;
    String writer;
    String date;
    int hitCount;

    Board(String title, String content) {
        this.title = title;
        this.content = content;
        this.writer = "로그인한 회원아이디";
        this.date = "현재 컴퓨터 날짜";
        this.hitCount = 0;
    }

    Board(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = "현재 컴퓨터 날짜";
        this.hitCount = 0;
    }

    Board(String title, String content, String writer, String date) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitCount = 0;
    }

    public Board(String title, String content, String writer, String date, int hitCount) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitCount = hitCount;
    }
}

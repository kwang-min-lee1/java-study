package jdbc.board;

import java.util.Date;
import java.util.Objects;


public class Board {
    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date date;

    public Board(int boardNO, String title, String content, String writer, Date date) {
        this.boardNo = boardNO;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public Board(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public int getBoardNo() {
        return boardNo;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Date getDate() {
        return date;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return boardNo == board.boardNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardNo);
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardNO=" + boardNo +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", date=" + date +
                '}';
    }
}

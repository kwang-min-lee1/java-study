package jdbc.object;

import static0.Data;

import java.sql.Blob;
import java.util.Date;
import java.util.Objects;

public class Board {

    // 필드는 테이블의 속성(컬럼)
    private int boardNO;
    private String title;
    private String content;
    private String writer;
    private Date date;
    private String filename;

    private Blob filedata;


    public Board(int boardNO, String title, String content, String writer, Date date, String filename, Blob filedata) {
        this.boardNO = boardNO;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.filename = filename;
        this.filedata = filedata;
    }

    public int getBoardNO() {
        return boardNO;
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

    public String getFilename() {
        return filename;
    }

    public Blob getFiledata() {
        return filedata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return boardNO == board.boardNO;
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardNO);
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardNO=" + boardNO +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", date='" + date + '\'' +
                ", filename='" + filename + '\'' +
                '}';
    }
}

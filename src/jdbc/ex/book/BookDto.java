package jdbc.ex.book;

public class BookDto {

    // 데이터를 전달할 컬럼 (DB의 컬럼과 일치)
    private String isbn;
    private String title;
    private String author;
    private int publish_year;
    private String genre;

    // 생성자
    public BookDto(String isbn, String title, String author, int publish_year, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publish_year = publish_year;
        this.genre = genre;
    }

    // getter, setter
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublish_year() {
        return publish_year;
    }

    public void setPublish_year(int publish_year) {
        this.publish_year = publish_year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}

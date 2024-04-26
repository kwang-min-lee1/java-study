package jdbc.ex.book_teacher;

public class BookDto {
    private String isbn;
    private String title;
    private String author;
    int publishYear;
    private String genre;

    public BookDto() {}

    public BookDto(String isbn, String title, String author, int publishYear, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.genre = genre;
    }

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

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // 책의 표시 포맷을 정의
    @Override
    public String toString() {
        return String.format("ISBN: %s, 제목: %s, 저자: %s, 출판년도: %d, 장르: %s", isbn, title, author, publishYear, genre);
    }
}

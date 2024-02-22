package inheritance.ex;

public class Book {
    // 필드 (protected 접근제어자를 활용하면, 상속관계에서 접근 가능)
    protected String title;
    protected String author;
    protected int year;

    // 생성자
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // 메서드
    public void displayInfo() {
        System.out.println("Title : " + title + ", Author : " + author + ", Year :" + year);
    }
}

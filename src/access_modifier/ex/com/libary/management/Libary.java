//package access_modifier.ex.com.libary.management;
//
//public class Libary {
//    //    필드:
//    Book[] books; // Book 객체의 배열
//    int index = 0;   // 현재 저장된 도서의 수
//
//    //    생성자:
//    Library(int capacity) {
//        this.books = new Book[capacity]; // 길이만큼 배열 초기화
//    }
//
//    //    메서드:
//    public void addBook(Book book)  {
//        // 도서관에 새 도서 추가
//        books[index] = book;
//        index++; // books[1] = book;
//    }
//    public void listBooks() {
//        // 도서관에 있는 모든 도서 출력
//        System.out.println("도서목록:");
//        for (int i = 0; i < index; i++) {
//            System.out.println((i+1) + ". 제목 : " + books[i].title + ", 저자 : " + books[i].author);
//        }
//    }
//
//}

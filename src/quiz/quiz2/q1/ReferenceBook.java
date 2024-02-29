package quiz.quiz2.q1;
/*
ReferenceBook(참고서) 클래스:
    Book 클래스로부터 상속받습니다.
    추가 필드: field (참고서 분야, 예: "과학", "수학")
    displayInfo() 메소드를 오버라이딩하여, 참고서의 경우 추가적으로 분야도 출력합니다.
 */
class ReferenceBook extends Book {

    // 추가 필드
    private String field;

    // 생성자
    public ReferenceBook(String title, String author, int year, String field) {
        super(title, author, year); // 부모클래스 생성자 호출
        this.field = field;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // 부모 클래스의 displayInfo 메소드 호출
        System.out.println(". Field: " + field);
    }
}

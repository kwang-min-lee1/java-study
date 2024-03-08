package quiz.quiz3.q5;

public class Quiz5 {
    public static void main(String[] args) {
        // Product 객체 생성
        Product product1 = new Product("Apple", 2.5, 10);
        Product product2 = new Product("Apple", 2.5, 10);

        // equals 메서드 호출 결과 출력
        System.out.println("equals 메서드 호출 결과: " + product1.equals(product2));

        // hashCode 메서드 호출 결과 출력
        System.out.println("hashCode 메서드 호출 결과 (product1): " + product1.hashCode());
        System.out.println("hashCode 메서드 호출 결과 (product2): " + product2.hashCode());

        // toString 메서드 호출 결과 출력
        System.out.println("toString 메서드 호출 결과 (product1): " + product1.toString());
        System.out.println("toString 메서드 호출 결과 (product2): " + product2.toString());
    }

}

package quiz.quiz3.q5;

public class Quiz5 {
    /*
    상품 클래스 재정의하기

    Product 클래스는 상품을 나타내며, 상품의 이름(name), 가격(price), 수량(quantity)을 저장합니다.
    Product 클래스는 Object 클래스의 메서드 중 일부를 오버라이드합니다.
    equals 메서드는 이름, 가격, 수량이 모두 동일한 경우에만 true를 반환합니다.
    hashCode 메서드는 이름, 가격, 수량을 기반으로 해시 코드를 생성합니다.
    toString 메서드는 "상품: [이름], 가격: [가격], 수량: [수량]" 형식의 문자열을 반환합니다.
    Product 클래스의 객체를 생성하고, equals, hashCode, toString 메서드를 각각 호출하여 결과를 출력하세요.

    실행결과
    ===
    equals 메서드 호출 결과: true
    hashCode 메서드 호출 결과 (product1): 635023629
    hashCode 메서드 호출 결과 (product2): 635023629
    toString 메서드 호출 결과 (product1): 상품: Apple, 가격: 2.5, 수량: 10
    toString 메서드 호출 결과 (product2): 상품: Apple, 가격: 2.5, 수량: 10
     */

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

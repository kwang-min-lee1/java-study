package library.lang.ex.ex4;

import java.util.Objects;

public class Ex4 {
    static class Product {
        private String name;
        private long price;
        private int quantity;

        public Product(String name, long price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return price == product.price && quantity == product.quantity && Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price, quantity);
        }

        @Override
        public String toString() {
            return "상품: [" +
                    name +']' +
                    ", 가격: [" + price +
                    "], 수량: [" + quantity +
                    '}';
        }
    }

    public static void main(String[] args) {
        Product carrot1 = new Product("당근", 3000, 30);
        Product carrot2 = new Product("당근", 3000, 30);

        carrot1.equals(carrot2);

        System.out.println(carrot1.hashCode());
        System.out.println(carrot2.hashCode());

        System.out.println(carrot1.toString());
        System.out.println(carrot2.toString());
    }


}
/*
문제
요구사항
===
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
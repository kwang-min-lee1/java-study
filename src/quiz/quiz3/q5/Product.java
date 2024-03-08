package quiz.quiz3.q5;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "상품: " + name + ", 가격: " + price + ", 수량: " + quantity;
    }
}


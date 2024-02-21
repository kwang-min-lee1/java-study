package access_modifier.ex;

public class Item {
    private String name;        // 이름
    private long price;         // 가격
    private int quantity;       // 수량

    public Item(String name, long price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 이름 접근 getter
    public String getName() {
        return name;
    }

    // 합계 구하기 : 가격 * 수량
    public long getTotal() {
        return price * quantity;
    }
}

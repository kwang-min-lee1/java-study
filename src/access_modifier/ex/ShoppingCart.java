package access_modifier.ex;

public class ShoppingCart {
    // 필드
    private Item[] items = new Item[10];
    private int count = 0;

    // 메서드
    // 쇼핑카트에 아이템을 추가하는 메서드
    public void addItem(Item item) {
        // 제약사항
        if (count > 9) {
            System.out.println("장바구니가 가득찼습니다.");
            return;
        }

        // 아이템 추가
        items[count] = item;
        count++;
    }

    //    장바구니 상품 출력
//    상품명:당근, 합계:4500
//    상품명:양파, 합계:10000
//    전체 가격 합:14500
    public void displayItems() {
        // 상품명:당근, 합계:4500
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < count; i++) {
            System.out.println("상품명:" + items[i].getName() + ", 합계: " + items[i].getTotal());
        }
        System.out.println("전체 가격 합:"+ calculateSum());
    }

    // 내부에서만 사용하는 메서드는 private로 막아둔다.
    // 사용자에게 꼭 필요한 메서드만 노출하는 것이 좋은 캡슐화 방식이다.
    private long calculateSum() {
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + items[i].getTotal();
        }
        return sum;

    }
}

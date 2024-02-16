package class0.ex;

public class Ex4 {
    // 3번 연습문제를 리팩토링 해주세요.
    // createOrder 메소드를 통해 상품 주문 객체를 생성해주세요.
    // printOrder 메소드를 통해 상품 정보를 출력해주세요.
    // getTotalPayment 메소드를 통해 총 결제 금액을 구해주세요.
    public static void main(String[] args) {

        // 상품 주문 객체를 3개 생성
        ProductOrder order1 = createOrder("노트북", 1000000, 2);
        ProductOrder order2 = createOrder("마우스", 15000, 3);
        ProductOrder order3 = createOrder("키보드", 50000, 1);

        // 생성한 객체를 배열에 저장
        ProductOrder[] orders = {order1, order2, order3};

        // 객체 정보 출력
        printOrder(orders);

        // 최종 결제 금액 출력
        int totalPayment = getTotalPayment(orders);
        System.out.println("총 결제금액 : " + totalPayment + "원");
    }

    // 출력 메서드
    private static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + "," +
                    " 가격 :" + order.price + ", 수량 : " + order.quantity);
        }
    }

    // 계산 메서드
    private static int getTotalPayment(ProductOrder[] orders) {
        int totalPayment = 0;
        for (ProductOrder order : orders) {
            totalPayment += order.price * order.quantity;
        }
        return totalPayment;
    }

    // 생성 메서드
    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }


}

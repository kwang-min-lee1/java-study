package quiz;

import class0.ex.ProductOrder;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 주문 개수 입력받기
        System.out.print("주문 개수를 입력해주세요: ");
        int orderNumber = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[orderNumber];

        for (int i = 0; i < orderNumber; i++) {
            System.out.println(i+1 +"번째 주문을 입력해주세요");

            System.out.print("상품명 : ");
            String productName = scanner.next();
            System.out.print("가격 : ");
            int price = scanner.nextInt();
            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();  // 입력받는 버퍼 라인을 비움

            // 배열에 생성된 객체를 할당
            orders[i] = createOrder(productName, price, quantity);
        }

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




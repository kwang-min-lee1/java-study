package class0.ex;

public class Ex3 {
    public static void main(String[] args) {

        // 상품 주문 객체 생성
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName ="노트북";
        productOrder1.price = 50000 ;
        productOrder1.quantity = 2 ;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName ="마우스";
        productOrder2.price = 10000 ;
        productOrder2.quantity = 3 ;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName ="키보드";
        productOrder3.price = 20000 ;
        productOrder3.quantity = 5 ;


        //생성한 객체를  배열에 저장

        ProductOrder[ ] productOrders ={productOrder1,productOrder2,productOrder3};
        int totalPayment = 0;  // 총 결제금약을 저장할 변수

//        ProductOrder[] productOrders = new ProductOrder[3];
//        productOrders[0] = productOrder1;
//        productOrders[1] = productOrder2;
//        productOrders[2] = productOrder3;

        // 객체 정보 출력
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " +productOrder.quantity);
            int payment = productOrder.price * productOrder.quantity;
            totalPayment += payment;
        }

//        for (int i = 0; i < productOrders.length; i++) {
//            System.out.println("[ 상품명 : " + productOrders[i].productName + ", 가격 : " + productOrders[i].price +  ", 수량 : " + productOrders[i].quantity+ "]");
//            System.out.println("총 결제금액: " + productOrders[i].price * productOrders[i].quantity);
//        }

        //최종 결제 금액 출력
        System.out.println("총 결제금액: " + totalPayment + "원");

    }
}

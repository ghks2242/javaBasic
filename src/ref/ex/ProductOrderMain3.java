package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println(n);

        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < orders.length; i++) {
            System.out.println(i+1 + "번쨰 주문 정보를 입력하세요.");

            System.out.print("상품명 : ");
            String s = scanner.next();
            scanner.nextLine();

            System.out.print("가격 : ");
            int i1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("수량 : ");
            int i2 = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createProductOrder(s, i1, i2);
        }

//        orders[0] = createProductOrder("김치", 5000, 1);
//        orders[1] = createProductOrder("두부", 2000, 2);
//        orders[2] = createProductOrder("콜라", 1500, 2);

        printProductOrder(orders);
    }

    public static ProductOrder createProductOrder(String name, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public static void printProductOrder(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("productName = " + productOrder.productName + " price = " + productOrder.price + " quantity = " + productOrder.quantity);
        }
        System.out.println("총결재 금액 = " + getTotalAmount(productOrders));
    }

    public static int getTotalAmount(ProductOrder[] productOrders) {
        int amount = 0;
        for (ProductOrder productOrder : productOrders) {
            amount += productOrder.price * productOrder.quantity;
        }
        return amount;
    }
}

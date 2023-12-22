package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createProductOrder("김치", 5000, 1);
        orders[1] = createProductOrder("두부", 2000, 2);
        orders[2] = createProductOrder("콜라", 1500, 2);

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

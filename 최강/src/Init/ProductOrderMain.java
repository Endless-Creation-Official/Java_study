package Init;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder order1 =createOrder("두부", 2000, 2);
        ProductOrder order2 =createOrder("김치", 5000, 1);
        ProductOrder order3 =createOrder("두부", 1500, 2);

        ProductOrder[] orders = {order1, order2, order3};

        printOrder(orders);
        getTotal(orders);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;
        return product;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품 이름:" + order.productName + "상품 가격:" + order.price + "상품 수량:" + order.quantity);
        }
    }

    static void getTotal(ProductOrder[] orders) {
        int total=0;
        for (ProductOrder order : orders) {
            total+=order.price * order.quantity;
        }
        System.out.println(total);
    }
}

package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder("두부", 3000, 5);
        ProductOrder order2 = new ProductOrder("김치", 5000, 3);
        ProductOrder order3 = new ProductOrder("감자", 8000, 4);

        ProductOrder[] orders = {order1, order2, order3};
        for (ProductOrder order : orders) {
            System.out.println("상품명:" + order.naem + " 가격:" + order.price + " 수량:" + order.quantity);
        }
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.getTotalPrice();
        }
        System.out.println("총결제 금액:" + sum);
    }
}

package ref.ex;

public class ProductOrder {
    public String name;
    public int price;
    public int quantity;

    public ProductOrder(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return price * quantity;
    }

    public void printOrderInfo(Object obj) {
        ProductOrder order = (ProductOrder) obj;
        System.out.println("상품명:" + getName());
        System.out.println("가격:" + getPrice());
        System.out.println("수량:" + getQuantity());
    }
}

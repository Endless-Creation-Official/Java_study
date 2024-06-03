package class1.ex;

public class ProductOrder {
    public String naem;
    public int quantity;
    public int price;

    public ProductOrder(String naem, int price, int quantity) {
        this.naem = naem;
        this.quantity = quantity;
        this.price = price;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}

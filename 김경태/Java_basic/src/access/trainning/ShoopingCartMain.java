package access.trainning;

public class ShoopingCartMain {
    public static void main(String[] args) {
        ShoppintCart cart = new ShoppintCart();
        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}

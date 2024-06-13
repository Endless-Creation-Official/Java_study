package collection.list.test.ex2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        items[itemCount] = item;
        itemCount++;
    }


    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명:" + items[i].getName() +
                    ", 합계:" + items[i].getTotal());
        }
        System.out.println("전체 가격 합:" + calculateTotal());

    }

    private int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum+=item.getTotal();
        }
        return sum;
    }
}

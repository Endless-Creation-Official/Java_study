package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart_listV {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println(item.getName() + item.getTotal());
        }
        printTotalcal();
    }

    private void printTotalcal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getTotal();
        }
        System.out.println(sum);
    }


}

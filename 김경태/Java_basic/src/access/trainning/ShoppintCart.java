package access.trainning;

public class ShoppintCart {
    private Item[] items = new Item[10];
    private int itemCount;

    void addItem(Item item) {
        if (isMax(itemCount)) {
            items[itemCount++] = item;
        } else {
            System.out.println("상품 개수가 10개입니다.");
        }
    }

    private boolean isMax(int count) {
        return count < 10;
    }

    public void displayItems() {
        int sum = 0;
        for(int i=0; i<itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
            sum += item.getTotalPrice();
        }
        System.out.println("전체 가격: " + sum);
    }
}

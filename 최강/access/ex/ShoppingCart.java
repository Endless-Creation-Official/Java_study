package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount=0;

    public void addItem(Item item) {
        //제약 조건
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득찼습니다");
            return;
        }
        // 실행조건
        items[itemCount]=item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotal());
        }
        System.out.println("전체 가격 합:"+calculateTotalPrice());
    }

    public int calculateTotalPrice() {
        int totalprice=0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalprice+=item.getTotal();
        }
        return totalprice;
    }

}

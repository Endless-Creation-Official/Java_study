package access.ex;

public class ShoppingCart {
    Item[] items = new Item[10];
    int itemCount;

    public void addItem(Item item) {
        // 제어 조건 배열의 길이 10 보다 크면
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득찼습니다");
            return;
        }
        // 실행조건 items 배열에 item 넣어주기
        items[itemCount++]=item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < itemCount; i++) {
            Item item= items[i]; // int item이 아니라 Item item
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotal());
        }

        int getTotalPrice=0;
        for (int i = 0; i < itemCount; i++) {
            Item item= items[i];
            getTotalPrice+=item.getTotal();
        }
        System.out.println("전체 가격 합:" + getTotalPrice);

    }


}


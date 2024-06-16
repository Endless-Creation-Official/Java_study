package enumeration.ex02;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);
    private int discountPercent;
    private int price;
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public int discount(int price) {
        return discountPercent *(price / 100);
    }
}

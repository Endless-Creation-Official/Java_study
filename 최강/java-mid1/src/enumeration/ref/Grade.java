package enumeration.ref;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30);
    private int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}

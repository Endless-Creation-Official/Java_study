package enumeration.ex0;

public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercent = 0;
        if (grade.equals("Basic")) {
             discountPercent = 10;
        } else if (grade.equals("Gold")) {
             discountPercent = 20;
        } else if (grade.equals("Diamond")) {
            discountPercent = 30;
        } else {
            System.out.println("할인x" + discountPercent);
        }
        return price * discountPercent / 100;
    }
}

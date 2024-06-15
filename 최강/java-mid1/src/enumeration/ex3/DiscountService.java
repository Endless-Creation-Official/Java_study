package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discount = 0;
        if (grade.equals(BASIC)) {
            discount = 10;
        } else if (grade.equals(GOLD)) {
            discount = 20;
        } else if (grade.equals(DIAMOND)) {
            discount = 30;
        } else {
            System.out.println("할인x");
        }
        return price * discount / 100;
    }
}

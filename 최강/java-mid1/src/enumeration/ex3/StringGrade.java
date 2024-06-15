package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class StringGrade {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;
        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        //Grade grade = new Grade();
        System.out.println("베이직 등급의 할인 금액:" + basic);
        System.out.println("베이직 등급의 할인 금액:" + gold);
        System.out.println("베이직 등급의 할인 금액:" + diamond);
    }
}

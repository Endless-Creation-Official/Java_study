package enumeration.ref;


import static enumeration.ref.Grade.*;

public class EnumMain {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int a = discountService.discount(BASIC, price);
        int b = discountService.discount(GOLD, price);
        int c = discountService.discount(DIAMOND, price);

        System.out.println("베이직 등급:" + a);
        System.out.println("골드 등급:" + b);
        System.out.println("다이아 등급:" + c);

    }
}

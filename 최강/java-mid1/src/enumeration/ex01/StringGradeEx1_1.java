package enumeration.ex01;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;
        int gold = discountService.discount(StringGrade.BASIC, price);
        int basic = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println(gold);
        System.out.println(basic);
        System.out.println(diamond);

    }
}

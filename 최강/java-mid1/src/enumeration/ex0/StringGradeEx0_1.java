package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;
        int gold = discountService.discount("Gold", price);
        int basic = discountService.discount("Basic", price);
        int diamond = discountService.discount("Diamond", price);

        System.out.println(gold);
        System.out.println(basic);
        System.out.println(diamond);

    }
}

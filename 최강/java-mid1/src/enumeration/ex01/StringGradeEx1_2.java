package enumeration.ex01;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;
        int vip = discountService.discount("VIP", price);
        int diamond = discountService.discount("DIAMONDD", price);
        int gold = discountService.discount("gold", price);
        // string을 받을 수 있기 때문에 어떻게든 오류가 날 수 있음
        System.out.println(vip);
        System.out.println(gold);
        System.out.println(diamond);

    }
}

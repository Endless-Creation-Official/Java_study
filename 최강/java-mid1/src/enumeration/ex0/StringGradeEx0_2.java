package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;
        // 소문자 입력
        int gold = discountService.discount("gold", price);
        // 오타
        int basic = discountService.discount("Basicc", price);
        // 없는 등급
        int diamond = discountService.discount("Vip", price);

        //오류 발생
        System.out.println(gold);
        System.out.println(basic);
        System.out.println(diamond);
        
    }
}

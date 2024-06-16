package enumeration.ex02;

public class DiscountServiceMain {
    public static void main(String[] args) {
        /*DiscountService discountService = new DiscountService();
        int price = 10000;
        int basic = discountService.discount(Grade.BASIC, price);
        System.out.println("BASIC 등급의 할인율:"+basic);
        */
        int price = 10000;
        int basic = Grade.BASIC.discount(price);
        System.out.println("BASIC 등급의 할인율:"+basic);
    }
}


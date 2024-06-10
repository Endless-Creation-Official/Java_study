package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductOrder order1 = new ProductOrder("두부", 2000, 2);
        ProductOrder order2 = new ProductOrder("김치", 5000, 1);
        ProductOrder order3 = new ProductOrder("콜라", 1500, 2);


        System.out.println("입력할 주문의 개수를 입력하세요:" );
        int n = sc.nextInt();

        order1.printOrderInfo(order1);
        order1.printOrderInfo(order2);
        order1.printOrderInfo(order3);
        // 반복은 어떻게 할건데



    }

/*
    private static void printOrderInfo(ProductOrder[] orders) {

    }
*/

    // order1 order2 order3에 대한 입력을 따로 만들어줘야 하니까 이럴때 Object이용해보자가 아니라
    // 같은 형태니까 굳이 Object선언할 필요가 없음
    /*private static void printOrderInfo(ProductOrder order1) {

    }*/


}

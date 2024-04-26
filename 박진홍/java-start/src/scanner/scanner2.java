package scanner;

import java.util.Scanner;

public class scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        while (true) {
            System.out.print("두 정수를 입력하세요 : ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a==0 && b == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            System.out.println("두 정수의 합은 " + (a+b) + "입니다");

        }
    }
}

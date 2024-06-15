package collection.list.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요 (종료0)");
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n != 0) {
                arrayList.add(n);
            } else {
                break;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
            if (i < arrayList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

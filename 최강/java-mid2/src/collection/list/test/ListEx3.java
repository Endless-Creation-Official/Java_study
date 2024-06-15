package collection.list.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요 (종료0)");
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            if (n != 0) {
                arrayList.add(n);
                sum += n;
            } else {
                break;
            }
        }
        System.out.println(sum);
        double avg = (double) sum / arrayList.size();
        System.out.println(avg);
    }
}

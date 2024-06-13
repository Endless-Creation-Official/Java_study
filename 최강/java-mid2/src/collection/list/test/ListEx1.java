package collection.list.test;

import java.sql.Array;
import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> students = new ArrayList<>();
        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);
        int total = 0;

        for (Integer student : students) {
            total += student;
        }
        double average = (double) total / students.size();
        System.out.println(total + "\n" + average);

    }
}

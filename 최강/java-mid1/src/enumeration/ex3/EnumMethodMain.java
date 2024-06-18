package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();
        String string = Arrays.toString(values);


        Grade gold = Grade.valueOf("GOLD");
        System.out.println(gold);
        String name = gold.name();
    }
}

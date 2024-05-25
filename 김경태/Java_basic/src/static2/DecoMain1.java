package static2;

import java.sql.SQLOutput;

public class DecoMain1 {
    public static void main(String[] args) {

        String s = "hello java";
        DecoUtill utills = new DecoUtill();
        String deco = utills.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

    }
}

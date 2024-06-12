package lang.string.stringBuilder;

public class StringBuilderMain1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");

        System.out.println("sb=" + sb);

        sb.insert(4, "java");
        System.out.println("insert=" + sb);

        sb.delete(4, 8);
        sb.reverse();

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println(string);
    }
}

package generic.ex4;

public class GenericMethod {
    public static Object objectMethod(Object object) {
        System.out.println("object print: " + object);
        return object;
    }

    public static <T> T genericMethod(T T) {
        System.out.println("generic print: " + T);
        return T;
    }

    public static <T extends Number> T boundMethod(T T) {
        System.out.println("bound print: " + T);
        return T;
    }
}

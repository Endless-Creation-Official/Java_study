package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object result =GenericMethod.objectMethod(i);

        // 타입 인자 명시적 전달
        Integer result1=GenericMethod.<Integer>genericMethod(10);
        Integer result2 = GenericMethod.<Integer>boundMethod(10);
        Double result3 = GenericMethod.<Double>boundMethod(20.0);

        // 타입 추론
        Double result4 = GenericMethod.boundMethod(20.0);

    }
}

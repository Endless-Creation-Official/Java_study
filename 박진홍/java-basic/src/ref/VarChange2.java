package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();

        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA의 참조값 = " + dataA);
        System.out.println("dataB의 참조값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataA.value = 20;
        System.out.println("A값 변경");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataB.value = 30;
        System.out.println("B값 변경");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

    }
}

package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;

        System.out.println("date1 ="+date1);
        System.out.println("date2 =" + date2);

        System.out.println("date1의 2025년을 2024년으로");
        //date1.getYear().setYear(); 안되는 경우
        date1 = date1.withyear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

    }
}

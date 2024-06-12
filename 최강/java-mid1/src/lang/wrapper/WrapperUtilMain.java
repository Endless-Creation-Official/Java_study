package lang.wrapper;

public class WrapperUtilMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); //참조형으로 반환
        Integer i3 = Integer.valueOf("10"); // 문자열 래퍼로 반환
        int i2 = Integer.parseInt("10"); // 기본형으로 반환

        int result = i1.compareTo(20); //비교 메서드
        System.out.println(result);

        int sum = Integer.sum(i1, i2);
        int min = Integer.min(i1, i2);
        int max = Integer.max(i1, i2);


    }
}

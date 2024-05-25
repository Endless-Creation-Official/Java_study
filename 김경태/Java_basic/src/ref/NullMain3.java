package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        //NullPointerException: 참조형은 초기값이 null이므로 null.value는 접근 불가
        System.out.println("bigData.data.vlaue = " + bigData.data.value);
    }
}

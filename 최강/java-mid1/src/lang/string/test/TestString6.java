package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int cnt = 0;
        int index = str.indexOf(key);

        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            cnt++;
        }
        System.out.println(cnt);
    }
}

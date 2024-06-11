package lang.wrapper;

import java.util.Arrays;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정 틀린건 아님
        Integer integerObj = Integer.valueOf(10); // 자주사용하는 숫자 값 풀

        System.out.println("newInteger=" + newInteger);
        System.out.println("IntegerObj=" + integerObj);

        System.out.println("내부 값 읽기");
        int i = integerObj.intValue();
        System.out.println("intvalue=" + i);

        System.out.println("비교");
        System.out.println("== 바교" + (newInteger == integerObj));
        System.out.println("equals" + (newInteger.equals(integerObj)));

    }
}

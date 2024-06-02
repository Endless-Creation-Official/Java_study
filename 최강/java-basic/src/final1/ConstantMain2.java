package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("마트에 들어올 수 있는 최대 고객수:" + Constant.MAX_NUM);
        int currentUserCnt = 999;
        process(currentUserCnt++);
        process(currentUserCnt++);
        process(currentUserCnt++);

    }

    private static void process(int currentUserCnt) {
        System.out.println("현재 마트에 있는 인원수:" + currentUserCnt);
        if (currentUserCnt > Constant.MAX_NUM) {
            // 1000이라는 모호한 수가 maxnum으로 바뀜으로서 이해하기 쉬어짐
            System.out.println("대기자로 등록합니다");
        } else {
            System.out.println("마트에 들어올 수 있습니다");
        }
    }

}

package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("마트에 들어올 수 있는 최대 고객수:" + 1000);
        int currentUserCnt = 999;
        process(currentUserCnt++);
        process(currentUserCnt++);
        process(currentUserCnt++);

    }

    private static void process(int currentUserCnt) {
        System.out.println("현재 마트에 있는 인원수:" + currentUserCnt);
        if (currentUserCnt > 1000) {
            // main 함수안에서 고객수1000명이 바뀌면 함수에서도 바뀌어야 되고 1000이라는 숫자가 무엇인지
            // 다른 개발자가 알기 모호함
            System.out.println("대기자로 등록합니다");
        } else {
            System.out.println("마트에 들어올 수 있습니다");
        }
    }

}

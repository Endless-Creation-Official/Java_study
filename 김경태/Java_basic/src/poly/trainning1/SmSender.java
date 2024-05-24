package poly.trainning1;

public class SmSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 발송합니다: " + message);
    }
}

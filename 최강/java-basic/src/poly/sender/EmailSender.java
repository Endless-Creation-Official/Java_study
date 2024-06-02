package poly.sender;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("이메일 발송합니다:" + message);
    }
}

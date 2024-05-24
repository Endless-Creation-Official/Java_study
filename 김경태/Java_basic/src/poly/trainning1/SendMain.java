package poly.trainning1;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmSender(),  new FacebookSender()};

        for(Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}

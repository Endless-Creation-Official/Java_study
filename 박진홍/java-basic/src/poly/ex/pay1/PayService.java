package poly.ex.pay1;


// 변하지 않는 부분
public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        Pay pay = PayMethod.findPay(option);

        if (pay != null) {
            pay.pay(amount);
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제 수단이 없습니다.");
            System.out.println("결제가 실패했습니다.");
        }
    }
}

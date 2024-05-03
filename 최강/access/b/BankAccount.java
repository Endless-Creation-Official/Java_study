package access.b;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance=0;
    }

    // 돈을 입금하는 함수
    public void deposit(int amount) {
        if (isValidAmount(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 값입니다");
        }
    }

    // 돈을 인출하는 함수
    public void withdraw(int amount) {
        if (isValidAmount(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 값이거나 잔액이 부족합니다");
        }
    }

    public void showBalance() {
        System.out.println("현재 통장 잔고: " + balance);
    }

    // 강사님 코드
    /*public int showBalance() {
        return balance;
    }
    */

    // 입력된 돈이 양수인지 확인하는 함수
    private boolean isValidAmount(int amount) {
        return amount>0;
    }
}

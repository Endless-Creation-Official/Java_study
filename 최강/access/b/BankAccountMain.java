package access.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(2000);
        account.showBalance();
        account.deposit(-1000);

    }
}

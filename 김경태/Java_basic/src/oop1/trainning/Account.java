package oop1.trainning;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        if(balance - amount < 0) {
            System.out.println("잔액 부족");
        }else {
            balance -= amount;
        }

    }
}

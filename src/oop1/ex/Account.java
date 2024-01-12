package oop1.ex;

public class Account {
    int balance;

    void depsoit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액부족");
            System.out.println("잔고: " + balance);
        } else {
            balance -= amount;
        }

    }
}

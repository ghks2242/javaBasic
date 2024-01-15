package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0 보다 커야함
        return amount > 0;
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔고가 부족합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }
}
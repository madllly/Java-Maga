package lr2;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class Account implements BankAccount {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class Example7 {
    public static void main(String[] args) {
        Account account1 = new Account(100.0);
        account1.deposit(50.0);
        account1.withdraw(20.0);
        System.out.println("Account 1 Balance: " + account1.getBalance());

        Account account2 = new Account(200.0);
        account2.deposit(100.0);
        account2.withdraw(250.0);
        System.out.println("Account 2 Balance: " + account2.getBalance());
    }
}
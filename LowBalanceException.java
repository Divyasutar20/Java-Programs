import java.util.*;

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance: $" + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit negative amount!");
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) throws NegativeNumberException, LowBalanceException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount!");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }}

    private double balance;

    public BankAccount(double initialBalance) {
            balance = initialBalance;}

    public void balanceEnquiry() {
        System.out.println("Current Balance: $" + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit negative amount!");
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) throws NegativeNumberException, LowBalanceException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount!");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
}

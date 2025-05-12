class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}

class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

class BankAccount {
    private double balance = 1000;

    void balanceEnquiry() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0)
            throw new NegativeNumberException("Cannot deposit negative amount.");
        balance += amount;
    }

    void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0)
            throw new NegativeNumberException("Cannot withdraw negative amount.");
        if (amount > balance)
            throw new LowBalanceException("Insufficient balance.");
        balance -= amount;
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.balanceEnquiry();

        try {
            account.deposit(500);
            account.withdraw(200);
            account.withdraw(2000);
        } catch (NegativeNumberException | LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        account.balanceEnquiry();
    }
}

public class

class LowBalanceException extends Except {

    
}

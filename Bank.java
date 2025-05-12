import java.lang.*;
import java.util.*;

class LowBalanceException extends Exception {
    public String toString()

    {
        return "Low Bank Balance";
    }
}

class NegativeNumberException extends Exception {
    public String toString()

    {
        return "Negative Number";
    }
}

class BankAccount {
    double balance;

    void balanceEnquiry()
    {
        System.out.println("Initial Balance"+ balance)
    }

    void deposit(double amount) {
        if (amount < 0)
            throw new NegativeNumberException("cannot deposit negative amount");
        balance = balance + amount;
    }

    void withdraw(double amount) 
    {
        if(amount<0)
        throw new NegativeNumberException("Cannot withdraw negative amount")
        if (amount > balance)
        throw new LowBalanceException("Insufficient balance");
        balance=balance-amount;
        
    }

}

class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(300);
        account.withdraw(400);

    }
}
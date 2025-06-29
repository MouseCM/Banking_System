package Banking_System;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public Account() {
        this.accountNumber = "";
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public double doWithdraw(double amount) {
        this.balance -= amount;
        return amount;
    }

    public double doDeposit(double amount) {
        this.balance += amount;
        return amount;
    }

    public double recieveMoney(String senderID, double amount) {
        this.balance += amount;
        this.transactions.add(new Transaction(senderID, this.accountNumber, amount));

        return amount;
    }

    public double sendMoney(String recieverID, double amount) {
        this.balance += amount;
        this.transactions.add(new Transaction(this.accountNumber, recieverID, amount));

        return amount;
    }


    public String getAccountnumber() { return this.accountNumber; }
    public double getBalance() { return this.balance; }
    public List<Transaction> getTransactions() { return this.transactions; }

    abstract double withdraw(double amount) throws NotEnoughMoneyException;

    abstract double deposit(double amount);
}

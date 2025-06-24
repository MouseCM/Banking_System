

public abstract class Account {
    private String accountNumber;
    private double balance;

    public Account() {
        this.accountNumber = "";
        this.balance = 0;
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double doWithdraw(double amount) {
        this.balance -= amount;
        return amount;
    }


    public String getAccountnumber() { return this.accountNumber; }
    public double getBalance() { return this.balance; }

    abstract double withdraw(double amount) throws NotEnoughMoneyException;

    abstract double deposit(double amount);
}

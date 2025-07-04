package Banking_System;

public class SavingAccount extends Account {

    public SavingAccount() {
        super();
    }

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }


    // public float getInterestRate() { return this.interestRate; }

    @Override
    public double withdraw(double amount) throws NotEnoughMoneyException {
        if(this.getBalance() >= amount) {
            doWithdraw(amount);
        }
        else {
            throw new NotEnoughMoneyException(this.getBalance(), amount);
        }

        return amount;
    }

    @Override
    public double deposit(double amount) {
        doDeposit(amount);
        return amount;
    }
}

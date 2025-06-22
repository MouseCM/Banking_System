public class SavingAccount extends Account {
    private int savingBalance;
    private float interestRate;

    public SavingAccount() {
        super();
        savingBalance = 0;
        interestRate = 0;
    }


    public int getSavingBalance() {
        return this.savingBalance;
    }

    public float getInterestRate() {
        return this.interestRate;
    }
}

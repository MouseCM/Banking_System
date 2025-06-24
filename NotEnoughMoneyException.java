public class NotEnoughMoneyException extends BankException{
    public NotEnoughMoneyException() {
        super();
    }

    public NotEnoughMoneyException(double balance, double amount) {
        super(String.format("Not Enough Money, your account balance has: %.3f but you need: %.3f", balance, amount));
    }
}

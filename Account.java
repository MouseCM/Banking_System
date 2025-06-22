public class Account {
    private String email;
    private String password;
    private String accountNumber;
    private int balance;

    public Account() {
        this.email = "";
        this.password = "";
        this.accountNumber = "";
        this.balance = 0;
    }

    public Account(String email, String password, String accountNumber, int balance) {
        this.email = email;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAccountnumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }


}

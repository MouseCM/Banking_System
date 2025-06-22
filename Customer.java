import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String nationalID;
    private List<Account> accounts;

    public Customer() {
        this.nationalID = "";
        this.name = "";
        this.accounts = new ArrayList<>();
    }

    public Customer(String name, String nationalID) {
        this.nationalID = nationalID;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getNationalID() {
        return this.nationalID;
    }

    public void setNationalID(String newNationalID) {
        this.nationalID = newNationalID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public Account addAccount(Account newAccount) {
        accounts.add(newAccount);

        return newAccount;
    }

    public Account deleteAccount(Account deleteAccount) {
        accounts.remove(deleteAccount);
        
        return deleteAccount;
    }

}

package Banking_System;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String nationalID;
    private String email;
    private String password;
    private List<Account> accounts;

    public Customer() {
        this.nationalID = "";
        this.name = "";
        this.email = "";
        this.password = "";
        this.accounts = new ArrayList<>();
    }

    public Customer(String name, String nationalID, String email, String password) {
        this.nationalID = nationalID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.accounts = new ArrayList<>();
    }

    public String getName() { return this.name; }
    public String getNationalID() { return this.nationalID; }
    public String getEmail() { return this.email; }
    public String getPassword() { return this.password; }
    public List<Account> getAccounts() { return this.accounts; }


    
    public void setName(String newName) { this.name = newName; }
    public void setNationalID(String newNationalID) { this.nationalID = newNationalID; }




    public Account addAccount(Account newAccount) {
        accounts.add(newAccount);

        return newAccount;
    }

    public Account deleteAccount(Account deleteAccount) {
        accounts.remove(deleteAccount);

        return deleteAccount;
    }

}

package Banking_System;

import java.util.*;

public class Bank {
    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }



    public List<Customer> getCustomers() { return this.customers; }



    public Customer addCustomer(Customer newCustomer) {
        customers.add(newCustomer);

        return newCustomer;
    }

    public Customer login(String email, String password) throws InvalidUserException {
        for(Customer customer : customers) {
            if(customer.getEmail() == email && customer.getPassword() == password) {
                return customer;
            }
        }

        throw new InvalidUserException();
    }

    public void tranfer(Account sender, Account reciever, double amount) throws NotEnoughMoneyException {
        if(sender.getBalance() < amount) {
            throw new NotEnoughMoneyException(sender.getBalance(), amount);
        }
        sender.sendMoney(reciever.getAccountnumber(), -amount);
        reciever.recieveMoney(sender.getAccountnumber(), amount);
    }

}

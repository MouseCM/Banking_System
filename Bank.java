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

    public Customer login(String email, String password) {
        for(Customer customer : customers) {
            if(customer.getEmail() == email && customer.getPassword() == password) {
                return customer;
            }
        }

        return null;
    }

}

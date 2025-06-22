
// import java.util.Scanner;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String email;
        String password;
        String number;
        int balance;

        email = "mousecuber@gmail.com";
        password = "mousefsef";
        number = "3042342";
        balance = 10000;


        Customer cus = new Customer("Nguyen Chi Minh", "031204354");
        cus.addAccount(new Account(email, password, number, balance));
        List<Account> temp = cus.getAccounts();

        for(int i = 0 ; i < temp.size(); i++) {
            System.out.println(temp.get(i).getEmail());
        }

        SavingAccount test = new SavingAccount();
        test.getAccountnumber();

        Transaction test1 = new Transaction();
        // test1.get
    }
}

// import java.util.Scanner;
import java.util.*;


public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String email;
        String password;
        String number;
        int balance;

        email = "mousecuber@gmail.com";
        password = "mouse";
        number = "3042342";
        balance = 10000;

        Bank bank = new Bank();

        Customer cus = new Customer("Nguyen Chi Minh", "031204354", email, password);
        cus.addAccount(new SavingAccount(number, balance));
        cus.addAccount(new SavingAccount("4234", 435.453f));
        bank.addCustomer(cus);

        String testEmail = "mousecuber@gmail.com";
        String testPassword = "mouse";

        Customer testCus = bank.login(testEmail, testPassword);
        // if(testCus != null) {
        //     List<Account> temp = testCus.getAccounts();

        //     for(Account t : temp) {
        //         System.out.println(t.getAccountnumber());
        //         System.out.println(t.getBalance());
        //     }
        // } 

        List<Account> tt = testCus.getAccounts();

        for(Account ttt : tt) {
            try {
                ttt.withdraw(20000.234f);
            } catch (NotEnoughMoneyException e) {
                System.err.println(e.toString());
            }
            
        }

        testCus = bank.login(testEmail, testPassword);
        try {
            if(testCus != null) {
                List<Account> temp = testCus.getAccounts();

                for(Account t : temp) {
                    System.out.println(t.getAccountnumber());
                    System.out.println(t.getBalance());
                }
            }
            else {
                throw new InvalidUserException();
            }
        }
        catch(InvalidUserException erorr) {
            System.err.println(erorr);
        }


        // test1.get
    }
}
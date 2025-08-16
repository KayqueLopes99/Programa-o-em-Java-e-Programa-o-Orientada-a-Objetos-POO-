package Udemy.Code.Abstract;

import java.util.ArrayList;
import java.util.List;

public class DemoAccount {
    public static void main(String[] args) {

        // NÃO SE PODE INSTANCIAR POIS É ABSTRACT.
        // Account account1 = new Account(1001, "Kayque", 1000.0);

        List<Account> list = new ArrayList<>();


        list.add(new SavingAccount(1023, "Maria", 1000.0, 0.01));
        list.add( new BusinessAccount(1023, "José", 1000.0, 500.0));

        list.add(new SavingAccount(1023, "Bob", 2000.0, 0.05));
        list.add( new BusinessAccount(1023, "Mil", 4000.0, 300.0));

        double sum = 0.0;
        for (Account account : list) {
            sum += account.getBalance();
        }

        for (Account account : list) {
            account.deposit(10.0);
            System.out.println("Update for account for account: " + account.getBalance());
            
        }

        System.out.printf("Total balance: %.2f: ", sum);
    }
}

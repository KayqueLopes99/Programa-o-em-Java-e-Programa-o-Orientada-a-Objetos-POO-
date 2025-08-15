package Udemy.Code.Heritage_polimorfism;

public class DemoAccount {
    public static void main(String[] args) {

        // Sobreposição.
        Account account = new Account(1001, "Kayque", 1000.0);

        account.withdraw(200.0);
        System.out.println(account.getBalance());

        Account account3 = new SavingAccount(1004, "Lima", 1000.0, 0.10);

        account3.withdraw(200.0);
        System.out.println(account3.getBalance());

        BusinessAccount newBusinessAccount = new BusinessAccount(1002, "José", 0.0, 500.0);

        // UPCASTING: subclasse se atribuidno a uma superclasse.
        Account account1 = newBusinessAccount;
        Account account2 = new BusinessAccount(1003, "Lopes", 1000.0, 555.0);
        account2.withdraw(500);
        System.out.println(account2.getBalance());

        System.out.println(account + "\n" + account1);
        // SUCESSO.

        // DOWNCASTING: superclasse se atribuindo para supeclasse.

        // Sucesso se converter o tipo no segundo
        BusinessAccount acc4 = (BusinessAccount) account2;
        acc4.loan(100.0);

        // OBS: De uma subclasse para outra não pode.
        if (account3 instanceof BusinessAccount) {

            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(200.0);
            System.out.println("Loan!");
        }

        if (account3 instanceof SavingAccount) {

            SavingAccount account5 = (SavingAccount) account3;
            account5.uptadeBalance();
            System.out.println("Uptade!");
        }

        // Polimorfismo
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingAccount(1023, "Maria", 1000.0, 0.01);
        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance() + " | " + y.getBalance());


    }
}

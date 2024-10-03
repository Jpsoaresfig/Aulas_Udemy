import Atividade_30.Entities.Account;
import Atividade_30.Entities.BusinesssAccount;
import Atividade_30.Entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        Account account = new Account(1001, "Alex", 0.0);
        BusinesssAccount businessAccount = new BusinesssAccount(1002, "Maria", 0.0, 5000.0);

        // uso do super
        Account acc8 = new BusinesssAccount(101, "bob", 1000.0, 500.0);
        acc8.withdraw(200.0);

        // uso override
        Account acc6 = new Account(101, "ana", 1000.00);
        acc6.withdraw(200);// sacando 200 + valor de taxa que é 5
        Account acc7 = new SavingsAccount(01, "flavio", 1000.00, 0.1);
        acc7.withdraw(200);// sacando 200 so que sem taxa

        // upcasting

        Account acc1 = businessAccount;
        Account acc2 = new BusinesssAccount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "ana", 0.0, 0.01);

        // downcasting
        BusinesssAccount acc4 = (BusinesssAccount) acc2;
        acc4.loan(100.0);

        // BusinesssAccount acc5 = (BusinesssAccount)acc3; não funciona pois acc3 é do
        // tipo SavingAccount e não account que é o geral

        if (acc3 instanceof BusinesssAccount) {
            BusinesssAccount acc5 = (BusinesssAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("update");
        }
        System.out.println(acc6.getBalance());
        System.out.println(acc7.getBalance());
        System.out.println(acc8.getBalance());

        Account x = new Account(10, "julio ", 1000.0);
        Account y = new SavingsAccount(11, "Julia", 1000.0, 0.1);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println("Saldo Account" + x.getBalance());
        System.out.println("Saldo SavingsAccount" + y.getBalance());

    }
}

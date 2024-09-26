import Atividade_30.Entities.Account;
import Atividade_30.Entities.BusinesssAccount;
import Atividade_30.Entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        
        Account account = new Account(1001, "Alex", 0.0);
        BusinesssAccount businessAccount = new BusinesssAccount(1002, "Maria", 0.0, 5000.0);

        //upcasting

        Account acc1 = businessAccount;
        Account acc2 = new BusinesssAccount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "ana", 0.0, 0.01);
        
        //downcasting
        BusinesssAccount acc4 = (BusinesssAccount)acc2;
        acc4.loan(100.0);

       // BusinesssAccount acc5 = (BusinesssAccount)acc3; não funciona pois acc3 é do tipo SavingAccount e não account que é o geral 

       if(acc3 instanceof BusinesssAccount){
        BusinesssAccount acc5 = (BusinesssAccount)acc3;
        acc5.loan(200.0);
        System.out.println("Loan");
       }

       if (acc3 instanceof SavingsAccount){
        SavingsAccount acc5 = (SavingsAccount)acc3;
        acc5.updateBalance();
        System.out.println("update");
       }
    }
}

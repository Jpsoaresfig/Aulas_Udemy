import Atividade_33.Entities.Account;
import Atividade_33.Entities.BusinessAccount;
import Atividade_33.Entities.SavingAccount;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        List<Account> lista = new ArrayList<>();

        lista.add(new Account(101, "carlota", 100.0));
        lista.add(new SavingAccount(102, "maria", 100.0, 0.01));
        lista.add(new BusinessAccount(103, "joao", 100.0, 500.0));

        double sum = 0.0;

        for (Account acc : lista) {
            sum += acc.getBalance();
        }

        System.out.println("total: " + String.format("%.2f", sum));

        for (Account acc : lista){
            acc.deposit(10.0);
        }

        for (Account acc : lista){
            System.out.println("update balance: " + String.format("%.2f", acc.getBalance()));
        }

    }
}

package Atividade_33.Entities;

public class SavingAccount extends Account {
    private Double interestRate;

    public SavingAccount(){
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    
    public void updateBalance(){
        balance += balance * interestRate;
    }
    @Override
    public void withdraw(double amount){ //se for colocado public final void withdraw essa função nao podera ser chamada em outra classe  
        balance -= amount; //final também é mais rapido, não consome muito 
    }
}

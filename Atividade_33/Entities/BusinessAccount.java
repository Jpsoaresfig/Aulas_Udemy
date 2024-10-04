package Atividade_33.Entities;

public class BusinessAccount extends Account{
    
    private Double loanLimit;

    public BusinessAccount(){

    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(double amount){
        if(amount <= loanLimit){
            deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);//pegando o withdraw da superclasse e desontando 2 reais
        balance -= 2.0;
    }
}

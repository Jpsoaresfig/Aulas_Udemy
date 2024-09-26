package Atividade_30.Entities;

public class BusinesssAccount extends Account{

    private Double loanLimit;

    public BusinesssAccount(){

    }

    public BusinesssAccount(Integer number, String holder, Double balance, Double loanLimit) {
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
}

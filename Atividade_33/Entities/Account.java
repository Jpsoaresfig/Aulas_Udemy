package Atividade_33.Entities;

public  class Account { //se colocar abstract não podera instanciar dessa classe 
    
    private Integer number;
    private String holder;// so pode ser acessado pela propria classe
    protected Double balance;// pode ser acessado por subclasses

    public Account() {

    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount +5;
    }
}
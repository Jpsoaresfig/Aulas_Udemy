package Atividade_19.src;

public class Funcionario {

    private int ID;
    private String nome;
    private double salario;


    
    public Funcionario(int iD, String nome, double salario) {
        ID = iD;
        this.nome = nome;
        this.salario = salario;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    //funçõe---------------------------------------------------------
    public void AumentarSalario(double porcentagem){
        salario += (salario * porcentagem / 100);
    }

    //função de imprimir 
    public String toString() {
        return "ID: " + ID + ", Nome: " + nome + ", Salario: " + salario;
    }
}
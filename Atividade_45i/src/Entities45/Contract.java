package Entities45;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int number;
    private LocalDate date;
    private Double totalvalue;

    private List<Installment>  installments = new ArrayList<>();//um contrato tem varias Installment 

    public Contract(int number, LocalDate date, Double totalvalue) {
        this.number = number;
        this.date = date;
        this.totalvalue = totalvalue;
        
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalvalue() {
        return totalvalue;
    }

    public void setTotalvalue(Double totalvalue) {
        this.totalvalue = totalvalue;
    }

    public List<Installment> getintallment(){
        return installments;
    }


   
}

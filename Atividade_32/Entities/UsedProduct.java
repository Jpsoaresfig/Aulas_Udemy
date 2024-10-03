package Atividade_32.Entities;

import java.util.Date;

public class UsedProduct extends Product {
    private Date dataDeFabricacao;

    public UsedProduct(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public UsedProduct(String name, double price, Date dataDeFabricacao) {
        super(name, price);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String toString() {
        return "Nome do produto: " + getName() + " Data de fabricação: " + dataDeFabricacao + " Preço: " + getPrice() +" $";
    }

}

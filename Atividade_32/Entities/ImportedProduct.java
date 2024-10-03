package Atividade_32.Entities;

public class ImportedProduct extends Product {

    private double customsFee;

    public ImportedProduct() {

    }

    public ImportedProduct(double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return super.getPrice() + customsFee;
    }

    @Override
    public String toString() {
        return "Produto importado: " + getName() + " taxa de imtortção: " + customsFee + "  preço: " + getPrice() + "$";
    }

}

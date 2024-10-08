package Atividade_29.Entities;

public class OrderItem {

    private int quantity;
    private Double price;

    private Product product; // fazendo ligação com a classe products

    public OrderItem() {

    }

    public OrderItem(int quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return price * quantity;
    }


    @Override
    public String toString(){
        return getProduct().getName()
        +String.format("%.2f", price)
        + quantity
        +"Subtotal: $"
        + String.format("%.2f", subTotal());

    }


}

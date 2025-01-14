package Entities_62;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String StaticUpperCaseName(Product p) {//pode ser feito dessa forma também 
        return p.getName().toUpperCase();
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

}

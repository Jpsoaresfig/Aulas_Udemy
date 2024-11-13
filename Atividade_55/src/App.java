import java.util.ArrayList;
import java.util.List;

import Entities55.Product;
import Interface.ProductPredicate;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("mouse", 50.0));
        list.add(new Product("keyboard", 70.0));
        list.add(new Product("tablet", 300.0));
        list.add(new Product("headphones", 800.0));
        list.removeIf(new ProductPredicate());

        for (Product p : list) {
            System.out.println(p);
        }

    }
}

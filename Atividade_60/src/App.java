import java.util.ArrayList;
import java.util.List;
import Entities_60.Util_60.ProductService;

import Entities_60.Product;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("Hd case", 80.90));

        ProductService ps = new ProductService();
        double sum = ps.filteredsum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println( "Sum of filtered products: " + sum );
    }
}

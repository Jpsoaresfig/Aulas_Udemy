import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import Entities_58.Product;
import util_58.ProductUpdate;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("tablet", 350.00));
        list.add(new Product("Hd case", 80.90));

        list.forEach(new ProductUpdate());

        Consumer <Product > cons = p -> p.setPrice(p.getPrice() * 1.1);
        list.forEach(cons);//da no mesmo resultado que o anterior

        //ainda da pra fazer assim 
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out :: println);//reference method 


    }
}

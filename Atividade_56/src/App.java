import java.util.ArrayList;
import java.util.List;

import Entities56.Product;

import util.PriceUpdate;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("mouse", 50.0));
        list.add(new Product("keyboard", 70.0));
        list.add(new Product("tablet", 300.0));
        list.add(new Product("headphones", 800.0));
        

        list.forEach(new PriceUpdate());

        list.forEach(System.out::println);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import Entities_59.Product;
import util_59.UpperCaseName;

public class App {
    public static void main(String[] args) throws Exception {
         List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("tablet", 350.00));
        list.add(new Product("Hd case", 80.90));

      List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
      List<String> names2 = list.stream().map(Product :: StaticUpperCaseName).collect(Collectors.toList()); //pode ser assim chamando o método static da classe Product

      //ou pode criar a propria função 
      Function<Product, String> func = p -> p.getName().toUpperCase();
      List<String> names3 = list.stream().map(func).collect(Collectors.toList());

        System.out.println(names3);
        System.out.println(names);
        System.out.println(names2);
    

    }
}

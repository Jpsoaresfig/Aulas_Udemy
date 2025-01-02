import java.util.ArrayList;
import java.util.List;
import Entities_57.Product;
import util57.ProductPredicate;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();

        list.add (new Product("TV", 900.00));
        list.add (new Product("mouse", 50.00));
        list.add (new Product("tablet", 350.00));
        list.add(new Product("Hd case", 80.90));

        list.removeIf(new ProductPredicate());//verifica que se for menor que 100 ele deixa e se for maior remove 

        //list.removeIf(Product :: staticProductPredicate); outra forma de fazer na classe product 

        for (Product p : list) {
            System.out.println(p);
        }



    }
}   

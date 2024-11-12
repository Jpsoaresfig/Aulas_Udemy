import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
    List<Product> list = new ArrayList<>();

    list.add (new Product("Tv", 900.00));
    list.add (new Product("Laptop", 1000.00));
    list.add (new Product("Mobile", 700.00));

   
    list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));// comparator

    for(Product p: list){
        System.out.println(p);
    }
    }
}

package util57;
import java.util.function.Predicate;
import Entities_57.Product;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;//se for maior que 100 tira o produto 
    }
    
}

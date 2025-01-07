package util_59;
import java.util.function.Function;

import Entities_59.Product;

public class UpperCaseName implements Function<Product, String>{

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
    
}

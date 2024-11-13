package Interface;

import java.util.function.Predicate;

import Entities55.Product;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;

    }

}

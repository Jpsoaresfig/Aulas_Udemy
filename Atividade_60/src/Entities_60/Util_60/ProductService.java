package Entities_60.Util_60;

import java.util.List;
import java.util.function.Predicate;

import Entities_60.Product;

public class ProductService {

    public double filteredsum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0;
        for (Product product : list) {
            if (criteria.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }

}

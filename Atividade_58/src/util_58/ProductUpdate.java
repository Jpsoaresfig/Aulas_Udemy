package util_58;

import java.util.function.Consumer;

import Entities_58.Product;

public class ProductUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
         p.setPrice(p.getPrice() * 1.1);

    }
}

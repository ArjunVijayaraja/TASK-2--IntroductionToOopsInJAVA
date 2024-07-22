package IntroductionToOopsJava;

import java.util.Comparator;

public class PriceSortHighToLow implements Comparator<Product> {
    @Override
    public int compare(Product obj1, Product obj2) {
        return obj2.price- obj1.price;
    }
}

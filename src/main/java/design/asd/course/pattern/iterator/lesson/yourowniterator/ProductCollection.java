package design.asd.course.pattern.iterator.lesson.yourowniterator;

import design.asd.course.pattern.iterator.lesson.model.Iterator;
import design.asd.course.pattern.iterator.lesson.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Iterator<Product> reverseIterator() {
        return new ReverseIterator<Product>(products);
    }
}

package design.asd.course.pattern.iterator.lesson.yourowniterator;

import design.asd.course.pattern.iterator.lesson.model.Iterator;
import design.asd.course.pattern.iterator.lesson.model.Product;

public class Application {
    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();
        collection.addProduct(new Product("Go3", "Speaker", 30, true));
        collection.addProduct(new Product("A123", "Iphone 6", 20, true));
        collection.addProduct(new Product("A345", "Iphone 7", 15, false));

        Iterator<Product> reverseIterator = collection.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}

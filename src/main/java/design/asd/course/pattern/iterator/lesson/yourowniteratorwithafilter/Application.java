package design.asd.course.pattern.iterator.lesson.yourowniteratorwithafilter;

import design.asd.course.pattern.iterator.lesson.model.Iterator;
import design.asd.course.pattern.iterator.lesson.model.Product;

import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();
        collection.addProduct(new Product("A123", "Iphone 12", 1200, true));
        collection.addProduct(new Product("A234", "Iphone 13", 1300, true));
        collection.addProduct(new Product("A234", "Iphone 13 Promax", 1350, false));
        collection.addProduct(new Product("A345", "Iphone 14", 1400, false));
        collection.addProduct(new Product("A345", "Iphone 14 Promax", 1480, true));

        System.out.println("Available products:");
        Predicate<Product> availablePredicate = p -> p.isAvailable();
        Iterator<Product> filterIterator = collection.filterIterator(availablePredicate);
        while (filterIterator.hasNext()) {
            System.out.println(filterIterator.next());
        }

        System.out.println("Less than 1400$ products:");
        Predicate<Product> lessThanAPrice = p -> p.getPrice() < 1400;
        Iterator<Product> filterIterator2 = collection.filterIterator(lessThanAPrice);
        while (filterIterator2.hasNext()) {
            System.out.println(filterIterator2.next());
        }
    }
}

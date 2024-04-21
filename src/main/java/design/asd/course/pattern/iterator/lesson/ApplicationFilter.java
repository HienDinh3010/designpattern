package design.asd.course.pattern.iterator.lesson;

import design.asd.course.pattern.iterator.lesson.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationFilter {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("A123", "Iphone 12", 1200, true));
        products.add(new Product("A234", "Iphone 13", 1300, true));
        products.add(new Product("A234", "Iphone 13 Promax", 1350, false));
        products.add(new Product("A345", "Iphone 14", 1400, false));
        products.add(new Product("A345", "Iphone 14 Promax", 1480, true));

        System.out.println("Available products:");
        List<Product> availableProducts = products.stream()
                .filter(p -> p.isAvailable())
                .collect(Collectors.toList());
        availableProducts.forEach(p -> System.out.println(p));
    }
}

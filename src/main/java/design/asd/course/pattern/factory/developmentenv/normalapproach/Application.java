package design.asd.course.pattern.factory.developmentenv.normalapproach;

import design.asd.course.pattern.factory.developmentenv.normalapproach.model.Product;
import design.asd.course.pattern.factory.developmentenv.normalapproach.service.ProductService;

public class Application {
    public static void main(String[] args) {
        Product product = new Product(1234, "DJI Mavic 2 Pro drone");
        ProductService productService = new ProductService();
        productService.save(product);
    }
}

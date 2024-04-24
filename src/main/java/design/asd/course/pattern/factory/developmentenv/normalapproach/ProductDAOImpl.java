package design.asd.course.pattern.factory.developmentenv.normalapproach.service;

import design.asd.course.pattern.factory.developmentenv.normalapproach.model.Product;
import design.asd.course.pattern.factory.developmentenv.normalapproach.model.ProductDAO;

public class ProductDAOImpl implements ProductDAO {
    @Override
    public void saveProduct(Product product) {
        System.out.println("Saving product " + product.getName());
    }
}

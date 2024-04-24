package design.asd.course.pattern.factory.developmentenv.factorymethod.service;

import design.asd.course.pattern.factory.developmentenv.factorymethod.model.Product;
import design.asd.course.pattern.factory.developmentenv.factorymethod.model.ProductDAO;

public class ProductDAOImpl implements ProductDAO {
    @Override
    public void saveProduct(Product product) {
        System.out.println("Saving product " + product.getName());
    }
}

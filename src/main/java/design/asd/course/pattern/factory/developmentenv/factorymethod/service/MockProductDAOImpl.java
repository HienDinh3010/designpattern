package design.asd.course.pattern.factory.developmentenv.factorymethod.service;


import design.asd.course.pattern.factory.developmentenv.factorymethod.model.Product;
import design.asd.course.pattern.factory.developmentenv.factorymethod.model.ProductDAO;

public class MockProductDAOImpl implements ProductDAO {
    @Override
    public void saveProduct(Product product) {
        System.out.println("Mock Saving product " + product.getName());
    }
}

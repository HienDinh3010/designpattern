package design.asd.course.pattern.factory.developmentenv.normalapproach.service;

import design.asd.course.pattern.factory.developmentenv.normalapproach.model.Product;
import design.asd.course.pattern.factory.developmentenv.normalapproach.model.ProductDAO;

import java.io.FileInputStream;
import java.util.Properties;

public class ProductService {

    private ProductDAO productDAO;

    public ProductService() {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream(rootPath + "/config.properties"));

            String environment = prop.getProperty("environment");
            if (environment.equals("production")) {
                productDAO = new design.asd.course.pattern.factory.developmentenv.normalapproach.service.ProductDAOImpl();
            } else if (environment.equals("test")) {
                productDAO = new design.asd.course.pattern.factory.developmentenv.normalapproach.service.MockProductDAOImpl();
            } else {
                System.out.println("Enviroment property is not set correctly");
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public void save(Product product) {
        productDAO.saveProduct(product);
    }
}

package design.asd.course.pattern.factory.developmentenv.factorymethod.service;

import design.asd.course.pattern.factory.developmentenv.factorymethod.model.ProductDAO;

import java.io.FileInputStream;
import java.util.Properties;

public class ProductDAOFactory {

    public static ProductDAO getProductDAOInstance() {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(rootPath + "/config.properties"));

            String environment = properties.getProperty("environment");
            if (environment.equals("production")) {
                return new ProductDAOImpl();
            } else if (environment.equals("test")) {
                return new MockProductDAOImpl();
            } else {
                System.out.println("Environment is not set correctly");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

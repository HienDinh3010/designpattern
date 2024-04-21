package design.asd.course.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

public class CustomerService {

    private CustomerDAO customerDAO = new CustomerDAOImpl();

    private ClassLoader classLoader = CustomerDAO.class.getClassLoader();

    private CustomerDAO cachingProxy = (CustomerDAO) Proxy.newProxyInstance(classLoader,
            new Class[]{ CustomerDAO.class },
            new CachingProxy(customerDAO));

    private CustomerDAO loggingProxy = (CustomerDAO) Proxy.newProxyInstance(classLoader,
            new Class[]{ CustomerDAO.class},
            new LoggingProxy(cachingProxy));

    private CustomerDAO stopWatchProxy = (CustomerDAO) Proxy.newProxyInstance(classLoader,
            new Class[] { CustomerDAO.class },
            new StopWatchProxy(loggingProxy));

    public Customer getCustomer(int id) {
        return stopWatchProxy.findCustomerById(id);
    }
}

package design.asd.course.pattern.proxy.multipleproxies;


public class CustomerService {

    private CustomerDAO customerDAO = new CustomerDAOImpl();
    private CustomerDAO cachingProxy = new CachingProxy(customerDAO);

    private CustomerDAO loggingProxy = new LoggingProxy(cachingProxy);

    private CustomerDAO stopWatchProxy = new StopWatchProxy(loggingProxy);

    public Customer getCustomerById(int customerId) {
        return stopWatchProxy.findCustomerById(customerId);
    }
}
